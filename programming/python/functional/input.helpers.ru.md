## Функции. Аргументы и возвращаемые значения

* Очень часто для ввода с клавиатуры в python используется функция **input()** которая может вывести сообщения на экран и возвращает то что ввел пользователь с клавиатуры:
  ```python
  value = input("Enter some value: ")
  ```
  однако она всегда возвращает тип "символьная строка" - string, что требует несомненно применить  "преобразование" типа - для дальнейшего применения вводимого значения в том или ином случае.


* Для облегчения разработки, требуется создать 3 простые функции, каждая из которых должна позволить ввести с клавиатуры значение и вернуть значение уже "преопразованым" в нужный тип данных. Их имена:
  - ```inputInt( message )``` 
  - ```inputFloat( message )``` 
  - ```inputBoolean( message )``` 

* каждая из них должна внутри себя использовать "input()" 
* каждая преобразует значение в тип который упоминается в ее название
---
* После того как код функций будет создан, можно запустить для проверки такого рода код:
  ```python
  n = inputInt("Enter the first integer: ")
  m = inputInt("Enter the second integer: ")
  
  print( n + m )
  ```

