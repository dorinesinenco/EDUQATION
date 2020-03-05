# Identificarea si schemele de numire.

Foarte multe limbaje folosesc notiunea de "identificator", cel mai des acesta reprezinta o denumire unica 
care identifica o variabila sau o functie. Exista diferite reguli de denumire a intentificatorilor, dar in linii generale
sunt aplicate urmatoarele recomandari/reguli:
* se recomanda utilizarea setului de simboluri a..zA..Z0..9_ (alfabetul latin, cifrele si cratima de jos)
* nu se incepe denumirea cu cifre
* denumirile sunt sensibile la registru ( ex. **price** nu este egal cu **Price** )
* denumirile compuse sunt separate vizual ( ex. **drink_price** sau **executeAction()** sau **UserEnvironment** )

---

* In baza explicatiei de mai sus si a urmatorului fragment de cod (care declara 2 variabile de tip **string** cu numele si prenumele studentului) 

    ATENTIE, codul contine o eroare lasata INTENTIONAT!:

    ```python  
    students_firstname = "John"
    students lastname  = "Doe"
    # ???
    ```
    sa se completeze acest fragment de cod astfel incat acesta sa contina si:
    * o variabila care indica varsta
    * o variabila care indica tara de provenienta
    * o variabila care indica orasul de bastina
* utilizand functia **print()** afisati fiecare valoare pe un rand separat