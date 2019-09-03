
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



### 2. Utilizarea parametrilor URL si operarea cu filtrele
* Toate rutele care urmeaza trebui sa afiseze doar denumire produsului si pretul acestuia cu unitatea de masura (curenta) in baza relatiei Product->price


1. Creati o ruta publica "/catalog" care afiseaza paginat a cate 12 produsele si preturilor sortate conform datei de adaugare (cele mai proaspete la suprafata). Aceasta ruta trebui sa actioneze prin controlerul "CatalogController" aflat in spatiul public prin metoda "index()". Vizualizarea publica "products/catalog" va fi utilizata pentru afisarea rezultatelor. Rezultatele trebuiesc amplasate in pagina cu ajutorul Bootstrap 4 grid cate 3 coloane per rand. 
2. Creati o ruta publica parametrizata "/catalog/price/{sort}" care primeste in parametrul "sort" una din doua variante "cheap", "expensive" si este realizata de acelasi controler prin aceiasi vizualizare prin metoda "indexPriceSort()". Aceasta metoda tre sa continue sa pagineze rezultatele a cate 12. Metoda tre sa sorteze produsele dupa pret.
3. Creati o ruta publica parametrizata "/catalog/date/{sort}" care primeste in parametrul "sort" una din doua variante "fresh", "old" si este realizata de acelasi controler prin aceiasi vizualizare prin metoda "indexDateSort()". Aceasta metoda tre sa continue sa pagineze rezultatele a cate 12. Metoda tre sa sorteze produsele dupa data adaugarii.

NOTA: Atentie cand utilizati sortari asupra valorilor accesibile prin relatii in laravel/Eloquent!



### 3. Relatii polimorfe, controllere, parametrii URL
* Pentru a lucra cu conditiile din acest capitol incercati sa faceti un singur cos in baza de date (el sa fie unicul) si faceti toate operatiunile de mai jos cu acest unic cos, presupunand ca asta este cosul clientului actual.

1. Creati modelul CartItem (el reprezinta un item care va fi adaugat in cos) acesta tre sa contina id, timestamps si sa utilizeze optiunea "soft deletes". El tre sa mai contina un camp de tip intreg mic "amount" - numarul de produse de acest tip puse in cos. El tre sa contina o relatie cu un pret - "itemPrice". Tot acesta tre sa contina campul product_id si relatia "product" care indica ce produs reprezinta acest item. Si in cele din urma el tre sa mai contina cart_id si relatia "cart" care arata in ce cos a fost plasat acest CartItem.
    * Pentru clarificare ilustrez schematic cum ar trebui sa arate structura in urma adaugarii acestui model.
        1. Cart ------- totalPrice() ----> Price 
        2. Cart ------- items()      ----> CartItem <br/>
           Cart <------ cart()       <---- CartItem ------ product()   -----> Product<br/>
                                           CartItem <----- cartItems() <----- Product<br/>
                                           CartItem ------ itemPrice() -----> Price<br/>

        
2. Creati o ruta numita /cart/add/{product_id} aceasta tre sa fie public accesibila si sa actioneze CartController@add. Deocamdata aceasta metoda tre sa adauge produsul ales dupa id, creand un nou CartItem() cu cantitatea 1 si legat de produsul ales, apoi plasat in cosul curent! Nu uitati sa scrieti logica de calcul astfel incat de fiece data se adauga un item cu un produs in cantitate de x1 in cos - costul total al cosului trebuie updatat!
3. in AppServiceProvider - sa se redacteze logica astfel incat acesta sa ofere nu doar informatia despre costul total al cosului - dar si numarul de "CartItems" (itemuri) puse in cos.  


### 4. Relatii polimorfe, controller, parametrii URL. Generarea raspunsului cu "redirect". Utilizarea Bootstrap 4 in FE.
  

