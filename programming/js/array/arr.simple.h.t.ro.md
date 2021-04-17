## Operatii simple cu tipul Array


* Avand la dispozitie o colectie de tip Array sa zicem 
  ```js
  let a = [10,20,30]
  ```
  daca am aplica metoda (functia) **.push()** - acesta ar primi pe ultima pozitie o valoare noua
  ```js
  a.push( 40 )
  //               [10,20,30,40]
  // new value                ^
  ```
  daca am aplica metoda (functia) **.unshift()** - acesta ar primi pe prima pozitie o valoare noua
  ```js
  a.unshift( 0 )
  //               [0,10,20,30,40]
  // new value      ^
  ```

* imaginati-va urmatorea colectie de valori de tip String: sa presupunem ca acestea sunt numele clientilor care stau in "coada" de asteptare a unui restaurant unde si-au facut comenzile din meniu 
  ```js
  let clients = ["John","Marry","Kate"]
  ```
* se cere sa se scrie un ciclu **for** standard - care le-ar afisa in consola asa:
  ```
  1. John
  2. Marry
  3. Kate
  ```
* sa presupunem ca in aplicatia care "pozitioneaza"  comenzile au mai aparut doua liste:
  ```js
  let clientsHighPriority = ["Tob","Pete"]
  let clientsLowPriority = ["Vicky","Lessly"]
  ```
  se cere sa se adauge un script bazat pe metodele indicate mai sus, care va plata toti clientii prioritari in fata celor existenti in array-ul initial (clients) -  aceasta s-ar numi tehnic - adaugarea in cap-ul listei, si respectiv clientii din array-ul cu prioritate joasa sa fie adaugati dupa clientii care existau initial in coada de asteptare , tehnic - adaugare la coada listei
  dupa, afisati lista **clients** si rezultatul final ar trebui sa arate asa:
  ```
  1. Tob
  2. Pete
  3. John
  4. Marry
  5. Kate
  6. Vicky
  7. Lessly
  ```   
---
* OPTIONAL:
 1. Sa se grupeze codul care afiseaza rezultatul intr-o functie (pentru optimizare) - numita eventual **showClients()**
 2. Sa se scrie un algoritm iterativ (for + if/ while + if) care prin combinatie cu **prompt()** si **confirm()** ar cere numele clientului si daca tre de adaugat la coada sau in capul listei - pana in momentul in care va fi apasat "cancel" pe fereastra afisata de **prompt()**
  
  
