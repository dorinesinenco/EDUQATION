## Кастумные аннотации и процессоры для них

* Создайте 2 проекта: 
  1. CustomProcessor
  2. TargetProject


* В первом проекте ваша задача объявить аннотацию "@HasDefaultConstructor" и процессор для нее "HasDefaultConstructorAnnotationProcessor" cуть которых вывести ошибку в IDE (env) в том случае когда у класса который аннотирован данной аннотацией нет дефолтного конструктора
* Второй проект служит "тестовой площадкой"
* Под конец, загрузить каждый проект в отдельную репозиторю в гитхаб
* Загружать только исходный код