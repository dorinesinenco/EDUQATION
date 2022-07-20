## Structuri de control, for


* Avem dat un cod care afiseaza "harta" marii in simboluri
    1. **small_ship** - coordonata vaporului mic
    2. **x** - variabila care se plimba prin diapazonul 1-10
    3. **"W"** - vaporul
    4. **"~"** - apa

        ```python

        small_ship = 5
        for x in range(1,11):
            if x == small_ship:
              print( "W", end="" )
            else:
              print( "~", end="" )

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
