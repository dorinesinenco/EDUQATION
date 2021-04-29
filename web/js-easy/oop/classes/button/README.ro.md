*Clasele permit "sablonizarea" obiectelor si gruparea acestora in categorii. Foarte multe framework-uri moderne (gen React, Angular, Vue,...) creaza componente vizuale in baza claselor*

| *declararea claselor: **class Name***
| *initializarea proprietatilor: **constructor()**, **new Name()***
| *cautarea in DOM: **document.getElementById()***

---

In acest exemplu trebuie sa declarati o clasa numita "Button", care permite creare componentelor de tip buton cu urmatoarele proprietati:
  * text (String)     - textul ce apare pe buton 
  * type (String)     - tipul butonului, exista doar optiunile "success", "warning", "disabled", "danger", "default", cu ajutorul constructiilor conditionale convingeti-va ca doar valorile acceptabile vor nimeri in "type"
  * action (Function) - functia (callback-ul) care va fi executat atunci cand se face click pe buton


Clasa tre sa contina de asemenea si cateva metode:
  * render( parrent_id ) - afiseaza reprezentarea HTML a acestui buton IN INTERIORUL elementului identificat prin "parrent_id"



## In baza fragmentului "script" din [index](./index.html) executati urmatoarele puncte:
1. Completati toate locurile marcate cu **// ???** in clasa si in afara ei, astfel incat codul sa corespunda cerintelor expuse mai sus
2. Completati script-ul cu un cod care va executa urmatoarele actiuni:
    * va crea 2 butoane "OK" si "CANCEL" in interiorul formularului in "div"-ul cu id="actions"
    * atunci cand se va efectua click pe butonul "OK" scriptul tre sa execute functia "okAction()" 
    * atunci cand se va efectua click pe butonul "CANCEL" scriptul tre sa execute functia "cancelAction()" 
    * reprezentarea butoanelor trebuie sa corespunda totodata si cu imaginea [result](./result.png)

---
