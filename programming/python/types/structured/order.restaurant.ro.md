# Tipuri de date structurate, dictionare si liste


* Sa presupunem ca avem un dictionar care contine datele despre o persoana fizica:
  ```python
  person = {
      "name": "John Onnor",
      "address": {
          "city": "Intertown",
          "street": "Independency",
          "number": "77/BB"
      },
      "contacts":{
          "phone": "+123 456 789",
          "skype": "johno77"
      }
  }
  ```
  Se cere sa adaugati o functie ```printPersonInfo( person ) care va afisa detaliile acestei persoane astfel:
  ```
  ---------------------------------------------------
  John Onnor
  ---------------------------------------------------
  address: Intertown, Independency str., 77/BB
  phone: +123 456 789
  skype: johno77
  ---------------------------------------------------
  ```  

* Sa presupunem ca avem un un alt dictionar care reprezinta comanda facuta de aceasta persoana intr-un restaurant:
  ```python
  order = {
      "items": [
          { "name": "Pizza", "price": 70, "quantity": 2 },
          { "name": "Salad", "price": 30, "quantity": 1 },
          { "name": "Juice", "price": 15, "quantity": 2 }
      ],
      "client": person
  }
  ```   
  Observati cum cheia "client" contine o referinta la variabila **person**, prin urmare exista o legatura intre cele doua structuri de date.
  ```
  [order] --- "client" ----> [person]
  ```  
  Se cere sa adaugati o functie ```printOrderInfo( order ) care va afisa detaliile despre comanda facuta astfel:
  ```
  ---------------------------------------------------
  ORDERED ITEMS
  Pizza x 2 = 140  
  Salad x 1 = 30  
  Juice x 2 = 30  
  ---------------------------------------------------
  TOTAL
  200

  ORDERED BY
  ---------------------------------------------------
  John Onnor
  ---------------------------------------------------
  address: Intertown, Independency str., 77/BB
  phone: +123 456 789
  skype: johno77
  ---------------------------------------------------
  ``` 