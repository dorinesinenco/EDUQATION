## Шаблон строителя

> часть 1

---

* Нам дали создать приложение для тур агенства. Оно основано на ООП и шаблонах. Приложение создает ТУРЫ (объекты) с включенными и опциональными деталями
* Есть класс в модуле "money.py" - для цен/стоимости, допишите код так чтобы срабатывал метод **__str__()** и добавьте в конструктор проверку  - так чтобы если значение сумы было бы отрицательным или валюта (currency) не в MDL, USD, EUR, RUB, RON (список допустимых значений дан в виде кортежа - ```_currencies```) - то тогда выскочил бы соответствующий exception "ValueError/TypeError"
  ```py
  class Money:
    _currencies = ("MDL","USD","EUR","RUB","RON")
    def __init__(self,amount,currency):
      self.amount = amount
      self.currency = currency
    
    def  __str__(self):
      return ???      # e.g. "100.00MDL"
  ```
* Модуль "datetime.py" с временным функционалом, допишите класс **Period** (объект который запоминает дату начала и конца периода времени в виде str), так чтобы срабатывал метод **__str__()** и добавьте в конструктор проверку на то чтобы **start** всегда был меньше чем **end** иначе -> **ValueError**

  ```py
  class Period:
    def __init__(self,start,end):
      self.start = start
      self.end = end
    def  __str__(self):
      return ???      # e.g. "[01.01.2021 .. 02.01.2021]"   
  ```
 * Модуль "tourist.py" - допишите класс **Tourist** (каждый объект данного класса запоминает данные одного туриста), так чтобы срабатывал метод **__str__()** и добавьте в конструктор проверку на то чтобы **name** всегда был минимум 3 символа и возраст не ниже 1 (года), иначе -> **ValueError**
 
  ```py
  class Tourist:
    def __init__(self,name,age):
      self.name = name
      self.age = age      
    def  __str__(self):
      return ???      # e.g. "John Doe (31years)"         
  ```  
  
   * Модуль "tour.py" с функционалом который свяжет все классы в один, класс ```_Tour``` (внимание скрытый класс), описывает одну тур-путевку. Одна путевка включает в себя для начала пункт назначения (destination), название тура (напр. "Горы Греции!!!"), список туристов (**tourists** - внимение это ```list[]``` в котором объекты класса ```Tourist```) , период тура - ***period** - объект класса ```Period```. 
   * Обратите внимание на то что список пунктов назначения предопределен кортежом из словарей ```_destinations```, внутри каждой опции прописана стоимость одного полного "билета"
   * Обратите внимание что есть метод **calculateCost()** который "помогает" вычислить стоимость тура в зависимости от места пребывания (destination), длительности (period) и участников тура (tourists)
 
  ```py
  _destinations = ({ "name": "Greece", "price": Money(100,"EUR")},{ "name": "France", "price": Money(120,"EUR")}, { "name": "Italy", "price": Money(200,"EUR")}, { "name": "USA", "price": Money(300,"USD")})
  class _Tour:
    def __init__(self,destination,name,tourists,period):
      self.destination = destination
      self.name = name
      self.tourists = tourists
      self.period = period  
      self.cost = self.calculateCost()
    def calculateCost(self):
      ???
      return ???
        
  ```   
 * Дополните код **calculateCost** так чтобы в зависимости от выбранного **destination** (напр - "Italy") он добавил бы соответствующую полную стоимость билета (напр. для Italy  - 200EUR) - к значению стоимости тура (cost) - для туристов с возростом 16+ лет, включил бы 75% от стоимости для туристов с возрасом 7..15 лет, и включил бы 50% от стоимости для каждого туриста с возрастом до 6-и лет
  

* Добавляем класс строителя в тот же модуль, он создает изначально объект тура и запоминает его с предопределенными опциями
  ```py
  class TourBuilder:
    def __init__(self,destination,name,tourists,period):
      self._tour = _Tour(destination,name,tourists,period)
    def withEnsurance(self):
      ???
      return self
    def withEnsurance(self):
      ???
      return self 
    def withGuide(self):
      ???
      return self        
    def build(self):
      return self._tour      
  ```   
* Обратите внимание на то что метод **build()** завершает построение объекта тура и возвращает его!
* Допишите код метода **withEnsurance** (с страховкой), так чтобы он во-первых добавил в объект тура свойство "ensurance=True" , а так же чтобы он добавил бы 5% стоимости тура
* Допишите код метода **withGuide** (с проводником), так чтобы он во-первых добавил в объект тура свойство "guided=True" , а так же чтобы он прибавил бы 100 единиц стоимости в ТОЙ валюте в которой считается выбранное направление, к стоимости тура
* Создайте главное приложение "app.py" и запустите следующий тестовый код в нем (не забудьте про импорты)
  ```py
  tour = TourBuilder("Italy","The best parst of Italy",[Tourist("John Doe", 21), Tourist("Jane Doe", 30), Tourist("Jenny", 6)],Period("01.01.2021","02.01.2021")).withEnsurance().withGuide().build()
  ```
* Проверьте все характеристики полученного тура при помощи вывода в атрибутов объекта в консоль  
