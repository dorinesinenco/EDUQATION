# Принципы идентификации и именования.

Во многих языках используется понятие «идентификатор», чаще всего это уникальное имя, которое идентифицирует переменную или функцию. Существуют разные правила именования идентификаторов, но в целом
применяются следующие рекомендации / правила:
* рекомендуется использовать набор символов a..zA..Z0..9_ (латинский алфавит, цифры и нижнее подчеркивание)
* название не должно начинаться с цифры
* названия являются регистрочувствительными ( напр. **price** не тоже самое, что **Price** )
* составные имена разделяются визуально ( напр. **drink_price** или **executeAction()** или **UserEnvironment** )

---

* На основе приведенного выше объяснения и следующего фрагмента кода (который объявляет 2 переменные в формате **string** с именем и фамилией учащегося) 

    ВНИМАНИЕ, код содержит ошибку, оставленную НАМЕРЕННО!:

    ```python  
    students_firstname = "John"
    students lastname  = "Doe"
    # ???
    ```
    дописать этот фрагмент кода, чтобы он также содержал:
    * переменную, указывающую возраст
    * переменную, которая указывает страну происхождения
    * переменную, указывающую город 
* используя функцию **print()** выводить каждое значение на отдельной строке