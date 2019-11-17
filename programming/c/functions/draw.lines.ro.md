## Functii

> **Signatura** functiei sau **prototipul** acesteia, reprezinta informatia generala cunoscuta despre ea. Cel mai des prototipul reprezinta "formula" care indica tipul returnat, denumirea, tipurile si denumirile argumentilor.

* Sa declare o functie care corespunde urmatorului prototip
  ```c
  void draw_line( int length, char direction );
  ```
  astfel incat, atunci cand vom executa codul:
  ```c
  draw_line( 5, 'h' );
  ```
  rezultatul sa fie
  ```
  -----
  ```
  iar atunci cand vom executa codul:
  ```c
  draw_line( 3, 'v' );
  ```
  rezultatul sa fie
  ```
  |
  |
  |
  ```

