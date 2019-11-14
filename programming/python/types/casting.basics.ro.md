# Tipuri de date. Transformarea tipului de date

> Python evită pierderea de date în conversia implicită a tipului de date (Type Conversion). Conversia tipului explicită se numește de asemenea "Type Casting"

> Transformarea explicita a unui tip in altul se face prin formula ```new_type(value)``` unde in loc de "new_type" se indica tipul dorit, de exemplu
    ```python
    integer_n = int(0.5)
    ```
acest cod va aduce valoarea **0.5** la valoarea de tip intreg ceea ce va rezulta in **0**    

HINT in Python exista o functie numita "type( value )" in careia daca ii pasam o careva valoare sau variabila, aceasta ne va returna denumirea tipului pe care o reprezinta!

* Incercati sa rezolvati urmatoarele exercitii scurte:
  1. Avand la dispozitie urmatorul cod
    ```python
    integer_value = 100
    float_value = 0.100
    boolean_value = True
    string_value = "100"
    ```  
    completati acest cod astfel incat acesta sa afiseze fiecare din valorile sus-numite pe un rand separat si alaturi de fiecare valoare sa fie afisat tipul acesteia

  2. De la tastatura se introduc 3 numere intregi, sa se calculeze si sa se afiseze media lor aritmetica tot ca valoare intreaga
  3. Pornind de la 
    ```python
    x = 10
    x += 0.1
    print(x)    
    ```   
    sa se explice ce tip de date reprezinta variabila **x** in acest program  

