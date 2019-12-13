## Классы. Динамическое использование - объекты. Наследование, Полиморфизм

> Полиморфизм для начинающих Полиморфизм — одна из трех основных парадигм ООП. Если говорить кратко, полиморфизм — это способность объекта принимать "множество" форм.


> Абстрактный класс похож на обычный класс. В абстрактном классе также можно определить поля и методы, в то же время нельзя создать объект или экземпляр абстрактного класса. Абстрактные классы призваны предоставлять базовый функционал для классов-наследников. А производные классы уже реализуют этот функционал.

* Предположим у нас есть софт который "устанавливается" фабрикой роботов каждому произведенному роботу. Эта фабрика работает давно и производит разные "поколения" роботов. Поколения названы по порядку "Alpha", "Beta"... чем дальше - тем "более продвинутые" роботы выходят из фабрики.
 
* Начните с структуры:

```
RoboInheritanceExample
 - src/
   - main(package)
     - Application(Class + static main())
   - robo(package)
     - RobotFactory(Class)
     - AbstractRobot(AbstratClass)
     - AlphaRobot(Class)
     - BetaRobot(Class)
     - CharlieRobot(Class)
   - tests(package)
     - SimpleTest(Class)  
```

* ОБРАТИТЕ ВНИМАНИЕ! что помимо 3-х "поколений" роботов есть еще "костяк" - основной класс - **AbstractRobot**. Этот класс должен служить лишь идеей того как должен выглядеть робот (или что он должен делать) но мы запретим создание робота напрямую из этого класса!
* То есть схематически наследование в нашем проекте будет проходить по диаграмме:
  ``` AbstractRobot --> AlphaRobot --> BetaRobot --> CharlieRobot```
  чем правее класс, тем круче робот этого класса!
* Чему служат абстрактные классы? Представьте себе что вы инженер-механик, придумали новый вид двигателя, "нарисовали" свою идею - то есть абстрактный план того как ВЫ видите работу и структуру этого двигателя - есть! Но! предположим - для того чтобы его "запускать" требуется электронная часть в которой вы не разбираетесь, тогда вы объявляете эту идею НЕПОЛНОЦЕННОЙ! Запрещаете другим воплощать идею (так как опасно без электронного управления запускать ваш двигатель)! И - для полной его реализации требуете ДОВЕСТИ ДО УМА структуру и функционал электрики! Это выглядело бы на языке Java примерно так:
  ```java
  public abstract class AbstractEngine {
      public void move(){
          // code of the mechanic part
      }
      public abstract void control();
          // declaration of prototype of electrical control part
  }
  ```
  обратите внимание на присутствие абстрактного метода - ключевое слово **abstract**, оно есть и в объявление класса. Обратите внимание на имя класса - в Java часто требуют все абстрактные классы именно так называть **AbstractXyz**.

* Вернемся к нашему заводу роботов. Класс **AbstractRobot** имеет такую начальную структуру:
  ```java
    public abstract class AbstractRobot {
       // Robot schema 
       public abstract void setName(String name);
       public abstract String getName();

       public abstract void setModel(String model);
       public abstract String getModel();

       public abstract void setX(int x);
       public abstract int getX();

       public abstract void setY(int y);
       public abstract int getY();
       
       public abstract boolean moveRight();
       public abstract boolean moveLeft();
       public abstract boolean moveDown();
       public abstract boolean moveUp();
    }
  ```
  Можно думать об этой структуре как о "схеме", "чертеже" будущих классов роботов. После объявления этого абстрактного класса, можете протестировать его так в **main()**:
  ```java
  AbstractRobot testRobot = new AbstractRobot();
  ```
  на что вы получите ошибку - нельзя создать объект абстрактного класса!

  Если всмотреться внимательно в структуру класса  **AbstractRobot** вы можете заметить что хотя там нет ни одного свойства, они подразумеваются четырьмя парами сет/гет методов. Соответственно - в классах наследниках - нам придется объявить
  ```java
  private String name;
  private String model;
  private int x;
  private int y;
  ```
  как вы видите так же в структуре схемы есть 4 метода передвижения, то есть даже самый примитивный робот этого семейства роботов будет уметь передвигаться в 2D пространстве. 
  
  ВНИМАНИЕ - в этом пространстве система координат X / Y в которой Y начинается сверху и направлен в низ!
  ``` 
       
       |
  --- 0,0 -------------------------- X ----------->
       |
       |
       |
       |
       |
       |
       |
       |
       Y
       |
       V
  ```

