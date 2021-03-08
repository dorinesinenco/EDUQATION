# Использование дебагера

---

ВАМ ДАЛИ КОД 'provider.js'

* RandomDataProvider - класс объекты которого должны быть способны генериновать рандомные ЦЕЛЫЕ числа в указанном диапазоне

```js

class RandomDataProvider {

  
  random(min,max) {
    return Math.random() * (max-min) + min
  }
  
  next() {
    return this.random(this.min,this.max)
  }
  
}

```

и 'app.js' который используя наш модуль пытается наполнить массив 10-ью РАЗНЫМИ целыми рандомными числами

```js

const { RandomDataProvider } = require('./provider.js')

const rdp = new RandomDataProvider( 0, 100 ) 

let randomInts = [] 
let n
while( (n = rdp.next()) && randomInts.length != 10 ) {
   randomInts.includes( n ) ? undefined :  randomInts.push( n )
}

// ???

```

ТРЕБУЕТСЯ:
 1. Переделать класс ТАК чтобы он соответствовал ТОМУ как его используют когда создают объект в 'app.js' (конструктор?)
 2. Добиться наполнения массива ЦЕЛЫМИ РАЗНЫМИ числами в указанном кол-ве (10 - Значений)
 3. Ответить на вопрос - зачем эта строка кода  **randomInts.includes( n ) ? undefined :  randomInts.push( n )** ?
 4. Дописать код в 'app.js' так чтобы в консоль были выведены все значения
 5. Как вы думаете, при каком значение **n** цикл остановится? и как это предотвратить (почему не всегда 10 чисел)?
 6. Откройте код в дебаггере и добавьте в "watch" такую инструкцию чтобы "словить" момент когда цикл остановится - ПОСЛЕ выполнения п. 5 !!!
 7. Исправьте код цикла так чтобы в массив всегда накапливалось 10 чисел
 8. !!! ПОПРОБОВАТЬ переписать код  в 'app.js' так чтобы о выглядел следующим образом (но выполнял те же требования) - вписать код надо будет ТОЛЬКО в местах где ??? 
     ```js
   
    let randomInts = [] 
    randomInts.push( ??? (function( ??? ){
      const provider = new require('./provider.js').RandomDataProvider( ???, ??? ) 
      ??? 
      return ???
    })(0,100) )
    randomInts.forEach( ??? )
    
    ```
 9. После переделки кода (п. 8), что покажет call stack если вставить breakpoint в анонимную функцию перед **return ...** ?
