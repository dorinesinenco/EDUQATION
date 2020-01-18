## Clase si obiecte. Notiuni de baza


* Sa presupunem ca avem o clasa care descrie ceea ce reprezinta un bilet de avion:
  ```cpp
  class Ticket {
      public:
        string passengerFullName;   // numele complet al pasagerului
        string seat;                // locul in avion
        string departureHour;       // ora de plecare
        float  price;               // pretul in USD

        // constructor
        Ticket(string pn, string s, string dh, float p){
          /* ??? */
        }

        // method
        void print(){
          /* ??? */
        }  
  };

  int main(){
    Ticket my_ticket("John Doe", "1A", "11:00", 500);
    my_ticket.print();
  }
  ``` 

  
* Se cere sa
  1. completati codul marcat cu ```/* ??? */``` din constructor, astfel incat acesta sa plaseze valorile in obiectele de tip **Ticket**
  2. complecati codul din metoda **print()** astfel incat, dupa ce se lanseaza codul din **main()** rezultatul sa arate asa:
     ```"John Doe" from the seat "1A", payed 500USD for the "11:00" flight.``` 
