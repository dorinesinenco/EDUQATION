## Expresii cu operatori in Py

* A nu se uita faptul ca operatiile in expresiile complexe sunt indeplinite dupa prioritate!

---

* Avem asa un cod care reprezinta o aplicatie capabila sa dea un "semnal" sub forma de True/False unui pilot, daca i se permite sa aterizeze, la moment codul arata asa

    ```python

    # data
    plane_altitude = 500    # meters
    plane_speed    = 300    # km/hours

    # logic 
    can_land = plane_altitude < 700 and plane_speed < 500

    # view
    print( "Can the plane land? ", can_land )
    ```

se ia in consideratie altitudinea si viteza avionului, trebui sa mai adaugati:
1. Avionul va putea ateriza doar daca altitudinea nu e mai mare de 100 m si viteza nu mai putin de 200 km/h
2. Avinonul va ateriza si daca sunt piste de aterizare libere
3. Avionul nu va ateriza daca viteza vantului depaseste 100 km/h, directia vantului coincide cu directia avionului 
4. Avionului i se permite o aterizare de urgenta daca are combustibil mai putin de 1%, fara sa se considere conditiile precedente
5. Avionul are dreptul sa aterizeze de urgenta (fara a tine cont de  alte conditii) daca are defectiuni tehnice

* scrieti codul in asa maniera incat aplicati nu doar sa afiseze rezultatul, dar si sa afiseze si toate conditiile care participa la luarea deciziei!
