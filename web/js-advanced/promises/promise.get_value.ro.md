## Obiectele de tip "Promise" in ES

> Obiectele de tip **Promise** reprezinta un rezultat complet (sau un esec) al unei operatiuni eventuale asincrone.
> Pana la aparitia acestui concept in JS (chiar si in continuare) erau utilizate "callback"-urile pentru a reactiona la starea unui rezultat in viitor

* Sa presupunem ca avem un obiect cu date numit **data**
  ```javascript
  const data = {
      first: 1000,
      second: 2000
  }
  ```
* Sa presupunem ca avem uite asa o functie **getValueOf** scopul careia este sa incerce sa returneze valoarea unei proprietati din obiectul "data", doar ca cu o intarziere aliatorie intre 0..3 secunde. Dupa cum vedeti aceasta se realizeaza prin **setTimeout**. In momentul in care a trecut timpul de asteptare, vom transmite functiei "callback" o eroare - daca proprietatea nu exista sau valoarea acesteia daca ea exista. Atentie la faptul ca este utilizata metoda predefinita **.hasOwnProperty()** pentru a determina daca obiectul are proprietatea dorita.

    ```javascript
    function getValueOf( property , callback ){
        setTimeout(()=>{
           if( data.hasOwnProperty( property )){
               return callback( data[property] )
           }else{
               return callback( new ReferenceError("No such property in DATA!") )
           }
        }, 3000 * Math.random());
    }
    ```
* Testam functia creata de noi, mai intai o apelam incercand sa citim prima valoare din obiectul **data** si ii dam ca si callback - console.log ca sa vedem rezultatul
  ```javascript
  getValueOf("first",console.log)
  ```
  veti vedea 1000 in consola peste ceva timp

* Testam functia creata de noi, mai intai o apelam incercand sa citim cea de a doua valoare din obiectul **data** si ii dam ca si callback - console.log ca sa vedem rezultatul
  ```javascript
  getValueOf("second",console.log)
  ```
  veti vedea 2000 in consola peste ceva timp

* Testam functia creata de noi, mai intai o apelam incercand sa citim o proprietate care nu exista in obiectul **data** si ii dam ca si callback - console.log ca sa vedem rezultatul
  ```javascript
  getValueOf("nothing",console.log)
  ```
  veti vedea "ReferenceError: No such property in DATA!" in consola peste ceva timp

* In asa mod in cazul dat simulam citirea cu intarziere a datelor dintr-o sursa (exact asa cum ar fi dintr-un API, fisier, baza de date, etc) cu o careva rezolvare eventuala. Adica in final primim datele, sau eroarea sub forma de argument al callback-ului.

---

* Acum in baza exemplelor de mai sus, incercam sa scriem un cod care va cere mai intai "first" apoi DACA nu obtine eroare, va accesa "second". Deci citirea "consecutiva" a doua valori din **data**
    ```javascript
    getValueOf("first",(result)=>{
        if( typeof result != ReferenceError ){
            console.log( "Succes! Data: ", result )
            getValueOf("second",(result)=>{
                if( typeof result != ReferenceError ){
                    console.log( "Succes! Data: ", result )
                }else{
                    console.log( "Data NOT available: ", result )
                }
            })
        }else{
            console.log( "Data NOT available: ", result )
        }
    })
    ```
    lansati acest cod de cateva ori, si veti vedea cum cu anumita intarziere ambele date apar consecutiv. Incercati sa intelegeti ce se intampla in el. In esenta - nimic complicat. Pur si simplu succesiunea a doua apeluri este dominata de if/else care verifica daca nu au aparut erori. Daca am adauga in aceasta schema inca 2-3 surse de date care functioneaza asincron (AJAX,fetch, etc) am obtine un cod care a fost denumit anterior "calback hell". Un cod complex, greu de citit, greu de intretinut. 
    Pentru o mai mare practica - incercati in acest exemplu cateva variatii, incercati sa apelati mai intai "nothing" - care ar rezulta intr-o eroare, caz in care cea de a doua etapa nu are sens. Asa lanturi in sistemele reale sunt deseori necesare. 
    
---

* La moment functia **callback** va primi mereu acelasi argument "result" si in caz de eroare si in caz de rezultat realizat.  SE CERE sa modificati formula functiei **getValueOf** si a codului care o apeleaza in exemplul de mai sus, asa incat **callback-ul** sa primeasca pe prima pozitie "err" iar pe cea de a doua "data" in felul urmator:
  * daca este eroare atunci ```err = new ReferenceError(), data = null```
  * daca nu este eroare atunci ```err = null, data = valoarea returnata```

