## Utilizarea **while** pentru "template"-uri

* Se da urmatorul cod:
  ```js
  
  let item = 1

  document.write(`<ul>`)
  while(item<=5) {
    document.write(`<li>item ${item}</li>`)
    item++
  }
  document.write(`</ul>`)
  
  ```
  
  rezultatul executiei caruia arata asa
  ![image](https://user-images.githubusercontent.com/4667821/112746382-12ac4900-8fb7-11eb-894c-1a24fa4e598f.png)

* Sa se modifice acest cod (adaugant in interior conditii prin **if-else** ), astfel incat executia sa dea urmatorul rezultat
  
  ```
  * 1. Monday
  * 2. Tuesday 
  * 3. Wednesday
  * 4. Thursday
  * 5. Friday
  * 6. Saturday
  * 7. Sunday
  ```
