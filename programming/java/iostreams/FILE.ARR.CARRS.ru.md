
1. Создайте редактором файл который называется так "cars.txt" в текущей папке.
2. Запишите в файл след. структуру:
    ```
        BMW 1999 1000000 1000  
        BMW 2011 10000 20000  
        Mercedes 2002 20000 10000  
    ```
    это: модель год пробег стоимость

3. Ниже приведен класс **FileStreamToArrayApp** и метод для чтения из данного файла **loadFileToArray( String filename )** в массив **cars**
4. Ниже приведен метод для вывода из данного массива **printArrayData()**
5. Массив **cars** должен состоять из объектов класса **Car** где каждый объект хранит информацию из одной строки текстового файла "cars.txt"

```java
public class FileStreamToArrayApp{

    public static Car[] cars;

    public static void main(String[] args){
      
    }  
    /**
        метод который читает из файла
        он получает @param filename - путь до файла что нужно открыть
        суть метода:
        1) открыть файл через Scanner() + File()
        2) путем цикла while() + Scanner.hasNext() сделайте так
           чтобы метод загрузил в массив "cars" все данные
         
     */
    public static void loadFileToArray( String filename ) {

    }
    /**
        метод который выводит список данных из массива "cars"
        суть метода:
        1) цикл for (each) по массиву "cars"
        2) используя Car.toString() преобразует результат
           на экране в такой формат
           > 1. CAR: BMW 1999 1000000km  1000USD
           > 2. CAR: BMW 2011 10000km   20000USD
           > 3. ....
     */
    public static void printArrayData() {

    }
}

class Car{
    String model;
    Integer year;
    Integer km;
    Integer price;
    // добавить конструктор и toString()
    // БОНУС - валидировать данные (вдруг отрицательный год или прайс)
}
```