## Programarea OOP/Design patterns

> In programarea OOP - un provider este numita de obicei componenta care ofera / presteaza careva bunuri (data/servicii)


* Sa presupunem ca avem urmatoarea clasa (in fisierul NumberProvider.js)

  ```js
    class NumberProvider {
        constructor(min=-100,max=100){
            // 1. Validation
            this.min = min
            this.max = max
            this.start()
        }

        // 2. arrow notation
        generate() {
            return Math.round(Math.random() * (this.max - this.min) + this.min)
        }

        whenPositive(positiveCB) {
            this.positiveCB = positiveCB
        }

        whenNegative(/* 3. ??? */) {
            /* 3. ??? */
        }

        start() {
            setInterval(()=>{
                let number = this.generate()
                if(number>=0) {
                    this.positiveCB(number)
                }
                /* 3. ??? */
            },1000)
        }

    }
  
  ```
  Observati in constructia clasei faptul ca aceasta va crea un obiect de tip provider care va tine minte 2 valori (min,max) care definesc diapazonul in care acest provider trebuie sa ofere numere random. De asemeni observati ca - imediat ce s-a realizat construirea obiectului de acest timp, starteaza un timer care repeta o functie care genereaza un numar intreg random in diapazonul indicat o data pe secunda.

* Se cere:
  1. Sa adaugati acest fisier unei pagini HTML
  2. Sa mai creati un fisier (app.js - fisierul principal al aplicatiei) care va contine codul
     ```js
     let provider = new NumberProvider()
     ```
     deci acesta va crea un provider si il va starta imediat
  3. Sa dechideti consola si sa explicati de ce o data la cateva secunde apare o eroare? 
  4. Tot in app.js, adaugati urmatoarea functie
     ```js
      function positiveAction(number) {
          console.log("got a positive random number >>>", number)
      }
     ```
     aceasta va fi o functie care va "reactiona" de fiece data va aparea un numar pozitiv
  5. Dupa adaugarea acestor modificari, reincarcati pagina si verificati consola, eroarea va continua sa apara din cand in cand
  6. !!!Din consola, apelati urmatoarea comanda
     ```js
     provider.whenPositive(positiveAction)
     ```
  7. Rezultatul ar trebui sa se schimbe in ceva asemanator cu
     ![image](https://user-images.githubusercontent.com/4667821/118600122-391d8200-b7b9-11eb-892c-f7a9531cce96.png)
  8. Raspundeti la intreabarea - de ce a disparut eroarea?
  9. (marcat 1 in cod) Adaugati cod in constructor astfel incat acesta sa verifice min/max daca sunt numere intregi si daca nu - sa dea o eroare prin "console.err()" : utilizati pentru aceasta metoda .isInteger() din javascript Number
  10. (marcat 2 in cod) Rescrieti definitia functiei **generate()**, astfel incat ea sa fie declarata ca arrow function
  11. (marcat 3 in cod) Completati codul astfel incat provider-ul sa poata accepta si functii carea reactioneaza la numere negative
  
