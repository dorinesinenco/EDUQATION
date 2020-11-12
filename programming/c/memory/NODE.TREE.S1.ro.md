## Lucrul cu structurile si pointerii / alocarea memoriei
### Bazele arborilor

---

> part 1

---

Sa presupunem ca avem urmatoarea structura

```c

struct node {
  int value;
  
  struct node* first;
  struct node* second;
};

```

aceasta ne permite sa cream un "obiect" de tip **node** in memorie, care va contine o valoare intreaga - **value** si posibilitatea de a se conecta cu 2 noduri vecine.

schematic, acest lucru poate fi reprezentat astfel:

```
         /----> nodeB 
   nodeA 
         \----> nodeC

```

ceea ce vedem mai sus, este un "segment" de arbore/graf

* sa se scrie un program care creaza aceste trei noduri si le leaga intre ele in asa mod incat acestea sa corespunda desenului si conditiei: nodul A tre sa pastreze valoarea 100, nodul B - 200 si C - 300

