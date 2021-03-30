# Использование async / await + Promises

* Дан файл с данными (data.json)
  ```json
  {
    "dummy": 1000
  }
  ```
* Дан код (app.js)
  ```js
  const fs = require('fs')
  function readFromFile(fileName) {
      const data = fs.readFileSync(fileName)
      return JSON.parse(data)
  }


  function getData(data, propertyName) {
      if (data.hasOwnProperty(propertyName)) {
          return data[propertyName]
      }
  }


  function printValue(value) {
      console.log(value)
  }

  ////////////////////////////////
  printValue(getData(readFromFile('./data.json'), 'dummy'))
  printValue(getData(readFromFile('./data.json'), 'inexistent'))
  
  ```
  проверьте код, как вы видите создается цепока вызовов функций (синхронная)
  
* ТРЕБУЕТСЯ: переписать код используя асинхронный подход начиная с **fs.readFile()**, подсказка:
  ```js
  async readFromFile( ... ) {
    const data = await readFile(...)
    ...
  }
  ```
  * ВНИМАНИЕ! для этого используйте субмодуль 'fs/promises' (который есть в nodejs как часть модуля 'fs')
