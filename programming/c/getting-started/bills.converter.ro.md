## Tipuri de date, operatii, formatare.

> In programare deseori se aplica un principiu numit "acumulator/acumulare", cel mai des asa este numita o variabila care mentine o valoarea intermediara atat timp cat au loc operatiuni consecutive in program care au nevoie de aceasta valoare. De exemplu daca am dori in C sa adunam o suma de bani de la 3 persoane consecutiv intr-un total avand sumele lor separate de bani si apoi sa cheltuim din acest total o suma de bani, codul ar arata cam asa:

```c
int money_1 = 100;
int money_2 = 200;
int money_3 = 300;

// acumulatorul cu suma totala
int money_accumulator = 0;

// cheltuieli
int expenses = 

// acumulam suma
money_accumulator = money_accumulator + money_1;
money_accumulator = money_accumulator + money_2;
money_accumulator = money_accumulator + money_3;

// scadem cheltuielile
money_accumulator = money_accumulator - expenses;

```

* In C exista o categorie de operatori numita "compacti" - care permit reducerea volumului de cod scris pentru realizarea anumitor operatiuni. De exemplu:

```c
int s = 10;
// daca am dori sa marim (acumulam) in "s" cu 100 mai mult am putea scrie
s = s + 100;
// sau mai compact
s += 100;
```

* Aceleasi optiuni sunt valabile pentru toti operatorii aritmetici

---

* Se cere sa se scrie o aplicatie care citeste de la tastatura o suma de bani si determina cate bancnote de 50, 20, 5 si 1 trebuiesc pentru a reprezenta aceasta suma. De exemplu - daca se introduce valoarea 113, programul ar trebui sa afiseze urmatorul rezultat pe ecran:
  ``` 113 MDL = 50MDL(2) + 20MDL(0) + 5MDL(2) + 1MDL(3)```
  in paranteze fiind indicat numarul de bancnote

