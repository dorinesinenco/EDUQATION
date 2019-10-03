# Aplicarea Structurilor de control (flow control).


Scrieti o aplicatie care citeste de la tastatura temperatura medie a aerului in grade CELSIUS pentru ziua curenta
si afiseaza rezultatul in formatul urmator

```text
> Astazi (cald): 20C
```

* Cuvantul "cald" in acest exemplu este o estimare facuta pe baza conditiilor si a constructiei **if/else**
* Sa presupunem ca toate temperaturile de la 10 grade in sus sunt considerate "calde" si toate cele de la 10 in jos - "reci"

> formula constructiei pentru orientare este
```python
if conditie:
    cod_de_afisat
else:
    cod_de_afisat    
```

---

* BONUS 1 - adaugati inca niste constructii de tip  **if/else** pentru situatiile cand valorile sunt gresite, sau imposibile - gen ma mari de 70 de grade si mai mici de -70
* BONUS 2 - in exemplul de mai sus - estimarea in cuvinte a temperaturii este foarte rudimentara (doar cald si rece), incercati adaugand mai multe constructii **if/else** inseriate sa acoperiti in urmatorul mod intregul diapazon posibil de valori:
  1. temperaturi mai mici de -50 -> "cod rosu de inghet" 
  2. temperaturi de la -50 pana la -20 -> "cod galben de inghet" 
  3. temperaturi de la -20 pana la 0 -> "ingheturi" 
  4. temperaturi de la 0 pana la 10 -> "rece" 
  5. temperaturi de la 10 pana la 20 -> "confort" 
  6. temperaturi de la 20 pana la 40 -> "cald" 
  7. temperaturi de la 40 in pana la 50  -> "cod galben de calduri" 
  8. temperaturi de la 50 in sus  -> "cod rosu de calduri" 
