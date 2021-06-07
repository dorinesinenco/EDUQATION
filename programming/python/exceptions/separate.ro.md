## Gestionarea excepțiilor în Python

* există asa un cod
  ```py
  def getData( index ):
    data = [10,20,30,40,50]
    return data[index]
  ```
  
  aceasta este o funcție care va obține **indexul** celulei și va returna valorile corespunzătoare din lista **data** (dacă totul merge bine!)

* imaginați-vă că o vom folosi în continuare în două moduri (posibil)
  ```py
  # Situation A
  index = int(input("Enter an index: "))
  print(getData(index))

  # Situation B
  index = 1000
  print(getData(index))
  ```
  în situația A - eroarea "ValueError" poate apărea deoarece int() nu poate converti orice valoare de intrare într-un număr întreg
  în situația B - va apărea o eroare "IndexError" (este posibilă și în situația A), deoarece apelul merge la o celulă care nu există
  
* Este necesa de - adăugat try / except astfel încât să prindeți erorile separat și astfel încât în **situația A** - sa apara mesajul „indexul să nu poată fi altceva decât un întreg” și în **Stiautia B** - „o valoare a indexului nu poate fi în afara listei"
