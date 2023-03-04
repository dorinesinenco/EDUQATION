## Tipuri, operațiuni, conversie

> În programare se folosește adesea un principiu numit „acumulator/stocare”, cel mai adesea acesta este numele unei variabile care "tine minte" o valoare intermediară în timp ce în program există operații secvențiale care au nevoie de această valoare. De exemplu, dacă am dori ca **money_accumulator** să colecteze suma de bani de la 3 persoane succesiv (pas cu pas), iar apoi să cheltuiască bani din suma acumulată, în cod ar arăta astfel:

```java
int money_1 = 100;
int money_2 = 200;
int money_3 = 300;

int money_accumulator = 0;

int expenses = 45;

money_accumulator = money_accumulator + money_1;
money_accumulator = money_accumulator + money_2;
money_accumulator = money_accumulator + money_3;

money_accumulator = money_accumulator - expenses;

```

---

* Este necesară îmbunătățirea codului astfel încât, pe de o parte, SA NU INTRERUPETI secvența logica a programului, pe de altă parte, pentru ca acesta să devină MAI COMPACT!
     <details>
       <summary>Sfat?</summary>
        uitați-vă la operatorii +=, -=
      </details>
     
* Imbunătătiti calitatea codului (respectand convențiile de denumire)
* DE asemenea se cere afisarea pe ecran a SCHEMEI "operatiilor" calculului in urmatorul format:
   ```
       555MDL:
       100MDL
     + 200 MDL
     + 300 MDL
     --------
     - 45 MDL
   ```
<details>
     <summary>Sfat?</summary>

    în text (String - „ce este între ghilimele”) în Java există câteva „caractere speciale”:
    * \t Caracter Tab.
    * \b Întoarce caracterul din text cu un pas înapoi sau ștergerea unui caracter dintr-o linie (backspace).
    * \n caracter Newline.
    * \r Caracter de întoarcere a cursorului.
    * \' Caracter apostrof.
    * \" Caracter ghilimele duble.
    * \\\ Caracterul bară oblică inversă (\).
</details>
