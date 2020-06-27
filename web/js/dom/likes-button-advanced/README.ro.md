## Operarea cu structura dom si elementele din ea

> In multe frameworkuri moderne (sau biblioteci) care sunt bazate pe  JS, pentru elementele DOM creaza o "componenta" sub forma de clasa, ca sa se poata prototipa comportamentul acestora.

* in [LikeButton.js](./LikeButton.js) este declarata o clasa in baza careia vom vrea butoane (componenta unui buton)
* ce rol joaca **constructor(...)** in clase? 
* constructorul clasei **LikeButton** primeste doi parametri:
  * element - elementul butonului (DOM) de care va fi legata logica butonului
  * likes - numarul initial de like-uri, ce inseamna dupa voi expresia ``` ... , likes  = 0 )``` ?
* Конструктор "запоминает" два переданных аргумента как свойства текущего объекта
* Что означает слово **this** ?
* Обратите внимание на ```this.element.addEventListener('click', this.like.bind(this) )``` внутри конструктора, данная строка привязывает обработчик (функцию) **like()** из текущего класса к клику на кнопку что была передана аргументом в конструктор, зачем нужен ``` ... .bind(this) ``` ? - для того чтобы КОГДА произойдет клик - **this** указывал на текущий объект!
* Каждый раз как пользователь кликает, увеличивается кол-во кликов и текст кнопки рендерится заново
* у вас есть в [index.html](./index.html) одна кнопка, ее можно найти по комбинации классов "btn" и "like", мы ее находим и "одеваем" свою компоненту (LikeButton) поверх кнопки

* Требуется:
  * Доработать код ```// ??? ``` в **render()** так чтобы он работал следующим образом:
    1.  если **likes** ноль, выводить "Like!"
    2.  если **likes** в пределах 1 .. 999, выводить "100 Likes"  - кол-во лайков
    3.  если **likes** в пределах 1000 .. 999999, выводить "10.5k Likes"  - кол-во лайков например если накопилось 10512 - то есть апроксимировать до одной цифры после запятой
    4.  следовать той же логике до 1T - terra likes

* Вам возможно нужны будут некоторые функции из String, Number, Math - классов!
