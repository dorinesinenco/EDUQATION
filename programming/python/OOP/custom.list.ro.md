## Lucrul cu referintele/obiectele, lista

* In programare o lista (la nivel de jos) este considerata o forma de organizare a celulelor in memorie unde fiecare celula poate sa se afle pe orice adresa, si fiecare din celule va retine o valoare (pentru care este menita lista) si adresa urmatoarei celule. Am putea simbolic sa ilustram o lista cu 2 valori in felul urmator

```
[HEAD]-- next -->[VALUE1]-- next -->[VALUE2]-- next --> None

```

* Multi dintre voi s-au gandit probabil la tipul de date **list** din Python, nu despre acesta este vorba, in exemplul dat vom face o "mini lista" cu propria clasa
* Creati urmatoarea clasa
  
  ```py
  class Node:
    def __init__(self,value):
      self.value = value
      self.next = None
    def __str__(self)  :
      return f"[{self.value}]-- next --> {self.next}"
  ```
  dupa cum se poate vedea, cand este creat un nou obiect care reprezinta o celula dintr-o lista inventata de noi, valoarea **value** ii este setata din start, iar atributul **next** e setat fara valoare - None, pentru ca nu stim exact daca va urma o alta celula
  de asemeni, se poate observa faptul ca in momentul in care o celul de acest tip (**Node**) va fi convertita in text, mai intai va aparea valoarea acesteia in paranteze patrate, apoi va fi convertit in text obiectul referentiat prin atributul **next**
  

* daca am scrie in continuare urmatorul cod
  ```py
  head = Node(100)
  print(head)
  ```
  am vedea urmatorul rezultat, prin urmare o lista care consta dintr-un singur element
  ```[100]-- next --> None```

* daca am adauga si acest fragment
  ```py
  head.next = Node(200)
  print(head)
  ```
  adica am adauga in continuarea primei celule inca o celula si am printa lista
  ```[100]-- next -->[200]-- next --> None```
  
* SE CERE SA:
  1. adaugati inca 3 noduri cu valorile: 300,400,500 respectiv si sa verificati acest lucru
  2. Sa rescrieti codul de adaugare astfel incat acesta sa faca automat adaugarea a 5 valori printr-un ciclu  
  