---

* Создайте класс **AlphaRobot** и объявите его наследником нашего абстрактного класса. Реализуйте структуру этого класса дополняя его теми 4-и свойствами что отмечены выше а так же дополнить его функционал так чтобы:
  1. Были реализованы Конструкторы класса **AlphaRobot()** и **AlphaRobot(String name, String model)** координаты по умолчанию устанавливаются в 0!
  2. **setName(String name)/setModel(String model)** защищены от установки значения **null**
  3. **setX(int x)/setY(int y)** позволяли установить координаты в диапазоне 0..100 (предположим наши роботы умеют передвигаться в рамках заданных координат - иначе **err** - ошибка)   
  4. **getName()/getModel()/getX()/getY()** работают как стандартные геттеры
  5. Каждая из функции передвижения **moveXxxx()** делает один шаг (т е +/- 1 единица) в указанном направлении. Соответственно - изменяет **x/y** координату на единицу, но при этом возвращает **true** только если удалось сделать шаг в указанном направлении!

* Создаем статичный класс простого теста **SimpleTest**
    ```java
    public class SimpleTest {
        public static int runCase(AbstractRobot robot){
            int percentage = 0;    

            /// VALUES

            // name cannot be null
            robot.setName(null);
            if( robot.getName() == null ) {
                System.err.println("Name test failed\nREASON: null name not allowed!"),
                return percentage;
            }
            percentage+=10;

            // model cannot be null
            robot.setModel(null);
            if( robot.getModel() == null ) {
                System.err.println("Model test failed\nREASON: null model not allowed!"),
                return percentage;
            }
            percentage+=10;

            /// COORDINATES

            // X cannot be outside 0..100
            robot.setX(-100);
            if( robot.getX() < 0 ) {
                System.err.println("X coord test failed\nREASON: Values less than 0 not allowed!"),
                return percentage;
            }
            percentage+=10;
            
            // X cannot be outside 0..100
            robot.setX(1000);
            if( robot.getX() > 100 ) {
                System.err.println("X coord test failed\nREASON: Values more than 100 not allowed!"),
                return percentage;
            }
            percentage+=10;

            // Y cannot be outside 0..100
            robot.setY(-100);
            if( robot.getY() < 0 ) {
                System.err.println("Y coord test failed\nREASON: Values less than 0 not allowed!"),
                return percentage;
            }
            percentage+=10;

            // Y cannot be outside 0..100
            robot.setY(1000);
            if( robot.getY() > 100 ) {
                System.err.println("Y coord test failed\nREASON: Values more than 100 not allowed!"),
                return percentage;
            }
            percentage+=10;

            /// MOVEMENT

            // Y cannot be outside 0..100
            robot.setY(0);
            if( robot.moveUp() ) {
                System.err.println("Move test failed\nREASON: moveUp() out of bounds!"),
                return percentage;
            }
            percentage+=10;

            // Y cannot be outside 0..100
            robot.setY(100);
            if( robot.moveDown() ) {
                System.err.println("Move test failed\nREASON: moveDown() out of bounds!"),
                return percentage;
            }
            percentage+=10;

            // X cannot be outside 0..100
            robot.setX(0);
            if( robot.moveleft() ) {
                System.err.println("Move test failed\nREASON: moveleft() out of bounds!"),
                return percentage;
            }
            percentage+=10;

            // X cannot be outside 0..100
            robot.setX(100);
            if( robot.moveRight() ) {
                System.err.println("Move test failed\nREASON: moveRight() out of bounds!"),
                return percentage;
            }
            percentage+=10;

            return percentage;
        }
    }
  ```
  * Заметьте что тест метод **runCase(AbstractRobot robot)** получает в качестве аргемента объект - наследника класса **AbstractRobot** - фактически дает нам возможность использовать любой объект любого класса нашего семейства роботов, т е - мы создали универсальный метод проведения базового тестирования для всего семейства классов **Robot**!
