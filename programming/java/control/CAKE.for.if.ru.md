## Условные выражения. Циклы, Цикл "for" конструкция "if/else" 


* У вас есть такой стартовый код 
 
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

    коротый рисует основу торта, требуется:

       1. Дополнить "case"-ы в **switch** так чтобы результат выглядел следующим образом

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

        где:
         * # - BASE
         * ~ - CREAM
         * | - CANDLE
         * ^ - FIRE
         * . - SMOKE
       
       2. Добавить возможность ввода с клавиатуры "ширины" торта


