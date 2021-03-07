## В python есть следующие основные типы данных


* Text Type:	str
* Numeric Types:	int, float, complex
* Sequence Types:	list, tuple, range
* Mapping Type:	dict
* Set Types:	set, frozenset
* Boolean Type:	bool
* Binary Types:	bytes, bytearray, memoryview


* применяя функцию "type()" можно получить ответ на вопрос "какого типа значение?", например:

  ```python
  x = 1000
  print( type( x ) )
  ```
  выведит "int" (вывод скорей всего будет сложнее выглядеть - типо "class int"), что означает что это значение целого типа
  
---

ваша задача:
* узнайте ПРАКТИЧНО тип следующих переменных:

```python
i = -10
f = 0.001
s = 'abc'
l = [1,2,3]
d = { 'a': 1, 'b': 2, 'c': 3 }
b = False

x = f > i
```



