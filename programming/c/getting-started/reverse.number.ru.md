### Числа и символы.

>  Чтобы менять значения двух переменных, используя промежуточную третью (временную), мы могли бы сделать это, применив принцип «треугольника» следующим образом:

```c
int a = 10;
int b = 20;

int temp;

// треугольник
temp = a; // освободился "a"
a    = b; // освободился "b"
b    = temp; // значения поменялись
printf("a=%d, b=%d", a, b);
```

* Например, если мы хотим отсканировать двузначное число с каждым «отдельным символом» номером, а затем изменить их в ячейке памяти, код будет выглядеть следующим образом:

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

