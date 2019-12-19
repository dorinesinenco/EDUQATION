## Как использовать кастумизированный Bootstrap 4 в SCSS / при помощи VSCODE


1. Устанавливаем расширение для VSCODE "Live Sass Compiler"
2. Создаем проект с такой структурой
   ```
   bootstrap-scss-example/
     - .vscode/
        - settings.json 
     - scss/
     - css/
     - js
     - index.html
   ``` 
3. В "settings.json" пишем такой конфиг
   ```json
    {
        "liveSassCompile.settings.includeItems": [
            "scss/style.scss"
        ],
        "liveSassCompile.settings.formats":[
            {
                "format": "expanded",
                "extensionName": ".css",
                "savePath": "/css"
            }
        ],
        "liveSassCompile.settings.excludeList": [
        "**/node_modules/**",
        ".vscode/**"
        ],
        "liveSassCompile.settings.autoprefix": [
            "> 1%",
            "last 2 versions"
        ]
    }
   ``` 
4. Заходим на официальный сайт, секция DOWNLOAD скачиваем "SOURCE" [getbootstrap](https://getbootstrap.com/docs/4.4/getting-started/download/)
5. Из "zip" вам нужна только SCSS папка, копируем ее содержание в папку проекта "scss"
6. В папке "scss/" создаем еще свой файл "style.scss"
7. импортируем bootstrap в свой файл
   ```scss
   @import "bootstrap";
   ``` 
8. Запускаем "watch sass" в VSCODE
9. Открываем в редакторе  "_variables.scss"  (все файлы с нижним подчеркиванием - фрагменты, их отдельно юзать не желательно!) и меняем например цвета "primary" и "secondary"
   ```scss
    $primary:       brown !default;
    $secondary:     magenta !default;
   ``` 
   на какие-то свои желаемые цвета!
10. В том же фале ищем радиусы (это переменные что задают степень округления кнопок и других элементов) и меняем на 0 - предположим нужны прямые формы без округлений
   ```scss
    $border-radius:               0 !default;
    $border-radius-lg:            0 !default;
    $border-radius-sm:            0 !default;
   ```
11. Находим секцию с переменными кнопок и увеличиваем **padding** так чтобы он был идентичен в доль осей **x/y** - предположим требуются более "квадратные" кнопки
   ```scss
   $input-btn-padding-y:         .5rem !default;
   $input-btn-padding-x:         .5rem !default;
   ``` 
12. При компиляции в папке "css/"   должен появится "style.css' - подключаем в HTML и в макете делаем 2 кнопки
    ```html
    <a href="#" class="btn btn-primary">PRIMARY</a>
    <a href="#" class="btn btn-secondary">PRIMARY</a>
    ``` 
    если все пошло удачно, то вы увидите новую модель кнопок в своем макете!