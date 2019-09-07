* Классы позволяют «структурировать» объекты и группировать их по категориям. *

| *объявление классов: **class Name***
| *инициализация свойств: **constructor()**, **new Name()***

---

В этом примере вы должны объявить класс с именем "User", который при создании новых объектов
должен установить следующие характеристики (атрибуты, свойства):
    * username - имя пользователя
    * email - адрес электронной почты
    * password - пароль
    * avatar - адрес аватара
    * created - дата регистрации пользователя
Класс также должен содержать несколько методов:
    * render() - отображает HTML-представление этого профиля пользователя
    * period() - возвращает период, сколько пользователь находится в системе в виде количества дней



## На основе фрагмента «script» в [index](./index.html) выполнить следующие пункты:
1. Заполните все места, отмеченные ** // ??? ** в классе и за его пределами, чтобы код соответствовал требованиям, изложенным выше.
2. Завершите сценарий кодом, который выполнит следующие действия:
    * создаст 3 пользователей с разными именем, аватаром, адресом электронной почты, паролем и датой регистрации
    * отобразит 3 профиля пользователя, вызывая функцию render(), чтобы вывод соответствовал шаблону:

```html
<div>   
    <h2>??? - username (??? - email)</h2>  
    <img src="??? - avatar" />
    <p>user has registered ??? - period() - days ago</p>
</div>   


---