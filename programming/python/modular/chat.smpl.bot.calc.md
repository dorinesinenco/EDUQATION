## Module. Programarea modulara

> Multe aplicatii moderne utilizeaza logica ML (machine learning) sau AI (artificial intelligence) pentru a programa robotii sa faca careva actiuni automatizate.

> Un modul in Python poate contine atat functii cat si variabile!

* In acest exemplu va trebui sa creati un modul care contine 2 roboti pe nume "Alice" si "Mike". 

* organizati structura proiectului in felul urmator:
   /chat-simple-app/    (folderul principal) 
       - main.py   (fisierul principal)
       - alice.py      (modulul cu proprietatile si functiile primului robot)
       - mike.py      (modulul cu proprietatile si functiile celuilalt robot)

* modulul alice.py incepeti-l de la aceasta structura
    ```python
    # variables
    name = "Alice"
    IQ = 150
    ```
    Dupa cum vedeti acest modul contine numele si IQ-ul estimat al robotului 
    
    Daca, spre exemplu veti dori sa accesati aceste doua variabile (proprietatil ale robotului Alice) din fisierul principal (main.py) va fi necesar sa scrieti in "main.py"
    ```python
    import alice

    print( alice.name )
    print( alice.IQ )
    ```

    
* Se cere sa:
  1. Sa se adauge exact aceleasi 2 proprietati si in modulul "mike.py" cu alte valori, care sa corespunda acestui robot
  2. Sa se adauge functia **sayHello( name )** in ambii roboti, astfel incat de exemplu apeland pentru robotul **alice** aceasta functie din main
     ```python

     alice.sayHello( "Dorian" )
     ```   
     rezultatul sa fie ```Hello Dorian! I am Alice!```
  3. Sa se adauge functia **sayBye( name )** pentru fiecare robot, astfel incat daca am apela-o pentru **alice**      
      ```python

      alice.sayBye( "Dorian" )
      ```  
      rezultatul sa fie ```Bye Bye Dorian! Have a good day!```
  4. Sa se apeleze in asa mod functiile robotilor in **main.py** incat acestia sa se salute unul pe celalalt!
  5. Sa se adauge functia **compareIQTo( robot )** astfel incat de exemplu daca am apela in **main.py** functia in asa mod
     ```python

     alice.compareIQTo( mike )
     ```     
     aceasta sa afiseze ```Alice: I am smarter than Mike``` in cazul in care IQ-ul din modulul robotului **alice** este mai mare decat cel din modulul **mike**, si alte doua mesaje - respectiv - pentru situatia cand nivelul IQ este egal sau mai mic. 