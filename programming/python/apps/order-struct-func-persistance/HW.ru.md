## Доработка приложения заказа еды

* код можно найти [тут](https://github.com/dorinesinenco/EDUQATION/tree/master/programming/python/apps/order-struct-func-persistance)

* Требуется:
    1. В структуру [dict](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/app.py#L5) **order** добавить ключ **total**, который должен содержать подструктуру похожую на **price** (т е - amount,currency). Изначально установить сумму в 0
    2. При [добавлении](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/app.py#L22) каждого нового продукта в заказ, его стоимость прибавить к **total**
    3. При [добавлении](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/app.py#L22) каждого нового продукта в заказ ПРОВЕРИТЬ если заказанное кол-во **quantity** не превышает **avail** - выбранного продукта
    4. При [добавлении](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/app.py#L22) каждого нового продукта создать еще один этап ПОДТВЕРЖДЕНИЯ выборки продукта
    5. Улучшить функцию [printItems](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/restaurant.py#L3) так чтобы: 
        1. Она выводила пагиатор по 5 на страницу + опции ```< 1 [2] .. n >```
        2. Она адаптировалась и выводила еще дополнительные "поля" из структур: например когда выводится список заказанных продуктов - отсутствует **quantity**, это можно было бы сделать например добавляя еще 1 аргумент функции ```def printItems( items, title = None, showQuantity = False )``` - **showQuantity** - который по умолчанию **False** но если передать **True** то [```print()```](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/restaurant.py#L10) в цикле должен содержать и кол-во
    6. Добавить новый пункт главного меню - оформление заказа ("Checkout") - выбирая который пользователь получает следующую перечень вопросов:
        1. Указать свое имя
        2. Указать свой адресс
        3. Указать номер телефона
        4. Ответить на вопрос - желает ли он доставку или нет
    
    7. Добавить в структуру [dict](https://github.com/dorinesinenco/EDUQATION/blob/fae873e05e9711dcc0c802b9bfaad4ec1035d2e6/programming/python/apps/order-struct-func-persistance/app.py#L5) **order** ключ **client** - где содержатся ответы нв вопросы 6.1 .. 6.3
    8. В **order** так же добавить ключ **delivery** - если клиент ответил что желает доставку, и как значение ключа указать сумму в 100 "MDL" или 0 - если клиент сделал заказ на больше чем 200 "MDL" 
    9. Внести в **total** и доставку если она есть
    10. После завершения процесса оформления заказа - вывести красиво (форматированно) - чек на экран И тот же чек сохранить в простой текстовый файл с названием "bill.txt" в папку **data**
