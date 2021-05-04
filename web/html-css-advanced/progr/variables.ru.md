## Применение CSS переменных


* У вас есть HTML:
  
  ```html
  
    <div class="container">
        <div>1</div>
        <div>2</div>
        <div>3</div>
        <div>4</div>
        <div>5</div>
        <div>6</div>
        <div>7</div>
        <div>8</div>
        <div>9</div>
    </div>
  ```

* и CSS к нему:
  ```css
  .container {
    --size: 1em;
    --color: green;
  }

  .container > div {
      width: var(--size);
      height: var(--size);
      padding: var(--size);
      margin: calc(var(--size) / 10);

      background-color: var(--color);
  }


  .container > div:first-child, 
  .container > div:last-child {
      --size: 2em;
  }
  ```
  
* ТРЕБУЕТСЯ:
  1. Запустить код и ответить на поврос - почему 1-й и 9-й элементы отличаются по размеру (ответ желательно построить детально изложенный с точки зрания технических терминов )     
  2. Добавить код который установит элементам 4,5,6 дугой цвет (применяя переменную **--color**), для этого вы свободны менять HTML / CSS, но необходимо мотивировать аргументами ваше решение! Приветствуется так же альтернативные решения!
