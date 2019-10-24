### Aritmecica numerelor si cifrelor.

> Daca am dori sa zicem sa schimbam cu locul valorile a 2 variabile avand la dispozitie o a 3-a (una temporara), am putea face asta aplicand principiul "triunghiului" in felul urmator:

```c
int a = 10;
int b = 20;

int temp;

// triunghiul
temp = a; // s-a eliberat "a"
a    = b; // s-a eliberat "b"
b    = temp; // s-au mutat valorile
printf("a=%d, b=%d", a, b);
```

* De exemplu, daca am dori sa scanam un numar din doua cifre cu fiecare cifra de tip "char separat", si apoi sa le schimbam cu locul in memorie, codul ar fi cam asa:

```c
char d1,d2, temp;
printf("un numar din doua cifre: ");
scanf("%c%c",&d1,&d2); // in acest caz - fiecare cifra nimereste ca si simbol in d1 si d2
// daca de exemplu s-ar introduce 12 - atunci d1 = '1' si d2 = '2'. Nu confundati 
// '1' cu 1 - primul e caracter, al doilea e numar intreg
// daca ar fi acum sa schimbam cu locul cifrele astea si sa le afisam algoritmul ar fi:
temp = d1; 
d1    = d2;
d2    = temp; 
printf("%c%c",d1,d2);
```
* Observati ca noi nu schimbam ORDINEA DE AFISARE, cifrele sunt schimbate cu locul in memorie! Atentie - de azi inainte sa distingeti bine cand rezultatul este inversat doar pe ecran (in printf) si cand este memorizat "inversat" in memorie.
* Observati specificatorul de format "%c" - permite citirea sau afisarea unui singur caracter (in cazul nostru a unei cifre)
* Problema: de la tastatura se introduce un numar intreg "n" utilizand tipul de date "char" adica prin caractere.
* Acesta contine mereu 3 cifre (acest lucru este garantat!, adica e in diapazonul de la 100 pana la 999). Se cere sa se scrie un algoritm care SCHIMBA ORDINEA CIFRELOR IN MEMORIE in directie inversa si afiseaza numarul, adica daca se introduce **123** sa fie afisat **321**, daca se introduce **100**, afisati **001**. 