* Запускаем тест для одного объекта **AlhpaRobot** в **main()**
  ```java
  System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
  ```    

---

* Создайте класс **BetaRobot** и объявите его наследником класса **AlphaRobot**. 
   Предположим основной недостаток класса **AlphaRobot** это то что роботы не учитывают заряд своей батареи, и потому могут разрядиться на пол пути. 
   
   **BetaRobot** это новая серия роботов которые способны проверять уровень заряда и не застревать на пол пути!

   Реализуйте структуру этого класса так чтобы:
    1. Добавилось свойство **byte charge** - заряд!  (0..100)
    2. Конструктор класса должен соответствовать сигнатуре **BetaRobot(String name, String model)** где он пользуется частично логикой супер класса (делегируя **super(name,model)**) а так же устанваливает заряд в **charge** в 0 дефолт
    3. **setCharge(int charge)** защищен от установки значения в не **0..100**
    4. **getCharge()** работают как стандартные геттеры
    5. Перегрузить (Override) все четыре метода **moveXxxx()** передвижения таким образом чтобы заряд уменьшался ровно на 1 единицу - на каждые два шага! Так же сделать защиту таким образом чтобы - если заряд остался в запасе меньше чем на 5 единиц, методы передвижения возвращали бы **false** и робот не двигался (не менял бы координаты и при это не терялся бы заряд). Предположим это требуется для того чтобы если заряда мало - робот сохранял только основные свои функции! 
* Провести тот же тест и для объекта из второго поколения роботов:
    ```java
    System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new BetaRobot("Robo","beta") ) );
    ```    
* Продумать класс **ChargeTest** который протестирует следующие ситуации:
  1. попытается установить заряд -100 
  2. попытается установить заряд 1000 
  3. установит заряд на 50 и передвинет робота циклом в право до того времени пока он не остановится, проверит уровень заряда когда робот останивился


---    


* Создайте класс **CharlieRobot** и объявите его наследником класса **BetaRobot**. 
      
   **CharlieRobot** это новая серия роботов которые способны шагать по диагонали!

   Реализуйте структуру этого класса так чтобы:
    1. Конструктор класса должен соответствовать сигнатуре **CharlieRobot(String name, String model)** где он пользуется частично логикой супер класса (делегируя **super(name,model)**)
    2. Добавить еще 4 метода передвижения именуя их по принципу **moveDownRight()** 

* Продумать класс **DiagonalWalkTest** который проверит как он шагает по диагонали
* Провести все три теста для роботов **Charlie**

--- 

* Посмотрите на перечень классов еще раз, мы не использовали класс **RobotFactory**. Суть этого класса - как звучит его имя, "создавать" роботов. Мы этот класс будем использовать статично. Фабрика роботов ( шаблон разработки "Factory Pattern" ) - это то что как в реальной жизни - будет выпускать в свет "вещи" похожего типа! Чтобы наша фабрика начала "работать" - создайте этот класс и:
  1. Добавьте в нем метод ```public static AbstractRobot getRobot(String model, String name)```, этот метод получит имя модели (alpha,beta,charlie) и имя самого робота, возвращая объект соответсвующего класса! например
   ```java
   AbstractRobot robo = RobotFactory.getRobot("beta","Bobo"); 
   ```  
   вернет объект робота из класса **BetaRobot**
 
  2. Возникает вопрос - окей - ну фабрика способна создавать роботов но как сделать так чтобы в **main()** нельзя было создать робота напрямую !? Т е - как сделать так чтобы этот код
   ```java
   AbstractRobot robo = new BetaRobot("Bobo","beta",50);  
   ``` 
   не можно было запустить (аналогично для Alpha и Charlie) ?
   иными словами - чтобы в **main()** все роботы попадали только через логику фабрики!


---

БОНУС - прочитайте более детально инфу про "Паттерн Фабрики" и попробуйте ответить на вопрос - в чем приемущества такого подхода в плане реализации объектов?

БОНУС - Предложите и реализуйте 2-3 улучшения архитектуры и качество кода
