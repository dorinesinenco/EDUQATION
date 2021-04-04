## Constructii repetitive / for standard

* Avem la dispozitie un cod care deseneaza harta locurilor unei parcari automatizate cu un numar de locuri total predefinit si un singur loc liber
  
  ```js
  const PARKING_PLACES = 7
  let freePlace = 3

  let decor = ""
  for (let x = 1 ; x <= PARKING_PLACES * 5; x++ ) {
      decor += "#"
  }
  console.log(decor)

  let places = ""
  for (let x = 1; x <= PARKING_PLACES; x++) {
      places += "| X |"
  }
  console.log(places)

  decor = ""
  for (let x = 1; x <= PARKING_PLACES * 5; x++) {
      decor += "#"
  }
  console.log(decor)
  
  ```
  rezultatul executiei caruia la momentul dat este:
  
  ```
  ###################################
  | X || X || X || X || X || X || X |
  ###################################
  ```
  
* SE CERE:
  1. Sa se adauge o conditie prin **if .. else ...** in interiorul ciclului astfel incat rezultatul sa reflecte si locul liber:
           
       ```
      ###################################
      | X || X ||   || X || X || X || X |
      ###################################
      ```
  2.  Sa se raspunda la intrebarile: 
    * de ce a fost nevoie de variabilele **decor** si **places** ?
    * de ce cele 2 variabile mentionate mai sus au fost declarate pana la cicluri?
    * ce inseamna **const** si de ce numele variabilei declarate prin acest prefix difera ca sintaxa de celelalte variabile?
