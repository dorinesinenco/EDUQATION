## Operarea cu array -  Stergerea din array / Adaugarea in array


* Este dat un tabel cu numere intregi.

    ```java
    
        int[] data = {10,20,30,40,50};

    ```
    ```
       data  --> |10| |20| |30| |40| |50|
       index      [0]  [1]  [2]  [3]  [4]  
    ```

    sa presupunem ca ni se da indicele celului care trebuie eliminata din array


    ```java

        int indexToDelete = 2;

    ```

    algoritmul de stergere a celulei va fi urmatorul:

    1. Cream un nou array cu marimea mai mica cu unu fata de tabelul vechi

        ```java

            int[] newData = new int[data.length - 1];

        ```
        ```
                         
        data     --> |10| |20| |30| |40| |50|
        newData  -->  |0|  |0|  |0|  |0| 
        index         [0]  [1]  [2]  [3]  [4]  
                                 ^  
                            indexToDelete
        ```


    2. Copiem toate valorile in noul tabel in afara de cea ce trebuie stearsa
    (aici oi - indicele prin care parcurgem tabelul vechi, ci - indicele prin care parcurgem tabelul nou)

            
        ```java

            for(int oi = 0, ci = 0; oi < data.length; oi++ )
            {
                if( oi != indexToDelete ){
                    newData[ ci++ ] = data[ oi ];
                }
            }

        ```   
        ```
        iteration 1                
        ------------
        data     --> |10| |20| |30| |40| |50|
                       v
        newData  --> |10|  |0|  |0|  |0| 
        index         [0]  [1]  [2]  [3]  [4]  
                       ^
                       ci 
        ```
        ```
        iteration 2                
        ------------
        data     --> |10| |20| |30| |40| |50|
                            v
        newData  --> |10| |20|  |0|  |0| 
        index         [0]  [1]  [2]  [3]  [4]  
                            ^
                           ci 
        ```
        ```
        iteration 3                
        ------------
        data     --> |10| |20| |30| |40| |50|
                            
        newData  --> |10| |20|  |0|  |0| 
        index         [0]  [1]  [2]  [3]  [4]  
                            ^
                           ci 
        ```
        ```
        iteration 4                
        ------------
        data     --> |10| |20| |30| |40| |50|
                                   /
        newData  --> |10| |20| |40|  |0| 
        index         [0]  [1]  [2]  [3]  [4]  
                                 ^
                                ci 
        ```
        ```
        iteration 5                
        ------------
        data     --> |10| |20| |30| |40| |50|
                                        /
        newData  --> |10| |20| |40| |50| 
        index         [0]  [1]  [2]  [3]  [4]  
                                      ^
                                      ci 
        ```
    3. Atribuim variabilei **data** noul obiect al tabelului

        ```java

            data = newData;

        ```

---

SE CERE:
 1. Sa fie cules intregul exemplu si rulat - verificati cum functioneza si incercati sa intelegeti algoritmul
 2. In baza pasilor de mai jos sa se scrie un algoritm care va insera valoarea ``` int newValue = -10;``` in locul indicat ``` int indexToInsert = 2; ``` in array:
    1. Creati un nou array **newData** care e cu o unitate mai mare decat tabelul vechi **data**
    2. Cu ajutorul ciclului (asemanator cu cel de mai sus) sa se parcurca tabelul vechi copiind valorile in tabelul nou, iar in momentul in care codul va ajunge in locul in care trebuie inserata valoarea ( ``` oi == indexToInsert ``` ) - inserati valoarea noua ( ``` newData[ci] = newValue ; ```), a nu se uita sa se faca inca un pas in plus in tabelul nou, dupa ce s-a inserat valoarea!
    3. Atribuiti variabilei **data** tabelul nou modificat
 3. Sa se afiseaza prin "foreach" array-ul nou, modificat
 4. *BONUS - incercati sa indepliniti aceleasi operatiuni (delete, insert) cu un tabel care este declarat asa


    ```java

    Person[] people; 

    ``` 

    unde 

    ```java

    class Person{
        private String fullName;

        ...
    }

    ```

    