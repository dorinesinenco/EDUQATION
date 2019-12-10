## Tipul de date List. Colectii.

> In Python lista reprezinta o colectie ordonata, indexata de date care poate fi schimbata dinamic. De multe ori este numita "dynamic array".


---

* Sa presupunem ca vi se dau 3 liste diferite, care vor pastra datele despre niste studenti:
    ```python
    students_first_name = []
    students_last_name = []
    students_age = []

    ```
    desi sunt 3 liste diferite, acestea vor sincroniza prin INDEX datele - nume, prenume si varsta pentru fiecare student!

    cu alte cuvinte daca am scrie
    ```python
    students_first_name.append( "Juli" )
    students_last_name.append( "Pierre" )
    students_age.append( 21 )

    ```

    am adauga datele pentru primul student ( de pe index - 0 ), respectiv - daca am continua acest proces intr-un ciclu, in lista s-ar acumula datele pentru mai multi studenti.

* Ca sa va fie mai usor sa va imaginati aceste date in memorie, imaginati-va ca aveti de aface cu un tabel unde cele 3 liste represinta niste coloane:

| index | students_first_name | students_last_name | students_age |
|-------|---------------------|--------------------|--------------|
|0|Juli|Pierre|21|
|1|John|Kosh|20|
|...|...|...|...|
|n|...|...|...|

* Se cere sa utilizati un ciclu **while** sau **for** pentru a permite utilizatorului prin **input()** sa fie introduse datele de la tastatura in felul urmator:
  - Cu ajutorul input() afisati mesajul "Enter student's data: "  dupa care utilizatorul introduce numele prenumele si varsta prin spatiu si apasa ENTER - ceea ce inseamna ca toate datele sunt returnate de functia **input** intr-un singur **string** (sir de caractere)
  - Separati datele din string utilizand **split()**
  - Adaugati fiecare din datele extrase din sirul de caractere introdus in fiecare din listele de mai sus (numele -> students_first_name, prenumele in -> students_last_name, etc...)
  - DACA a fost introdus un text gol ( **""** ) sa se opreasca ciclul de citire a datelor!

* Se cere sa afisati intr-un final, datele acumulate in liste cu ajutorul unui ciclu de tip **for in range()** utilizand ca limita lungimea (**len()**) primei liste (students_first_name)   
* BONUS!!! - sa se adauge si cea de a 4-a coloana in aceasta problema - coloana **students_mark** unde se introduce nota medii pentru fiecare student
* BONUS!!! - sa se adauge prin **if/else** validarea datelor:
  - varsta cuprinsa doar intre 18..30 inclusiv
  - nota media doar intre 1..10 inclusiv 