## Exercitiu de "dictare" in contextul listelor

1. sa se creeze o lista intr-o variabila numita **people** cu valorile "Marry", 20, "John", 21, "Peter", 22 setate din start in ordinea indicata (lista, fiind una mixta, contine mai intai numele, apoi varsta persoanei)
2. sa se afiseze pe ecran "people count {n}" unde variabila **n** va fi numarul de persoane continute in aceasta lista, aceasta valoare trebuie calculata cu ajutorul unui ciclu **for in** in combinatie cu un **if** aplicand principiul "contorului" (adica, de fiece data este indeplinica o careva conditie pentru valoarea din lista - se se incrementeze numarul, conditia ar fi - sa testati care din celule sunt de tip string)
3. numiti o alta metoda prin care ati propune sa se afle numarul de persoane continute in aceasta lista 
4. creati alte doua variabile de tip **list**: people_names, people_ages, care vor contine numele, respectiv - varstele persoanelor 
5. utilizand un ciclu **for in** in combinatie cu o conditie **if else** si metoda **.append()** din liste, separati numele si varstele persoanelor, respectand ordinea. la final listele obtinute ar trebui sa contina:
   
   ```python
    
    people_names = ["Marry","John","Peter"]
    people_ages  = [20,21,22]
    
   ```
6. de la tastatura se va introduce ca numar intreg un indice (intre 0..2), afisati numele si varsta persoanei de pe acel indice si un mesaj de eroare ("this person does not exist") pentru orice alte valori indicate in afara listei, de exemplu: pentru valoarea 1 -> rezultatul ar fi "John 22"
7. de la tastatura se introduce un nume, cu ajutorul metodei **.index()** aflati pe ce loc se afla aceasta persoana in **people_names**, apoi utilizand aceasta valoare extrageti din **people_ages** si afisati varsta acesteia, in cazul in care numele nu a fost gasit afisati "this person does not exist", de ex: pentru valoarea "Peter" rezultatul ar fi 22
8. de la tastatura se introduc numele persoanei si valoarea noua pentru varsta acesteia, printr-un algoritm similar cu p.7 schimbati valoarea pentru varsta persoanei indicate, cu cea de la tastatura, de ex: daca s-ar introduce "Marry 21" rezultatul ar fi schimbarea valorii astfel incat **people_ages** ar fi deja [21,21,22]
9. de la tastatura se va indica numele unei persoane, sa se elimine informatia despre aceasta persoana din ambele liste, de ex: daca se introduce "John", ca rezultat listele vor fi ["Marry","Peter"] si respectiv [21,22] (nu uitati de punctul 8), eliminarea o puteti face cautand persoana dupa nume prin **.index()** in prima lista si aplicand apoi **.pop()** in ambele liste
10. de la tastatura se introduc numele si varsta unei noi persoane care trebui adaugata in liste, sa se adauge la final de liste valorile respective, de ex: daca se introduce "Mark 23", ca rezultat listele vor fi ["Marry","Peter","Mark"] si [21,22,23], utilizati metoda **.append()**
11. de la tastatura  introduc numele si varsta unei noi persoane care trebuie adaugata in liste, de asemeni se introduce locul in care aceasta trebui adaugata, adaugati datele persoanei in locul indicat utilizand metoda **.insert()**, de ex: daca se introduce "Jane 24 0", listele rezultante vor arata asa ["Jane","Marry","Peter","Mark"] si [24,21,22,23]
    
