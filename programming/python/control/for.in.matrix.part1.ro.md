## Utilizarea constructiei **for in** in python

* Avem la dispozitie urmatorul cod:
  ```python
  print("\n")

  for y in range(1, 11):
      for x in range(1, 11):
          if x == 1:
              print("#", end=" ")
          else:
              print(".", end=" ")
      print()

  print("\n")
    
  ```
  
  rezultatul executarii caruia este:
  ```
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . . 
  # . . . . . . . . .
  ```
---

* SE CERE:
  1. Sa se adauge conditiile potrivite in **if** astfel incat rezultatul sa devina:
    ```
    # # # # # # # # # # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # . . . . . . . . # 
    # # # # # # # # # # 
    ```      
    
