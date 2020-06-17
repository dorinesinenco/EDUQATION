# Operarea cu DOM, pasii de baza, ierarhia elementelor


* Toate elementele dintr-un document reprezinta obiecte in memoria accesata de JS


* Sa presupunem ca avem un fisier cu urmatoarea structura HTML

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>DOM Tree</title>
</head>
<body>
    
    <header>
        <h1>DOM Tree</h1>
        <h2>Traversing DOM hierarchy</h2>
    </header>

    <h3>DOM shortcuts</h3>
    <ol>
        <li>document.TITLE</li>
        <li>document.HEAD</li>
        <li>document.BODY</li>
    </ol>

    <h3>Element References</h3>
    <ul>
        <li>.parentelement</li>
        <li>.previouselementSibling</li>
        <li>.nextelementSibling</li>
        <li>.firstelementchild</li>
        <li>.lastelementchild</li>
        <li>.children</li>
    </ul>

    <script>
        // ...
    </script>

</body>
</html>
```

* se cere sa se scrie o functie numita **fixData()**, care se va executa la incarcarea documentului si va efectua urmatoarele:
  * Va inlocui textul din elementul **H2** - cu textul pe care il contine acesta - unde toate literele sunt majuscule (vedeti element.innerText si String.toUpperCase() )
  * Va transforma in text cu litere mici, textul din fiecare element **li** din lista **ol**, (a se vedea element.children, ciclul for() si String.toLowerCase() )
  * Va corecta textul din fiecare **li** din **ul** astfel incat cuvantul "element" sa fie scris cu majuscula
  * Va corecta textul din fiecare **li** din **ul** astfel incat in fata "." sa fie prefixat cuvantul "element"