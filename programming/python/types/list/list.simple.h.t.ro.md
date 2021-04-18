## Operatii simple cu tipul - list


* Avand la dispozitie o colectie de tip **list** sa zicem 
  ```py
  a = [10,20,30]
  ```
  daca am aplica metoda (functia) **.append()** - acesta ar primi pe ultima pozitie o valoare noua
  ```py
  a.push( 40 )
  #               [10,20,30,40]
  # new value                ^
  ```
  daca am aplica metoda (functia) **.insert()** - acesta ar primi pe prima pozitie o valoare noua, atentie primul zero e indicele!
  ```py
  a.insert( 0, -10 )
  #               [-10,10,20,30,40]
  # new value      ^
  ```

* imaginati-va urmatorea colectie de valori de tip **str**: sa presupunem ca acestea sunt numele clientilor care stau in "coada" de asteptare a unui restaurant unde si-au facut comenzile din meniu 
  ```py
  clients = ["John","Marry","Kate"]
  ```
* se cere sa se scrie un ciclu **for .. in .. range()** standard - care le-ar afisa in consola asa:
  ```
  1. John
  2. Marry
  3. Kate
  ```
* sa presupunem ca in aplicatia care "pozitioneaza"  comenzile au mai aparut doua liste:
  ```py
  clientsHighPriority = ["Tob","Pete"]
  clientsLowPriority = ["Vicky","Lessly"]
  ```
  se cere sa se adauge un script bazat pe metodele indicate mai sus, care va plasa toti clientii prioritari in fata celor existenti in lista initiala (clients) -  aceasta s-ar numi tehnic - adaugarea in cap-ul listei, si respectiv clientii din lista cu prioritate joasa sa fie adaugati dupa clientii care existau initial in coada de asteptare, tehnic - adaugare la coada listei
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
 2. Sa se scrie un algoritm iterativ (for + if/ while + if) care prin combinatie cu **input()** ar cere numele clientului si daca tre de adaugat la coada sau in capul listei atat timp cat numele introdus nu va fi ""
  
  
