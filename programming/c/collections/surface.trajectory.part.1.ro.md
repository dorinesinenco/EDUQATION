## Coordonate si array

* sa presupunem ca sub forma de array sunt indicate coordonatele unei suprafete (relief) de pamant:
```c
int x[]= {100,200,300,400,500,600,700};
int y[]= {100,200,100,200,300,200,100};
```

 - unde y - este elevatia in metri iar x - este distanta pe orizontala

* daca am reprezenta grafic acest relief ar arata cam asa, e un relief cu doua varfuri


```
Y
^
.
|
.                      s     x     e
|                      *---/---\---*
|                        /       \
.          x           x           x
|        /   \       /               \ 
|      /       \   /                   \
.     x          x                       x 
|
|
.-----.-----.-----.-----.-----.-----.-----.-----.-----.--...> X
0     100   200   300   400   500   600   700   ...
```

* sa presupunem ca ni se ofera coordonatele a inca 2 puncte care descriu inceputul si sfarsitul unei traiectorii de zbor a unui obiect
```c
int x_s = 400;
int y_s = 250;
int x_e = 600;
int y_e = 250;
```
 - unde _s - punctul de start, _e - punctul de sfarsit

---

* se cere sa se scrie un algoritm care verifica (pentru cazul prezentat concret pentru datele fixate mai sus), daca traiectoria obiectului va fi una de impact (sau coleziune) cu suprafata. Practic, algoritmul trebuie sa reprezinte un ciclu iterativ care verifica daca macar 1 segment din toate cele ce reprezinta suprafata, se intersecteaza cu segmentul ce reprezinta traiectoria lineara.

* NOTA: cea mai simpla abordare ar putea sa se bazeze pe conditii compuse din compararea simultata a coordonatelor de inceput si de sfarsit a fiecarei din cele 2 segmente verificate.
* NOTA: pentru simplificare, rezolvarea poate fi inceputa fara iterare (fara ciclu), accessand direct coordonatele segmentului aflat pe x - 400..500 de pe suprafata si cele date de traiectorie.
