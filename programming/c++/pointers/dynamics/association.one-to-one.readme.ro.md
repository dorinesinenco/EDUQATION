## Operarea cu pointerii. Asocierea dintre obiecte

> Deseori in programare se necesita crearea de "relatii" intre obiecte de acelasi tip sau de tip diferit. Una din variantele de relationare este "aosierea" de tip "unu la unu" (care poate fi unilaterala sau bilaterala).

* De exemplu daca am avea o clasa care descrie obiectele de tip **House** si o clasa de tip **Room**, am putea crea o relatie in clasa **House** (in obiectele acestei clase) fata de obiectele clasei **Room**, plasand un pointer in interior:

  ```c++
    class House{
        Room* relation;
    };

  ```

  ceea ce ar insemna ca la un moment dat in timp, daca am dori sa stabilim aceasta relatie intre doua obiecte "reale", ar trebui sa procedam in felul urmator:

   ```c++

    House house;
    house->relation = new Room( ... );

   ``` 
   
   aceasta are crea o relatie UNILATERALA intre obiectele "house" si "room". In cazul dat doar obiectul "house" va "sti" ca are o relatie, celalalt nu are legatura inversa si nu "cunoaste" faptul ca este asociat cu primul.

---

* Se cere:
  * Sa se declare o clasa pentru obiectele de tip **Job** (profesie) cu urmatoarele caracteristici: 
    * name - denumire
    * salary - salariul lunar
    * experience - experienta minima pentru angajare in ani
  * Sa se adauge in clasa **Job** un constructor cu parametri si o functie **print()** care afiseaza datele unui JOB
  * Sa se declare o clasa pentru obiectele de tip **Employee** (angajat) cu urmatoarele caracteristici: 
    * fullName - nume complet
    * year - anul de nastere
    * locality - localitatea de trai
  * Sa se adauge in clasa **Employee** un constructor cu parametri si o functie **print()** care afiseaza datele unui acestui angajat
  * Sa se creeze o relatie unilaterala care origineaza in obiectul de tip "angajat" si "puncteaza" (indica) obiectul de tip "Job" care i se asociaza, utilizand pointerii.
  * Sa se imbunatateasca functia **print()** din clasa **Employee**, astfel incat - atunci cand apelam ```employee.print()``` aceasta sa afiseze:
    ```John Doe, 1980 (London) - unemployed``` - in cazul in care acesta nu are un job, iar in cazul in care are un job sa afiseze caracteristicile profesionale in locul cuvantului "unemployed"