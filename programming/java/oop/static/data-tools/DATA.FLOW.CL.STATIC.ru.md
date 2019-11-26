## Классы. Статика


* Предположим есть такой файл "DataFlowApp.java"
  ```java
    // main class
    public class DataFlowApp {
        public static void main(String[] args) {

        }
    }

    // secondary class
    class DataTransformer {

    }

  ```
  где есть 1 главный класс с **main()** и 1 вспомогательный класс **DataTransformer**

* Суть класса  **DataTransformer** как диктует его имя - преобразовывать данные, а точнее - конверсия числовых значений из одного в другой тип. Предположим что методы класса  **DataTransformer** должны приводить определенное значение к указанному типу (т е - ```(type)value```). При этом, методы должны предупредить если вдруг - переданное значение выскакивает ЗА рамки допустимых пределов типа в который необходимо преобразовать значение!
* К слову, предположим есть в классе метод
  ```java
  static byte integerToByte( int value ) {

  }
  ```
  этот метод должен вернуть переданное значение из **int** в **byte** но при этом, если **value** превысит (-127..128) - выдать ошибку / предупреждение. То есть, если мы вызовим **integerToByte(10000)** используя "System.err.println()" мы должны вывести в консоль ошибок такой текст "WARNING! the value "10000" overflows "byte" range. DATA will was lost!". 
* Продумать логику ИСКЛЮЧИТЕЛЬНО! следующих функций класса **DataTransformer**:
  -  integerToByte()
  -  byteToInteger()
  -  doubleToInteger()
  -  integerToDouble()
  -  shortToInteger()
  -  integerToShort()

* Провести проверку поведения каждого метода по отдельности
* !!! БОНУС - преобзазовать значение 1.5 из double в short     