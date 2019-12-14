## Operatii de baza cu listele.


* Sa presupunem ca aveti "harta" unei plantatii sub forma de lista bidimensionala (lista in lista):

    ```python
    garden = [
        #   0,   1,  2 
        [ '*', 'v', 'v' ],   # 0
        [ 'v', '.', '.' ],   # 1 
        [ 'v', '.', '.' ]    # 2
    ]
    ```
    pentru a intelege mai bine asa gen de structura, imaginati-va ca aveti de a face cu un tabel format din randuri si coloane, unde si numarul randului si a coloanei se incepe de la index-ul 0.

    In momentul in care veti scrie **garden[0]** veti accesa primul rand din acest tabel - veti obtine lista ```[ 'v', 'v', 'v' ]```.

    In momentul in care veti accesa si cea de a doua coordonata **garden[0][0]** veti obtine prima celula din primul rand, adica cea ce contine ```*```

* Sa presupunem ca legenda hartii este:
  - '.' - loc gol
  - '*' - trandafir
  - 'v' - lalea

* Sa facem un algoritm de afisare a hartii pe ecran
   ```python
   for row in garden:
    for col in row:
        print( col, end=' ' )
    print()    
   ``` 
   observati ca in acest algoritm, parcurgem tabelul rand cu rand, si randul  - celula cu celula si ii afisam continutul indicand functiei **print()** ca nu vrem sa utilizeze spatiu gol ```' '``` in calitate de terminator al afisajului (default este utilizat ```'\n'```)

   observati de asemeni ca mai exista un **print()** fara argumenti care se utilizeaza in ciclul corespunzator randurilor PENTRU a muta cursorul din rand nou

* Declarati inca 2 variabile:
  ```python
  roses = 0
  tulips = 0
  ```    
  care vor fi utilizate pentru a numara cati trandafiri sunt pe acest segment de harta si cate lalele

* Se cere sa continuati algoritmul astfel incat acesta sa incrementeze aceste doua variabile, ori de cate ori intalneste in celula hartii planta (floarea) respectiva. Afisati statistica la final in % ca sa fie clar asa ar arata rezultatul in cazul hartii declarate mai sus:
  ```
  * v v
  v . .
  v . .

  -------
  roses - 11%
  tulips - 44%
  ``` 

  