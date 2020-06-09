## Operarea cu obiectele simple.

* Sa presupunem ca aveti urmatorul cod, acesta corespunde unei comenzi facute online de catre un client al unui restaurant (este un obiect simplu JS - plain object)


```js
const order = {
    client: {
        firstName: "John",
        lastName: "Doe"
    },
    address: {
        street: "Main Street",
        number: 77
    },
    items: [
        new Food("Salad", 2),
        new Food("Soup", 1),
        new Drink("Water",1)
    ],
    render: ()=>{
        /* ... */
    }
}
```

* SE CERE:
  1. Raspundeti la intrebarea - ce garanteaza in cazul dat prefixul "const" fata de "let"? Doar dupa cum veti vedea mai jos, proprietatile obiectului pot fi schimbate! 
  2. Ce tip de date reprezinta "items" - proprietatea obiectului comenzii ?
  3. Declarati clasele **Food** si **Drink** astfel incat acestea sa contina proprietatile **name** si **quantity** (nume si cantitate) 
  4. Ce tip de functie reprezinta **render**?
  5. Completati **render()** astfel incat toata informatia despre comanda facuta sa fie afisata in HTML - intr-un tabel (nu se stie dinainte cate mancaruri sau bauturi au fost comandate)
  6. Adaugati o functie in codul principal ( **order()** ) care va cere prin **prompt()** utilizatorului sa introduca denumirea mancarii si cantitatea si va adauga aceasta mancare in continuare in **items**, aceasta functie poate fi agatzata de un buton HTML, ca la fiecare click - utilizatorul sa poata comanda inca ceva
  7. Faceti in asa fel incat de fiece data utilizatorul mai comanda ceva, in pagina sa se afiseze din nou informatia despre comanda facuta - incluzand ceea ce a solicitat acesta prin **prompt()**