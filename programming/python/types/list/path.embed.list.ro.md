## Lucrul cu listele


* imaginati-va ca o aplicatie tine minte sub forma de lista un "drum" (o cale) prin mai multe puncte de trecere A,B,C... (sa zicem ca sunt niste adrese sau localitati) 


```py
path = [ 'A', 'B', 'C' ]
```

* sa ne imaginam codul care ar arata iterativ parcurgerea acestei cai

```py
print("VISITING:")
for point in path:
  print(">", point)
```

* Ruland acest cod ar trebui sa obtinem urmatorul rezultat: aplicatia va afisa pas cu pas calea prin care trece
  
  ```
  VISITING:
  > A
  > B
  > C
  ```
* adaugam o modificare, sa zicem ca in cel din cel de al 3-lea punct va incepe un nou segment de cale  
  ```py
  path = [ 'A', 'B', ['C1','D1','E1'] ]
  ```
  vor rescrie codul pentru ca sa fie mai limpede asa
  ```py
  path = [ 
    'A', 
    'B', 
    ['C1','D1','E1'] 
  ]
  ```
  ruland codul cu aceasta modificare, el va functiona, dar va afisa segmentul inclus in a 3-a pozitie  - ca o lista in linie
  
SE CERE:
  * sa se ajusteze algoritmul ciclului astfel incat acesta sa verifice la fiecare pas daca nu a dat peste o "lista" si in cazul in care a dat de o valoare de tip lista, sa initieze INCA un ciclu care sa parcurga lista inclusa, astfel incat rezultatul sa fie:

  ```
  VISITING:
  > A
  > B
    > C1
    > D1
    > E1
  ```