1. Cu ajutorul bootstrap 4 [dropdown](https://getbootstrap.com/docs/4.3/components/dropdowns/). Faceti in asa mod incat atunci cand se afiseaza cosul in macheta voastra el sa arate cam asa [rezultat](./result-shop-cart.png). Cine doreste poate sa execute aceasta cu REACT/Material-ui
2. Linkul "View Cart" sa plece pe adresa "/cart/view" care reactioneaza prin controlerul "CartController@view" acesta sa afiseze mai detaliat toate produsele (cartItems) din cos in tabel (Bootstrap 4 or.. altele) cu urmatoarele coloane pe ecran:
   * nr de ordine (1,2,3...)
   * Titlu Produs
   * Cantitate (la moment 1 peste tot) 
   * Pret Item
   * Actiuni (ultima coloana din tabel tre sa contina un link cu textul "Remove" care este indreptata pe adresa /cart/remove/{cart_item_id}, acesta va actiona CartController@remove, care obtine id-ul cartitemului, il sterge din cosul actual, apoi face redirect la pagina /cart/view ca sa vedem rezultatul) Pentru redirectionare in Laravel - cititi [aici](https://laravel.com/docs/5.8/responses#redirects) 
   
 

### 5. Relatii intre modele. Modele inteligente.

* In cazul proiectului realizat de voi, atunci cand se initiaza un nou cos pentru un client prin Cart::create(), ar fi bine simultan sa se initieze si un pret cu valoarea "0" legat prin totalPrice(), care eventual va fi legat de o valuta. De altfel cosul initiat de sinestatator nu are sens! Pentru a realiza aceasta logica urmati urmatorii pasi:

1. Dati o privire aici pentru a intelege ce inseamna [evenimentele](https://laravel.com/docs/5.8/eloquent#events) modelului. De altfel numit "lifecycle events". Pe scurt, Eloquent va permite sa atasati functii cu logica proprie care vor reactiona la diverse "evenimente" care se intampla in viata unui model, atat in memorie cat si in baza de date.

2. Creati un "observator" [executand](https://laravel.com/docs/5.8/eloquent#observers) care va va permite sa definiti anumite reactii la anumite evenimente. Observatorul sa se numeasca "CartObserver". Metoda care va intereseaza la moment este "created(Cart $cart)". Aceasta metoda va fi apelat doar DUPA ce cosul a fost salvat in baza de date. 

3. In interiorul metodei observatorului care reactioneaza la crearea unui nou cos, Creati un nou pret Price::create([...]) si atasati-l de o valuta (Currency) si de cosul creat numai ce prin relatia totalPrice(). Astfel incat deja de fiece data veti crea un cos nou prin Cart::create() - modelul automat sa isi ataseze un pretz egal cu 0.

4. Verificati logica scrisa pana acum printr-un test-controller.


### 6. Utilizarea Middleware route si Controllere. Sesiunea

* Ideea acestui punct este de a reactiona la adaugarea in cos a clientului in felul urmator: atat timp cat clientul nu doreste sa cumpere nimic, nu ii este acordat nici un cos, pentru a economisi resursele serverului. In momentul in care clientul face cumparatura, se verifica daca in sesiune exista un cos alocat acestuia, daca nu - se creaza un cos nou si apoi se adauga primul produs in el.

1. Reveniti la ruta /cart/add/{product_id} si controller-ul respectiv. In metoda aceasta utilizati urmatorul algoritm:
   1. Verificati daca in sesiune exista "cart_id", daca nu exista atunci -> Cart::create();
   2. Adaugati in cos produsul ales dupa ID - product_id
   3. Redirectionati "back()" la pagina de pe care a avut loc acest request.
   * Pentru a nu va complica procesul, recomandarea este de a testa aceasta ruta deocamdata direct - punand in browser o cale de genul /cart/add/1 si afisand starea cosului cu ajutorul dd(), dump()
2. Verificati daca se afiseaza fara erori starea cosului in bara de navigare. Atentie! in CartMiddleware, refaceti logica in asa mod inca el sa partajeze cu vizualizarile cosul - daca el exista in sesiune, dar daca cosul nu exista in sesiune, partajati valoarea "null". Respectiv, in logica de afisare a cosului - daca valoarea este "null" afisati doar textul - "cart empty" in caz contrar - numarul de itemi, si costul total.
3. Atunci cand se afiseaza cosul cu itemi in el, linkul "vezi cosul" -> /cart/view tre sa treaca clientul pe o pagina unde se afiseaza cosul in detalii, cosul afisat va fi preluat din sesiune "cart_id"

