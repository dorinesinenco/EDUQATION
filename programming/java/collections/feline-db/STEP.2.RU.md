## База данных с кошками

1. создать package "data"
2. Вставить interface **FelineInterface**
   1. Интерфейс должен содержать схему:
      1. public void setName(String)
      2. public String getName()
      3. public void setRace(String)
      4. public String getRace()
      5. public void setYear(int)
      6. public int getYear()
3. Добавить класс **Cat** имплементирующий **FelineInterface**
   1. Структура класса
      1. name (String)
      2. race (String)
      3. year (int)
   2. Добавить конструктор
   3. Добавить toString()
4. Объявить статичный ArrayList в **main.Application** который сможет хранить любого наследника  **FelineInterface**
5. Добавить поля в UI для **race**, **year**
6. При нажатие на кнопку в UI - функция должна создать из значений полей для ввода - новый объект **Cat** и добавить его в список. Так же выводить для проверки в консоль список с котами каждый раз после добавления для проверки
