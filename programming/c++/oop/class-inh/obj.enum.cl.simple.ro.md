## Clase si obiecte, mostenirea.

> Tipul de date ```enum``` permite sa se declare un set de valori asociative sau enumerate, cu scopul de a restriciona "optiunile" posibile pentru anumite variabile si proprietati. Altfel spus, enumerarea reprezinta o "lista de optiuni".

* Daca am dori sa declaram o simpla enumerare in C++ ar trebui sa scriem:
  ```c++
    enum
    {
        a,
        b,
        c
    };
  ``` 
  in acest caz a = 0, b = 1, c = 2 si acestea reprezinta niste valori fixe - constante, adica nu am putea rula urmatorul cod in continuare
  ```c++
  a++;
  ```
  
  Exista insa situatii in care e nevoie sa se creeze un "namespace" pentru enumerare pentru a exclude conflictele cu alte enumerar. In asa caz exista mai multe solutii, una dintre cele mai practice fiind:
   sa se amplaseze enumerarea intr-un namespace
      ```c++
      namespace example {
        enum
        {
            a,
            b,
            c
        };
      }
    ```  
---

* Sa presupunem ca trebuie sa scrieti o aplicatie pentru un laborator biologic. Pentru aceasta:
  * Se cere sa se declare clasa numita **BloodPacket** - un pachet de sange folosit in transfuzie, formata din proprietatile:
    * type (de tip enumerare cu valori de genul ```A,B,AB,O``` )
    * rhesus (de tip enumerare cu doar doua optiuni ```negative``` si ```positive```)    
    * volume (o valoare de tip numeric, reprezentand cantitatea in ```ml``` de sange)
  * Sa se adauge constructorul default si cel cu parametri pentru a putea crea un nou obiect din clasa declarata
  * Sa se adauge cateva verificari in constructor prin **if/else** sau/si **switch/case** astfel incat constructorul sa nu permita setarea parametrilor ```type``` si ```rhesus``` in afara celor 2 enumerari declarare, si volumul in ```ml``` sa nu depaseasca diapazonul 100 .. 500 (sa zicem ca astea sunt limitele pachetelor de pastrare a sangelui)
  * Sa se adauge metoda **print()** care afiseaza informatia despre obiect in felul (pentru un volum de 400 de ml de sange de tip A pozitiv):
    ```
    BLOOD[A+|400ml]
    ``` 
---
Sa se raspunda la intrebarile (in comentarii in cod):
 1. De ce avem nevoie de un constructor intr-o clasa?
 2. Ce numim metodele clasei?
 3. Ce numim proprietatile clasei?
 