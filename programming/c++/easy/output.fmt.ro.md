## Introducerea si afisarea datelor. Formatarea "std"



> C++ utilizeaza doua obiecte "cout" si "cin" pentru afisarea, respectiv citirea datelor din consola. Pentru introducere / afisarea datelor fara multa manipulare este indeajuns sa utilizati biblioleta "iostream", pentru a avea la indemana si optiuni de formatare mai avansata adaugati si biblioteca "iomanip"

> Atunci cand afisati datele in consola, puteti beneficia de mai multe functii si variabile predefinite in spatiul de denumiri "std" care va pot ajuta sa formatati rezultatul. 

* in C++ pentru a formata rezultatul la afisare puteti cel mai des beneficia de:
  * setw( int ) - seteaza "latimea" rezutatului in caractere de ex ```cout << setw(20) << "Hi";``` 
  * setprecision( int ) - seteaza numarul de pozitii dupa virgula pentru tipul de date cu virgula flotanta
  * endl - afiseaza caracterul de trecere din rand nou
  * left, right - afiseaza caracterele de aliniere pe stanga - dreapta - de ex ```cout << setw(20) << right << "Hi";```


---
* Se cere sa se citeasca de la tastatura componentele unei adrese:
  * tara
  * oras
  * strada
  * numarul casei

* Alegeti tipurile de date pentru fiecare variabila la discretia dvs.

* Sa se afiseze aceasta adresa in urmatorul format
    ```
    ************* ADDRESS *************
    Country:                    Moldova
    City:                      Chisinau
    Street:                     Tighina
    Number:                          65
    ***********************************
    ```