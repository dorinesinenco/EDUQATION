## Классы. Динамическое использование - объекты. Наследование


> При использовании наследования вы говорите: Этот новый класс похож на тот старый класс. В коде это пишется как extends, после которого указываете имя базового класса.

---

Нам необходимо создать приложения которое пользуется цепочкой классов связанных путем наследования, структура проекта:

```
PhoneInheritanceHistory
 - src/
   - main(package)
     - Application(Class + static main())
   - comm(package)
     - CellularPhone(Class)
     - MobilePhone(Class)
     - SmartPhone(Class)
```


* Структура класса **CellularPhone** (прямая линия) у каждого объекта которого будет 4 свойства (координаты начала и конца), а так же конструктор - который инициализирует их.
 
  ```java
  public class CellularPhone {
    // properties
    private String model;
    private String manufacturer;
    private int year;


  

   
  }
 