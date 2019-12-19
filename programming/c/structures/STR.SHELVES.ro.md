## Structuri de date. Tipul struct

[Partea 1]

* Sa presupunem ca sub forma de o structura, in C ni se ofera schita unui dulap de birou cu polite si sectiuni

  ```
  ##############################
  #         TOP SHELF          #
  ##############################
  #        MIDDLE SHELF        #
  ##############################
  #        BOTTOM SHELF        #
  ##############################
  ```
  in cazul dat, acesta are 3 politze (rafturi): top - cea de sus, middle - din mijloc si bottom - de jos

  sa declaram structura echivalenta in C  printr-un **struct** cu 3 proprietati
  ```c
  // data type
  struct cabinet {
      char top[20];
      char middle[20];
      char bottom[20];
  };

  // variable
  struct cabinet  office_cabinet = { "", "", "" } ;
  ```

  DE REMARCAT! ca in calitate de valoare a fost plasata valoarea "vida" - "", in cazul dat - se are in vedere ca politza nu este ocupata cu nimic!

* In cazul in care am dori sa plasam un careva lucru pe una din politze ar trebui sa ii scriem denumirea ca tip de date "string"
  
  ```c
  strcpy(office_cabinet.bottom,"A book");
  ``` 
  adica, plasam o carte pe polita de jos

  Daca am dori sa indepartam de pe acea polita, cartea am scrie
  ```c
  strcpy(office_cabinet.bottom,"");
  ```

* In cazul in care am dori sa plasam mai multe lucruri pe aceiasi polita am scrie un "string" care prin virgula separa mai multe denumiri de obiecte aflate pe polita
  
  ```c
  strcpy(office_cabinet.bottom,"A book,flashlight,notebook");
  ``` 
  adica, am plasat o carte, o lanterna si un notebook pe polita de jos

  Daca am dori sa indepartam de pe acea polita toate lucrurile am scrie
  ```c
  strcpy(office_cabinet.bottom,"");
  ```
---

* Se cere sa se creeze un program care:
  * va plasa pe polita de sus o carte ("A book") pe cea din mijloc o lanterna ("Flashlight") si care va permite pe polita de jos sa plasam orice lucru numele caruia va fi dat de la tastatura de catre utilizator.
  * va afisa schema dulapului in felul urmator
    ```
    ##############################
    #          A book            #
    ##############################
    #        flashlight          #
    ##############################
    #         something          #
    ##############################
    ``` 