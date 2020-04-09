# Деструктуризация

Примените несколько вариантов деструктуризации в местах "A" и "B"

```js

class Order {
    constuctor( id, name, cost ){
        this.id = id                // A
        this.name = name        // A
        this.cost = cost            // A
    }
}


let data = {
    orders: [
        new Order(10,"John", 100.00),
        new Order(11,"Marry", 150.00),
        new Order(12,"Jack", 200.00),
    ]
}


let clients = [ data.orders[0].name, data.orders[1].name, data.orders[2].name ] // B

```