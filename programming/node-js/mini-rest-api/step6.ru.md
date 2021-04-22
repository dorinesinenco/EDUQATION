## Доработка / распределение логики рутера по модулям


* Продолжаем улучшать код

> Для того чтобы понять суть этого шага важно закончить 5-й шаг


* "Научим" рутер выполнять действия следуя ЯВНОЙ схеме "привязки" адреса к действию - сохраненную в виде массива, для этого добавим в класс рутера статичный массив (свойство **routes**) - который будет запоминать пути обрабатыеваемые компонентой рутера, а так же метод добавления путей в рутер **add( route )**
   ```js

     exports.Route = class Route 
        
        static routes = []     // + new property
        
        static add( route ) {
           this.routes.push( route )  // + new method
        }
        
        ...

     }

   ```

  как можно увидеть, метод **add()** - "толкает" объект **route** в массив, те при использовании рутера, выглядеть это будет так
  
  ```js
  Route.add({
    path:"/some/action",
    module: "moduleName",
    action: "actionName"
  })
  ```
  каждый объект обрабатываемого пути будет состоять из **path** - самого адреса, **module** - модуля где следует найти решение, **action** - имя метода/функции который будет выполнен в момент когда запрос попадет на этот адрес
  

* ВАША задача:
  1. Создать модуль "status" и перенести туда две УЖЕ сущестующие функции "pingAction" и "echoAction"
  2. Переделать **resolve()** так чтобы он искал решения основываясь на списка из массива **static routes**:
    * Разбить **url** через "?" и получить таким образом "path"    
    * Разпарсить параметры и получить массив параметров
    * Сравнивая полученный из **url** "path"  с теми что есть в массиве "routes" найти подходящий "action" и запустить его передавая туда параметры (если они есть)
  3. Протестировать сервер переделывая его код в
   ```js
      const http = require("http")
      const { host, port, access_key } = require("./config")

      const { Route } = require('./route')
      Route.add({ path: "/ping", module: "status", action:"pingAction"  })
      Route.add({ path: "/echo", module: "status", action:"echoAction"  })
      const server = http.createServer(({ url }, res) => {

          Route.resolve(url, (action, ... )=>{    // < this is the cb()
               res.end( action(...) )
          })

      })

      server.listen(port, host, () => {
          console.log(`> TEST Server running http://${host}:${port}`)
      })

   ```
