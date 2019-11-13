## Типы, операции, последовательность

> Оператор префиксного инкремента ++value и следовательно префиксного декремента --value В КОМПЛЕКСНОМ выражение, сначала "обновят" значение, потом вернут результат для остальной части выражения, в то время как постфиксный value++, value-- во первых вернут текущее значение для следующей операции, потом обновят значения внутри самой переменной 

* На основе выше изложенного попытайтесь запустить следующие фрагменты кода и объяснить каждый пример

1.   
  ```java
  int a = 10;
  int b = 100;
  int c = 1000;

  int result = a+++b+++c;

  System.out.println( "( " + a + "," + b + "," + c + " ) -> " + result );
  ```
2.   
  ```java
  int a = 10;
  int b = 100;
  int c = 1000;

  int result = ++a + ++b + ++c;

  System.out.println( "( " + a + "," + b + "," + c + " ) -> " + result );
  ```
3.   
  ```java
  int x = 10;
  int result = ++x + ++x + ++x;

  System.out.println( "( " + x + " ) -> " + result );
  ```



