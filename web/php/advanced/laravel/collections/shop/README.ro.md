
## Utilizarea claselor interne din Laravel. Colectii

Colectiile ( clasa Collection ) reprezinta ceea ce multi numesc "decorator" iar altii "wrapper", adica
un set de functii grupate intr-o clasa care se "imbraca" deasupra unei structuri de date pentru usura
procesul de prelucrare ale acestor date.

> a se vedea (Laravel):
[clasa "Collection"](https://laravel.com/docs/5.8/collections),




---

NOTA: Scopul acestui exercitiu este sa va obisnuiasca sa utilizati datele in Laravel. 

### 1. Lucrul cu colectiile.

1. Preluati fisierul [Product.php](./Product.php) si amplasati-l conform namespace-ului in aplicatia voastra.
2. Completati codul clasei **Product** astfel incat acesta sa contina proprietatile:
   * name - (php)string    
   * images - (laravel)Illuminate\Support\Collection
   * price - (custom)App\Price
3. Adaugati in clasa **Product** constructor parametrizat si urmatoarele metode:
   * get/set pentru toate proprietatile
   * addImage( image - string ) pentru a adauga o imagine in colectie
   * getMainImage() returneaza prima imagine din proprietatea **images**
4. Preluati fisierul [Price.php](./Price.php) si amplasati-l conform namespace-ului.
5. Completati codul clasei **Price** astfel incat acesta sa contina proprietatile:
   * value - (php)float    
   * currency - (custom)App\Currency
6. Adaugati in clasa **Price** constructor parametrizat si urmatoarele metode:
   * get/set pentru toate proprietatile
7. In acelasi namespace sa se adauge clasa **Currency** care sa contina urmatoarele proprietati:
   * name - (php)string 
   * code - (php)string
8. Adaugati in clasa **Currency** constructor parametrizat si urmatoarele metode:
   * get/set pentru toate proprietatile   
9. Creati o ruta in **routes/web.php** care atunci cand vine o cerere de tip "get" pe adresa "/products/test" activeaza metoda "test" din ProductController. Aceasta metoda trebuie sa genereze o colectie din 5 obiecte de tip **App\Product** si sa le transmita in vizualizarea **resources/views/products/test.blade.php** in variabila **products**.
10. Cu ajutorul constructiei "blade" @foreach, afisati produsele cu tot cu poze si preturi sub forma de lista ordonata HTML.

---
