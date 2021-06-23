## Realizarea unei aplicatii de tip TODO/Task list 

* Va trebui sa realizati o aplicatie de tip TODO cu permisiunea de a utiliza urmatorul stack de tehnologii:
  1. HTML
  2. CSS/SCSS/SASS
  3. JS(Vanilla)
  4. bootstrap

* Aplicatia va fi un SPA (Single Page Application), ceea ce inseamna ca totul se va incarca, modifica pe una si aceiasi pagina/document HTML
* Aplicatia va avea la baza clasa Task (JS) cu urmatoarele proprietati:
  1. name
  2. deadline
  3. priority
  4. status
  clasa va contine functie de rendering si alte funtii utile specifice unui task separat
  
* Aplicatia va memoriza initial toate taskurile intr-un Array numit **tasks**, toate operatiunile trebuiesc bazate pe acest array

* Aplicatia tre sa ofere urmatoarele functii:
  1. Adaugarea unui task
  2. Stergerea unui task
  3. Vizualizarea listei de taskuri
  4. Sortarea taskurilor dupa data   
  5. Cautarea taskurilor dupa cuvinte care unt prezente in nume

* Machetarea aplicatiei trebuie facuta cu ajutorul bootstrap:
  1. form
  2. list group
  3. navbar
  4. alert

---

* principiul de lucru:
  - Utilizatorul va accesa pagina care din start ii va afisa lista de taskuri existente. Din navbar acesta poate accesa optiunea "+ add task" , care va apela o functie ce afiseaza un formular prin care el va putea adauga un nou task (obiect care se va salva in lista de taskuri)
  - Dupa salvare, utilizatorului i se va arata din nou lista de taskuri  
  - In lista de taskuri, in drept cu fiecare task vor fi 2 butoane: delete si done (primul va sterge taskul din lista, iar ce de al doilea ii va schimba starea in done- facut)
  - de asupra listei va fi un formular cu un camp in care daca este cules un text cu mai mult de 3 simboluri - se va activa cautarea, care va arata mai jos doar lista de taskuri ce contin acel text in denumire
  - tot de asupra listei se va afla un buton pe care daca il apasa utilizatorul, taskurile se sorteaza in memorie dupa data din deadline - crescator si descrescator
  - inca un buton de sortare dupa prioritate
  - de asupra listei se va afla inca un select list care permite sa filtrezi taskurile dupa prioritate
