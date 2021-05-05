## Использование Fetch API в контексте "Promise"

* У нас есть такая структура кода HTML
 
  ```html

  <!DOCTYPE html>
  <html>
  <head>
      <meta charset="UTF-8">
      <title>Fetch API | Promise | Example</title>
  </head>
  <body>

      <div id="output">
          <!-- content will load here -->
      </div>
      <button onclick="loadData()">
          LOAD DATA
      </button>
      <script src="app.js"></script>
  </body>
  </html>

  ```
  
  где подключен скрипт "app.js", есть контейнет ```<div id="output">``` и есть кнопка на поторую когда нажмет клиент, отправится запрос на API и загрузятся данные
