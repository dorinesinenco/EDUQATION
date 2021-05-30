## Работа с классами и объектами в Python3

* В объектно-ориентированном программировании (ООП), **фабрика** — это объект для создания других объектов


* Объявить класс **Product** с пустой структурой
* Объявить отдельно функцию **newProduct( name, price, quantity )** которая получит 3 отдельные характеристики продукта и создаст из них объект класса **Product** и вернет его (кстати именно эта функция в нашем коде играет роль "фабрики")
* Объявить функцию **printProduct( product )** которая получит объект продукта и выведит на экран его данные форматированно
* Объявить функцию **compareProducts( product1, product 2 )** которая получит 2 объекта продукта и сравнит их цены, после чего выведит имя того который дешевле
* ОПЦИОНАЛЬНО - переделать функцию **newProduct( dictProduct )** так чтобы вместо 3-х отдельных аргументов она получила бы данные о продукте в виде **dict**