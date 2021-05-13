## Procesarea datelor din Array prin callback functions

* Sa presupunem ca ni se da un array format din urmatoarele obiecte

  ```js
  const payments = [
    { amount: 100.00, currency: "USD" },
    { amount:  50.00, currency: "EUR" },
    { amount:  10.00, currency: "USD" },
    { amount:  25.00, currency: "EUR" },
    { amount:   5.00, currency: "USD" },
  ]
  
  ```
  care reprezinta sumele de bani transferate pe un cont dintr-o sursa externa in diferite transe
  

* Se cere:
  1. Utilizand metoda Array.filter( callback )  - sa se filtreze valorile in EUR (sa ramana doar sumele in USD)
  2. Utilizand metoda Array.forEach( callback ) - sa se afiseze sumele ramase in consola
  3. Utilizand metoda Array.reduce( callback )  - sa se calculeze suma totala formata din toate transele in valuta USD (prin acumulare)
