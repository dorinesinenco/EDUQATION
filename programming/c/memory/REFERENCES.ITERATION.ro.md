## Lucrul cu memoria si cu referintele (adresele) variabililor, aritmetica adreselor

> In C, atunci cand declari o structura de date (de exe - array, struct, enum, union, ...), adresa structurii coincide cu adresa primului byte din aceasta structura.


* Sa presupunem ca avem o variabila de tip array cu celule intregi. 
  ```c
  int a[] = { 1000, 2000, 3000 };
  ``` 
  Aceasta variabila ocupa in memorie 12 bytes.

  Daca am scrie urmatorul cod  

  ```c
  printf("the first array value is %d\n", *(&a) );
  ```
  ceea ce inseamna - valoarea de pe adresa lui "a", nu am primi un rezultat corect, din cauza ca aceasta adresa nu reprezinta un "int" ci un array de int-uri, din acest motiv pe langa avertizari (warnings), am primi si o valoare eronata.

  Ca sa citim valoarea primei celule din array-ul "a" prin adresa lui, ar trebui mai intai sa convertam tipul adresei din "adresa de array" catre adresa de "int".
  ```c
  printf("the first array value is %d\n", *((int*)&a) );
  ```
  si apoi abia sa luam valoarea.

---
* In baza exemplelor de mai sus incercati in urmatorul program:
  ```c
  int a[] = { 1000, 2000, 3000, 4000, 5000 };
  ``` 
  folosind aritmetica adreselor si ciclul "for", sa afisati valorile din array pornind de la adresa **&a** in felul urmator:
  ```
    1000
    2000
    3000
    4000
    5000
  ```