## Deprinderea lucrului in limbajul "C" 

> Limbajul C nu este greu de invatat daca o faci corect!

* Pentru a va ajuta sa cresteti in domeniu vom parcurge cativa pasi de baza


1. Scheletul unei aplicatii aplicatiei. De obicei la inceput se va rezuma la un fisier cu denumirea "main.c" care va contine urmatoarea structura unde:
    * Atentie la **```//```** - reprezinta un comentariu pe linie
    * Atentie la **```/* */```** - reprezinta un comentariu de tip bloc
    * De obicei zonele marcate in cod de **```{    }```** reprezinca un "bloc de cod" sau cum mai se mai zice - un set de instructiuni
    * De obicei in C fiecare instructiune sau expresie exte terminata prin **```;```**
    * Liniile de cod care incep cu **```#```** deobicei sunt numite directive preprocesor (pentru incepatori un fel de setari/configurari care inlesnesc procesul de compilare a aplicatiei)
    * main() = reprezinta ceea ce multi numesc functia/blocul principal, de aici incepe rularea aplicatiei, incercati pentru inceput sa nu iesiti cu instructiunile din regiunea marcata prin comentariile ```//begin``` si ```//end```
    * directiva ```#include``` este utilizate cel mai des pentru a "include" diferite biblioteci in aplicatie, in cazul exemplului de mai jos - utilizam biblioteca "stdio" pentru a avea acces la functiile **printf()** si **scanf()** care permit afisarea si citirea datelor cu formatare.  

---

        ```C
        #include <stdio.h>

        int main(){
            // begin

            // Scrie codul aici

            // end
        }
        ```
---

2. Tipuri de date si variabile.
   * O variabila este un "container" in memorie, caruia cel mai des i se indica tipul - pentru a-l formata corect, un nume - pentru a-l accesa si o valoarea - care poate fi schimbata. ATENTIE! C - este un limbaj strict tipizat, valorea "turnata" intr-o variabila trebuie sa fie "transformata" pentru a corespunde tipului variabilei 
   * Mai jos aveti un exemplu de cod C care declara 3 variabile de tip **int**
   * Denumirile variabililor - reprezinta niste identificatori, pentru a evita conflictele incercati sa:
     * utilizati in denumire doar ```a..zA..Z0..9_```
     * nu incepeti cu o cifra

        ```C
        // declaram si setam valorile pentru 3 variabile de acelasi tip
        // sa presupunem ca acestea reprezinta temperaturile in Celsius pentru primele
        // trei zile ale saptamanii
        int temperatura_luni     = 20; 
        int temperatura_marti    = 21; 
        int temperatura_miercuri = 19; 

        ```

3. Operatiuni aritmetice.
   * Cel mai des operatorii ```*, /, +, -``` vor fi utilizati in contextul valorilor numerice (char, short, int, long, float, double, etc...) 
   * Atentie daca un operator (de exemplu ```*``` - inmultirea) - intalneste doua valori de tip diferit, valorile vor fi aduse la acelasi tip - inainte de a se efectua operatia!
   * Atentie, operatiunile - ca si in matematica - au precedenta (prioritate)
   * Atentie, un segment dintr-o expresie - poate fi facut mai prioritar, daca i se aplica parantezele rotunde ```( segment cu operatii prioritare )```
   * In exemplul de mai jos vom calcula temperatura medie pentru cele 3 zile din variabilile de mai sus si vom stoca rezultatul intr-o a 4-a variabila tot de tip intreg:

        ```C
        // calculul temperaturii medii
        int temperatura_medie     = ( temperatura_luni + temperatura_marti + temperatura_miercuri ) / 3;
        ``` 
4. Afisarea datelor.
   * Functia **printf()** din "stdio" permite sa se afiseze datele formatat
   * Cel mai des aceasta se utilizeaza in formula:


        ```C

        printf("shablon de afisare %formater cu casute special formatate", valoare);
        // unde shablonul este dat ca sir de caractere "... acesta este un sir" delimitat prin "" 
        // iar locurile "speciale" unde trebuie inserate automat valorile intr-un anumit format sunt marcate prin formule speciale care incep cel mai des cu  - %
        // in cazul randului de mai sus "valoare" va fi inlocuit ---> in loc de %formater

        ```
   * Formatele de afisare sunt foarte diverse, pentru inceput retineti 2: %d - numere intregi, %f - numere flotante
   * Afisam temperatura medie pentru exemplul discutat
   * 

        ```C
            printf("Temperatura medie pentru 3 zile: %d C", temperatura_medie);
            //                                        ^                    v
            //                                        ^<---- inlocuire <---v          
        ```

---
* SE CERE: 
  1. Sa se asambleze toate fragmentele de cod legate de temperatura care figureaza printre explicatii intr-un bloc "main" si sa se ruleze aplicatia verificandu-se rezultatul final!
  2. Sa se adauge temperatura pentru restul saptamanii, sa se modifice formula de calcul si sa se afiseze din nou datele (valorile pentru intreaga saptamana vor fi: 20,21,19,17,15,10,9 )

