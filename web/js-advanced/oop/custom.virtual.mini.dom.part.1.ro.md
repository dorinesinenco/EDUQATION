## Lucrul cu clasele si obiectele

ACEST EXEMPLU VA AFISA REZULTATUL DOAR IN CONSOLA! NU IN document!

* Sa ne imaginam faptul ca e nevoie sa "re-inventam" ideea structurii DOM pe care o utilizam in browse, doar ca mult mai simplificata
* Vom lua drept baza clasa Element

  ```js
  class Element {
    constructor(tagName) {
      this.tagName = tagName
      // reference to other elements
      this.parent = null
      this.children = []
      this.prev = null
      this.next = null
    }
  }
  ```
  
  dupa cum vedeti constructorul clasei va primi denumirea tag-ului pe care il reprezinta elementul (gen: "div", "a", "p")
  de asemeni putem observa faptul ca acesta are 4 proprietati care ne permit sa il legam de alte elemente, initiate din start cu valori NULE
  
* Ne vom tine de aceiasi regula ca si in DOM-ul real, unde parintele raspunde e copii
* Sa adaugam metoda **render** pentru aceasta clasa
  ```js
  ...
    render() {
        let childFragment = ``
        this.children.forEach(child => childFragment += child.render())
        
        return `<${this.tagName}>${childFragment}</${this.tagName}>`
    }
  ...
  ```
   dupa cum se poate vedea, render() - pornit la nivelul unui elemente, va randa automat si toti mostenitorii
* Adaugam un cod in afara clasei pentru a testa clasa proiectata de noi
  ```js
    let root = new Element("html")
    root.children.push(new Element("head"))
    root.children.push(new Element("body"))

    console.log(root.render())
  ```
  rezultatul ar trebui sa fie 
  ```
  <html><head></head><body></body></html>
  ```
* SE CERE SA:
  1. asamblati codul, verificand si intelegand cum functioneaza acesta
  2. adaugati o metoda numita **appendChild( child )** in clasa **Element**, astfel incat ea sa adauge elementul copil in "this.children" , de asemeni, adaugati o verificare in aceasta metoda, astfel incat ea SA NU PERMITA adaugarea obiectelor care nu fac parte din clasa Element
  
  
