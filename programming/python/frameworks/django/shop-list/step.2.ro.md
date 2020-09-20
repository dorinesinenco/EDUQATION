## Lucrul in Django framework

### Creare unor "pagini" si "rute" simple cu niste date
  
* Rutele - reprezinta "caile" interne in sistem, acestea pot lua diferite formate, de ex:
    
    ```
    /products
    /products/id/100
    /products?sort=price
    ...
    ```
    important este sa retineti ca rutele pot contine "parameters" si "query string variables"!

    ORICE ruta va fi legata de un careva "controller" (un fragment de logica) care o proceseaza si, probabil, returneaza un careva rezultat

* Vizualizarile (views) - reprezinta un mecanizm de afisare a rezultatului in mod shablonizat. Vizualizarile sunt activate de catre controllere, pot primi date din sistem si le pot afisa utilizand shabloane (templates)
* Templates - reprezinta fragmente de pagina sau pagini complete scrise utilizand un careva motor de shablonizare si tehnologii web HTML,CSS,JS

---

SE CERE:
1. Sa se adauge in sistem ruta "/" sau "" - care reprezinta pagina principala, aceasta sa afiseze o vizualizare cu o pagina HTML cu structura completa in care in title (tag-ul title) sa fie afisat automa data de astazi in formatul YYYY/MM/DD
2. Sa se adauge in sistem ruta "/shop-list" - care sa afiseze o lista de cumparaturi. Aceasta tre sa functioneze in felul urmator: ruta va apela o functie, care va genera o lista dictionare care arata in felul urmator:
    ```python
    shoppingList = [
        { 'name': 'Bread', 'quantity': 2 },
        { 'name': 'Water', 'quantity': 5 },
        ...
    ]
    ```
    unde **name** - este denumirea produsului iar **quantity** cantitatea necesara de a fi procurata

    functia va trebui sa transfere aceasta lista prin "views" intr-un shablon, care o va afisa formatand-o ca o lista numerotata in HTML (tag-urile ol, li)

---

referinte
[rutarea](https://docs.djangoproject.com/en/3.1/topics/http/urls/)
[exemplu cu pagini cu template](https://docs.djangoproject.com/en/3.1/intro/tutorial03/)
