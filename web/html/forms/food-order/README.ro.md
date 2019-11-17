## Elemente din formulare si tabele. Principii de creare a formularelor si de machetare

> a se vedea (HTML):
[elementele "table"](http://htmlbook.ru/html/table),
[elementele "tr"](http://htmlbook.ru/html/tr),
[elementele "td"](http://htmlbook.ru/html/td),
[elementele "form"](http://htmlbook.ru/html/form),
[elementele "input"](http://htmlbook.ru/html/input),
[elementele "select"](http://htmlbook.ru/html/select),
[elementele "button"](http://htmlbook.ru/html/button),


---

Cu ajutorul formularelor utilizatorul poate interactiona cu campurile de introducere a datelor si introduce, eventual, date in sistem. Browserul poate expedia datele introduse in formular de catre utilizator spre server.

MENTIUNE: pentru a solutiona acest exemplu dati atentie atributelor: **align**,**valign**,**cellpading**,**bgcolor**,**src**,**href**,**target**,**placeholder**,...

## Intregul proiect reprezinta 3 pagini legate intre ele.
### 1. Pagina principala.
In baza scheletului [index](index.html) machetati un table cu formularul de comandare a unui menu asa incat rezultatul sa arate cat mai aproape de [result-index](result-index.png). Atentie la urmatoarele detalii:
    * pictograma in tab-ul ferestrei ( tag-ul ```<link/>``` in **head** )
    * in titlu principal sunt simboluri speciale Braille
    * in tabelul principal, formularul este introdus printr-un alt tabel
    * in campurile de introducere este un text sugestiv de culoare gri
    * unele campuri au dimeniuni mai mici (de ex - numarul telefonului - 9 caractere ) dar si limiteaza numarul de caractere introduse 
    * daca utilizatorul doreste sa faca cunostinta cu termenii si conditiile apasa pe "terms & conditions" si prin acest link nimereste pe pagina "terms.html" (acest link trebuie deschis in pagina noua!)
    * daca utilizatorul apasa butonul "ORDER NOW" formularul trebuie sa il redirectioneze pe "confirmation.html"
### 2. Pagina "terms"
In baza scheletului [terms](terms.html) machetati tabelul regulamentului asa ca in acest rezultat [result-terms](result-terms.png). Atentie la:
    * cu ajutorul **emmet** ati putea genera o lista cu text prin formula "ul>li*5>lorem5"
    * atentie la TIP-ul listei
    * atentie la linkurile de la inceputul paginii, aceste linkuri permit depanarea paginii pana la locul necesar. ca un link sa miste pagina pana la lista potrivita trebuie sa:
        1. dati un identificator liste prin &lt;ul id="section-1"&gt;
        2. linkul care se duce pe acel indentificator trebuie sa contina adresa &lt;a href="#section-1" &gt;


### 2. Pagina "confirmation"
In baza scheletului [confirmation](confirmation.html) machetati pagina asa ca sa arate ca in [result-confirmation](result-confirmation.png).

---

[referinta la intreaga mapa](./)