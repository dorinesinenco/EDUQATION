## Lucrul cu clasele si obiectele / referinte intre acestea

> part 2

* Continuarea exemplului cu DOM virtual
* Pentru a continua, faceti cunostinta cu aceasta metoda ( .is() ) statica din clasa **Object** https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is


SE CERE SA:
  * adaugati o metoda numita **removeChild( child )** in clasa **Element**, aceasta metoda va primi in calitate de argument un obiect, care mai intai de toate trebuie testat sa fie reprezentant (instance) a clasei **Element**, apoi metoda data va trebui sa utilizez UN CICLU STANDART FOR cu index! pentru a parcurge toti copii elementului dat si care va utiliza metoda Object.is() pentru a vedea daca elementul pe care incercam sa il stergem este pe pozitia [index] in colectia de mostenitori. Daca elementul va fi gasit, metoda data va trebui sa il elimine din lista de mostenitori al elementului parinte.
  * Testati codul prin
    ```js
      let parent = new Element("div")
      let h1 = new Element("h1")
      parent.appendChild(h1)
      parent.appendChild(new Element("p"))
      parent.removeChild(h1)
      parent.removeChild(new Element("p"))
      
      console.log(parent.render())
    ```
    drept rezultat - ar trebui sa ramana parintele "div" cu un singur mostenitor "p", "h1" ar trebui sa fie eliminat din colectie
