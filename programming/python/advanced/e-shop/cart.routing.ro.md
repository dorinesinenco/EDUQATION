## Dezvoltarea rutelor legate de cos


In acest segment de logica va fi necesar sa desfasurati logica legata de cosul clientului in urmatoarea maniera:

1. Convingeti-va ca atunci cand are loc adaugarea in cos, in lista item-urilor se adauga dictionare care mentioneaza id-ul produsului si cantitatea, gen:
    ```py
    
    ...
    cart.append({
      pid: 1,
      qty: 1
    })
    ...
    
    ```  
2. Adaugati ruta "/cart"  care va randa o pagina pe care cu ajutorul tag-urilor HTML  **table,tr,td,...** va fi afisata detaliat lista item-urilor din cos in asa maniera

  ```
  | Item name  | quantity | price  | total | actions |
  ----------------------------------------------------
  | Product 1  |      x 1 | 10.00  | 10.00 | ....... |
  ----------------------------------------------------
  | Product 2  |      x 2 | 10.00  | 20.00 | ....... |
  ...
  
  ```

3. Adaugati un rand jos care va prezenta costul total al intregului cos
4. In ultima coloana a tabelului adaugati 3 referinte "+" (care duce pe adresa /cart/increment/<pid>), "-" (care duce pe adresa /cart/decrement/<pid>), "x" (care duce pe adresa /cart/remove/<pid>)
   aceste trei referinte vor actiona in conformitate cu +/-: va mari/micsora cantitatea unui produs pe aceiasi pozie in cos, x: va sterge complet pozitia cu acest produs din cos
  
