## lucru cu operatorii si tipuri de date simple

* Sa presupunem ca avem un inceput de aplicatie care poate prelua o comanda de mancaruri si poate calcula costul
  ```js
  food_1_name  = "Pizza"
  food_1_price = 75.00
  food_2_name  = "Salad"
  food_2_price = 25.00
  food_3_ ...  = ...
  
  ```
  - mai adaugati cateva "item"-uri dupa acelasi principiu

* Sa zicem ca ar trebui sa se afle cantitatea de fiecare item comandata dupa principiul 
  ```js
  food_1_quantity = parseInt( prompt(`How many "${food_1_name}" do you want?`) )
  ...
  ```
  - priviti cu atentie cum este construita expresia si continuati ideea pentru toate punctele din meniu (ce rol joaca functia **parseInt()** ?)
  - ce rol joaca `${identifier}` ?

* Calculam costul pentru fiecare pozitie
  ```js
  cost_1 = food_1_price * food_1_quantity
  cost_2 = ...
  ...
  ```
  - adaugati calculul costului total
  - adaugati o variabila numita **free_delivery**, astfel incat valoarea ei sa fie **true** atunci cand costul total depaseste 200 de unitati

* Completati intregul cod al aplicatiei astfel incat interactiunea cu aceasta sa arate cam asa:
  1. Sa apara o fereastra care reprezinta meniul 
  
    ```
    ################# FOOD ##################
    1. "Pizza"  75.00
    2. .....
    ################# FOOD ##################
    ```
  2. Sa apara cate un prompt pentru fiecare punct (daca clientul nu vrea o mancare, sa introduca 0) dupa cum e descris mai sus
  3. Sa apara o fereastra care arata urmatoarea nota de plata:
    ```
    ############### BILL ####################
    1. "Pizza" x 2 = 150.00
    2. "Salad" x 1 = ....
    ... 
    -----------------------------------------
    total: 300
    free delivery: true
    ############### BILL ####################
    ```
 
 * HINT: pentru ca transforma un numar cu virgula (cu precizie mare/mica) intr-un text cu un numar FIX de cifre dupa virgula puteti utiliza:
    ```js
    x = 100.1234567
    x.toFixed(2)     // va rezulta in 100.12
    ```
  
