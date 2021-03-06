## Доработка / распределение логики рутера по модулям


* Продолжаем улучшать код

> Для того чтобы понять этот шаг важно вспомнить что такое СТАТИЧНЫЙ и ДИНАМИЧНЫЙ метод/свойство классов в Javascript
 

---

* Создаем заново класс **Route**: 
 
  1. Создать отдельный модуль "route.js"
  2. В него поместить следующий скелетон класса Route на этот раз мы используем класс как статичный контейнер (т е - делать с него объекты не будем!):
       ```js
       
       exports.Route = class Route {
          
          static resolve( url, cb ) {            // method that resolves the ROUTING process
            if (url == "/ping") {
              return cb(pingAction)
            }
          }
     
       }
       
       function pingAction() {
           return `{ "active": true }`
       }
       ```
      как можно увидеть класс имеет всего лишь 1 метод - **resolve** суть которого маршрутизировать (находить решения касаемо путей в системе)
      
      на данный момент, его код очень прост, он будет реагировать всего на 1 адресс URL (/ping - предположим это тестовый адресс - через который другие системы могут проверить если наш сервер в рабочем состоянии, как говорят - пингануть сервер )) ). 
      
      можно сказать что адресу "/ping" - соответствует действие **pingAction()**
      
      обратите внимание что когда срабатывает условие if() - рутер НЕ ВЫПОЛНЯЕТ САМ **pingAction** - а передает его как аргумент некому **cb(...)** который срабатывает ЗА ПРЕДЕЛАМИ рутер компоненты!
      
3. Создать тестовый сервер "test_routing_server.js" с кодом:
   ```js
    const http = require("http")
    const { host, port, access_key } = require("./config")
    
    const { Route } = require('./route')
    const server = http.createServer(({ url }, res) => {
     
        Route.resolve(url, (action)=>{    // < this is the cb()
             res.end( action() )
        })
        
    })

    server.listen(port, host, () => {
        console.log(`> TEST Server running http://${host}:${port}`)
    })

   ```
   обратите внимание! с этой сторны наш код передает колбэк **(  action ) => { ... }** который получит в аргумент **action** от рутера действие что соответствует выбраному пути, и это действие запускается в текущем контексте, РУТЕР ЕЕ ЛИШЬ ПЕРЕДАЕТ сюда!

ПОДСКАЗКА! - если посмотреть на то КАК выполняется вызов **action()** - можно заметить что в скобках ЯВНЫМ образом не передаются параметры. Это необходимо будет сделать используя **.bind(this,arg1,arg2, ...)**

ТРЕБУЕТСЯ:
1. Запустить тестовый код проверить
2. Понять схему работы рутера
3. Добавить в модуль рутера действие **echoAction( params )** и привязать ее к адресу "/echo" которое вернет обратно ```{ "echo": "user1" }``` в случае если пользователь наберет в адресе "/echo?name=user1"
4. Продолжить условие рутинга в **resolve()** так чтобы если нe один из выше - указанных адресов не сработал, рутер вернул бы код ```{ "status": 404 }```
      
