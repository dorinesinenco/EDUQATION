## Работа с Java Instrumentation API

* У вас уже есть рабочий агент упакованный в JAR в виде класса **XxxxxAgent**
* У него уже есть запускающийся **premain(...)**
* второй аргумент **instrumentation** - упаковывает сервисы необходимые для манипулирования Java кодом, если написать внитри метода **premain()** такой код:
  

    ```java

    instrumentation.addTransformer( ... )

    ```

    и вставить вместо троеточия объект который может "обрабатывать" классы (кстати паттерн Transformer), то для каждого загружаемого в JVM класса, будет вызван наш объект, а конкретнее его метод ** ... transform (...) ...**

* Добавим "анонимный / динамичный класс" (так как) так как метод **.addTransformer( ... )** ждет аргумент соответствующий интерфейсу - **ClassFileTransformer** из которого напрямую нельзя создавать объекты и за одно инстанциируем из него объект трансформера, за одно имплементируем требуемый метод **transform()**:
    
    ```java

        instrumentation.addTransformer(new ClassFileTransformer() {
		      @Override
		       public byte[] transform(Module module, 
		                               ClassLoader loader, 
		                               String name, 
		                               Class<?> typeIfLoaded, 
		                               ProtectionDomain domain, 
		                               byte[] buffer) {
		        
		         return null;
		       }
		    })

    ```

* как вы видите метод **transform()** получает доступ ко многим параметрам:
  * loader - загрущик классов
  * name - имя класса
  * typeIfLoaded - если класс трансформируемый - его тип
  * domain - домен защиты класса (об этом позже)
  * buffer - байтовый (бинарный) код класса
* как вы видите он должен вернуть либо **byte[]** - новый буфер с модифицированными байтами класса, либо - **null** что указывает на то что данный класс не будет изменен
* ТРЕБУЕТСЯ: 
  1. Вывести в консоли информацию о том какой класс грузиться каждый раз когда вызывается **transform()**
  2. Вывести в консоли какой загрузчик класса используется каждый раз когда вызывается **transform()**
  3. После запуска вы должны увидеть что-то на подобие :

     ```
        Test Agent RUNNING!
        Class was loaded: java/util/jar/JarVerifier
        Loader used: null

        Class was loaded: java/security/CodeSigner
        Loader used: null

        Class was loaded: java/io/ByteArrayOutputStream
        Loader used: null
        ...

        Application RUNNING!

        Class was loaded: java/util/IdentityHashMap$KeyIterator
        Loader used: null

        Class was loaded: java/util/IdentityHashMap$IdentityHashMapIterator
        Loader used: null

        Class was loaded: java/lang/Shutdown
        Loader used: null

        Class was loaded: java/lang/Shutdown$Lock
        Loader used: null

     ``` 

    4. обратить внимание на начало этого длинного списка и на конец, о чем они вам говорят? 