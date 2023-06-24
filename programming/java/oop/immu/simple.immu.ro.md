## Java Immutable. obiecte imuabile

> Imutabil (Invariabil) este numele obiectului a cărui stare internă (datele) nu poate fi modificată după crearea sa

> Principalul avantaj al unui obiect imutabil este faptul că codul nostru îl poate „distribui” în diferite metode fără teama că vreo metodă îl va schimba intre timp și acest lucru va duce cumva la prăbușirea algoritmilor care se referă (depind de) la el.


* Adică, din punctul de vedere al consumatorului, dacă logica consumatorului dorește să schimbe ceva în obiect, acesta va primi o copie a obiectului ca urmare a modificării, în locul obiectului original .
* Immutable stă la baza diferitelor clase Java (String, Integer, etc...)
* De exemplu

 ```java
 String message = "This is the original object";
        message.replace("original","modified");
 ``` 

  folosind metoda **replace()** din clasa **String** nu afectați originalul, această metodă returnează un nou obiect cu o modificare.

---

* Să încercăm să ne creăm propriul Immutable, pentru aceasta urmează pașii:
   1. Facem clasa **final** care va interzice moștenirea, și astfel posibila „relucrare” a mecanismului de protecție de către moștenitori (în acest caz, moștenirea este o lacună)
   2. Facem toate proprietățile private
   3. Oferim doar constructorului posibilitatea de a seta valoarea - deoarece noua valoare a câmpurilor va fi asociată cu noul obiect
   4. Toate celelalte metode trebuie să fie protejate de modificările interne
   5. Dacă dorim să creăm o metodă care „produce o modificare” - această metodă trebuie să creeze o nouă copie cu o valoare modificată și să ne returneze o copie fără a schimba originalul


* Să presupunem că avem o clasă **Currency** - monedă, cu câmpurile:
   * baseCode - codul valutei - (ex. „EUR”) față de care se calculează cursul de schimb
   * code - (de exemplu, „MDL”) cod valutar
   * value - (de exemplu, 17,50) valoarea coeficientului în raport cu o moneda de ```bază```
   * date - data (de exemplu, "2020-01-01") când această valoare a fost fixată (deoarece valoarea se poate modifica în funcție de dată)
    ```java

    final class Currency {
        private String baseCode;
        private String code;
        private Float value;
        private String date;
    }

    ```
   de ce să faci o astfel de clasă imutabilă? În afara contextului, poate părea lipsit de sens - răspunsul este foarte simplu - imaginați-vă o situație în care un obiect din clasa **Currency** va fi asociat cu un obiect de tipul **TotalCost** (costul comenzii) al unei anumite comenzi. Dacă comanda este plasată, să zicem, într-o zi, iar plata este scadentă în altă zi, iar coeficientul s-a modificat în această perioadă a zilei, atunci cu ce coeficient trebuie efectuată plata? În acest caz - trecerea obiectului valutar în diferite locuri din codul imutabil - ne va garanta că nu va fi schimbat în acele locuri unde obiectul există deja.

   * ESTE NECESAR:
     1. Adăugați un constructor parametrizat
     2. toString() pentru a verifica in consola
     3. getters pentru toate proprietățile
     4. și setteri pentru toate proprietățile, dar cu condiția ca fiecare setter să creeze o copie exactă a obiectului curent (this), să schimbe doar proprietatea pentru care este responsabil și să returneze o copie modificată

* Cum se verifică?
   * în **main()**

    ```java
    Currency todaysCurrency = new Currency("EUR","MDL",17.50f,"2020-01-01");
    Currency tomorrowsCurrency = todaysCurrency.setDate("2020-01-02");

    System.out.println(todaysCurrency);
    System.out.println(tomorrowsCurrency);
    ```  

* Întrebări:
   1. Câte obiecte **Monedă** au fost create ?
   2. Și dacă pentru **tomorrowsCurrency** ar trebui să modificați și coeficientul în ```18.00f``` - cum ar arăta în cod?
