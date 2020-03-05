# Functiile de intrare / iesire. Afisarea. Afisarea formatata


> print() este o functie care permite sa se afiseze pe ecran sub forma de text orice valoare transmisa ca argument

> Functia "print" poate primi mai multe valori separate prin spatii gen ```print(val1,val2,val3,..)``` acestea vor fi afisate in acelasi rand printr-un spatiu

---

* Deseori cand se utilizeaza functiile de afisare, datele sunt "insotite" de un text (sir de caractere) pentru a infrumuseta rezultatul final, acest text de obicei este delimitat sau de 'text' (apostrofa) sau de "text" (ghilimele)
* In interiorul textului pot fi utilizate orice simboluri si alfebete, atat timp cat consola in care acestea se afiseaza le suporta ca si set de caractere
* Se recomanda a se retina cateva asa-numite "caractere speciale", care permit executarea anumitor actiuni in text, sau afisarea anumitor simboluri "nestandarte". De exemplu "\n" - va trece cursorul din rand nou. Aceste caractere pot fi usor observate in text datorita formulei lor de scriere care se rezuma la "\code" - unde **code** este codul caracterului. Cele mai importante caractere speciale de retinut sunt:
  * \n - trecere din rand nou
  * \r - returnarea cursorului la inceputul randului
  * \\ - caracterul unui \
  * \t - tabularea
  * \uXXXX - codul utf al oricarui caracter special suportat
---

* Priviti urmatorul fragment de cod:
  ```python
  price_pizza_mdl = 75
  name_pizza = "Pizza Diverso"

  print("1. ", name_pizza, ": ", price_pizza_mdl, "MDL" )
  ```   
  
  rezultatul afisarii ar fi
  
  ```
  1.  Pizza Diverso :  75 MDL
  ```

* Adaugati in aplicatia de mai sus inca 2 produse din meniu cu denumirea si pretul respectiv, urmand acelasi patern de denumire al variabililor si acelasi patern de afisare pe ecran
* Adaugati doua linii decorative la inceputul si la sfarsitul acestui meniu utilizand caracterul special ```"\u2605"``` stelutza, (puteti gasi mai multe [caractere speciale utf-8 aici]([utf8icons.com](https://www.utf8icons.com/) ) astfel incat rezultatul sa arate cam asa
      
  ```
  ★★★★★★★★★★★★★★★★★★★★
  1.  Pizza Diverso :  75 MDL
  2.  .....
  3.  .....
  ★★★★★★★★★★★★★★★★★★★★
  ```
  
HINT! in Python daca scrieti o expresie de tipul "caracter"*10 - veti obtine repetarea acestui caracter de exact 10 ori  