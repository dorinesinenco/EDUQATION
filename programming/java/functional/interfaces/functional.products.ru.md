## Функциональное программирование. ПОТОКИ, ОПЕРАЦИИ, ЛЯМБДА



* Дан класс продуктов:

    ```java
    public class Product{
        private String category;
        private String name;
        private Float price;
        private Integer quantity;

    }
    ```
    * дополнить класс конструктором, сет/гет-ами и преобразованием в строку
    
* Данны следующие функциональные интерфейсы:
  *  

    ```java
    @FunctionalInterface
    interface VATFunction 
    { 
        Product calculate(Product product); 
    } 
    ```
    
      который содержит логику вычисления стоимости НДС (он должен работать так: переданному продукту установить цену при вычислении НДС больше на 18% ) и вернуть "обновленный" продукт
  * 
      ```java
      @FunctionalInterface
      interface IsHealthPredicate 
      { 
          Boolean test(Product product); 
      } 
      ```
     определяет если продукт из категории "health" (здоровье)
        
  * 
      ```java
      @FunctionalInterface
      interface IsSHPredicate 
      { 
          Boolean test(Product product); 
      } 
      ```
     определяет если продукт из категории "second hand" (б / у)
  * 
      ```java
      @FunctionalInterface
      interface ConsolePrintConsumer 
      { 
          void consume(Product product); 
      } 
      ```
     получает продукт и выводит его в стандартную консоль 
        

* Требуется:
  * Ответить на вопрос - что такое **Predicate**, **Function** и **Consumer** и чем они отличаются в целом?
  * Объявить в **main()** список (ArrayList) из 5 продуктов
  * Объявить в **main()** в виде лямбд функции соответствующие 3-м заданным интерфейсам
  * При помощи преобразования коллекции продуктов в поток (.stream()) увеличить стоимость применяя НДС только тем продуктам из списка что не относятся к "health" или "second hand", после чего - вывести список обновленных продуктов

* Что подразумевают под "терминальные" операции в потоке?