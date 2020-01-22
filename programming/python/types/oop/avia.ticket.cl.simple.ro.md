## Clase si obiecte. Notiuni de baza


* Sa presupunem ca avem o clasa care descrie ceea ce reprezinta un bilet de avion. Fiecare bilet (obiect) tre sa contina urmatoarele caracterisici:
  * passengerFullName -  numele complet al pasagerului
  * seat - locul in avion
  * departureHour - ora de plecare
  * price - pretul in USD

  ```python
  class Ticket: 

        # constructor
        def __init__(self, ???):
          # ??? 
        

        # method
        def printInfo(self):
          # ??? 
          
  
  ``` 

  
* Se cere sa
  1. completati codul marcat cu ```???``` din constructor, astfel incat acesta sa plaseze valorile transmise (cele 4 caracteristici) in obiectele de tip **Ticket**
  2. complecati codul din metoda **printInfo()** astfel incat, dupa ce se lanseaza codul 
   
     ```python
      my_ticket = Ticket("John Doe", "1A", "11:00", 500)
      my_ticket.printInfo()
     ``` 
     rezultatul sa arate asa:
     ```"John Doe" from the seat "1A", payed 500USD for the "11:00" flight.``` 


---

BONUS:

* Ce rol joaca **self** in atunci cand lucram cu obiectele si clasele ?
* de ce metoda **__init__()** are o denumire atat de caraghioasa ?