## Арифметические операции с типом "Number", Условные выражения
> Посмотреть (js):
[метод "prompt()"](https://www.w3schools.com/jsref/met_win_prompt.asp),
[метод "alert()"](https://www.w3schools.com/jsref/met_win_alert.asp),
[метод "parseFloat()"](https://www.w3schools.com/jsref/met_win_alert.asp),
[метод "isNaN()"](https://developer.mozilla.org/ro/docs/Web/JavaScript/Reference/Global_Objects/isNaN),
[оператор "+"](https://www.w3schools.com/jsref/jsref_operators.asp),
[тип "Number"](https://www.w3schools.com/jsref/jsref_obj_string.asp),
[тип "NaN"](https://www.w3schools.com/jsref/jsref_obj_string.asp),
[тип "null"](https://www.w3schools.com/jsref/jsref_obj_string.asp),
[структуру "if/else"](https://www.w3schools.com/js/js_if_else.asp)

Предположим переменная **safe** соответствует сумме денег в сейфе.
Прочитать с клавиатуры значение переменной **money** при помощи **prompt()**, это сума которую пользователь желает взять из сейфа.
При помощи "alert()" вывести сколько денег осталось в сейфе.

  ```javascript
    let safe           = 500.00;                        // CU
    let money          = prompt("How much money do you want ?");    // CU;
    // ... ???
  ```

Продолжить код так чтобы:
  * Вычислялось сколько денег осталось и результат вывести через "alert()"
  * Дополнительно, проверить если достаточно денег чтобы выдать сумму целиком
  * Проверить если значение суммы (money) не отрицательное
  * БОНУС: Если вводится не число, предотвратить выдачу денег.
  * БОНУС: Если пользователь отменяет окно "prompt()", проверить какой тип возвращается и отменить выдачу денег
---

этот пример работает с типами "Number", "NaN", "null", структурой "if/else", логическими операторами и операторами сравнения
