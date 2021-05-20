## Программирование ООП / шаблоны проектирования

> В программировании ООП - провайдер обычно называется компонент, который предлагает / предоставляет какие-то товары (данные / услуги)


* Допустим, у нас есть следующий класс (в файле NumberProvider.py)

  ```py
    from random import randint
    from time import sleep

    class NumberProvider: 
        def __init__(self,min=-100,max=100): 
            # 1. validation
            self.min = min
            self.max = max

        def generate(self):
            return randint(self.min,self.max)


        def whenPositive(self, positiveCB):
            self.positiveCB = positiveCB


        def whenNegative(self):
            # 2. ???
            pass

        def start (self):
            while True:
                number = self.generate()
                if number >= 0:
                    self.positiveCB(number)
                # 2. ???    
                sleep(1)
               
  ```  
  Обратите внимание, что при построении класса он создаст объект поставщика (provider), который запомнит 2 значения (min, max), которые определяют диапазон, в котором этот поставщик должен предоставлять случайные числа. 

* Требуется:
  1. Сохраните код в файл "NumberProvider.py".
  2. Создайте еще один файл (app.py - главный файл приложения), который будет содержать код.
     ```py
      from NumberProvider import NumberProvider
      provider = NumberProvider()
      provider.start()
     ```
     он создаст объект провайдера и немедленно запустит его, вопрос - почему ДВА раза упомянается "NumberProvider" в **import** ?
     Также обратите внимание, что - как только объект был построен на этот раз, таймер начинает повторять функцию, которая генерирует случайное целое число в указанном диапазоне один раз в секунду (start()).

     
  3. Запустите приложение и объясните, о чем говорит ошибка "AttributeError: 'NumberProvider' object has no attribute 'positiveCB'"?
  4. В app.py добавьте следующую функцию
     ```py
        def positiveAction(number):
           print("Got an positive number >>>", number)
     ```
     это будет функция, которая будет "реагировать" каждый раз, когда появляется положительное число.
     
  5. После добавления этих изменений перезапустите приложение и проверьте консоль, ошибка будет все еще появляться.
  6. !!! Добавьте следующую команду в "app.py" ДО "provider.start()"
     ```py
     provider.whenPositive(positiveAction)
     ```
  7. Результат должен измениться на нечто похожее.
     ![image](https://user-images.githubusercontent.com/4667821/118925914-2c7b6400-b948-11eb-8117-30af35c5750a.png)

  8. Ответьте на вопрос - почему исчезла ошибка?
  9. (помечено 1 в коде) Добавьте код в конструктор, чтобы он проверял min / max, являются ли они целыми числами, а если нет - выводите ошибку через "print()": используйте для этого **type()**
  10. (помечено 2 в коде) Введите код, чтобы провайдер также мог принимать функцию, которая реагируют на отрицательные числа.
