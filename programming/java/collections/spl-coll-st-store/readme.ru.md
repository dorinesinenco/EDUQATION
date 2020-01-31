### работа с коллекциями ArrayList, Collections

> Статичный класс "Arrays"  в Java, предоставляет функции для обработки массивов

* представим себе следующую ситуацию, клиент собрался в магазин с списком желаемых покупок **listOfWishes**. Обратите внимание на то как в список добавлять массово значения (дабы не пользоваться ```.add()```, по одному значению). Каждая позиция в списке - название продукта и через запятую - необходимое кол-во (упаковок).
* **listOfOffers** - список продуктов - предоставляемых магазином в каждой ячейке которого название продукта и стоимость одной упаковки.
* Вопрос: - зачем в 2-х местах в коде добавили ```(ArrayList<String>)``` ?
* Вопрос: - ка можно из ```"Spaghetti,2"``` получить отдельно **"Spaghetti"** - как строку и **2** - как целое число?

```java
  
  // CLIENT WISHES
  ArrayList<String> listOfWishes = (ArrayList<String>)Arrays.asList( 
    "Spaghetti,2", 
    "Pepper,5",
    "Sugar,1"
  ); 

  // STORE OFFERS
  ArrayList<String> listOfOffers = (ArrayList<String>)Arrays.asList( 
    "Spaghetti,10.00", 
    "Sugar,5.00",
    "Water,2.50"
  ); 
  // ???
```
* ТРЕБУЕТСЯ - написать алгоритм который сопоставит списки и создаст такой результирующий список - **listOfPurchases** - список покупок
   ```java
  
    // CLIENT FULFILLED WISHES
    ArrayList<String> listOfPurchases = new ArrayList<>();
    // ???

    // 0 -> "Spaghetti,2=20.00"
    // 1 -> "Sugar,1=5.00"

  ```

