## Вот код который проверит ваш код автоматически

```js

/// COPY PASTE YOU app.js code in this file

const { RandomDataProvider } = require('./provider.js')
// TEST CONFIGURATION
let nTests = 1000 // number of tests
const SIZE = 10   // number of values to be found in the array
const MIN = 0    // min value
const MAX = 100  // max value

let success = 0
// testing loop
for (let testN = 1; testN <= nTests; testN++) {

    let rdp = new RandomDataProvider(MIN, MAX)

    let randomInts = []
    let n
    while ((n = rdp.next()) && randomInts.length != SIZE) {
        randomInts.includes(n) ? undefined : randomInts.push(n)
    }

    // testing the result
    if (randomInts.length != SIZE) {
        console.error(`Test No: ${testN} failed, REASON: ${SIZE} != ${randomInts.length}`)
        console.error(`Resulted array: ${randomInts}`)
    }else {
        console.log(`TEST No: ${testN} OK`)
        console.error(`Resulted array: ${randomInts}`)
        success ++
    }

}

console.log(`${nTests} DONE: ${success}/${nTests} - passed!!!`)






```
