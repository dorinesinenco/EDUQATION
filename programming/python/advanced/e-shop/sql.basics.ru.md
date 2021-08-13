## Подготовка DB структуры

!!! ПОПРОБУЙТЕ ВСЕ ОПЕРАЦИИ СДЕЛАТЬ ЧЕРЕЗ SQL script

ГОТОВИМ СТРУКТУРУ

1. Создать таблицу **products** с следующей структурой:
  * id - integer PK - первичный ключ
  * name - character varying (100) - ограничение по длине названия - 100 сиволов
  * created - datetime - поле которое запонит дату когда продукт добавили в базу
  * updated - datetime - поле которое запонит дату когда продукт обновили
  * category_id - integer NOT NULL - поле значения которого будут ссылатся на категории из таблицы с категориями
  * price_id - integer NOT NULL - поле значения которого будут ссылатся на сумы денег из таблицы с деньгами, это и будет служит ценой
2. Создать таблицу **categories** с следующей структурой:
  * id - integer PK - первичный ключ
  * name - character varying (50) - ограничение по длине названия - 50 сиволов
  * ??? - стоит ли добавить поля created, updated в эту таблицу? аргументируйте
3. Создать таблицу **money** (тут запоминаем все суммы денег, не зависимо от того где они используются) с следующей структурой: 
  * id - integer PK - первичный ключ
  * amount - integer - кол-во
  * currency_code - character varying (3) - код валюты, ??? - достаточно ли длины 3 символа для кода валют?

---

ДОБАВИМ ДАННЫЕ

* Попробуем создать категорию, в которой 2 продукта с определенной стоимостью

```sql
INSERT INTO categories VALUES(1,'Smartphones');

INSERT INTO money VALUES(1,1000,'USD');
INSERT INTO products VALUES(1,'iPhone XI',  '2021-01-01 00:00:01', null, 1,1);

INSERT INTO money VALUES(2,1500,'USD');
INSERT INTO products VALUES(2,'iPhone XII', '2021-01-01 00:00:01', null, 1,2);
```
1. ВЫПОЛНИТЕ ЭТИ СКРИПТЫ
2. ЗАМЕТЬТЕ что INSERT написан гораздо компактнее чем обычно, как вы думайте при таком синтаксисе - что важно соблюдать?
3. ПОЧЕМУ мы добавили данные сначало в **categories** и **money** и потом лишь в **products**
4. Нарисуйте от руки ка связанны те данные что мы добавили только что, между собой


---

ЗАПРОСИМ ДАННЫЕ

```sql
SELECT categories.name, products.name, amount, currency_code 
FROM products 
JOIN categories ON products.category_id = categories.id
JOIN money ON products.price_id = money.id;
```

Мы объединили 3 таблицы в одно запросе, как вы думайте - почему перед **name** пришлось уточнить имя таблицы?












