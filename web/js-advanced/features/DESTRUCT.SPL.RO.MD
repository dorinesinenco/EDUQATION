# Destructurizarea 

Aplicati destructurizarea si/sau spread operator in locul marcat cu "???"

```js

class Order {
    constuctor( id, name, cost ){
        this.id   = id              
        this.name = name           
        this.cost = cost           
    }
}


let data = {
    orders: [
        new Order(10,"John", 100.00),
        new Order(11,"Marry", 150.00),
        new Order(12,"Jack", 200.00),
    ]
}


let clients = [ data.orders[0].name, data.orders[1].name, data.orders[2].name ] // ???

```
