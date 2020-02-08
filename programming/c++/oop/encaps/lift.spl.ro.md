## Principii OOP. Encapsularea

> Cand se proiecteaza o clasa (viitoarele obiecte ale unei clase) este foarte important sa se puna la punct "politica" externa a acestei clase.


* Sa presupunem ca avem clasa unui obiect de tip **Lift** care reprezinta logica de functionarea a unui lift dintr-un bloc locativ:
  
  ```C
  
    class Lift{

    };

  ``` 
  
*  Adaugati proprietatile:
   *  min_floor,max_floor - etajul minim la care este setat sa mearga liftul dat si etajul maxim, numere intregi, private (nu vrem decat liftul sa decida pana la ce etaj sa poate cobori si urca, ca sa excludem accidentele). Aceste valori pot fi schimbate doar din interior
   *  floor - numarul etajului la care se afla liftul, numar intreg, privat

* Adaugati un constructor public, care nu primeste nimic ca parametru, dar seteaza etajul minim = 0 (parter), etajul maxim = 9 (terasa), si etajul curent = 0.
* Adaugati metoda publica ```void showMap()``` care printeaza "harta" liftului in felul urmator (cu ajutorul unui ciclu):
    ```
        T | |
        8 | |
        7 | |
        6 | |
        5 | |
        4 | |
        3 | |
        2 | |
        1 | |
        P |X|
    ```      
    unde P - parter, T - terasa, X - marcat etajul la care se afla liftul la moment.

* adaugati (supraincarcati) operatorul public ++ si operatorul -- care vor muta liftul cu un etaj mai sus, respectiv - mai jos, tinand cont de etajul minim si maxim posibile.
* Testati urmatorul cod in ```main()```:
   ```C
     
     Lift l;
     l++;
     l++
     l++;
     l.showMap();
     l--;
     l--;
     l--;
     l--;
     l--;
     l.showMap();
   ```     
   ca rezultat, liftul tre sa apara prima data la etajul 3 (al 3-lea de la parter), iar apoi la parter, cu toate ca noi l-am instructionat sa coboare mai jos.