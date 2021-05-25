## Обработка исключений в Python

* есть код
  ```py
  def getData( index ):
    data = [10,20,30,40,50]
    return data[index]
  ```
  
  это функция которая получит **index** ячейки и вернет из списка **data** соответствующие значения (если все пройдет хорошо!)

* представим то что мы ее используем далее двумя способами (возможными)
  ```py
  # Situation A
  index = int(input("Enter an index: "))
  print(getData(index))

  # Situation B
  index = 1000
  print(getData(index))
  ```
  в ситуации A - может возникнуть ошибка "ValueError" так как int() не может преобразовать в целое число любое вводимое значение
  в ситуации B - появится ошибка "IndexError" (она возможна и в ситуации A), так как обращение идет к ячейке которой нет
  
* Требуется - добавить try/except так чтобы перехватить отдельно ошибки и чтобы в ситуации A - на экране появилось сообщение "index cannot be something else than an integer" а в B - "an index value cannot be outside the list" 
