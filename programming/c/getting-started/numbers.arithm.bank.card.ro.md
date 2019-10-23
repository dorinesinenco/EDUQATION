## Operatii aritmetice, Numere

> Atat timp cat in C lucrati cu numere intregi, toate operatiunile aritmetice vor rezulta in valori intregi
> Daca am avea un numar sa zicem 123456 (dat in orice baza) am putea sa il separam in 2 parti a cate 3 cifre folosind impartirea intreaga si restul impartirii intregi in felul urmator

```c
int n     =   123456;
int left  = n / 1000;  // 123
int right = n % 1000;  // 456
```
> De ce 1000? pentru ca in acest caz se alege mereu prima unitate "1" care depaseste numarul de cifre dorit. 
> De exemplu in hexazecimal schema functioneaza la fel (si in octal si binar e la fel), atentie la modul in care sunt marcate numerele hexazecimale cand le dati valori in cod - "0x....."!
```c
int n     =   0xabcdef;
int left  = n / 0x1000;  // abc
int right = n % 0x1000;  // def
```
---
* Cardurile bancare de obicei contin pe ele asa-numitul "primary account number (PAN)". Cel mai des acesta este dat in formatul de 16 cifre zecimale.
* Sa se scrie un program care citeste numarul unui card bancar (sa zicem 1111222233334444) de la tastatura sub forma de numar intreg foarte mare fara semn. Puteti numi variabila "card_number". Programul va separa acest numar in 4 numere separate mici intregi fara semn (puteti numi aceste variabile in forma "card_n_1", "card_n_2", ...). In cele din urma programul va afisa numerele obtinute pe ecran in urmatorul format:
  ```card number: 1111-2222-3333-4444```
  
   