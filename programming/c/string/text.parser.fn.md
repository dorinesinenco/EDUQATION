## Tipul de date sir de caractere. Tipuri compuse de date. Prelucrarea textului introdus


> Un "parser" este o componenta care de obicei permite "citirea" si "identificarea" anumitor date intr-un text "plan" sau text "formatat". (Sunt foarte multe tehnologii moderne care contin text formatat utilizat ca baza pentru structuri de date, de ex: JSON, XML, YML, CSV, etc...)

---

* Avand la dispozitie urmatorul fragment de cod (acesta reprezinta o linie de tip "csv" - cu valori separate prin virgula)
    ```c
    char text[] = "John Doe,1977,Progtown";

    char name[30];   // < "John Doe"
    char year[5];    // < "1977"
    char city[30];   // < "Progtown"
    ```
    unde prima valoare este numele, cea de a doua - anul nasterii si a 3-a valoare este numele orasului de bastina, sa se scrie un program care extrage aceste 3 valori in cele 3 siruri de caractere declarate mai jos, asa incat fiecare din aceste variabile sa contina valorile indicate in comentariu.

* Algoritmul propus pentru solutionarea acestei probleme suna asa:
  1. Mai intai alcatuiti un ciclu "for" care se va "plimba" de la prima pana la ultima celula a sirului initial **text** (utilizati markerul null '\0' sau **strlen()** pentru a stopa iteratiile)     
  2. In interiorul ciclului trebuie la fiecare iteratie sa testati daca celula curenta nu este egala cu ',' pentru ca in acest exemplu virgula este separatorul valorilor
  3. In timp ce au loc iteratiile, puteti copia celula cu celula incepand cu prima valoare (de pe index - 0) valorile in primul array numit "name", pana dati de prima virgula!
  4. De fiece data dati peste o virgula, algoritmul vostru va trebui sa incrementeze un contor (ca sa tineti cont de locul in care va aflati - altfel spus, a cata valoare trebuie sa o extrageti) - denumirea propusa pentru aceasta variabila ar fi **commas**
  5. Cum puteti folosi contorul de virguli? daca la fiecare iteratie verificati contorul - si acesta e setat in 0, atunci copierea are loc in "name", daca valoarea contorului de virguli este 1, atunci copierea are loc in "year" si daca contorul de virguli a ajuns la 2, atunci copierea se face in "city"
  6. In timp ce copiati cate o celula din text[] in name[], year[] si city[] nu uitati ca index-ul din text[] va continua sa mearga inainte, iar index-urile pentru cele 3 array-uri vor trebuie resetate si numarate separat

DIAGRAMA de mai jos ilustreaza schematic cum va avea loc copierea valorilor din array-ul sursa in cele 3 destinatii!



```
i       "John Doe,1977,Progtown"
0       'J' > name[0]
1        'o' > name[1]
2         'h' > name[2]
....         ....
7              'e' > name[7]  
8        commas++
9                '1' > year[0]   
10                '9' > year[1]   
11                 '7' > year[2]   
12                  '7' > year[3]   
13       commas++            
14                     'P' > city[0]   
15                      'r' > city[1]   
....           ....
```

