## Structuri de date. Dictionare.
### Functii

* Sa presupunem ca avem o functie codul careia arata asa:
  ```python
  def buyTicket( touristName, seat, hour ):
    ticket = {}
    # ???
    return ticket
  ``` 
  scopul careia este sa inregistreze sub forma de dictionar un tichet pentru un turist.

  Functia primeste 3 argumente: numele turistului, locul (in autocar) si ora plecarii.

  Functia returneaza dictiunarul din variabila **ticket** cu toate campurile completate din datele primite prin argumente.

* Se cere sa se completeze locul marcat cu ```# ???``` astfel incat dupa executia functiei cu urmatorii parametri ```buyTicket("Lora Abams", "4B", "11:00")```, dictionarul rezultant sa arate asa ```{ "touristName": "Lora Abams", "seat": "4B", "hour": "11:00" }. Verificarea o faceti printand rezultatul pe care il returneaza functia.
* BONUS - sa se adauge prin **if/else** o verificare astfel incat sa se permita inregistrarea pasagerilor doar:
  1. daca ora de plecare este "11:00", sau "11:30" sau "12:00"
  2. daca locul ales se afla in diapazonul de la "1A" pana la "10C"
  3. daca numele introdus are cel putin 5 caractere

  in cazul in care nu se respecta aceste conditii, functia tre sa returneze **None** in locul dictionarului!   



