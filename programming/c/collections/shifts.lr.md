## Tipul de date array. Tipuri compuse de date. Deplasarea datelor

> Un array iti permite sa ordonezi datele si sa le prelucrezi iterativ.

* Urmatorul fragment de cod declara un array cu 7 numere intregi:

    ```c
    int data[7] = { 10, 20, 30, 40, 50, 60, 70 };
    ```
* Adaugam un algoritm de afisare iterativa (prin ciclul **for**), valorile se vor afisa separate printr-un spatiu

    ```c
    for( int i = 0; i < 7; i++ ){
        printf( "%d ", data[i] );
        //         ^ 
        //         ^<<< space   
    }
    ```  

* Adaugam un algoritm de deplasare spre dreapta (right shift). Acest algoritm incepe de la coada mutand penultimul element pe ultima pozitie (ultimul se pierde), apoi fiecare elemente de la coada spre cap este mutat pe urmatoarea pozitie. Altfel spus, fiecare celula isi primeste valoarea din pozitia anterioara. Iar pe prima celula care s-a eliberat (deoarece valoarea ei a fost copiata in celula urmatoare), plasam o valoare noua din variabila "value". 
* In comentarii in cod este indicat ilustrativ ce se intampla cu datele dupa o parcurgere prin ciclu.

    ```c
    int value = 5;
    for( int i = 6; i > 0; i-- ){
        data[i] = data[i-1]; 
        //  0  1  2  3  4  5  6
        // -- -- -- -- -- -- -- 
        // 10 20 30 40 50 60 70
        //  > 10 20 30 40 50 60 
    }
    data[0] = value
        //  5 10 20 30 40 50 60 
    ```  


* Se cere sa se scrie algoritmul care va deplasa cu o celula toate datele spre stanga (left shift) si va adauga o noua valoare din variabila "value" pe ultima pozitie.
  