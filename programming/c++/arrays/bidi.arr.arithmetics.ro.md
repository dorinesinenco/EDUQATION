## Array-uri bidimeensionale. Aritmetica tipului de date array

> Un array bidimensional este acel in care fiecare celula din array contine inca un array

* Sa presupunem ca avem un program in c++ care in afara lui **main()** (deci in spatiul global) declara urmatorul array (matrice, tablou, tabel) bidimensional cu numere intregi.


  ```c
  int matrix[3][3] = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
  };
  ``` 

* Ca sa accesam celula cu valoarea **9** ce valori vom substitui in loc de y,x in formula ```matrix[y][x]```?  
* Se cere sa se efectueze urmatoarele:
  1. Creati o functie ```void printMatrix()``` care afiseaza prin dublu **for()** matricea in felul urmator
     ```
        | 0 1 2
        - -----
        0 | 1 2 3 
        1 | 4 5 6
        2 | 7 8 9
     ```  
  2.  Creati o functie ```int sumMatrix()``` care prin dublu **for()** parcurge iterativ si calculeaza, apoi returneaza suma tuturor celulelor
    ```
        matrix sum: 45
    ```  
  3. Creati functiile ```int maxMatrix()``` si ```int minMatrix()```  care prin dublu **for()** parcurg iterativ si gasesc, apoi returneaza elementul maximal, respectiv - minimal
    ```
        matrix max: 9
        matrix min: 1
    ```  