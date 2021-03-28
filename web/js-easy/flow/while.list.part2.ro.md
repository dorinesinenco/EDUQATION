## Utilizarea **while** pentru "template"-uri

* Se da urmatorul cod:
  ```js
  const start = 1
  const end   = 10
  let item    = start

  document.write(`<ul>`)
  while(item<=end) {
    document.write(`<li>:nth-child(${item})</li>`)
    item++
  }
  document.write(`</ul>`)
  
  ```
  
  rezultatul executiei caruia arata asa
  
  ![image](https://user-images.githubusercontent.com/4667821/112746511-e5ac6600-8fb7-11eb-8c31-e762d9741901.png)


* Sa se modifice acest cod (adaugant in interior conditii prin **if-else** ), astfel incat executia sa dea urmatorul rezultat
  
  ```
  * :first-child
  * :nth-child(2) 
  * :nth-child(3) 
  * ...
  * :nth-child(9) 
  * :last-child
  ```

