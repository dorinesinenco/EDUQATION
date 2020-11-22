## Lucrul cu structurile si pointerii / alocarea memoriei
### Bazele arborilor

---

> part 2

---

Sa presupunem ca avem urmatoarea structura

```c

struct node {
  int value;
  
  struct node* first;
  struct node* second;
  struct node* third;
};

```

aceasta ne permite sa cream un "obiect" de tip **node** in memorie, care va contine o valoare intreaga - **value** si posibilitatea de a se conecta cu 3 noduri vecine.

schematic, acest lucru poate fi reprezentat astfel:

```
         /----> first 
   node  -----> second
         \----> third

```

ceea ce vedem mai sus, este un "segment" de arbore/graf

* sa se scrie un program care creaza urmatorul arbore - utilizand o singura variabila care "tine minte" inceputul (root - radacina) arborelui

```
                                    /-- first --> node[4]
            /-- first --> node[1]-- -- second --> node[5]
   root[0]  -- second --> node[2]   \-- third --> node[6]
            \-- third --> node[3]

```
valorile indicate in parantezele patrate trebuiesc setate in proprietatea **value**  

