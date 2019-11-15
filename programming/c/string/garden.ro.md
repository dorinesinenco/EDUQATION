## Siruri de caractere


* Sa presupunem ca avem un sir de caractere care reprezinta "harta" amplasarii copacilor intr-o livada. Unde pentru convenienta vom considera ca:
   * ' ' - reprezinta un loc gol
   * 'T' - un copac de NUCI 
   * 'Y' - un copac de MERE 
   * 'V' - un copac de PERE

    aveti mai jos un exemplu de cod care declara harta unei livezi cu un anumit numar de copaci repartizate in ea
    ```c
    char garden[] = " Y Y Y T T VV";
    // index         0123456789012
    ```
    fiecare celula reprezinta un spatiu egal cu 10 metri lungime si 10 metri latime (deci un ar).
* se cere sa se scrie un algoritm iterativ care:
  1. Calculeaza suprafara in **ari** a livezii si o afiseaza formatat
  2. Numara fiecare tip de copac aparte si afiseaza statistica (utilizati **for**, **if** si contoare separate pentru copaci)
  3. Determina daca sunt copaci care trebuie taiati. Un copac trebuie taiat atunci cand acesta se afla imediat DUPA un alt copac, fara spatiu intre ele. De exemplu in harta de mai sus copacul de pe index-ul 12 trebuie taiat. ATENTIE, pot fi mai multi copaci care necesita sa fie taiati. Afisati toate valorile index-ului acestor copaci.

