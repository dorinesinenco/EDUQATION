## Functii, valori primite si returnate

> Nu uitati faptul ca functiile pot primi valori si returna valori in acel context de unde au fost apelate.

* Sa presupunem ca avem o functia "producator" (un soi de functie care nu primeste nimic, dar returneaza o valoare)
    ```c
    int provide_an_integer() {
        int value = 1000;
        return value;
    }
    ```
    Aceasta functie declara o "variabila locala" numita **value**, ii seteaza valoarea **1000** si returneaza aceasta valoare. 
    Daca am dori in **main()** sa apelam aceasta functie ca sa afisam valoarea data pe ecran, am putea scrie:
    ```c
    int main() {
        printf( "%d" , provide_an_integer() );
    }
    ```
    ceea ce ar inseamna ca valoarea returnata la incheierea functiei **provide_an_integer()** ar fi setata aici:
    ```
    printf( "%d" ,    1000   <----  return <--- provide_an_integer() );
    ```
    si ne-am alege de fapt cu un rezultat final care arata DUPA executia functiei cam asa:
    ```
    printf( "%d" ,    1000 );
    ``` 

* Sa presupunem ca mai avem o functie "consumator" (asa este de obicei numita functia care doar primeste valori si le consuma, fara a returna ceva inapoi), deci:
  ```c
  void consume_an_integer( int value ) {
    printf( "THE VALUE IS: %04d\n", value );
  }
  ```
  Dupa cum vedeti, aceasta functie primeste o valoare intreaga prin argumentul **value** si il afiseaza formatat ca numar intreg pe maxim 4 pozitii pe ecran.
  NU PUTEM sa utilizam nici un "rezultat" al acestei functie pentru ca ea returneaza "void" - sau lasa spatiu gol (nimic).
  Ca sa fie mai clar, daca am apela aceasta functie in **main()**:
    ```c
    int main() {
        consume_an_integer( 1 );
    }
    ```
    dupa executie, am obtine pe ecran 
    ```
    0001
    ```
    iar, in **main()** IN LOCUL apelarii valoarea returnata ar fi:
    ```
    void   <----  return <--- consume_an_integer( 1 );
    ```

* Sa presupunem ca mai avem o functie "transformator" (asa este de obicei numita functia care primeste valori si le transforma, returnandu-le modificate inapoi), deci:
  ```c
  int transform_an_integer( int value ) {
    return value * 10;
  }
  ```
  Dupa cum vedeti, aceasta functie primeste o valoare intreaga prin argumentul **value** si returneaza valoarea marita de 10 ori.
  Ca sa fie mai clar, daca am apela aceasta functie in **main()**:
    ```c
    int main() {
        transform_an_integer( 10 );
    }
    ```
    dupa executie am obtine in **main()** IN LOCUL apelarii valoarea returnata ar fi:
    ```
    100   <----  return <--- transform_an_integer( 10 );
    ```
    doar ca in acest caz noi nu utilizam valoarea returnata.

* Sa incercam sa asamblam acest cod, astfel incat aceste 3 functii sa creeze un "lantz de apel" (call stack) astfel incat, sa fie produsa, transformata si consumata o valoare intreaga in urmatorul mod:
    ```
    consume_an_integer  <------ return <---- transform_an_integer <------ return <---- provide_an_integer
    ```  
    mai concret in cod ar arata asa:
    ```c
    int main() {
        consume_an_integer(  transform_an_integer( provide_an_integer() ) );
    }
    ```
    pentru ca sa fie mai clar codul de mai sus, el poate fi rescris astfel in **main()**
    ```c
    int main() {
        int value = provide_an_integer();
            value = transform_an_integer( value );
            consume_an_integer( value );
    }
    ```
---

* Incercati sa scrieti un program care realizeaza exact acelasi lantz de apel, doar ca valorea generata, transformata si afisata sa fie de tip **float**.
