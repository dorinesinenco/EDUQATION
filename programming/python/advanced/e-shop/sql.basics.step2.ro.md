## FINISAREA structurii DB



TABELE

* inainte de a incepe faceti cunostinta cu ceea ce inseamna AUTO INCREMENT / SERIAL in postgresql


1. Creati tabelul **clients** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * full_name - character varying (50) - limita pentru numele clientului - 50 caractere
  * created - datetime - data cand a fost adaugat clientul in db
  * updated - datetime - data cand informatia despre client s-a schimbat

2. Creati tabelul **contacts** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * type - character varying (10) - ограничение по длине тип контактной инфы ('phone', 'email', 'address') - 10 сиволов
  * value - character varying (100) - ограничение по длине значение контактной инфы ('+12356789', 'dummyemail@domain.example', 'Some str., 99') - 100 сиволов
  * client_id - integer NOT NULL - поле значения которого будут ссылатся на записи клиентов (кому пренадлежит контакта инфа)
  
3. Creati tabelul **orders** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * created - datetime - data cand a fost adaugata comanda in baza de date
  * updated - datetime - data cand informatia despre comanda a fost modificata
  * price_id - integer NOT NULL - поле значения которого будут ссылатся на сумы денег из таблицы с деньгами, это и будет служить общей стоимостью заказа
  * client_id - integer NOT NULL - поле значения которого будут ссылатся на записи клиентов (кому пренадлежит заказ)

4. Creati tabelul **order_items** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * quantity integer NOT NULL - количество (единиц) продуктов в данном item-e
  * order_id - integer NOT NULL - поле значения которого будут ссылатся на таблицу с заказами (к какому заказу текущий item прикреплен)
  * product_id - integer NOT NULL - поле значения которого будут ссылатся на записи продуктов (какой продукт содержит данный item)


СВЯЗИ (FOREIGN KEYS)

1. Создать ссылочный ключ от products.category_id --- > categories.id
2. Создать ссылочный ключ от products.price_id    --- > money.id
3. Создать ссылочный ключ от contacts.client_id   --- > clients.id 
4. Создать ссылочный ключ от orders.price_id      --- > money.id 
5. Создать ссылочный ключ от orders.client_id     --- > clients.id 
6. Создать ссылочный ключ от order_items.order_id    --- > orders.id 
7. Создать ссылочный ключ от prodorder_itemsucts.product_id    --- > products.id 



СХЕМА
нарисовать собственноручно на бумаге таблицы с ключами и связями и сфоткать - выслать диаграмму (дабы лучше понять структуру)
на подобие этого примера

![image](https://user-images.githubusercontent.com/4667821/129709999-651874f9-f6cf-49a9-ad21-04199af137ab.png)



