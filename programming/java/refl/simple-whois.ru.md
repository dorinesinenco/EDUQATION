## Использование рефлексии, простые примеры

* Представим себе что у нас есть такая иерархия классов: **Box** - пустой абстрактный класс, роль которого - только в том чтобы "обобщить" два наследника под одну нишу, класс **SmallBox** - маленькая коробка (вмещает только 1 целое число), **BigBox** - большая коробка (вмещает 2 целых числа)

```java

public abstract class Box {
}

public class SmallBox extends Box {
    private Integer value;
    public Box () {}
    public Box (Integer value) { setValue(value); }
    public Integer  getValue() { return value; }
    public void setValue(Integer value) { this.value = value; }
}

public class BigBox extends Box {
    private Integer valueOne;
    private Integer valueTwo;
    public Box () {}
    public Box (Integer valueOne, Integer valueTwo) { 
        setValueOne(valueOne); 
        setValueTwo(valueTwo); 
    }
    public Integer  getValueOne() { return valueOne; }
    public Integer  getValueTwo() { return valueTwo; }
    public void setValueOne(Integer valueOne) {      
        this.valueOne = valueOne; 
    }
    public void setValueTwo(Integer valueTwo) {      
        this.valueTwo = valueTwo; 
    }
}

```

* Как вы видите, наследники не "совместимы" в плане структуры, у них отличаются и конструкторы, и методы, и свойства что внутри!
* Теперь представим себе что есть такой статичный метод в классе нашего приложения, суть которого протестировать коробку - путем установки внутри значения и проверки того если установленное значение можно прочитать:
  
```java
...
public static Boolean testBox(SmallBox box) {
    Integer value = new Random().nextInt();
    box.setValue(value);
    if(box.getValue() == value){
        return true; // test passed!
    } else {
        return false; // test failed
    }
}
...

```  
* Как вы видите данный код простой, устанавливает рандомное значение, после чего проверяет если объект выдает обратно то же значение, НО! у данного метода есть недостаток, он работает исключительно с классом **SmallBox**!
* От вас требуется переделать код так чтобы:
  * **testBox(...)** мог  принять в качестве аргумента любую коробку
  * если вдруг внутрь теста попала "большая коробка" - то тест считается успешно пройденным если оба значения которые установлены внутри совпадают с теми что мы получаем при помощи геттера
* ПРИМЕЧАНИЕ: если в Java у нас есть некий объект **object** и мы хотим узнать из какого он класса (т е - кто но), можем пользоваться методом **object.getClass()**
