# Prelucrare tip de date "string" prin functie.

Sa presupunem ca vi se cere sa creati o functie care este capabila sa genereze si afiseze initialele de la un **nume** si **prenume** primite ca argument 

Mai jos aveti exemplu care afiseaza doar numele (prescurtat):

```python
def initiale( nume, prenume ):
    print( nume[0] )


initiale("Ion", "Vasilievici")

# rezultat "I"
```

* Dupa cum observati imediat dupa denumirea variabilei sunt aplicate parantezele "[" "]" patrate cu valoarea zero, aceasta permite sa fie extrasa prima litera din text, cum credeti cum se poate extrage urmatoarea litera ? )

### Modificati exemplul de mai sus astfel incat:

* In momentul cand se apeleaza ```initiale("Ion", "Vasilievici")``` pe ecran rezultatul afisat sa fie ```I. V.```
