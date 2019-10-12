# Prelucrarea structurilor de date. Liste (colectii)

* Sa presupunem ca intr-o colectie avem lista becurilor (lampilor) in ordinea amplasarii lor pe o strada
  
```python
strada_becuri = [  100,   75, None,   75,   75,  100, None ] 
# indice             0,    1,    2,    3,    4,    5,    6
```

* Dupa cum se vede sunt indicate pe alocuri valori numerice, iar in unele celule "None" - nu e valoare
* Valoarea numerica indica cati watti consuma becul, daca nu e valoare - becul e ars
* Se cere in baza urmatoarei constructii si a functiilor

```python
for i in range(7):   # pentru ca avem 7 becuri
    ???


def determina_stare_bec( valoare ):
    return ???

def determina_consum_bec( valoare ):
    return ???    

```
1. Sa se afiseze in coloana numarul de ordine a becului, consumul si starea "Rea buna" in felul urmator

```
1 | 100W | Stare buna (consum mare)
2 | 75W  | Stare buna (consum mediu)
3 |  x   | Ars
4 ......
```

2. BONUS - sa se sumeze si sa se determine consumul total in watti a intregii strazi la momentul actual