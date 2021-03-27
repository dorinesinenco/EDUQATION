## Работа с событиями в nodejs (JS) / COMPLEX

* ДЛЯ ВЫПОЛНЕНИЯ данного примера, необходимо завершить https://github.com/dorinesinenco/EDUQATION/blob/master/programming/node-js/object.path.ru.md и https://github.com/dorinesinenco/EDUQATION/blob/master/programming/node-js/events/simple-pub-sub.ru.md примеры

---

* В том случае когда мы пользуемся **.emit('event_name',arg1,arg2,...)** чтобы выслать событие, все последующие аргументы после названия события - попадут в **callback**
* Класс **EventEmitter** может быть разширен (унаследован), для построения собственного функционала связанного с событиями

---

* Предположем у нас есть класс, объекты которого умеют "управлять" источниками данных, уподобляясь простому функционалу баз данных. Тоесть данный класс может выдать искомые данные внутри структуры по иерархическому пути, или вернуть ошибку - в случае если данных нет, объявим его (provider.js):
  ```js 
  const EventEmitter = require('events')
  
  class DataProvider extends EventEmitter {
    constructor ( dataSource ) {
      super()
      this.dataSource = dataSource
    }  
    
    select( path ) {
      // 1. getValue() from the path ( path is somth like "this.is.0.the.path.to.the.value" )
      // 2. if undefined - emit -> 'error' with a message and the path
      // 3. if data exist -> emit -> 'data' with data and path
      ...
      
      
    }

    getValue( path, this.dataSource  ) {
      ...
    }
    
  }
  ```
  как можно увидеть конструктор класса получает 1 аргумент:
    - dataSource - структура типо объекта (внутри которого производится поиск)
  ВОПРОС: - что дает вызов **super()** в нашем конструкторе?
  
  так же можно увидеть что у класса есть метод **getValue( ... )** - он должен искать по алгоритму который вы написали в прошлых примерах для поиска внутри структуры, и он должен вернуть - либо undefined либо данные
  
  так же внутри класса есть метод **select( ... )** - этот метод и будет вызван на самом деле из главного кода для поиска данных, он и должен воспользоватся методом **getValue( ... )**
   * добавьте код который экспортирует класс **DataProvider** через такое же имя

* Продолжим код (app.js)
  ```js
  const { DataProvier } = require('./provider')
  const data = { users: [ { ... } ]  }
  
  let dataProvider = new DataProvider( data )
  
  ```
  создали объект провайдера и зафиксировали в нем источник данных (источник можете подставить с любой древообразной структурой)

* Добавим привязку к 2-м событиям (app.js)
  ```js
  dataProvider.on('data', (path, data)=>{ console.log( "FOUND", data, "on", path)  })
  dataProvider.on('error', (path, error)=>{ console.log( error, "on", path)  })
  ```
  как можно увидеть, если провайдер запустит событие "data" то он так же отправит в callback путь и сами данные (чтобы было понятно что мы искали и где), а в случае ошибки - ошибку и путь, для той же цели
  ВОПРОС: - откуда у нашего класса **DataProvider** - появился метод **.on( ... )** ?
  
* Добавим запрос на поиск (app.js)
  ```js
  dataProvider.select("some.existing.data")
  dataProvider.select("some.inexisting.data")
  ```
  запустив приложение должны увидеть в консоли инфу об удачном и неудачном поиске данных в **dataSource**, НО для этого вам необходимо доделать код **getValue()** и **select()** так чтобы **select()** - искал данные по указаному пути и выпускал события успешного или ошибочного результата
  
 



