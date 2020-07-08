## Функциональное программирование в контексте интерфейсов. 



* Рассмотрим пример простого класса "Employee" (работник)
  
    ```java
    public class Employee {
        private String fullName;
        private float salary;
        private float experience;
      

        // +constructor,set,get,string
    }
    ```

* Предположим так же что у нас есть коллекция **List<Employee>** (employees) - список сотрудников, внутри контейнерного класса **Company**:

    ```java
    public class Company {
        
        private static List<Employee> employees;
      
        public static void generate() {
            //
        }

        public static void printAllCompact() {
            //
        }

        public static void printAllDetailed() {
            //
        }
        
    }
    ```      

* Требуется: 
  1. Напишите логику внутри **generate()** так чтобы данная функция при помощи "java Faker" наполнила список 10-ю сотрудниками с разными именами, зарплатой в диапазоне 10000 .. 20000 и стажем в 3 .. 15 лет
  2. Напишите логику внутри **printAllCompact()** так чтобы данная функция при помощи "collection.forEach( lambda )" вывела список всех сотрудников в компактом варианте:
   
    ```
    1. John Doe
    2. Jane Doe
    3. ....
    ```
  
  3. Напишите логику внутри **printAllDetailed()** так чтобы данная функция при помощи "collection.forEach( lambda )" вывела список всех сотрудников в полном варианте:
   
    ```
    1. John Doe   10000$  15 years
    2. Jane Doe   20000$  10 years
    3. ....
    ```
  
---

ПРИМЕЧАНИЕ!! 
Для использования "java Faker" (библиотека для генерирования фейковых данных) как стороннюю библиотеку следуйте принципу что ниже:
 1. заходим сюда, скачиваем .jar файлы самой библиотеки и ее зависимости и копируем все файлы в папку "libs" которую надо создать в своем проекте 
    1. https://mvnrepository.com/artifact/com.github.javafaker/javafaker/1.0.2
    2. https://mvnrepository.com/artifact/com.github.mifmif/generex/1.0.2
    3. https://mvnrepository.com/artifact/org.apache.commons/commons-lang3/3.5
    4. https://mvnrepository.com/artifact/org.yaml/snakeyaml/1.23
 2. После, клик правый на свой проект - "Build Path > Configure Build Path"
 3. В окне что вылезло, выбираем "Libraries" потом в "Classpath"
 4. Жмем "Add jars", выбираем скаченные файлы из папки "libs" - проекта и "Apply, OK"
 5. Это подскажет компилятору ГДЕ искать библиотеки с необходимым дополнительным функционалом
    (По такому же принципу, можно в ручную подключить любую другую библиотеку!) 
      
 6. В коде где нужно сгенерировать фальшивые данные, впишите код :
    ```java
    Faker faker = new Faker();

    String name = faker.name().fullName();
    ```
более детальная дока тут [docs](https://github.com/DiUS/java-faker)