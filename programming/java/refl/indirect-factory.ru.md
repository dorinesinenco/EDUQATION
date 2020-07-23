## Использование рефлексии, простой пример

* Java Reflection - то что дает вам возможность "взглянуть" под капот классов, объектов, их свойств и методов.

---

* Предположим у нас есть такой класс (капсула со значением внутри!)

```java

public class Box {
    private Integer value;
    public Box () {}
    public Box (Integer value) { setValue(value); }
    public Integer  getValue() { return value; }
    public void setValue(Integer value) { this.value = value; }
}

```
* А так же есть фабрика с таким кодом
```java

public class BoxFactory {
 public Object getBox(String className,Class argumentType,Object value) {
        Class classRef;
		try {
			classRef = Class.forName(className);
			Constructor constructor = classRef.getConstructor(argumentType);
		    return constructor.newInstance(value);
		} catch (Exception e) {

		}
		return null;
   }
}

``` 
* То есть внутри метода **getBox()** наш код динамично ссылаясь на объект класса, находит конструктор класса который соответствует указанному типу аргумента (как класс так и его конструктор - мы получаем в виде объектов из классов: Class, Constructor), запускает метод конструктора **.newInstance()** который создает нам новый объект (Object)!
* При этом код в main (это при том что класс **Box** находится в package **main**)

```java
...
    Box b = (Box)new BoxFactory().getBox("main.Box", Integer.class, 100);
    System.out.println(b.getValue());
...

```
* Данный код, создает объект класса **Box** - упоминая его полноценное имя "main.Box", тип аргумента (Integer.class) и - передавая во внутрь значение 100
* ТРЕБУЕТСЯ: добавить код в **Box** и в **main()** так чтобы класс **Box** получил еще один вариант конструктора: **Box(Boolean random)**, если обратиться к данному конструктору положив туда значение **true** - то коробка получит рандомное значение от 0 до 1000