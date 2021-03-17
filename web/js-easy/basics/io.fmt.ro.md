## JS Noțiuni de bază, intrare, ieșire. Operații simple.

> Când utilizați **prompt()** - orice valoare introduce utilizatorul în fereastră, această funcție returnează un text (String).


* Să presupunem că există un astfel de fragment de cod de pornire
  ```js
  a = prompt("Enter \"A\" value")
  b = prompt("Enter \"B\" value")
  ``` 
  atentie la CUM se adaugă ghilimelele in text!

* Rulați codul, pentru momnent acesta citește doar valori și le stochează în variabile **a**, **b**
* Utilizând functia **alert (...)** si operatorul **+**, si operatorii aritmetici ```*, /, +, -``` impreuna cu caracterul de întrerupere a liniei **"\n"** sa se afiseze rezultatul în fereastră în acest fel (să presupunem  ```a = 2, b = 1 ```):
  ```
  ######## VALUES #######
  a = 2               
  b = 1               
  ###### OPERATIONS #####
  a * b = 2           
  a / b = 2           
  a + b = 3           
  a - b = 1           
  #######################
  ```    
  valorile trebuie să fie cele care au fost introduse de la tastatură (în loc de ```2, 1```)

  de ex., dacă utilizatorul introduce ```20, 10```, atunci:
  ```
  ######## VALUES #######
  a = 20              
  b = 10              
  ###### OPERATIONS #####
  a * b = 200           
  a / b = 2           
  a + b = 30           
  a - b = 10           
  #######################
  ```    
---
BONUS - adisati acelasi lucru într-un document HTML folosind **document.write (...)**
