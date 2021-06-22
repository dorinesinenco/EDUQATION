# Destructuring in JS

* in fragmentul de cod de mai jos este prezentata operatiune desfasurata de schimbare cu lorul a valorilor **a** cu **b**

  ```js
  let a = 10
  let b = 100
  let c 
  
  console.log("before",a,b)
  c = a
  a = b
  b = c
  console.log("after",a,b)
  ```
  cu ajutorul destructurizarii sa se rescrie codul, astfel incat acesta sa ocupe cat mai putine randuri / instructiuni si sa aduca la acelasi rezultat
