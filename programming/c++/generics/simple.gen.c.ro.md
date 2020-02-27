## Clase Generice. Template Classes

> Clasele generice, sunt acele clase care pot contine si opera cu tipuri "generice" de date (practic cu orice tip de date). Utilizand aceasta optiune in C++, aveti posibilitatea de a crea obiecte "shablonizate" pentu diverse tipuri de date.


* Ca sa declaram o clasa shablonizata ar fi indeajuns sa utilizam formula:
    
    ```c++
    template <typename T> 
    class MyClass { 
    public: 
        T value; 
        T methodOne(){ ... }
        T methodTwo(T arg, ... ){ ... }
        ...
    }; 
    ```
    * unde peste tot **T** ar fi potential orice tip de date

    * Daca am dori sa cream un obiect static in baza acestei clase in **main()** dand de inteles ce anume vrem in calitate de **T**, ar trebui sa scriem:
    

        ```c++
        MyClass<int> myObject;
        myObject.value = 100;
        std::cout << myObject.value;
        ```
    
    * Prin urmare clasa "recunoaste" tipul cu care are de a face si datorita parantezelor unghiulare amplasate in momentul declararii variabilei **myObject**
     
---     

* SE CERE:
  1. Declare o clasa numita **Box** (cutie), care poate contine o singura valoare de orice tip in interior
  2. Valoarea din interior trebuie "protejata" de la accesul din afara clasei
  3. Sa se adauge constructorul default si parametrizat care poate primi valoarea din afara, pentru a o seta in interior
  4. Sa se adauge metoda **print()** care afiseaza valoarea din cutie
  5. Sa se supraincarce operatorii **>** si **<** pentru obiectele de tip **Box** astfel incat valorile din doua cutii diferite sa poata fi comparate   