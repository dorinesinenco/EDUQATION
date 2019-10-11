# Functii.


> Unele functii sunt capabile nu doar sa primeasca valori (argumenti) si sa execute un set de instructiuni, dar si sa returneze valori (return). Acest lucru e prevazut pentru ca o functie sa poata returna unei alte functii niste date pentru o prelucrare inseriata. Imaginati-va ca si cum o functie ar fi de exemplul "fierbatorul" care primeste apa rece, o fierbe apoi o returneaza ca in continuare apa fiarta sa fie aplicata intr-o functie de preparare a ceaiului.

* In fragmentul urmator avem o functie care nu "cere" nimic, si returneaza mereu valoarea 1000 - numar intreg
```python
def damiOMie():
    return 1000
```
* in asa caz este ca si cum ii "zicem" functiei ca ea tre sa se intoarca in **locul** de unde a fost apelata cu valoarea intreaga **1000**

* in continuare, daca am utiliza functia creata de noi asa:
```python
milion = damiOMie() * damiOMie()
print( milion )
```
* ar fi ca si cum am inmulti doua numere intregi cu valoarea de 1000, altfel spus: codul anterior poate fi privit asa:

```python
milion = 1000 * 1000
print( milion )
```
* pentru ca fiecare din cele 2 apelari a functiei **damiOMie** returneaza in acel loc valoarea respectiva

---

* In baza codului de mai jos, incercati sa raspundeti la intrebarea: "ce returneaza functia **f** ?" si la intrebarea: "ce denumire s-ar potrivi mai bine pentru functia **f** ?"

```python
def f( x , y ):
    return x * y
```

---

* Avand la dispozitie urmatorul fragment:

```python
def suma( a, b ):
    return a + b

# adunam 10 + 20 + 30 prin functia noastra
rezultat = suma( suma( 10, 20 ), 30 )
print(rezultat)  # raspuns corect = 60
```

* faceti urmatoarele:
    1. definiti inca 3 functii (inmulti,impartit,scazut), toate primind 2 argumenti (2 numere) si toate returnand o valoare - drept rezultat
    2. cu ajutorul functiilor create, rezolvati formula ** 5 + 4 * 3 / 2 - 1 **

