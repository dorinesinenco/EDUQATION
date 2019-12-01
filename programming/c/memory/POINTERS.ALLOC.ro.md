## Lucrul cu memoria. Pointeri (indicatori) si alocarea memoriei

> Pointerii reprezinta niste variabile specializape pe pastrarea adreselor de memorie.


* Sa presupunem ca avem o variabila de tip intreg "a" declarata in urmatorul bloc de cod. 
  ```c
  int a = 1000;
  ``` 
  Daca vom prelua adresa acestei variabile prin "&" si vom incepe sa facem operatii aritmetice simple cu ea (gen + sau -), ne vom deplasa in memorie intr-o directie sau alta (multi numeste asta - pasire prin memorie). In acest caz fiecare pas intreg va fi echivalent cu marimea in bytes a tipului pe care il reprezinta aceasta adresa.

  Adica daca noi scriem ```&a``` tipul acestei expresii este ```int&``` sau ```int*``` - ceea ce inseamna referinta la memorie de tip **int**. Deci adaugarea sau scaderea pasilor catre aceasta adresa se va masura in 4 bytes. 

  ATENTIE - daca nu stim cati bytes ocupa un tip in C, putem afla foarte simplu prin:
  ```c
  printf("the size of type int is %d bytes\n", sizeof(int) );
  printf("the size of variable a is %d bytes\n", sizeof(a) );
  ```
  in mod normal ar trebui sa vedeti 4 in ambele cazuri.

  Deci daca am scrie urmatorul cod ```&a + 1``` aceasta ar inseamna, treci peste o valoare de tip "int" in memorie, adica muta-te mai jos cu 4 bytes. Schematic:

  ```
   MEMORY
       ...
   [   ...   ]
   [999999997]
   [999999998]          x  <<<  &a - 1
   [999999999]
   [100000000]
   [100000001]
  +[100000002]          |  <<<  &a 
  +[100000003]          |   
  +[100000004]          |   
  +[100000005]          |  
   [100000006]          x  <<<  &a + 1
   [   ...   ]
       ...
  ```
  Deci daca dupa ce ne-am deplasa prin memorie in jos sau in sus am prelua valoare prin operatorul "*", am citi valoare de pe o alta celula din memorie. Prin urmare:
  ```c
  printf("the value before a is: %d", *(&a - 1) );
  printf("the value after  a is: %d", *(&a + 1) );
  ``` 
  Observati prioritatile operatorilor in acest caz paranteza a fost necesara pentru ca mai intai sa se calculeze adresa, apoi sa se ia valoarea de pe aceasta.

* Daca am dori sa pasim pornint de la un bloc de memorie de tip "int" cu pasi mai mici (sa zicem cu cate 2 bytes) atunci inainte sa facem pasirea, adresa obtinuta de tip ```int*``` trebuie convertita intr-o adresa de tip ```short*```, adica:
   ```c
   printf("the short value 2 bytes before a is: %hd", *((short*)&a - 1) );
   printf("the short value 2 bytes after  a is: %hd", *((short*)&a + 1) );
   ```   
   in acest caz se va schimba NU doar pasul, ci si cum va fi citita valoarea - ca ```short```,
   prin urmare, daca intalniti o expresie de tipul ```(type*)address``` - interpretati-o ca o schimbare (conversie de tip) a adresei.

---

* Sa presupunem ca vi se dau 3 variabile in memorie de 3 tipuri diferite:
  ```c
  long  a = 1000000;
  int   b = 100000;
  short c = 1000;

  long result;
  ``` 
  si o variabila de tip ```long``` - result. Se cere sa se sumeze toate trei valorile (a,b,c) si sa se plaseze rezultatul in variabila **result**. Sa se afiseze **result** pe ecran, cu conditia ca TOATE OPERATIILE din acest program sa se faca exclusiv pornind de la adresa variabilei **a**