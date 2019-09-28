# Operatorii de incrementare si decrementare. Operatii, citire de date si afisare.

> In multe limbaje de programare sunt 2 operatori compacti (se scriu prescurtat) care permit executarea a doua actiuni deseori necesare asemanatoare cu pasinrea inainte si inapoi, acesti doi operatori se numesc 
> Increment operator: x += 1
> Decrement operator: x -= 1
> Este ca si cum am simula cresterea sau scaderea cu o unitate a unei valori, sau pasirea inainte si inapoi


* In fragmentul de mai jos, presupunem ca avem o variabila **steps** care numara pasii facuti de o persoana. Initial erau 10 pasi apoi cu ajutorul codului modelam situatia prin care aceasta persoana paseste inca de 3 ori cate un pas. Intr-un final afisam numarul total de pasi facuti.


```python
# date initiale
steps = 10

# pasim de 3 ori inainte
steps += 1
steps += 1
steps += 1

# afisam numarul de pasi acumulati
print( steps ) # rezultatul va fi 13

```

* Ca sa verificati daca ati inteles, incercati in codul de mai jos sa pasiti inapoi de asa incat in baza datelor initiale - dupa pasii adaugati de voi in loc de "???" la final sa se afiseze - 7 pasi ramasi

```python
# date initiale
steps = 11

# pasim - adaugati de atatea ori pasi inapoi pana cand nu se va ajunge la valoarea 7

???

# afisam numarul de pasi acumulati
print( steps ) # rezultatul trebuie sa fie 7

```

# In baza teoriei de mai sus aveti de rezolvat urmatorul exemplu.

* Sa presupunem ca programul vostru intr-un anumit mod primeste informatia despre un drum national (numele drumului, markerul kilometrajului de inceput si markerul kilometrajului de sfarsit). Iata un exemplu grafic

```python
road_name     = "DNM-107"  # numele drumului - ce tip de date este ?
road_start_km = 20         # drumul incepe cu kilometrul 20 - ce tip de date avem aici ?
road_end_km   = 120        # drumul se incheie cu kilometrul 120
# imaginati-va aceasta situatie
# ...[10]...[20]===[30]===[40]===...===[100]===[110]===[120]...
#            ^
#         inceput                                        ^ 
#                                                     sfarsit
```

* In baza acestui inceput de program se cere sa faceti urmatoarele
  1. Sa se declare o variabila care reprezinta pozitia unui automobil pe drum (adica in km - la ce marker se afla automobilul) 
  2. Sa se citeasca valoarea acestei variabile de la tastatura prin functia **input()**
  3. Sa se calculeze ce lungime are drumul in km si sa se afiseze
  4. Sa se calculeze cati km a parcurs automobilul de la inceputul drumului si sa se afiseze
  5. Sa se calculeze cati km mai are de parcurs automobilul pana la  sfarsitul drumului si sa se afiseze
  6. * BONUS - Daca se introduce viteza medie a automobilului intr-o variabila de la tastatura in km / h, sa se calculeze si sa se afiseze cate ore mai are de mers automobilul pana iese de pe acest drum
  7. * BONUS - Inainte de a calcula distantele si timpul legate de automobil, modelati deplasarea acestuia cu 3 markere mai spre sfarsitul drumului utilizand incrementarea
