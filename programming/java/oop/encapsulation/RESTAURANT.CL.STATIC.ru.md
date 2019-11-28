## Классы. Статика и инкапсуляция 

* Предположим есть такой файл "RestaurantChoosingApp.java"
  ```java
    public class RestaurantChoosingApp {
        public static void main(String[] args) {

        }
    }

    // ###################### RESTAURANT CLASSES ##########################
    class VeganRestaurant {
      static class Info {
        static void printName() {

        }
        static void printMenu() {

        }
        static void printAddress() {

        }
      }
      static class Menu {
        static double getPrice() {
           return 100.0;
        }
        static double getPrice(int portions) {

        }
      }
      static class SpecialMenu {

      }
    }

    class SushiRestaurant {
      static class Info {}
      static class Menu {}
      static class SpecialMenu {}
    }

  ```
  где есть два класса соответствующие конкурирующим двум ресторанам **VeganRestaurant**, **SushiRestaurant**. Каждый класс инкапсулируют еще 3 статичных класса (Info, Menu, SpecialMenu). 
    
    Суть Суб - классов:
    - Info - методы вывода информации о ресторане **printName()** выводит имя, **printAddress()** - адресс и **printMenu()** выводит опции меню.
    - Menu - два метода **getPrice()** возвращает стоимость одной порции меню а **getPrice(int portions)** вычисляет стоимость указанного количества порций и возвращает результат.
    - SpecialMenu - содержит такие же два метода как и класс **Menu** только это разновидность меню с специальными блюдами!
  

  ---
  * Требуется:
    1. Ответить на вопрос - почему нельзя например класс **Menu** каждого ресторана объявить прямо в этом файле - а приходится объявлять как Суб класс?
    2. Дополнить логику классов и методов таким образом (на ваше усмотрение - но! исходя из смысла их и сути их методов), чтобы при вызове ИСКЛЮЧИТЕЛЬНО методов **printMenu()** из того и другого ресторана в **main()**, мы получили бы такой результат:

    ```
    ########### Sushi Mini Restaurant ###########
    -- DownTown Str 88/A, Minicity             --
    MENU          x 1  portion         100.00 MDL
    MENU          x 5  portions(-10%)  450.00 MDL
    SPECIAL MENU  x 1  portion         300.00 MDL
    SPECIAL MENU  x 10 portions(-20%) 2400.00 MDL

    ########### Vegan Pure Restaurant ###########
    -- UpTown Str 77/B, Maxicity 
    MENU          x 1  portion          50.00 MDL
    MENU          x 5  portions(-5%)   238.50 MDL
    SPECIAL MENU  x 1  portion         200.00 MDL
    SPECIAL MENU  x 10 portions(-10%) 1800.00 MDL
    ```
    3. ВЫ ИМЕЕТЕ ПРАВО ДОПОЛНЯТЬ КЛАССЫ СВОИМИ МЕТОДАМИ (кроме требуемых) - а так же можете найти общую логику и применить наследование
    