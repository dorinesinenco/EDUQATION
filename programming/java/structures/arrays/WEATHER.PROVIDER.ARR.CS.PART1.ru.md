## Массивы, обработка данных

### [Часть 1]

* Предположим есть класс который является провайдером данных о погоде (**WeatherProvider**), функция которого **generateTemperature()** возвращая произвольное значение температуры от -150.0 до +150.0 Целсий (Для этого использовали класс **Random** - **java.util** ). У него же есть метод **generateTemperaturesForecastFor10Days()** который генерирует и возвращает массив температур за 10 дней (прогноз).
У этого класса есть еще метод **getTemperatureForToday()** который возвращает температуру за текущий день! 
У этого класса есть еще метод **getTemperaturesForecastFor10Days()** который возвращает прогноз температур за 10 дней! 
У этого класса есть еще метод **calculateAvgFor10Days()** который вычисляет среднюю температуру за 10 дней на основе массива из 10 значений температур! 
Методы **getMaxTemperatureFor10Days()** и **getMinTemperatureFor10Days()** возвращают максимальное, соответственно - минимальное значение температуры за период 10 дней!

  ```java
  public class WeatherProvider {

      private static double temperatureForToday = generateTemperature();
      private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

      private static double generateTemperature() {
          Random rd = new Random(); 
          double temperature = 300 * ( rd.nextDouble() - 0.5 );
          return temperature;
      }

      private static double[] generateTemperaturesForecastFor10Days() {
          // ???
      }  


      public static double getTemperatureForToday() {
          // ???
      }

      public static double[] getTemperaturesForecastFor10Days() {
          // ???
      }

      public static double calculateAvgFor10Days() {
          // ???
      }

      public static double getMaxTemperatureFor10Days() {
          // ???
      }

      public static double getMinTemperatureFor10Days() {
          // ???
      }

  }
  ``` 
  - ОБРАТИТЕ ВНИМАНИЕ на то как инициализируются данные при помощи приватных методов!  
  - добавить код для метода что возвращает прогноз на 10 дней (при это данный метод собирает массив из 10 значений при помощи цикла и вызова метода **getTemperature()** для каждой ячейки массива!)
  - добавить код в методе вычисления средней температуры и в методах поиска минимума и максимума!
  - улучшить код так чтобы температура генерировалась с точностью 1 цифры после запятой (например 0.5, 10.0, -20.3, ...) 
  - ВНИМАНИЕ! ни один метод данного класса ничего не выводит, методы принимают, возвращают значения!


* Предположим в этом же примере есть основной класс **WeatherApplication** который обращаясь за данными к методам класса **WeatherProvider** выводит погоду 
  ```java
  public class WeatherApplication {

      public static void main(String[] args){
          // ???
      }

      public static void printWeather() {
          // ???
      }

  }
  ```  
  - методом **printWeather()** выводит погоду на экран в таком формате
    ```
    ############# WEATHER #############

    TODAY: 10.1 ℃

    -----------------------------------
    
    FORECAST FOR 10 DAYS
    DAY  1:   0.5 ℃
    DAY  2:   1.5 ℃
    DAY  3: -12.1 ℃
    ...
    DAY 10:  20.0 ℃
    
    MAX:     20.0 ℃
    AVG:      5.0 ℃
    MIN:    -12.1 ℃
    
    ###################################
    ``` 