## Работа с структурами

* Данный пример выполнить стараясь применять функциональное программирование


Предположим у нас есть следующие колекции значений (множества), это пара (John & Jane) решила сделать покупки параллельно в двух местах, они купили продукты, некоторые из которых повторяюится 

```py

products_john = [
 {
  "name": "Potatos",
  "quantity": 5.0
 },
 {
  "name": "Bread",
  "quantity": 2
 },
 {
  "name": "Water",
  "quantity": 3.0
 },
]

products_jane = [
 {
  "name": "Potatos",
  "quantity": 3.0
 },
 {
  "name": "Water",
  "quantity": 3.5
 },
 {
  "name": "Tomatos",
  "quantity": 5.0
 },
]

```
мы знаем о продуктах лишь название и кол-во

* Требуется написть код функции которая объединит (union) все значения в один общий список, но при этом будет складывать кол-во для продуктов с одинаковыми названиями. Например в итоговом списке будет продукт "Potatos" с кол-вом 8.0
