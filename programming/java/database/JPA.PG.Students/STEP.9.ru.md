## Имплементирование на уровне JPA используя Hibernate ORM

> Проверка производительности, большие данные

### Шестая ЧАСТЬ

материалы:
 - [1](https://www.codeflow.site/ru/article/java__java-jmh-benchmark-tutorial)
 - [2](https://putridparrot.com/blog/benchmarking-my-java-code-using-junitbenchmarks/)
 - [3](https://www.baeldung.com/java-microbenchmark-harness)
 - [4](https://www.youtube.com/watch?v=m3Xf1ra2Ekg)

* Необходимо создать "stress test" или как еще часто говорят "performance test" который проверит скорость и стабильность базы данных в двух реализациях: Single Table и Join Table inheritance. Что должен показать тест:
  - Скорость базовых CRUD операций в секунду
  - Который из вариантов наследования лучше
  - Все ли этапы прошли удачно
  - Прогноз какие лимиты могут быть в плане общего кол-ва записей, кол-ва запросов в секунду  

* К проекту надо будет подключить Java Faker - для генерирования фальшивых данных
* К проекту надо будет подключить JMH (Java Microbenchmark Harness) - для тестирования производительности

* Тест сценарий 1 - INSERT Single Table Student / Single Transaction
  * Запускаем тест который создает и сохраняет 10000 сущностей **Student** в дб в пределах одной транзакции, где наследование применено как Single Table
* Тест сценарий 2 - INSERT Single Table Student / Multiple Transactions
  * Запускаем тест который создает и сохраняет 10000 сущностей **Student** в дб где на КАЖДОГО СТУДЕНТА по одной транзакции, где наследование применено как Single Table
* Тест сценарий 3 - INSERT Join Table Student / Single Transaction
  * Запускаем тест который создает и сохраняет 10000 сущностей **Student** в дб в пределах одной транзакции, где наследование применено как Join Table
* Тест сценарий 4 - INSERT Join Table Student / Multiple Transactions
  * Запускаем тест который создает и сохраняет 10000 сущностей **Student** в дб где на КАЖДОГО СТУДЕНТА по одной транзакции, где наследование применено как Join Table

* Повторить те же 4 теста для **PhDStudent**
* Каждый тест - должен ПОСЛЕ того как закончился - очистить ДБ от тестовых значений
* Сравнить результаты
---

