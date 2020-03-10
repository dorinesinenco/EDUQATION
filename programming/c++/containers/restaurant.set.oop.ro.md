## Containerele in C++, seturi

> Un set este o colectie de valori ordonate si unice
> Pentru ca obiectele dintr-o anumita clasa sa se "aseze" corect intr-un set, este necesar sa fie supraincarcat operatorul care compara 2 obiecte din aceiasi clasa "<"


---

* Sa presupunem ca avem o aplicatie care contine un set de "comenzi" facute prin intermediul chelnerilor intr-un restaurant. Aceasta aplicatie adauga fiecare comanda noua sub forma de obiect din clasa **Order**. Aceasta clasa este caracterizata prin:

    ```c++
    class Order{
        private: 
          string clientFullName;
          int tableNumber;
          float bill;
          int hours;
          int minutes;

    };
    ```
    - clientFullName - numele complet al clientului
    - tableNumber - numarul mesei
    - bill - suma spre achitare
    - hours - ora la care a fost facuta comanda ( intre 9 si 22 )
    - minutes - minutele la care s-a facut comanda (sa presupunem ca se ia din 10 in 10 minute, adica 10, 20, 30, .. 50)

    * ATENTIE la faptul ca toate proprietatile sunt private, ca sa nu poata fi schimbate din exterior!
* Se cere sa se creeze constructorul clasei **Order** care va interzice (va afisa eroare):
     - daca numele clientului este gol - ""      
     - daca numarul mesei nu este in diapazonul 1 .. 10 (avem 10 mese in restaurant)
     - daca suma spre achitare e mai mica ca 0
     - daca orele si minutele la care a fost facuta comanda se afla in afara regimului de lucru 9:00 .. 22:30

* Se cere sa se adauge metode publice (get-ere) care vor returna valoarea proprietatilor private ( gen getClientFullName(), getBill() ... )      
* Se cere sa se supraincarce operatorul **<<** pentru **Order** si **cout**
* Sa se supraincarce operatorul **<** pentru doua obiecte de tip comanda, astfel incat acesta sa compare sumele spre achitare si orele... si sa permita unui set de comenzi (variabila numita orders) sa sorteze automat comenzile asa incat primele sa fie acele cu cele mai mari sume si facute cel mai devreme (primele) in acea zi.
* Creati in **main()** un set de comenzi, adaugati in el cateva comenzi, verificati daca sortarea are loc conform principiului indicat.
