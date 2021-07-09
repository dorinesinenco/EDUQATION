## Programarea functionala, aplicarea principiilor AOP 

* Sa presupunem ca exista o functie si sa ne imaginam ca aceasta "realizeaza" transferul unei sume de bani pe un cont dupa "id"
  ```js
  function  pay(acountId,amount) {
    console.log(`paying ${amount} to ${acountId}`)
  }
  ```
  aceasta functie ar fi declarata in contextul browser, respectiv - window
  
  apeland functia in felul urmator 
  ```js
  pay(123456, 100.00)
  ```
  am transfera pe contul 123456 suma de 100.00 (evident ca functia noastra nu transfera nimic, dar sa ne imaginam ca acel console.log care e plasat in interiorul ei, reprezinta tranzactia financiara in realitate)
  
  
* Sa presupunem ca am dori sa "urmarim" (watch) toate apelurile facute catre aceasta functie, fara ca sa stim exact unde va fi apelata, pentru a duce o "evidenta" (log) al tuturor apelurilor facute catre aceasta functie, pentru a realiza aceasta vom aplica paterrnul  "wrapper" - adica vom imbraca functia intr-o functie creata de noi, pentru a captura apelul aceleia FARA sa intervenim in codul functiei originale

  ca sa realizam aceasta vom crea o alta functie numita "watchDog"  - adica o functie care va "agata" un cod de urmarire pentru functia de baza
  ```js
  function watchDog(context,target) {
      let oldTarget = context[target.name]
      context[target.name] = function () {
          console.info(`LOG: function "${oldTarget.name}" begin`)
          let result = oldTarget.apply(context,arguments)
          console.info(`LOG: function "${oldTarget.name}" end`)
          return result
      }

  }
  ```
  observati faptul ca functia este cautata in contextul in care a fost definita dupa nume **.name** si este substituita cu o alta functie care o va apela prin **.apply** si care va afisa un mesaj de logare pana la si dupa apelarea functiei target 
  
* Vom apela functia watchDog pentru a face legatura 
  ```js
  watchDog(window,pay)
  ```
  din acest moment toate apelurile catre functia "pay" declarata la nivel global in contextul ferestrei vor fi "urmarite" , sa testam:
  ```js
  pay(123456, 100.00)
  ```


 
SE CERE SA:
 1. aduceti exemplul pana in acest puct urmarind si verificand practic cum functioneaza acest mecanism
 2. modificati codul  ```oldTarget.apply(context,arguments)``` astfel incat **.apply** sa fie substituit cu **.call** sau cu **.bind**
 3. utilizati **watchDog** pentru a urmari (captura, intercepta) orice apel catre functia **parseInt** care exista deja in contextul ferestrei, testati interceptarea
  
