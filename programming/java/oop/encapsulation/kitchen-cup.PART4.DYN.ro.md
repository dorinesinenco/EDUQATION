## Encapsularea. Mostenirea. Suprascrierea, polimorfism.

> partea 4

* La momentul actual in obiectele de tip "cana" (Cup + decendants) se afla 2 proprietati: denumirea lichidului si volumul acestuia. va trebui sa refaceti codul pentru obiectele de tip cana ca in loc de cele doua proprietati sa apara una noua - obiectul de tip lichid dar si limita volumului maximal. 
* Pentru aceasta se cere:
  1. Sa se inceapa cu clasa "Cup", stergeti 2 proprietati - liquidName, liquidVolume
  2. Adaugati proprietatea liquid (lichid) in clasa Cup - asta va fi un obiect din clasa Liquid (creat in partea 3-a) cu modificatorul de acces private. Deci lichidul sa se afle in cana.
  3. Sa se adauge o CONSTANTA STATICA in clasa Cup - "MAX_VOLUME" in care este fixata valoarea 600 (ml). De ce statica? - deoarece toate obiectele acestei clase vor avea acelasi volum maxim!. De ce constanta? - pentru ca sa nu poata fi schimbata intamplator sau intentionat!
  4. Sa se refaca logica constructorului si a set / get luand in consideratie faptul ca structura clasei s-a schimbat!
  5. Sa se creeze in main() o cana "standardCup" (obiect) din clasa "Cup" cu 500 ml de apa in interior
  6. In main() sa se mai toarne 50 de ml de apa in aceiasi cana
  7. Sa se afiseze informatia despre "standardCup" si despre lichidul din interior - in consola!

