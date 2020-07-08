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
  

