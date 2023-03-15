
* Перед тем как выполнить этот пример запомните следующие 2 ключевых момента:
  1. Если при проверки определенного условия не требуется вариант "иначе" (else) - его не обязательно добавлять
     то есть код может спокойно обойтись одним **if**-Ом как в коде ниже  
     ```java
     if( condition ){
         // instruction1;
         // instruction2;
         // ...
         // instructionn;
     }
     ```
     при этом набор из "n" инструкций выполнится только если условие выдаст **true** иначе программа пройдет "мимо" этого блока!
  2. Иногда после проверки определенного условия, по мимо инструкций которые необходимо выполнить, можно вложить проверку очередного условия, как в этом коде
     ```java
     if( condition1 ){
         // instruction1;
         // instruction2;
         // ...
         // instructionn;
         if( condition2 ){
            // instruction1;
            // instruction2;
            // ...
            // instructionn;
         }
     }
     ```
    при этом набор из "n" инструкций родительского блока, выполнится только если условие **condition1** выдаст **true**, после чего второй набор из "n" инструкций дочернего блока выполнится только если условие **condition2** выдаст **true**, иначе программа пройдет "мимо" того и другого блока!

---

* На данный момент у вас есть код который выводит МЕНЮ в форматированную строку благодаря **.printf()** и коду что приведен ниже. Обратите внимание на КОД и на то что он содержит!
 
```java
import java.util.Scanner;

public class RestaurantApp {

    public static void main(String[] args) {
        
        // DATA LAYER
        final String CURRENCY = "MDL";
        
        final String FOOD_1_NAME = "Pizza";
        int food_1_available_quantity = 5; 
        final float FOOD_1_PRICE = 75.5f;
        
        final String FOOD_2_NAME = "Mamaliga";
        int food_2_available_quantity = 5;
        final float FOOD_2_PRICE = 150f;
        
        final String FOOD_3_NAME = "Salad";
        final float FOOD_3_PRICE = 30f;
        int food_3_available_quantity = 5;
        

        // PRESENTATION & LOGIC LAYER
        System.out.printf("\n********* MENU **********\n" +
                        "1. %-10s %7.2f %s\n" +
                        "2. %-10s %7.2f %s\n" +
                        "3. %-10s %7.2f %s\n" +
                        "*************************\n\n",
                FOOD_1_NAME, FOOD_1_PRICE, CURRENCY,
                FOOD_2_NAME, FOOD_2_PRICE, CURRENCY,
                FOOD_3_NAME, FOOD_3_PRICE, CURRENCY);

        Scanner in = new Scanner(System.in);
        int option = in.nextInt();

        if (option == 1) {
            System.out.println("Your choise is: " + FOOD_1_NAME);
        } 
	}
}
```

* На данный момент взаимодействие с пользователем выглядит так
  1. выводится меню 
    ```
    ********* MENU **********
    1. Pizza        75.50 MDL
    2. Mamaliga    150.00 MDL
    3. Salad        30.00 MDL
    *************************
    ```
  2. пользователь вводит например 1 и получает такой ответ   
    ```
    1
    Your choise is: Pizza
    ```

* Требуется:
  1. Изменить код так чтобы в меню все имена блюд были одеты в ковычки
    ```
    ********* MENU ************
    1. "Pizza"        75.50 MDL
    2. "Mamaliga"    150.00 MDL
    3. "Salad"        30.00 MDL
    ***************************
    ```
  2. Перед тем как пользователь выберет пункт - вывести приглашение с таким текстом
    ```
    CHOOSE AN OPTION >>>
    ```   
  3. После ввода опции 1, система должна ответить  
    ```
    Your choise is: "Pizza"
    ```
  4. Далее система должна попросить указать кол-во порций блюда, и прочитать указанное целое число  
    ```
    How many do you want ? 
    ```
  5. Если в наличие есть такое кол-во порций, то  
    ```
    3 x "Pizza"   (75.50MDL) = 225.00 MDL
    Confirm order ( 1 - yes, 0 - no )?
    ```
  6. Если же в наличие нет такого кол-ва то
    ```
    You've ordered too many "Pizza", we only have 5
    PLEASE TRY AGAIN!
    ```  
  7. В 5-ом пункте если человек согласился, то 
    ```
    THANK YOU!
    ```  

БОНУС, предположим требуется спросить пользователя хочет ли он доставку? если да, и он заказал на сумму менее чем 200 MDL - то доставка будет стоить 50 MDL - включить ее в счет и предупредить его об этом    
