*Clasele permit "sablonizarea" obiectelor si gruparea acestora in categorii.*

| *declararea claselor: **class Name***
| *initializarea proprietatilor: **constructor()**, **new Name()***

---

In acest exemplu trebuie sa declarati o clasa numita "User", care atunci cand va construi obiecte noi sa 
le atribuie urmatoarele caracteristici (proprietati):
    * username - nume utilizator
    * email    - adresa de email
    * password - parola
    * avatar   - adresa pozei de avatar
    * created  - data inregistrarii utilizatorului
Clasa tre sa contina de asemenea si cateva metode:
    * render() - afiseaza reprezentarea HTML a acestui profil de utilizator
    * period() - returneaza perioada de cand acest utilizator este in sistem ca numar de zile 



## In baza fragmentului "script" din [index](./index.html) executati urmatoarele puncte:
1. Completati toate locurile marcate cu **// ???** in clasa si in afara ei, astfel incat codul sa corespunde cerintelor expuse mai sus
2. Completati script-ul cu un cod care va executa urmatoarele actiuni:
    * va crea 3 utilizatori cu nume, avatar, email, parola si data de inregistrare diferite
    * afisati cele 3 profiluri de utilizatori apeland functia "render()" astfel incat datele sa corespunda shablonului:

```html
<div>   
    <h2>??? - username (??? - email)</h2>  
    <img src="??? - avatar" />
    <p>user has registered ??? - period() - days ago</p>
</div>   

---

