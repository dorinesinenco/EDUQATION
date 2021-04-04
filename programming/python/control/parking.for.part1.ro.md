## Constructii repetitive / for in

* Avem la dispozitie un cod care deseneaza harta locurilor unei parcari automatizate cu un numar de locuri total predefinit si un singur loc liber
  
  ```python
  PARKING_PLACES = 7
  FREE_PLACE = 3

  print("#"*PARKING_PLACES*5)

  for place_index in range(1, PARKING_PLACES + 1):
      print("| X |", end="")

  print("\n","#"*PARKING_PLACES*5, sep="")
  
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
  2.  Sa se raspunda la intrebarea: - ce reprezinta parametrul **sep** in functia **print()** si de ce a fost nevoie de acesta ? 
