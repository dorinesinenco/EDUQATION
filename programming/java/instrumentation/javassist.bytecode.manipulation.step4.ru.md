## Применение Javassist

* Дополнить свой класс (агента) **ClassTransformer** (метод **transform(...)** ) таким образом чтобы
  * Он проверил если попадающий в него класс (для преобразования) находится в определенном пакете (допустим - **original**), предположим - такая конвенция, что преобразовываться код будет исключительно для некоторых классов что есть пакете названым таким образом
  * Проверил бы если это класс а не интерфейс или абстрактный класс
  * Просканировал полученный класс на наличие аннотации **@AddConstructor** и запустил бы преобразование ТОЛЬКО если у класса есть такая аннотация (это можно проверить как рефлексией, так и методами Javassist). 
  * Если аннотация присутствует, то проверить список всех приватных свойств и их типов - и добавить конструктор с данными параметрами, т е - если у нас такой класс

	```java
	@AddConstructor
	public Car {
		private String model;
		private int year;
		...
	}
	```
	то наш трансформер должен добавить конструктор:

	```java
	public Car (String model, int year){
		this.model = model;
		this.year = year;
	}
	```

	* БОНУС -  попробовать перенести оба проекта на **maven** (ВНИМАНИЕ!!! - у maven есть свои настройки касаемо **javaagent** и **classPath**!!!)

  