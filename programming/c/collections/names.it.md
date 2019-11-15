## Colectii de date. Array-uri compuse


* Sa presupunem ca am dori sa inregistram in memorie numele unei persoane, am putea realiza aceasta prin urmatorul cod:
    ```c
    char name[] = "John";
    ```
* Daca insa am dori sa inregistram in memorie numele mai multor persoane, ar trebui sa facem un array in array. (un array bidimensional)    
    ```c
    char names[2][20] = { "John", "Marry" };
    ```
    partea stanga a acestui cod trebuie citita astfel: avem un array cu 2 celule de tip "string" unde fiecare celula poate contine 20 de caractere

    daca am dori sa afisam aceste nume pe eran, algoritmul ar fi:
    ```c
    for(int i=0; i<2; i++){
        printf("%s\n", names[i]);
    }
    ```
    dupa cum observati **names[i]** acceseaza din tabel cate o singura celula cu numele de pe indexul indicat

    daca am scrie mai jos asa un cod
    ```c
    for(int i=0; i<2; i++){
        printf("%s\n", names[i][0]);
    }
    ```

    Am obtine pe ecran doar prima litera din numele fiecarei persoane din lista.

---

* Sa presupunem ca vi se dau urmatoarele 2 array-uri, unde primul reprezinta prenumele iar al cel de al doilea numele de familie al acelorasi persoane, deci cand accesam un index "i" din ambele tabele putem obtine sincron numele si prenumele persoanei de pe pozitia "i".
  ```c
  char first_names[2][20] = { "John", "Marry" };
  char last_names[2][20]  = {  "Doe",   "Doe" };
  //   index                       0,       1   
  ```

  se cere sa se scrie un algoritm iterativ care afiseaza lista numelor complete ale persoanelor datele carora se afla in aceste 2 tabele in urmatorul format:
  ```
  1. John Doe
  2. Marry Doe
  ```


