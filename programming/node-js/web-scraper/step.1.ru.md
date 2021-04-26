## Использую за основу урок который был в классе

* Создать приложение 'app.js' которое при помощи 'selenium-webdriver' (на основание данного фрагмента кода):
```js
const webdriver = require('selenium-webdriver');
const By = webdriver.By
const chrome = require('selenium-webdriver/chrome');
// const firefox = require('selenium-webdriver/firefox');


(async function example() {
    let driver = new webdriver.Builder()
        .forBrowser('chrome')
        .setChromeOptions(/* ... */)
        .build();

    try {
        await driver.get('https://getavataaars.com/');
      
        let btn =  await driver.findElement(By.css('header button'))
        await btn.click()

        let svgContainer = await driver.findElement(By.css('svg'))
        let svg = await svgContainer.getAttribute('outerHTML')

        console.log(svg) 
        
    } finally {
        console.log("JOB DONE!")
    }
})();
```
ВЫПОЛНИТ:
  1.  Запустит при помощи **setInterval()** 10 кликов с задержкой в 1 секунду
  2.  Сохранит при помощи **fs** каждый полученный **svg** в файл "data/avatar-N.svg", где **N** - порядковый номер сгенеринованного аватара

ПОМОЩЬ:
  1. Обратите внимание! так как эта версия selenium driver в nodejs построена на Promise/async/await - каждое действие должно сопровождатся ожиданием через **await** или **.then()**
  2. .findElement(By.css('svg')) - ищет первый эмелент который соответствует формуле css
  3. .findElements(By.css('svg')) - ищет все эмеленты который соответствуют формуле css
  4. .getAttribute('outerHTML') - вернет HTML представление самого элемента , вопрос - как вы думайте что вернет .getAttribute('innerHTML')?

