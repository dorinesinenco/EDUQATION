## Clase si obiecte. Notiuni de baza

> Clasa poate fi privita pe de o parte ca o "fabrica" care permite crearea mai multor obiecte de acelasi tip, de pe alta parte ca o "schema" care serveste drept proiect in baza caruia sunt create obiectele.


> Constructorul unei clase este metoda (functia) care participa la crearea unui obiect si permite initierea valorilor acestuia


> Proprietatile unui obiect sunt variabilile care se afla in interiorul acestuia

---

* Sa presupunem ca avem urmatoarea clasa (clasa unei cutii)
  ```cpp
  class Box {
      public:
        int value;
  };
  ``` 

  Care contine proprietatea de tip intreg "value".

* Se cere sa se:
  1. adauge constructorul clasei care sa primeasca aceasta valoare din afara si sa o seteze in fiecare obiect nou creat!
  2. adauge metoda **print()** in clasa care sa afiseze continutul acestei cutii (value) in urmatorul format (in cazul in care cutia contine valoarea 100):
     ```
     BOX: 100
     ```    
  3. adauge metoda (functia) **bool isPositive()** care returneaza **true** atunci cand boxa contine valori pozitive si **false** in caz contrar.


