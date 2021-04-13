## Доработка проекта

* Продолжаем улучшать код

1. Создать "универсальную" функцию для загрузки в память содержимого HTML страниц из предопределенной директории, которая заменит вот этот участок кода в первичном примере
   ```js
   const html = fs.readFileSync("./server/public/index.html") 
   
   ```
   функция **readHTMLPage( name, cb )** должна получить название страницы HTML, найти ее по указанному пути и вернуть используя **callback**
   то есть код который ее вызывает будет выглядеть так
   ```js
   readHTMLPage("index", (content)=>{ console.log(content) })
   ```
   *Подсказка: используйте асинхронный вариант fs.readFile() внутри своей функции, так же проверьте ситуацию - что будет если нет такого файла!
   
2. По тому же принципу сделать функцию которая сможет загрузить данные и распарсить в виде JSON **readJSONFile( name, cb )** 
   ```js
   readJSONFile( "products", (data) => { console.log(data) }) 
   
   ```
   *Подсказка: этой функции мы даем имя файла без разширения и она ищет его в директории с данными (data), было бы неплохо проверить и перехватить ошибку в случае некачественного JSON формата

ПРИМЕЧАНИЕ - для начала сделать простую проверку этих двух функций (test.js который загрузит и выведит данные) применно так
   
   ```js
   readHTMLPage("index", (content)=>{ console.log(content) })
   readHTMLPage("there_is_not_such_page", (content)=>{ console.log(content) })
   readJSONFile( "products", (data) => { console.log(data) }) 
   readJSONFile( "no_such_data_file", (data) => { console.log(data) }) 
   
   ```
