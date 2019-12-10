## Классы. Динамическое использование - объекты. Отношения между классами (объектами)

> Очень часто в программах создают связи между объектами одного и того же класса с целью того чтобы "воплотить" в код - взаимоотношения которые есть между разными вещами или людьми, животными, ситуациями, и т д.

---

Нам необходимо создать приложение благодаря которому люди начнут "дружить". Для этого создайте проект **RelatedObjects**
с следующей структурой:

```
RelatedObjects
 - src/
   - main(package)
     - Application(Class + static main())
   - humanity(package)
     - Person(Class)
   - tests
     - BasicTest  
```

*  Класс **Person** содержит две "ссылки" (переменные) которые будут указывать в определенный момент времени на объекты типа String и Person - соответственно. 
```java
    public class Person{
        private String name;
        private Person friend;

        // ???
    }
```    
Перед тем как продолжите код класса, ответить на вопросы:
1. после выполнения ```new Person()``` - сколько объектов образуется в памяти?
2. чему равняются значения поля **name** и **friend** при создании нового объекта **Person**?

дополнить код отмеченный ```// ???``` для класса **Person**:
 1. Добавить конструктор который принимает только имя человека!!!
 2. Добавить метод ```boolean addFriend(Person friend)``` который установит в свойство "друг" (friend) - переданный объект как аргумент, данный метод должен защитить наш объект от попытки добавить самого себя как друга! А так же не должен допускать добавления **null** в качестве друга. Обратите внимание на тип возврата - вернуть false - если мы пытаемся провести неправильную операцию добавления в друзья
 3. Добавить метод  ```boolean removeFriend()``` который удалит единственного друга нашего объекта (человека), метод вернет - true - если там был уже друг, если в свойстве **friend** стоит **null** то метод должен вернуть - false. "Удалить" объект можно устанавливая переменную которая на него ссылается в **null**.
 4. Добавить метод ```boolean isLonely()``` который вернет - true только если у человека нет друга.
 5. Добавить метод ```String getFriendName()``` который вернет имя друга или **null** при его отсутствие!

ВНИМАНИЕ!!! для данного класса не требуется только геттер для **name** и  только методы что были указаны!
ВНИМАНИЕ!!! НИ в одном из методов класса **Person** не должно ничего выводится в консоль! Все методы возвращают или получают значения из "внешней логики" ( по отношению к классу ) и уже логика которая ВНЕ данного класса должна решать стоит ли что-то выводить в консоль или нет!

* Создаем базовый тест для нашего класса **Person** в виде класса и метода в другом пакете - **tests** так как нам достаточно одного экземпляра теста для проведения проверки - мы пользуемся классом **BasicTest** статично.

ОБРАТИТЕ ВНИМАНИЕ на то как метод теста пользуется значениями которые возвращают методы объектов из **Person** для того чтобы вывести сообщение о не пройденном этапе теста, а так же как сам метод ведет учет кол-ва пройденных "сценариев" и возвращает тип который в процентах укажет насколько весь тест был пройден!  
 
```java
    public class BasicTest{

        public static int runCase(){

            int percentage = 0;    

            Person guy = new Person( "John" );
            // cannot add itself as a friend
            if( guy.addFriend(guy) ) {
                System.err.println("Add test failed\nREASON: Person cannot add himself as a friend!"),
                return percentage;
            }
            percentage+=20;

            // cannot add null as a friend
            if( guy.addFriend(null) ) {
                System.err.println("Add test failed\nREASON: Person cannot add NULL as a friend!"),
                return percentage;
            }
            percentage+=20;

            // must add normal friend
            if( !guy.addFriend(new Person( "Marry" )) ) {
                System.err.println("Add test failed\nREASON: Person did not add another Person(object) as friend!"),
                return percentage;
            }
            percentage+=20;

            // can remove not null friend
            if( !guy.removeFriend() ) {
                System.err.println("Remove test failed\nREASON: Person did not remove Person(object) as friend!"),
                return percentage;
            }
            percentage+=20;

            // if friend removed - must be lonely
            if( !guy.isLonely() ) {
                System.err.println("Status test failed\nREASON: Person was not lonely after removing Person(object) as friend!"),
                return percentage;
            }
            percentage+=20;
            return percentage;

        }
    }

```

* Вызываем тест в основном методе **main()**

  ```java
    System.out.println( "Basic test passed with: " + BasicTest.runCase() + "%" );
  ```

  