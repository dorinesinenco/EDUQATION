## Доработка / распределение логики рутера по модулям


* Продолжаем улучшать код

> Для выполнения этого шага необходимо закончить шаг 2 и видео урок!
> Так же важно вспомнить что такое СТАТИЧНЫЙ и ДИНАМИЧНЫЙ метод / свойство классов в Javascript
 

---

* доработаем логику класса **Route** c пункта 2
 
  1. Создать отдельный модуль "route.js"
  2. В него поместить следующий скелетон класса Route на этот раз мы используем класс как статичный контейнер (т е - делать с него объекты не будем!):
       ```js
       
       exports default class Route {
          
          static routesAliases = []          // predefined routes 
          
          static addRouteAlias( route ) {    // method that adss new routes aliases
            routes.push( route )
          }
          
          static resolve( url, cb ) {            // method that resolves the ROUTING process
             if(url == "/do-something") {
               return cb()
             }
          }
     
       }
       ```
     


      
