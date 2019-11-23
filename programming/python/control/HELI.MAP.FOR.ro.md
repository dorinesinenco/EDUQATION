## Constructii conditionale. Cicluri, Ciclul "for" si constructia "if/else" 

* Sa presupunem ca proiectati un "sistem de navigare". Se cere cu ajutorul constructiilor conditionale sa marcati pe "harta" ce o vedem din satelit "zona periculoasa" in jurul unui HELIPORT (aeroport pentru elicoptere), ca nimeni sa nu se poata apropia de aceasta zona.

* Aveti asa un cod de start 
 
    ```python
    SCALE  = 10

    hX = 5
    hY = 4

    map = "" 
    for y in range(SCALE):
        map += str(y) + ". "
        for x in range(SCALE):

            if x == 0 or x == SCALE - 1 or y == 0 or y == SCALE - 1:
                map += "# "
            elif x == hX and y == hY:
                map += "H "
            else:
                map += "  "

        map += "\n"                

    print(map)
    ```

* care deseneaza "harta" unei localitati si plaseaza litera "H" in locul unde se afla aeroportul (in baza coordonatelor **hX**,**hY**):
  ```
   1. # # # # # # # # # # 
   2. #                 # 
   3. #                 # 
   4. #       H         # 
   5. #                 # 
   6. #                 # 
   7. #                 # 
   8. #                 # 
   9. #                 # 
  10. # # # # # # # # # # 
  ```  

* se cere sa se marcheze (in baza coordonatelor **hX**,**hY**) si constructiilor conditionale, zona "periculoasa" din jurul aeroportului in asa maniera incat rezultatul sa arate astfel:
  ```
   1. # # # # # # # # # # 
   2. #                 # 
   3. #     x x x       # 
   4. #   x x H x x     # 
   5. #     x x x       # 
   6. #                 # 
   7. #                 # 
   8. #                 # 
   9. #                 # 
  10. # # # # # # # # # # 
  ``` 
* BONUS! Sa presupunem ca trebuie sa marcam zona cu "zgomot sporit" in felul urmator   
  ```
   1. # # # # # # # # # # 
   2. #     ~ ~ ~       # 
   3. #   ~ ~ ~ ~ ~     # 
   4. #   ~ ~ H ~ ~     # 
   5. #   ~ ~ ~ ~ ~     # 
   6. #     ~ ~ ~       # 
   7. #                 # 
   8. #                 # 
   9. #                 # 
  10. # # # # # # # # # # 
  ``` 