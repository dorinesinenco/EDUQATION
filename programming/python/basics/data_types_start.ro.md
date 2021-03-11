## In Python exista urmatoarele tipuri de baza de date


* Text Type:	str
* Numeric Types:	int, float, complex
* Sequence Types:	list, tuple, range
* Mapping Type:	dict
* Set Types:	set, frozenset
* Boolean Type:	bool
* Binary Types:	bytes, bytearray, memoryview


* utilizand functia "type()" putem obtine raspunsul la intrebarea "ce tip are valoarea?", de ex:

  ```python
  x = 1000
  print( type( x ) )
  ```
  va afisa "int" (afisarea cel mai probabil va arata mai complicat - gen "class int"), ceea ce inseamna ca valoarea este de tip - numar intreg
  
---

trebuie sa:
* aflati in mod PRACTIC tipul pentru fiecare variabila:

```python
i = -10
f = 0.001
s = 'abc'
l = [1,2,3]
d = { 'a': 1, 'b': 2, 'c': 3 }
b = False

x = f > i
```



