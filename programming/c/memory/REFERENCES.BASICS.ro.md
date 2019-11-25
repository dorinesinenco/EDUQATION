## Lucrul cu memoria si cu referintele (adresele) variabililor

> C este unul dintre rarele limbaje din cele de TOP care permit accesul direct la memorie, ceea ce pe de o parte ii ofera un avantaj fata de alte limbaje, pe de alta parte cere mai multa raspundere din partea dev-ului.


* Sa presupunem ca avem o variabila de tip intreg "a" declarata in urmatorul bloc de cod. 
  ```c
  int a = 1000;
  ``` 
  In momentul executarii programului, aceasta variabila va fi plasata in memorie, incepand cu o anumita adresa. Daca ne-am imagina ca memoria operativa dedicata programului pe care il lansam este asemeni unui "array" (tabel) foarte mare, unde indicele poate ajunge la valori de milioane si chiar miliarde, ar fi mai usor sa intelegem ce este "adresa" unei variabile. 

  Daca va uitati in schema de mai jos, sa presupunem ca variabila "a" a primit "spatiu in memorie" incepand cu adresa 100000002, ocupand in jos 4 bytes (pentru ca int - ocupa 4).
  ```
   MEMORY
       ...
   [   ...   ]
   [100000000]
   [100000001]
  +[100000002]  byte 0  |  <<<  int a (variable) 
  +[100000003]  byte 1  |   
  +[100000004]  byte 2  |   
  +[100000005]  byte 3  |  
   [100000006]
   [   ...   ]
       ...
  ```
  Deci de fiecare data cand noi mentionam variabila "a" in cod, de fapt programul acceseaza acest segment de memorie. Prin urmare, variabila este o "comoditate", in loc noi sa scriem formule care folosesc adrese numerice - a lucra prin denumirea variabilei este mult mai simplu.

  Adresa in sine - nu e nimic altceva decat "indicele" celulei din care incepe locul variabilei in memorie (in tabelul memoriei), iar lungimea spatiului ocupat este determinata de tip.

* Daca am dori in C sa aflam adresa unei variabile, e indeajuns sa scriem
  ```c
  printf("%u",&a);
  ``` 
  deci formula ```&variable``` este cea ce ne returneaza adresa (referinta) acesteia.  

* Daca dorim sa accesam valoarea de pe o anumita adresa in C (de exemplu pentru situatia concreta discutata in exemplul din schema de mai sus), putem sa plasam operatorul "*" in fata adresei (este operatorul de dereferentiere) - mai simplu spus - operatorul de accesare a valorii de pe adresa. Prin urmare daca am rula in exemplu precedent codul
  ```c
  printf("%d", *100000002);
  ``` 
  am citi valoarea lui "a" prin adresa, asta ar fi si echivalentul a
  ```c
  printf("%d", *&a);
  ``` 
  ceea ce s-ar citi "afiseaza valoarea de pe adresa variabilei **a**"

  prin urmare
  ```c
  (*100000002)++;
  (*&a)++;
  ``` 
  ar incrementa valoarea lui "a" prin adresa indicata.


---
* Sa presupunem ca avem asa un fragment de cod in "main()"
   ```c
   char c = 'A';
   while( (*&c) != 'Z' ){
     (*&c)++;
   }
   printf("%c", *&c);
   ``` 
   - ce se va afisa pe ecran?
   - cum explicati rezultatul?
    
* Sa presupunem ca avem asa un fragment de cod in "main()"
   ```c
   int x = 1000;
   int y = 2000;
   (*&x) += (*&y);
   printf("%d %d", *&x, *&y);
   ``` 
   - ce se va afisa pe ecran?
   - cum explicati rezultatul?