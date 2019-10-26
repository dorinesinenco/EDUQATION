## Structuri de control. IF-ELSE

> In programare structurile de control permit crearea algoritmelor mai "inteligente"

> Daca am avea doua numere intregi, algoritmul care ar determina care din acestea este minim ar fi:

```c
int a = 10;
int b = 20;
if( a < b ) {
    printf("minimal - a");
} else {
    printf("minimal - b");
}
```

---

* Sa presupunem ca aveti urmatoarele date
  
```c
int distance_to_supermarket = 100; // m
int distance_to_market      = 50;  // m
int distance_to_minmarket   = 150; // m

int shortest_distance;
```

* Utilizati if/else in acest program si algoritmul de aflare a minimului intre 3 numere
* Se cere sa se completeze codul mai sus asa incat in variabila **shortest_distance** - sa se inscrie distanta cea mai mica dintre cele de sus
* Se cere sa se scrie de asemeni codul care va afisa si in cuvinte care din cele 3 mazagazine se afla mai aproape
  Rezultatul cu datele indicate mai sus ar fi:
  ```"The Market is closest (50m)!"```