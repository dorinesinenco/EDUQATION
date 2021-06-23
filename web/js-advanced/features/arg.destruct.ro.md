## Destructurizarea in argumentii functiilor

* Avem urmatorul fragment de cod, o functie care proceseaza o comanda facuta de un client

  ```js
  
  const processOrder = ( order ) => {
     let cost = product.quantity * product.price.amount
     return cost
  }
  
  //----------------------------------
  
  const order = {
      quantity: 10,
      price : {
         amount: 100,
         currency: "EUR"
      }
  }
  
  
  let totalCost = processOrder(order)
  ```
  
  sa se aplice destructurizarea in interiorul functiei pentru a face codul mai laconic
