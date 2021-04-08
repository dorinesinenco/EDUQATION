## Доработка проекта


* Продолжаем улучшать код

> Для выполнения этого шага необходимо закончить шаг 2

---

* После добавления класса **Route** - объекты которого хранят данные об путях:
  1.   Переписать логику "routing"-а основного файла приложения ```index.js```, по принципу:
       ```js
       
       const server = http.createServer(({url}, res)=>{

        // routing
        if ( url == "/" ) {
          ....

       ```
       заменить на
        ```js
       
       const server = http.createServer(({url}, res)=>{
        const route = new Route(url)
        // routing
        if ( route .isPath("/") ) {
          ....

       ```
