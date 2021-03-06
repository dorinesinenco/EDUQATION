## Шаблон фабрики, композиция / ООП


* У нас есть модуль "coffee.py" который предоставит приложению полноценный функционал производства "кофе" как напиток. Класс **CoffeeMachine** - играет роль фабрики для объектов типа **CoffeeDrink**, то есть этот класс не может создавать собственные объекты без управления со стороны **CoffeeMachine**. Иными словами, логика (напр app.py) которая будет пользоватся нашим модулем сможет создать **CoffeeDrink** объект только через **CoffeeMachine**
* Обратите внимание на переменную **names** - которая запоминает "список" доступных вариантов кофе производимого этой машиной, это тип данных кортеж (tuple) 
  ```py
  
  names=("Espresso","Cappuccino","Robusta")

  class CoffeeMachine:
    def __init__(self,brand):
      pass

    def makeCoffee(self,name,ingredients):
      pass

  class CoffeeDrink:
      def __init__(self,name,ingredients):
        pass

      def __str__(self):
        pass

  ```
  как вы видите у фабрики (CoffeeMachine) есть только брэнд прибора и метод **makeCofee()**, который получает **name** типа - **str** и **ingredients** как тип **dict**
  
  ВАША ЗАДАЧА:
    1. Ответить на вопрос - какие приемущества дает нам тип **tuple** (переменная - **names**)?
    2. Запретить доступ из вне модуля к классу **CoffeeDrink**
    3. Дополнить конструктор **CoffeeMachine** кодом который запомнит брэнд прибора (напр "Philips")
    4. Дополнить код **makeCoffee** так чтобы этот метод создавал новый объект класса **CoffeeDrink**, передавая его конструктору имя кофе и словарь с ингредиентами (словарь выглядит примерно так : { "water": "100ml", "sugar": "2g", ...  }), так же этот метод должен проверить что имя напитка только из тех что перечисленны в кортеже, иначе "выпустить" соответственный "exception" с сообщением: "This machine can make only ... types of Coffee" - где троеточие будет замененно именами из кортежа. Ингредиенты и их кол-во - на ваше усмотрение
    5. Доделать конструктор класса **CoffeeDrink** так чтобы он "запомнил" в объекте имя и ингредиенты
    6. Доделать метод преобразования в строку последнего класса
    7. В главном модуле "app.py" сделать по одному кофе каждого типа и вывести в консоль

