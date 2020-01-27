### работа с коллекциями ArrayList, ячейки с String значениями

* Предположим есть коллекция имен разработчиков компании в том порядке в котором их взяли на работу

```java
  ArrayList<String> devs = new ArrayList(); 
  // 1.      ^^^^ ??? 
  // adding data to the list
  devs.add("Johny");
  devs.add("Valerya");
  devs.add("Tatyana");
  devs.add("Peter");
  devs.add("Marry");
  
  // showing the initials, use "charAt(index)" from "String" class
  for( /* 2. ??? */ ) {          
      // 2. ???
  }

  // the longest name, use "length()" from "String" class
  int maxLength = 0;
  for( /* 3. ??? */ ) {          
      // 3. ???
  }

  // swap values
  String temp;
  // 4. ???
```
1. Что означает ```<String>``` ?
2. Вывести только их инициалы в таком формате
   ```
   1.   "J."
   2.   "V."
   3.   ....
   ```  
3. Найти самое длинное имя (вспомните поиск максимального значения!)
4. Написать код который поменяет местами имя из первой и последней ячеек при помощи промежуточного хранения значения в **temp** (вспомните принцип треугольника!)