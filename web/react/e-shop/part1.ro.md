## Pregatire pentru dezvoltarea shop-ului

### Crearea structurii proiectului si pregatirea modelului Product

1. Sa se genereze skeleton-ul unei aplicatii noi React
2. in mapa src/ sa se creeze folderul models/
3. in mapa src/models/ sa se creeze fisierul Product.js care contine clasa care reprezinta un oarecare produs din shop, ATENTIE! aceasta clasa nu reprezinta o componenta React, este o clasa standarda ES (deci ea descrie structura de date si NU partea vizuala a produsului)
4. clasa Product va avea: constructor - care va crea obiecte de tipul dat din urmatorii parametri: id, name, image (la moment doar astia 3)  
5. clasa Product va contine metoda toPOJO() care va returna datele produsului reprezentate ca obiect simplu {} javascript
6. clasa Product va contine o metoda numita toJson() - care tre sa returneze reprezentarea produsului intr-o structura de tip string - JSON "{}"
7. nu uitati sa exportati clasa Product din modulul Product.js

### Pregatirea componentei Product

1. sa se creeze in src/ mapa components/
2. in mapa src/components/ sa se creeze mapa product/
3. in mapa product/ sa se creeze componenta Product.js - care reprezinta o componenta VIZUALA (react) functionala
4. functia componentei va primi in calitate de proprietate numita "product" un obiect din clasa Product
5. sa se elaboreze codul JSX al componentei astfel incat aceasta sa afiseze: name -> ```<h2></h2>```,  image -> ```<img>```
6. in codul App, sa se elimine JSX-ul din exemplul standard si sa se afiseze 3 componente de tip Produs, fiecare pentru un obiect de tip produs diferit
