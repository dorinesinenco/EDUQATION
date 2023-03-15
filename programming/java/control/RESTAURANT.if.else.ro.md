* Înainte de a rula acest exemplu, rețineți următoarele 2 puncte cheie:
   1. Dacă opțiunea „altfel” (else) nu este necesară la verificarea unei anumite condiții, nu este necesar să o adăugați
      adică codul se poate descurca cu ușurință cu un **if**, ca în codul de mai jos
     ```java
     if( condition ){
         // instruction1;
         // instruction2;
         // ...
         // instructionn;
     }
     ```
      în același timp, un set de „n” instrucțiuni va fi executat numai dacă condiția este evaluată la **true**, altfel programul va „trece” peste acest bloc!
   2. Uneori, după verificarea unei anumite condiții, pe lângă instrucțiunile care trebuie executate, puteți incorpora un control pentru următoarea condiție, ca în acest cod
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
     în acest caz, un set de „n” instrucțiuni ale blocului părinte va fi executat numai dacă condiția **condition1** se evaluează la **true**, după care al doilea set de „n” instrucțiuni ale blocului copil va poate fi executat numai dacă condiția **condition2** este evaluată la **true**, altfel programul va „trece” peste ambele blocuri!

---

* Aveți  la dispozitie acest cod care imprimă MENIU într-un șir formatat datorită **.printf()** și codului de mai jos. Atenție la COD și la ce conține!
 
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

* În acest moment, interacțiunea utilizatorului arată astfel
   1. este afisat meniul
     ```
     ********* MENIUL **********
     1. Pizza 75,50 MDL
     2. Mamaliga 150,00 MDL
     3. Salata 30,00 MDL
     ************************
     ```
   2. utilizatorul introduce de exemplu 1 și primește un astfel de răspuns
     ```
     1
     Alegerea ta este: Pizza
     ```

* Necesar:
   1. Schimbați codul astfel încât în ​​meniu toate denumirile preparatelor să fie îmbrăcate între ghilimele
    ```
    ********* MENU ************
    1. "Pizza"        75.50 MDL
    2. "Mamaliga"    150.00 MDL
    3. "Salad"        30.00 MDL
    ***************************
    ```
   2. Înainte ca utilizatorul să selecteze un articol - afișați o invitație cu acest text
    ```
    CHOOSE AN OPTION >>>
    ```   
   3. După ce ați introdus opțiunea 1, sistemul ar trebui să răspundă
    ```
    Your choise is: "Pizza"
    ```
   4. În continuare, sistemul ar trebui să vă solicite să specificați numărul de porții ale felului de mâncare și să citiți numărul întreg specificat
    ```
    How many do you want ? 
    ```
   5. Dacă există un astfel de număr de porții în stoc, atunci
    ```
    3 x "Pizza"   (75.50MDL) = 225.00 MDL
    Confirm order ( 1 - yes, 0 - no )?
    ```
   6. Dacă nu există o astfel de cantitate în stoc, atunci
    ```
    You've ordered too many "Pizza", we only have 5
    PLEASE TRY AGAIN!
    ```  
   7. În al 5-lea paragraf, dacă persoana a fost de acord, atunci
    ```
    THANK YOU!
    ```  

BONUS, să presupunem că doriți să întrebați utilizatorul dacă dorește livrarea? dacă da, și a comandat cu mai puțin de 200 MDL - atunci livrarea va costa 50 MDL - includeți-l în factură și avertizează-l despre asta
