## Operarea cu array -  mutarea elementelor cu locul

* sa presupunem ca avem un array declarat prin urmatorul cod in interiorul lui **main()**

```java
  
  Integer[] data = { 100, 200, 300, 400, null };

```

* RASPUNDETI LA INTREBAREA: - de ce intr-un array de nunere intregi, avem dreptul pe langa valorile numerice sa plasam valoarea "null"?


* sa presupunem ca avem urmatoarea metoda (in aceiasi clasa ca si **main()**), care primeste un array din afara prin intermediul argumentului, face schimbari in acesta si il returneaza inapoi

```java

    public static Integer[] methodA(Integer[] array){
        int i = array.length;
        while( i > 0 ){
            array[i--] = array[i];
        }
        array[i] = null;
        return array;
    }

```

* SE CERE:
  1. Faceti o analiza si incercati sa intelegeti algoritmul metodei **methodA()** (scrieti o desfasurarea a pasilor care formeaza algoritmul in comentarii, deasupra locului unde e declarata metoda)
  2. Rulati codul, adaugand ``` data = methodA(data); ``` si un ciclu care sa printeze rezultatul obtinut in **main()**
  3. Reiesind din algoritmul metodei **methodA()**, redenumiti metoda in engleza cu o denumire din doua - trei cuvinte care sa i se potriveasca dupa sens
  4. Creati in aceiasi clasa o metoda, care din punct de vedere algoritmic, va executa operatiunea opusa
  5. Rescrieti ambele metode, astfel incat in loc de **while(...)** sa fie utilizat **for(...)**