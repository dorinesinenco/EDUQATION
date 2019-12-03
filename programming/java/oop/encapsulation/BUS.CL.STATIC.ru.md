## Классы. Статика и инкапсуляция 

* В класс **Bus** вложить класс **Wheels** - это капсула которая группирует информацию и логику о 6-и колесах автобуса в виде
 
  ```java
  /* ??? */ class Wheels {
            // Wheel numeric identifiers
            final static int FRONT_LEFT = 1;
            final static int FRONT_RIGHT = 2;
            final static int BACK_LEFT_PRIMARY = 3;
            // ???

            // wheel pressure values 
    /* ??? */ double frontLeftPSI = 100.0;
    // ???
  }
  ```  
  - заметьте что мы добавляем константы (напр - **FRONT_LEFT**) - идентифицирующие по номеру - расположение колеса!
  - как вы видите в название **frontLeftPSI** свойства колеса участвует  "PSI" - единица измерения давления (Pounds per Square Inch)
  - дополните названия и код для всех оставшихся колес учитывая то что 2 колеса спереди и 4 сзади, т е - после объявления вы должны получить 12 свойств в целом - 6 констант (номера колес) и 6 переменных (уровень давления в каждом колесе)

* Добавить классу  **Wheels** "своеобразный сеттер" (так как он будет немного модифицирован по сравнению с стандартным сеттером) - единственный сеттер класса, соответствующий формуле (прототипу) ```void setWheelPSI(double pressure, int whichWheel)``` - данный сеттер должен установить давление **pressure** указанному по номеру колесу  **whichWheel** с следующей политикой валидации значений:
  - давление любому из 6-и колес нельзя применить менее чем 0.0 PSI 
  - давления передних колес не более чем 120.0 PSI
  - давления задних первичных колес не более чем 100.0 PSI
  - давления задних вторичных колес не более чем 80.0 PSI
  - так же проверить если мы пытаемся назначить значение колесу которого нет в списке тех 6-и констант

  этот метод сделать **public** чтобы можно было проверить из **Application.main()**

  этот метод должен выводить сообщения об неправильно переданных значениях!

  НАПРЯМУЮ значения PSI не должны быть доступны вне класса **Wheels** 
  
  

* Добавить классу  **Wheels** "своеобразный геттер" (так как он будет немного модифицирован по сравнению с стандартным геттером) - единственный геттер класса, соответствующий формуле (прототипу) ```boolean getWheelPSI(int whichWheel)``` - данный геттер должен вернуть давление **pressure** указанному по номеру колесу  **whichWheel** 

  этот метод сделать **public** чтобы можно было проверить из **Application.main()**


* Таким образом мы добавили классу **Wheels** всего один универсальный геттер и сеттер, и не пришлось каждому колесу прописать отдельный геттер / сеттер

---

* Добавить напрямую в автобус (класс **Bus**) метод ```boolean isGoodToGo()``` суть которого дать ответ на вопрос - может ли ездить автобус или нет, данный метод вернет **true** только если:
  - при кол-ве пассажиров (**seats**) от 30 и выше давление во всех 6-ч колесах соответствует указанному лимиту (120.0,100.0,80.0) не менее чем на 95%
  - при кол-ве пассажиров (**seats**) до 30 достаточно чтобы давление во всех передних двух и в основных задних двух колесах соответствовало указанному лимиту (120.0,100.0) не менее чем на 95%

* Для условности будем считать что колесо проколото / не рабочее если PSI = 0.0
 
--- 
* После обновления логики класса, прокрутить в классе **Application** следующий тест:
  ```java
  void TestWheelsBasic(){
    // 4 working wheels within parameters
    Bus.Wheels.setWheelPSI(115.0, Bus.Wheels.FRONT_LEFT);
    Bus.Wheels.setWheelPSI(115.0, Bus.Wheels.FRONT_RIGHT);
    Bus.Wheels.setWheelPSI(100.0, Bus.Wheels.BACK_LEFT_PRIMARY);
    Bus.Wheels.setWheelPSI(100.0, Bus.Wheels.BACK_RIGHT_PRIMARY);
    Bus.Wheels.setWheelPSI(0.0, Bus.Wheels.BACK_LEFT_SECONDARY);
    Bus.Wheels.setWheelPSI(0.0, Bus.Wheels.BACK_RIGHT_SECONDARY);

    // Too many passengers
    Bus.setSeats(40);
    System.out.println( Bus.isGoodToGo() );
    // false

    // less passengers
    Bus.setSeats(29);
    System.out.println( Bus.isGoodToGo() );
    // true

    // pressurizing back wheels
    Bus.Wheels.setWheelPSI(80.0, Bus.Wheels.BACK_LEFT_SECONDARY);
    Bus.Wheels.setWheelPSI(80.0, Bus.Wheels.BACK_RIGHT_SECONDARY);


    // full bus
    Bus.setSeats(45);
    System.out.println( Bus.isGoodToGo() );
    // true    


  }


  ```
  
