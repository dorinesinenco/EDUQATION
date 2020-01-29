## Clase si obiecte, mostenirea.

> Mostenirea (Inheritance), este procedeul prin care o clasa derivata isi primeste partial sau total caracteristicile dintr-o clasa de baza.

* Sa presupunem ca avem o clasa care descrie un model de baza a unei "drone" (zburatoare) care este declarata in interiorul unui namespace (spaziu, zone) numita **air**:
  ```c++

    namespace air
    {
       class Drone {
         // ???
       };
    };

  ``` 
  cand aveti o clasa declarata intr-un namespace, utilizarea acesteia nu difera foarte mult de utilizarea oricarei alte clase, doar ca pentru a o accesa va fi necesar fie sa utilizati "using" fie sa mentionati nampespace-ul prefixat "air::Drone" peste tot unde va referiti la clasa.

  * Adauti proprietatile:
    * model (string) - modelul dronei
    * Altitude (int) - altitudinea (inaltimea) in metri la care se afla drona
    * airborne (bool) - se afla oare in zbor (true) sau "parcata" (false)
  * Adaugati constructorul clasei cu parametri 
  * Adaugati metoda **print()** care afiseaza datele despre drona in modul:
    ```DRONE["Acvila",0m,parked]``` - pentru o drona cu model "Acvila" parcata la sol - la 0 metri altitudine.
  * Adaugati metoda **flyTo(int altitude)** care "dirijeaza" drona in sus pana la altitudinea indicata, respectiv schimband valoarea proprietatii ```ariborne``` in ```true``` si ```altitude``` in valoarea transmisa      
  * Adaugati metoda **landTo(int altitude)** care "dirijeaza" drona in jos pana la altitudinea indicata si o aterizeaza (pacheaza), respectiv schimband valoarea proprietatii ```ariborne``` in ```false``` si ```altitude``` in valoarea transmisa      
  * Testati modul in care functioneaza metodele adaugate pana acum

---
 
* Sa presupunem ca a mai aparut o versiune noua de drone (o noua generatie cu upgrade) care este reprezentanta prin urmatoarea clasa:
  ```c++

    class AlphaDrone /* ??? */ {
      // ???
    };

  ``` 
  * Aceasta clasa trebuie declarata in acelasi namespace (pentru ca tine de obiecte zburatoare), doar ca va trebui sa completati codul clasei astfel incat:
    * ea sa mosteneasca caracteristicile dronei de baza
    * clasa sa contina urmatoarele proprietati adaugatoare:
      * longitute (float) - coordonata geografica, locul in care se afla drona pe glob
      * latitude (float) - coordonata geografica, locul in care se afla drona pe glob
      * charge   (unsigned short) - drona poate sti exact in % cat de incarcat ii este acumulatorul
    * adaugati constructorul care va initializa toate proprietatile utilizand si mostenirea (delegarea logicii)   
    * suprascrieti metoda **flyTo(int altitude)** astfel incat daca incarcatura bateriei nu depaseste 10%, atunci aceasta metoda sa nu faca absolut nimic, (drona sa ramana acolo unde se afla)
    * supraincarcati metoda **flyTo(int altitude)** astfel incat aceasta sa primeasca si 2 parametri noi (latitude, longitude) ca sa putem sa ii indicam in ce coordonate sa se deplaseze si la ce altitudine drona, aceasta metoda tre sa tina cont de incarcatura bateriei exact asa ca si varianta sa de mai sus
    * suprascrieti metoda **print()** astfel incat aceasta sa afiseze datele despre drona in asa mod:
      ```
       DRONE["Hawk",0m,parked,100%]
       (110.00,-60.00)

      ``` 
        in paranteze rotunde fiind latitudinea si longitudinea in grade.
