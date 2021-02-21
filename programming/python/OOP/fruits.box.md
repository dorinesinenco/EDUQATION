## Lucrul cu obiectele si clasele

* Sa presupunem ca trebuie sa proiectam o clasa care reprezinta o cutie (lada) cu fructe

```python

class FruitBox:
  def __init__(self,apples,oranges):
    self.apples = apples
    self.oranges = oranges

```

* constructorul aceste clase, instantiaza un nou obiect de tip "cutie cu fructe" primind 2 argumenti ca valoare de tip intreg (numarul e mere si portocale in cutie)
* adica daca am dori sa cream o noua "cutie", codul ar fi: ``` a_box = FruitBox(10,20)``` - cu 10 mere si 20 de portocale

---

* se cere sa se:
  1. Adauge conditii de verificare in **init** astfel incat sa apara un mesaj de eroare cand valorile transmise NU SUNT numere intregi si atunci cand numarul sumar de fructe introduse in cutie depaseste 50 (sa presupunem ca aceasta este capacitatea maxima a cutiei)
  2. Adauge metoda __add__(self, other_box) - care ar suma continutul dintre 2 cutii - creand si returnand o a treia cutie cu merele si portocalele sumate separat, gen: 
    
    ```python 
    box1 = FruitBox(5,10)  
    box2 = FruitBox(10,20)
    box3 = box1 + box2
    
    ```
    
    drept rezultat cutia 3 tre sa contina 15 mere si 30 de portocale
    
* NOTA: adaugati si codul care va afisa continutul boxelor pentru verificare (se recomanda utilizarea __str__())    
    
