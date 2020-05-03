## Principiul capsulei. Set-eri si Get-eri.. Mostenire. Polimorfizm

> partea 3

* La moment in interiorul obiectelor de tip "cana" (Cup + decendants) se contin 2 proprietati: denumirea lichidului si volumul acestuai. Pasul acesta nu va fi dedicat obiectelor de tip CUP dar va pregati teritoriul pentru imbunatatirea logicii acestora.

---

SE CERE (code refactoring):
  1. creati un pachet nou "world" (lumea) 
  2. In acest pachet creati clasa "Liquid" (lichid), aceasta clasa subintelege orice obiect de tip lichid (lapte, apa, ...)
  3. Clasei "Liquid" sa i se adauge proprietatile (private):
     1. name (denumire lichid) - tip?
     2. volume volumul in ml) - tip?
     3. temperature (temperatura in grad. Celsius ) - tip?
  4. Adaugati 2 variante pentru constructor (default si parametrizat) - Cum se numeste acest lucru - atunci cand o metoda are mai multe variante?
  5. Adaugati perechile set/get pentru toate proprietatile asa incat:
     1. name - sa nu fie gol
     2. volume - nu poate fi negativ sau zero
     3. temperature - este doar in diapazonul 0..100 (sa presupunem ca lichidele ingheata la 0 si se evapora la 100)
  6. Adaugati metoda publica "isCold()" (rece) care returneaza Boolean - true atunci cand temperatura lichidului <= 18
  7. Adaugati metoda publica "isWarm()" (cald) care returneaza Boolean - true atunci cand temperatura lichidului > 18 <= 36
  8. Adaugati metoda publica "isHot()" (fierbinte) care returneaza Boolean - true atunci cand temperatura lichidului > 36

---

* VERIFICAREA in main() a se face creand cateva volume de lichide cu denumiri si temperaturi diferite!