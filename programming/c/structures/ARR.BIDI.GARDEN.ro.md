## Lucrul cu structurile de date. Lucrul cu array-urile. Tablouri multidimensionale.


* Sa presupunem ca aveti urmatoarea structura (tip de date). 
  ```c
    // a parcel of plants
    struct parcel {
        char plant[60];    // plant name
        int  age;          // plant age in days
        float earn;        // approx - money earn from this plant  
    };
  ``` 
  o parcela sadita cu un anumit tip de plante (**plant**), care are o careva varsta in zile (**age**) si o suma estimativa - cat se poate castiga in urma culegerii roadei de pe aceasta parcela (**earn**).

  Deci daca am scrie urmatorul cod in **main()**

    ```c
    struct plant potato = {"Potato Irga", 100, 50.0 };
    ``` 
    ar insemna ca avem o parcela cu cartofi din soiul indicat mai sus, care se afla la ziua a 100-a de crestere si poate aduce venit 50 de unitati banesti.

  Atunci daca am scrie urmatorul cod in **main()**

    ```c
    struct plant garden[3] = {
        {"Potato Americana", 50, 80.0 },
        {"Potato Irga", 100, 50.0 },
        {"Potato Holland", 150, 30.0 },
    };
    
    ``` 
    ar insemna ca avem un array unidimensional cu 3 celule - fiecare cate o parcela cu diferite caracteristici pentru fiecare soi.

  Si daca am scrie urmatorul cod in **main()**

    ```c
    struct plant garden[2][2] = {
       {   {"Potato Americana", 50, 80.0 }, {"Potato Irga",      100, 50.0 },    },
       {   {"Potato Holland",  150, 60.0 }, {"Potato Moldavian", 120, 30.0 },    }
    };
    
    ``` 
    ar insemna ca avem un array bidimensional cu 2 x 2 celule - fiecare cate o parcela cu diferite caracteristici pentru fiecare soi.


---

* Se cere:
  1. Declarati o variabila **garden** (gradina) care reprezinta un array bidimensional 3 x 3 ce contine diferite parcele cu 3 tipuri de plante sadite pe teritoriul lor ("Potato","Tomato" si "Corn"). Varsta si valoarea in bani setati-o la alegerea dvs.
  2. Creati o functie **print_garden()** care afiseaza iterativ (dublu **for**) harta gradinii in felul urmator:
    
    ```
         0      1      2
    0 [  P  ][  P  ][  T  ]
    0 [ 100 ][  90 ][ 100 ]
    -----------------------
    1 [  T  ][  T  ][  T  ]
    1 [  60 ][  70 ][  80 ]
    -----------------------
    2 [  C  ][  C  ][  C  ]
    2 [ 30  ][  40 ][  50 ]
    
    ``` 

    unde P - celula cu "Potato", T - "Tomato", C - "Corn". Cifrele care se afla sub - reprezinta **age** varsta plantatiei in zile iar cifrele de sus si stanga (0,1,2) - indicele randului si coloanei respective.
  3. Sa se creeze o functie **stats_garden()** care calculeaza si afiseaza iterativ (dublu **for**) datele statistice despre intreaga gradina in felul urmator:
   ```
   1. Potato - 22% of total, avg age: 95 days
   2. Tomato - 44% of total, avg age: 78 days
   3. .....
   ----------------------
   Total earn: 1000.0 money units
   ```

   unde se afiseaza in procente a cata parte din totalul gradinii ocupa plantatia cu fiecare cultura in parte, ce varsta medie in zile are fiecare tip de plante sadit si mai jos totalul - suma tuturor valorilor banesti estimate pentru fiecare parcela - altfel spus, cati bani pot fi obtinuti prin vanzarea roadei de pe toate parcelele.