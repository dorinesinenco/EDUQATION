## Structuri de date, obiecte, mostenire

[PARTEA 1]

* Sa presupunem ca avem sctructura **Cabinet** (clasa) care descrie obiectele de tip "dulap" cu 3 polite

  ```
  ##############################
  #         TOP SHELF          #
  ##############################
  #        MIDDLE SHELF        #
  ##############################
  #        BOTTOM SHELF        #
  ##############################
  ```
  in acest caz: top - cea de sus, middle - cea din mijloc 
  si bottom - cea de jos

  declaram clasa echivalenta in  Java 

  ```java
  class Cabinet {
      private Thing topShelf;
      private Thing middleShelf;
      private Thing bottomShelf;
      
  }
  ```

  ATENTIE! tipul **Thing** - reprezinta o clasa abstracta prin care se subintelege orice lucru! (adica - direct nu putem instantia obiecte din aceasta clasa!). 

  ```java
  abstract class Thing {
      public abstract void setName(String name);
      public abstract String getName();
  }
  ```
  - INTREBARE - despre ce va vorbesc cele doua metode din clasa **Thing** ?



* SE CERE:
  1. Adaugati constructorul fara parametri **Cabinet**
  2. Adaugati metoda **Thing whatIsOn( String shelfName )** care primeste ca argument denumirea politzei si returneaza obiectul aflat pe ea. De exemplu ```whatIsOn("topShelf") ``` returneaza **null** daca pe acea politza nu este un obiect. 
  3. Adaugati metoda **void put( String shelfName, Thing thing )**  care trebuie sa seteze obiectul transmis pe politza a carei denumire a fost indicata in **shelfName**. De exemplu ```put( "topShelf", new Book("Programming in Java for beginners.") )``` va plasa obiectul de tipul **Book** (care tre sa fie mostenitor al clasei Thing) pe polita de sus!
  4. Adaugati metoda **Thing take( String shelfName )** care va primi denumirea politei si va returna obiectul de pe acea polita, de asemenea stergand (eliminand) obiectul de pe acea polita (va seta **null** in proprietatea respectiva)   
  5. Creati 2-3 clase mostenitoare ale clasei **Thing** (de exemplu Book, Tablet, Phone, ...)
   