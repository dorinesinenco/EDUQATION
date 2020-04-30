## Принцип капсулы. Сеттеры и Геттеры.

> часть 1

* Предположим у вас есть класс "чашка" Cup которую можно охарактеризовать 2-мя свойствами:
  1.  liquidName - название жидкости что внутри
  2.  liquidVolume - объем жидкости что внутри

* Требуется:
  1. выбрать типы "TypeA" и "TypeB" так чтобы класс соответствовал описанию что выше
  2. ВОПРОС - Применяется ли капсула к данному классу?
  3. Добавить set/get пару для обейх свойств соблюдая:
     1. В чашку данного класса можно наливать только "Water", "Milk","Tea"                                                             
     2. Объем жидкости не может превысить 600 ml и не может быть отрицательным!
  4. Поместить класс "Cup" в package "kitchen" а в package "main" создать "Application" с методом "main()"
  5. В "Application / main()" создать две чашки:
     1. cupA = с 300 ml молока
     2. cupB = с 500 ml воды
     3. вылить 50 ml молока из чашки "cupA"
     4. налить еще 50ml в чашку "cupB"
     5. вывести в консоль информацию о "cupA" и "cupB"

```java
class Cup {

    private /* TypeA */ liquidName;
    private /* TypeB */ liquidVolume;

    Cup(){

    }
    Cup( /* TypeA */ liquidName, /* TypeB */ liquidVolume ){
        this.liquidName = liquidName;
        this.liquidVolume = liquidVolume;
    }

    // ??? +set/+get
}

```
