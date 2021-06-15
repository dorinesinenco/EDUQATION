## Procesarea formularului de abonare

* Se cere sa adaugati un fragment de logica in JS care va permite sa "activati"/"decativati" butonul de abonare (subscribe) nu doar in baza bifei care tine de acceptarea termenilor si conditiilor, dar si numai atunci cand cel putin una din optiunile care trebuiesc bifate va fi activata.


RECOMANDARE: incercati sa utilizati urmatorul algoritm
  1. cautati toate cele 5 inputuri (pot fi si mai multe) dupa un criteriu comun, ca rezultat veti obtine un HTMLCollection, din pacate aceasta clasa nu ne permite sa beneficiem de metode precum: .filter(), .forEach(), ...
  2. pentru a beneficia de metoda Array.find(...)  care ar permite sa gasim "prima bifa activata" (sau nimic), va trebui sa pasati colectia de elemente metodei Array.from(...), aceasta va converti colectia intr-un array de elemente, apoi continuati cu metoda .search() si criteriul de cautare potrivit [detalii](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/from)
