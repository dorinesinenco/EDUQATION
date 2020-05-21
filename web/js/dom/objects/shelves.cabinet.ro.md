## Structuri de date. Obiecte simple

[Partea 1]

* Sa presupunem ca sub forma de o structura-obiect, in Javascript ni se ofera schita unui dulap de birou cu polite si sectiuni

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

  sa declaram structura echivalenta in Javascript  printr-un dictionar cu 3 chei

  ```js
  let cabinet = {
      topShelf: null,
      middleShelf: null,
      bottomShelf: null
  }
  ```

  DE REMARCAT! ca in calitate de valoare a fost plasata valoarea "vida" - null, in cazul dat - se are in vedere ca politza nu este ocupata cu nimic!

* In cazul in care am dori sa plasam un careva lucru pe una din politze ar trebui sa ii scriem denumirea ca tip de date "string"
  
  ```js
  cabinet["bottomShelf"] = "A book"
  ``` 
  sau 

  ```js
  cabinet.bottomShelf = "A book"
  ``` 
  
  adica, plasam o carte pe polita de jos

  Daca am dori sa indepartam de pe acea polita, cartea am scrie

  ```js
  cabinet["bottomShelf"] = null
  ```

* In cazul in care am dori sa plasam mai multe lucruri pe aceiasi polita am scrie un "string" care prin virgula separa mai multe denumiri de obiecte aflate pe polita
  
  ```js
  cabinet["bottomShelf"] = "A book,flashlight,notebook"
  ``` 
  adica, am plasat o carte, o lanterna si un notebook pe polita de jos

  Daca am dori sa indepartam de pe acea polita toate lucrurile am scrie

  ```js
  cabinet["bottomShelf"] = null
  ```
---

* Se cere sa se creeze un program care:
  * va plasa pe polita de sus o carte ("A book") pe cea din mijloc o lanterna ("Flashlight") si care va permite pe polita de jos sa plasam orice lucru numele caruia va fi dat de la tastatura de catre utilizator.
  * va afisa schema dulapului in felul urmator cu ajutorul unei functii numita "renderCabinet()"
    ```
    ##############################
    #          A book            #
    ##############################
    #        flashlight          #
    ##############################
    #         something          #
    ##############################
    ``` 
  * va utiliza o functie numita "checkShelf( shelfName )" care va returna true/false primind numele politzei, va verifica  daca aceasta polita este libera sau ocupata
  * va utiliza o functie numita "placeOnShelf( shelfName, thing )" care va verifica daca polita e libera si va plasa obiectul denumit pe polita indicata
