## Clase. Utilizare dinamică - obiecte. Relații între clase (obiecte)

*ATENȚIE!!! În acest exemplu, va trebui să comparați valorile de tip **String**. Rețineți că, spre deosebire de valorile **int**, **double** nu este o primitivă, valorile **String** sunt obiecte! Prin urmare, compararea - de exemplu, a două valori din clasa **String** ca aceasta **==** - nu va fi corectă! Pentru a compara 2 obiecte **String**, trebuie să utilizați metoda **.equals()** imbricată în acest tip de date.

* De exemplu
    ```java
    String s1 = "AB";
    String s2 = "AC";

    if ( s1 == s2 ) { /* BAD !!! */ }
    if ( s1.equals(s2) ) { /* GOOD !!! */ }
    ```


> Imaginati-va că clasa „Parking” este un obiect care corespunde
> unei parcari cu 6 locuri amenajate astfel
> -----------
> | 1A | 2A |
> -----------
> | 1B | 2B |
> -----------
> | 1C | 2C |
> -----------

---

* Codul clasei **Parking** unde **freePlaces** - este numărul de locuri de parcare libere, **place1A** .. **place2C** - locurile pentru viitoarele obiecte din clasa **Car**.
    ```java
    class Parking{
        private byte freePlaces; 
        private Car place1A;
        private Car place1B;
        private Car place1C;
        private Car place2A;
        private Car place2B;
        private Car place2C;

        // ???
        
    }
    ```
* Este Necesar sa:
   1. adăugați un constructor in clasă astfel încât să seteze inițial numărul de spații libere egal cu - 6

   2. adăugați metoda „parkCar(Car c,String place)”, care va parca mașina la locul specificat - cum? pur și simplu obiectul de tip „Car” transmis ca argument trebuie să fie atribuit proprietății „placeXX” al cărei nume este transmis prin argumentul „place” de exemplu, ```parking.parkCar(c1,"1B")``` trebuie să verifice mai întâi dacă acest locul este liber (vom presupune că, dacă proprietatea **placeXX** este null, atunci locul este liber), apoi sa atribuie o referință la obiectul transmis acelei proprietăți.

   3. adăugați o metodă care afișează numărul de locuri de parcare libere

   4. adăugați o metodă printMap() care afișează o hartă în consolă într-un astfel de mod, unde este locul ocupat - se afiseaza marca automobilului, 0 - unde eliber (null)
        ``` 
            -------------------
            | BMW    | 0      |
            -------------------
            -------------------
            | 0      | 0      |
            -------------------
            -------------------
            | 0      |  Fiat  |
            -------------------
        ```   
        
         * ATENȚIE pentru a afișa marca în locul potrivit, utilizați car.print()
         

* clasa unui vehicul
 
    ```java 
    class Car{
        private String model;
        // ???
    }      
    ```  
     1. adăugați constructorul clasei
     2. adaugati setter / getter, setter - acceptă doar 3 mărci de mașini: BMW, Mercedes și Fiat
     3. adaugati metoda print() care imprimă modelul mașinii in consolă


* BONUS!!! - adăugați proprietatea **String id** in clasa **Car** - numărul mașinii (de exemplu, "AB-123"), adăugați setter/getter și actualizați constructorul și print(). Ca **print()** sa afiseze
 
        ``` 
            ----------------------------
            | BMW         | 0          |
            | [AB-123]    |            |
            ----------------------------
            ----------------------------
            | 0           | 0          |
            |             |            |
            ----------------------------
            ----------------------------
            | 0           |  Fiat      |
            |             |  [XY-567]  |
            ----------------------------
        ``` 
