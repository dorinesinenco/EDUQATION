## Operatii de baza si tipuri de date

* Sa presupunem ca trebuie sa scrieti o parte din aplicatia care sta la baza intelectului unui mini robot-aspirator
  ```python
  walk_E = 5
  walk_S = 4
  walk_W = 3
  walk_N = 2
  ```
  fiind date 4 segmente de drum parcurs in cele 4 directii consecutiv (in metri), puteti vizualiza schema de mai jos pentru a intelege cum s-a deplasat robotul ca sa evit un obstacol incercand sa aspire praful dintr-o zona ingusta a unei camere
  ```
                    N
    - - - - - - - - - - - - - - - - - - - -
   |                                       |
   |                                       |
   |                                       |
   |                                       |
   |                                       |
   |             R > > > > >               |
   |            ########### V              |
   |            #### x #### V              |
  E|            #### ^ #### V              |W
   |            #### ^ #### V              |
   |                  < < <                |
   |                                       |
   |                                       |
   |                                       |
   |                                       |
   |                                       |
   |                                       |
    - - - - - - - - - - - - - - - - - - - -
                    S  
  
  ```
* SA SE:
 1. determine cati pasi a facut in total robotul
 2. cu cat s-a deplasat sprea dreapta si in jos robotul fata de pozitia sa initiala     
 3. aleaga o denumire mai potrivita pentru variabilile care arata deplasarea in metri
