## Tipul de date sir de caractere. Tipuri compuse de date.Copierea textului


> Copierea datelor dintr-un array in altul reprezinta de fapt - atribuirea valorilor celulelor array-ului sursa, celulelor din array-ul destinatie

---

* Avand la dispozitie urmatorul fragment de cod (un sir de caractere care reprezinta sursa)
    ```c
    char source[] = "Language";
    char destination[20]; 
    ```
    In acest fragment au fost rezervate doua siruri de caractere in memorie, unul care contine informatie si altul gol, gata pentru a receptiona informatia

* Incercati sa raspundeti la intrebarea - cate celule ocupa in memorie "source"?
* Incercati sa raspundeti la intrebarea - cate celule ocupa in memorie "destination"?
* Daca am apela **strlen(destination)** - ce valoare am obtine?

* Adaugam urmatorul cod in continuarea celui de sus
    ```c
    for(int i=0; i < strlen(source); i++){
        destination[i] = source[i];
    }

    printf("the original is \"%s\"", source);
    printf("the copy is     \"%s\"", destination);

    ```
    acesta copiaza iterativ celula cu celula sursa in destinatie
    deci practic transfera celulele astfel

    ```
    index           0   1   2   3   4   5   6   7   8   9
    source[]       'L' 'a' 'n' 'g' 'u' 'a' 'g' 'e' '\0'
                    |   |   |   |   |   |   |   |
                    v   v   v   v   v   v   v   v      
                    v   v   v   v   v   v   v   v      
    destination[]  'L' 'a' 'n' 'g' 'u' 'a' 'g' 'e' '\0'
    ```
* Se cere sa modificati algoritmul iterativ astfel incat sursa sa fie copiata in destinatie cu deplasare la dreapta cu o celula, cu alte cuvinte
    ```
    index           0   1   2   3   4   5   6   7   8   9
    source[]       'L' 'a' 'n' 'g' 'u' 'a' 'g' 'e' '\0'
                    |   |   |   |   |   |   |   |
                     v   v   v   v   v   v   v   v      
                       v   v   v   v   v   v   v   v      
                        v   v   v   v   v   v   v   v      
    destination[]  ' ' 'L' 'a' 'n' 'g' 'u' 'a' 'g' 'e' '\0'
    ```

 BONUS, sa zicem ca este indicata asa o variabila **offset** care primeste o valoare intreaga pozitiva. Sa se scrie algoritmul care copiaza sursa in destinatie deplasata cu "offset" celule mai la dreapta  