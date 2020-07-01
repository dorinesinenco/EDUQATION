## Operarea cu structura DOM

* Sa presupunem ca avem o structura semi-functionala pentru un "regulator de volum" apartinand unui player in [folder-ul proiectului](./). 
* Raspundeti la intrebarea - ce rol joaca variabila **volume** ?
* Priviti codul, completati-l in HTML si JS, asa incat:
  * butonul "-" (volume down) - sa functioneze
  * la interactiunea cu "slider"-ul (input[type="range"]) - valoarea variabilei **volume** sa se schimbe
* Raspundeti la intrebarea - poate fi cumva imbunatatit codul de mai jos? 
    ```js
    ...
        let screen = document.getElementById('player').firstElementChild;
        let slider = document.getElementById('player').children[1].children[1];
    ...
    ```
    