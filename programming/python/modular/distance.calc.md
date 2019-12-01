## Module. Programarea modulara

> Foarte multe aplicatii moderne sunt construite in baza diferitor module. Modulele permita aplicarea principiului "decuplarii" logicii.


* Sa presupunem ca trebuie sa cream o aplicatie care estimeaza distantele intre mai multe puncte aflate in plan 2D (bidimensional), pentru a face aceasta, aplicatia (app.py) utilizeaza din modulul "calc" creat de noi functii ajutatoare.

* organizati structura proiectului in felul urmator:
   /calculator-app/    (folderul principal) 
       - app.py   (fisierul principal)
       - calc.py      (modulul cu functii pentru anumite calcule)

* modulul calc.py contine o singura functie capabila sa primeasca 4 parametri
    ```
    **distanceBetweenTwoPoints( x1,y1,x2,y2 )**
    ```
    aceasta primeste in calitate de argumenti - x1,y1 - coordonatele primului punct si x2,y2 - respectiv coordonatele celuilalt punct in spatiu
    
    aceasta functie trebuie sa calculeze distanta dupa formula euclediana (o gasiti pe net) si sa returneze valoarea ca numar intreg!

    veti avea nevoie probabil de modulul "math" [documentatia](https://docs.python.org/3/library/math.html)

    ATENTIE - rezultatul intreg - nu trebuie obtinut prin simpla conversie gen **int(0.7)** - deoarece in asa caz veti pierde din date, rezultatul trebuie returnat intreg (chiar si daca sunt calcule cu zecimale) utilizand functii de aproximare/rotungire (vizualizati - built in functions sau modulul "math")


* app.py
  va importa modulul creat de voi si va utiliza o constructie if/else impreuna cu rezultatul functiei create de voi pentru a da raspuns la intrebarea:
    - care din urmatoarele 3 puncte sunt cele mai aproape unul de altul:
       * A (x=10,y=20)      
       * B (x=20,y=30)      
       * C (x=30,y=40)      
