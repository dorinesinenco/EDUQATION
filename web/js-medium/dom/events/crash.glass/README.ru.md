* Научиться взаимодействовать со структурой и событиями DOM - это один из важных моментов FE. *

| *основной обьект DOM: **document***
| *навигация по DOM: **element.parentElement**, **element.previousElementSibling**, **element.nextElementSibling**, **element.firstElementChild**, **element.lastElementChild**, **element.children***
| *поиск по DOM: **document.getElementById()**, **document.getElementsByClassName()**, **document.getElementsByTagName()**, **document.querySelector()**, **document.querySelectorAll()***

---

## На основе фрагмента «script» в [index](./index.html) выполнить следующие пункты:
1. Объявить в [cracks](./cracks.js) массив ```images``` с адресами всех картинок из папки ./images 
2. Привязать метод "addCrack()" к клику на **body**
3. Метод "addCrack()" должен получать обьект события, из этого обьекта вытащите координаты того места где произошел клик относительно окна ( пользуйтесь консолью чтобы понять какие свойства вам нужны ) 
4. Данный метод должен создать ```<div class="crack"></div>``` и добавить его в наследники **body**. А так же метод должен установить вложенный стиль новому **div** с свойством "background-image" и значением "url(...)" с одним из адресов картинки выбраной наугад из массива **images**. Этому же **div** установить координаты "top", "left" таким образом чтобы **div** c картинкой появился почти в том месте где был сделан клик, создавая тем самым впечатление того что стекло треснуло в том месте ))) [result](./result.png)

---

BONUS. Каждый раз когда устанавливается новая "трещина", запустить таймер который удаляет ее из **body** через интервал в 2..10 секунд
