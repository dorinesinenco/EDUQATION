## Functii. Argumenti si valori returnate

> Wrapping - de obicei in IT se refera la procesul de "impachetare" a anumitor structuri sau valori intr-un container.


* Sa presupunem ca vi s-a dat asa o functie
  ```python
  def wrap_brackets( text ):
    return "(" + text + ")"
  ```
  care primeste un text (o valoare de tip "string") si o "imbraca" in paranteze rotunde - de unde si denumirea functiei. Daca vom apela aceasta functie asa
  ```python
  print( wrap_brackets("12345") )
  ```
  vom obtine
  ```
  (12345)
  ```
* Se cere sa se creeze inca 2 functii:
  * functia care "imbraca" valoarea in **[]**
  * functia care "imbraca" valoarea in **<>**
* Se cere dupa ce s-au definit functiile respective, sa se ajunga la urmatorul rezultat:
    ```
    <<<[[[(12345)]]]>>>
    ```