# Structuri de control

> **if/else** reprezinta una din constructiile (structurile) utilizate pentru a controla mersul executiei in dependenta de anumite conditii

* Daca avem de testat o singura coditie in care se va executa un cod, atunci cel mai des este utilizata formula:
    ```python
    if condition:
        code_to_execute
    ```

* Daca avem de testat o singura coditie in care se va executa un cod, iar in caz contrar alt cod:
    ```python
    if condition:
        code_to_execute
    else:
        code_to_execute    
    ```

* Daca avem de testat cateva conditii inseriate care se exclud reciproc, putem recurge la formula:
    ```python
    if condition1:
        code_to_execute
    elif condition2:
        code_to_execute    
    elif condition3:
        code_to_execute    
    ...    
    elif conditionn:
        code_to_execute    
    else:
        code_to_execute    
    ```
---

* Sa se scrie un program, care citeste de la tastatura anul nasterii unei persoane dat in 4 cifre (gen 1990) si executa urmatoarele:
  1.  Verifica daca valoarea introdusa corespunde diapazonului cerut (se permit doar valori incepand cu 1900 si incheind cu ANUL CURENT). In cazul in care valoarea este in afara diapazonului - se afiseaza un mesaj cu eroare, in caz contrar, continuam cu punctul 2
  2.  Calculeaza varsta in ani si o afiseaza
  3.  Estimeaza varsta in cuvinte si afiseaza atat varsta cat si mesajul gen:
      1.  1-3 ani - "baby"
      2.  4-9 ani - "kid"
      3.  10-15 ani - "teen"
      4.  16-18 ani - "young" 
      5.  19-50 ani - "adult"
      6.  51+   ani - "old"     