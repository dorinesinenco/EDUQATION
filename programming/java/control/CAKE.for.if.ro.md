## Expresii condiționate. Bucle, Bucla „for” construcție „if/else”


* Aveți acest cod 
 
     ```java
    
      public class DrawCakeWithForApp {

          public static void main(String[] args) {

             final int SMOKE  = 1; 
             final int FIRE   = 2; 
             final int CANDLE = 3; 
             final int CREAM  = 4; 
             final int BASE   = 5; 


             for(int level=1; level<5 ;level++) {
                 switch(level) {
                     case SMOKE: break;
                     case FIRE: break;
                     case CANDLE: break;
                     case CREAM: break;
                     case BASE:
                          for(int lines=1; lines<=3; lines++) {
                              for(int elements=1; elements<=11; elements++) {
                                  System.out.print("#");
                              }
                              System.out.println();
                          }
                     break;
                 }
             }


          }
      }

     ```

     care deseneaza "baza" tortului, e cere sa:

        1. Adăugați „case” la **switch**, astfel încât rezultatul să arate așa

          ```
           . . . . .
           . . . . .
           ^ ^ ^ ^ ^
           | | | | |
          ~~~~~~~~~~~
          ###########
          ###########
          ###########
          ```

         Unde:
          * # - BAZA
          * ~ - CREMA
          * | - LUMÂNARE
          * ^ - FOC
          * . - FUM
       
        2. Adăugați posibilitatea de a introduce de la tastatură „lățimea” tortului
