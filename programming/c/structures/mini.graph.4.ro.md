## Structuri in memorie. Fragment de graf

> În matematică şi mai specific în teoria grafurilor, un graf este o structură care corespunde unui grup de obiecte, în care unele perechi de obiecte sunt într-un anumit sens "legate" reciproc.

---

Sa presupunem ca avem la baza structura unui "nod" descrisa astfel

```c

typedef struct {
  int value;
  Node* linkOne;
  Node* linkTwo;  
} Node;

```

nodul poate contine o valoare intreaga si pana la doua MAXIM! legaturi cu alte noduri

Se cere, sa se creeze un program in C care in baza acestei structuri va crea urmatorul mini graf in memorie (cu alocare dinamica de memorie si pointeri)

```
            ---> nodeB[200]\
          /                 \
nodeA[100]                    ->  nodeD[400] 
          \                  / 
            ---> nodeC[300] /   

```

