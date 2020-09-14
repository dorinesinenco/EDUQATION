## Применение Javassist

* Создайте следующий класс в пакете **tools**

```java

public class ClassTransformer {
	
	
	public static Class<?> transform() throws NotFoundException, IOException, CannotCompileException {
		
		// Get the class manipulation tool = pool
		ClassPool pool = ClassPool.getDefault();
    
    // in case the classes are not found
		pool.appendClassPath("path/to/your/project/bin/.class");
		
		// load the desired class
		CtClass cc = pool.get("original.Box");
    
    // find the default constructor
		CtConstructor ccon= cc.getDeclaredConstructor(null);
    // remove it
		cc.removeConstructor(ccon);

    // create a new default constructor
		CtConstructor cstructor = CtNewConstructor.defaultConstructor( cc	) ;
    // modify the constructor behaviour
		cstructor.setBody( "this.id = 100;");
		// add the constructor to the class
		cc.addConstructor(cstructor);
    // return the modified class
		return cc.toClass();
		
	}
	
}

```

* как можно увидеть, наш трансформер загружает класс, находит дефолтный конструктор и удаляет его, потом вставляет новый вариант конструктора и ВНИМАНИЕ! - возвращает переделанный класс, почему так? потому что наш код запускается не в режиме агента!
* Далее, мы используем наш трансформер прямо в **main()**

```java

  BoxInterface b;
  b =  (BoxInterface)tool.ClassTransformer.transform().getConstructor().newInstance();  	System.out.println( b.getId() );

```

* JVM должен выдать предупреждение о том что производятся манипуляции но при этом вы получите новый вариант класса!