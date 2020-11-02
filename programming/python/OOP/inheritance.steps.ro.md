## Inheritance - este procedeul prin care o clasa mai superioara (super) aflata mai sus pe ierarhie - ii transmite unei clase mostenitoare partial structura si capacitatile sale

---

* Sa presupunem ca este nevoie de a proiecta o aplicatie in care ierarhia claselor din care vor face parte obiectele - vor reprezenta "Starile" unei persoane in cazul in care aceasta s-a imbolnavit de COVID*, si anume: Healthy, Ill, Curred - Sanatos, Bolnav, Vindecat

sa presupunem ca avem clasa 

```python
class Healthy():
  pass
```

* raspundeti la intrebarile:
  1. Ce inseamna "pass"?
  2. Cum se numeste metoda care participa la instantierea unui nou obiect dintr-o clasa?
  3. Unde se indica numele clasei superioare (de la care aceasta mosteneste structura) in cod?
  
* se cere sa se adauge modificarile:
  1. Sa se adauge proprietatea **fullName** obiectelor de tip - Healthy
  2. Sa se adauge "constructorul" clasei astfel incat el sa atribuie proprietatea **fullName**
  3. Sa se adauge metoda care transforma obiectul de tip Healthy in "str"
  4. Sa se creeze clasa **Ill** ca mostenitoare a clasei Healthy: e o legatura logica - pentru ca doar un om sanatos poate sa se imbolnaveasca, in cazul ierarhiei noastre
  5. Obiectele de tip **Ill** - vor mai avea o proprietate: **startDate** - aceasta va marca data in care persoana data s-a imbolnavit: aceasta proprietate tre sa fie un **dict** cu 3 chei: **day**, **month**, **year**
  6. Sa se ajusteze constructorul si metoda de transformare in string - asa in cat sa se utilizeze si aceasta proprieate
  7. Sa se creeze clasa **Curred** ca mostenitoare a clasei Ill: e o legatura logica - pentru ca se poate vindeca o persoana doar daca a fost bolnava
  8. Obiectele de tip **Curred** - vor mai avea o proprietate: **endDate** - aceasta va marca data in care persoana data s-a vindecat: aceasta proprietate tre sa fie un **dict** cu 3 chei: **day**, **month**, **year**
  9. Sa se ajusteze codul constructorului si metodei de conversie in string
  10. Sa se adauge metoda getPeriod() in clasa **Ill** - aceasta va returna in zile - perioada pe parcursul careia boleste persoana (de la data de imbolnavire pana in prezent) 
  11. Se se adauge metoda getPeriod() si in clasa **Curred** - aceasta va returna in zile - durata perioade de bolire a persoanei - cuprinsa intre cele doua date din obiect
  
