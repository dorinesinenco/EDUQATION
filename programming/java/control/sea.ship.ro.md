## Structuri de control, for/while


* Avem dat un cod care afiseaza "harta" marii in simboluri
    1. **small_ship** - coordonata vaporului mic
    2. **x** - variabila care se plimba prin diapazonul 1-10
    3. **"W"** - vaporul
    4. **"~"** - apa

        ```java

        int small_ship = 5;
        for(int x=0; x<10; x++) {
            if (x == small_ship) {
              System.out.print( "W" );
            }
            else {
              System.out.print( "~" );
            }

        ```

        dupa rularea codului:

        ```
        ~~~~W~~~~~
        ```

* SE CERE:
    1. Sa se schimbe codul astfel incat coordonata vaporului sa poata fi data de la tastatura
    2. Variabila **small_ship** sa fie inlocuita cu **big_ship** - vaporul mare, adica - coordonata vaporului mare
    3. Sa se schimbe codul  **if/else** astfel incat daca ```big_ship = 5``` - rezultatul sa arate asa
     
        ```
        ~~~wWw~~~~
        ```
