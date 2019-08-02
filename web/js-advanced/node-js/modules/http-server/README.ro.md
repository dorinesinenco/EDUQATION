*Modulul **http** permite utilizarea protocolului de comunicare cu acelasi nume in nodejs.*

| *tipuri de date: **String**, **Array***
| *instalarea modulelor: **npm install/yarn add***
| *preprocesoare css: **sass/scss***

---
## In baza fragmentului de cod din din [index](./index.js) executati urmatoarele puncte:
1. Prin comanda **npm init** initiati un nou "package.json"
3. Verificati pe scurt documentatia modulului ales
4. Conectati complecati codul functiei [(req,res)=>{}](./index.js#L2) astfel incat, odata rulata aplicatia voastra, aceasta sa permita incarcarea in browser a paginii home.html cu toate resursele pe care aceasta le conecteaza.
   
---
ATENTIE: 
    * in obiectul req (request) puteti testa proprietatea **url** pentru a afla ce adresa a cerut browserul
    * ganditi-va daca poate cumva fi optimizat codul astfel incat sa nu scrieti verificari de **url** pentru fiecare fisier cu stil in parte (utilizati functiile din String)