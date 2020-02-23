## Functii Generice. Template functions

> Functiile generice, sunt acele functii care pot opera cu tipuri "generice" de date (practic cu orice tip de date). Utilizand aceasta optiune in C++, aveti posibilitatea de a crea un cod, care pentru a opera cu diferite tipuri de date nu va trebui scris din nou.


* Daca de exemplu am dori sa cream o functie care aduna numere, am putea sa o declaram astfel:

    ```c++
    int add(int a, int b){
        return a + b;
    }
    ```

    * Apeland functia mai jos ```add(1,2)``` am obtine rezultatul intreg ```3```. Este un rezultat de asteptat, luand in consideratie faptul ca aceasta aduna doua numere intregi. Dar daca s-ar apela tot aceiasi functie in urmatorul fel ```add(0.5,1)``` am obtine ```1``` intreg, deoarece primul argument ar fi transformat in numar intreg si am suma ```0+1``` de facto. In acest caz, am putea adauga inca o "varianta" a functiei date cu urmatorul format:

    ```c++
    float add(float a, float b){
        return a + b;
    }
    ``` 

    * Dar daca aceasta ar trebui sa opereze si cu alte tipuri (short, char, doubl, ... etc) - "adaptandu-se" dupa tip, am fi nevoiti sa repetam aceasi logica de foarte multe ori. Aici ne pot prinde bine functiile generice.

* Ca sa declaram functia de mai sus ca fiind generica, ar fi indeajuns sa utilizam formula:
    
    ```c++
    template <typename T>
    T add(T a, T b){
        return a + b;
    }
    ```

    * pentru ca compilatorul sa inteleaga ca avem de a face cu o functie "shablonizata", utilizam markerul **template**, ceea ce am plasat in paranteze unghiulare - arata faptul ca noi declaram un pseudo tip ```T``` care inca nu este cunoscut (va fi cunoscut in momentul apelarii functiei). Apoi atat rezultatul intors cat si parametrii sunt declarati ca fiind de tip ```T```
    * Testam functia in **main()**

        ```c++
        cout << "Suma numerelor intregi " << add(1,2) << endl;
        cout << "Suma numerelor cu virgula " << add(0.5,1.0) << endl;
        ``` 

        si obtinem
        ```
        Suma numerelor intregi 3
        Suma numerelor cu virgula 1.5
    * Prin urmare functia "recunoaste" tipul cu care are de a face si se adapteaza dupa acest tip   
     
---     

* SE CERE:
  1. Raspundeti in comentarii la intrebarea - de ce daca rulam ```add(1,0.5)``` compilatorul arata eroare?
  2. Declarati o functie care calculeaza media aritmetica a doua numere (numita ```avg(...)```)  si una care calculeaza patratul unui numar (numita ```sqr(...)```), astfel incat acestea sa poata lucra cu diferite tipuri numerice. Testati-le!     