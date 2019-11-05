## Tipul de date array. Tipuri compuse de date. Cautare iterativa

> Cautarea iterativa este unul din modurile de a gasi elementul cautat intr-o multime.

* Urmatorul fragment de cod declara un array cu 8 valori de tip caracter:

    ```c
    char data[8] = { 'L', 'A', 'N', 'G', 'U', 'A', 'G', 'E' }; // the "language" word
    ```
* Adaugam un algoritm de afisare iterativa (prin ciclul **for**), valorile se vor afisa lipite una de cealalta, observati DUPA ciclul de afisare a literelor, sunt 2 treceri din rand nou (pentru a lasa o linie goala)

    ```c
    for( int i = 0; i < 8; i++ ){
        printf( "%c", data[i] );
    }
    printf("\n\n");
    ```  

* Urmatorul algoritm "paseste" pas cu pas prin celulele tabelului de date de la stanga la dreapta si prin comparatie stabileste daca cel putin una din celule este egala ca valoare cu cea din variabila "value", in cazul in care celula a fost gasita, pozitia ei este memorizata in variabila "position" si procesul de cautare este intrerupt prin "break". La final DUPA incheierea procesului de cautare prin **for**, afisam pozitia valorii cautate:

    ```c
    char value = 'G';
    int position = -1;
    for( int i = 0; i < 8; i++ ){
       if( data[i] == value ){
           position = i;
           break;
       }
    }
    printf("%c found at position %d", value, position);
    ```  
    Observati faptul ca initial "position" primeste valoarea "-1", daca valoarea aceasta nu se va schimba in urma ciclului for, atunci vom sti cu SIGURANTA ca valoarea nu a fost gasita in tabel.

* Se cere sa:
  1. Asamblati codul din exemplu si sa il rulati in urmatoarea ordine:
     1. Mai intai afisati tabelul cu caractere
     2. Apoi cautati litera 'G' si afisati-i pozitia
    rezultatul acestui program pana in acest punct ar trebui sa fie:
        ```
        LANGUAGE
        G found at position 3
        ```      
     3. Modificati programul astfel incat rezultatul cautarii sa arate asa:
        ```
        LANGUAGE
        'G' found at position 3
        ```        
     4. Modificati programul astfel incat rezultatul cautarii sa arate asa:
        ```
        LANGUAGE
        "G" found at position 3
        ```        
  2. Daca in variabila "value" plasam valoarea cautata de exemplu "X" (care nu este in tabel), cum arata rezultatul?
  3. Modificati programul ca rezultatul din punctul "i.d" sa apara DOAR daca litera a fost gasita in tabel, daca nu sa fie afisat:
    ```
    "X" not found
    ```
  4. Modificati programul astfel incat acesta sa poata prelua "value" de la tastatura

