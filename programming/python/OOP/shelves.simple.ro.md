## Lucrul cu obiectele si clasele. Notiuni de baza



* Sa presupunem ca sub forma de clasa in Python ni se ofera schita unui dulap de birou cu polite si sectiuni, care va reprezenta urmatoarea schema structurala:

  ```
  ##############################
  #         TOP SHELF          #
  ##############################
  #        MIDDLE SHELF        #
  ##############################
  #        BOTTOM SHELF        #
  ##############################
  ```
  in cazul dat, acesta are 3 politze (rafturi): **top** - cea de sus, **middle** - din mijloc si **bottom** - de jos

  sa declaram structura echivalenta in Python  printr-o clasa, dupa cum vedeti - aceasta contine 3 proprietati, care reprezinta politzele din dulap
  ```python
  class Cabinet():
    top = None
    middle = None
    bottom = None
    
  ```
  DE REMARCAT! daca pe una din politze nu se va afla nimic o vom marca cu valoarea "vida" - **None**!

* SE CERE:
  1. Sa se declare 3 proprietati pentru clasa **Cabinet** cu denumirile mentionate mai sus
  2. Sa se declare o metoda **putOn( shelfName, thing )** aceasta va primi drept argument denumirea politei si o valoare de tip string - thing, care va reprezenta un careva lucru. De exemplu ```cabinet.putOn("top","Flash light")``` ar trebui sa plaseze "Flash light" (o lanterna) pe politza de sus! Metoda data, va trebui sa verifice daca aceasta polita este libera si daca nu e, atunci sa afiseze un mesaj gen "Cannot place "Flash light" on top shelf, it is not empty!"
  3. Sa se declare metoda  **takeFrom( shelfName )** care va returna "lucrul" de pe polita, numele careia este indicat ca argument si il va sterge de acolo ( de exemplu ```cabinet.takeFrom("top")```), iar daca pe politza nu este nimic - va avertiza prin mesajul "Nothing to take! The top shelf is empty"
  4. Adaugati metoda **printSchema()** in clasa **Cabinet**, care atunci cand va fi apelata, va afisa schita dulapului in felul urmator (in cazul dat pe politza de jos, nu este nimic):
    ```
    ##############################
    #          A book            #
    ##############################
    #        flashlight          #
    ##############################
    #                            #
    ##############################
    ``` 