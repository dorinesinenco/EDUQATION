## Использование конструкции **for in** в python

* Дан код:
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
  
  Результат выполнения которого:
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

* ТРЕБУЕТСЯ:
  1. Добавить необходимые условия в **if** для получения такого результата:
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
    
