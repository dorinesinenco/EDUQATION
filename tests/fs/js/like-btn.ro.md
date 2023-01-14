## Test pentru evaluarea cunostintelor front/back
 > thenologiiȘ html, css, js, nodejs, mongodb
 
 
Ideea testului este de a dezvolta o componenta de timp "button" care sa contorizeze numarul de clickuri pe el si sa le stocheze intr-o baza de date.

* CREATI un folder numit "fs-test", in el se va afla intregul cod

1. Creati o aplicatie nodejs intr-un sub-folder numit "api"
2. In acest subfolder, utilizand nodejs curat sau express.js creati o mica aplicatie care va rula un server http
3. Acest server va servi drept API pentru ca sa ofere date in format JSON oricarui client care trimite un request de tip GET pe adresa "/api", de aia adaugati codul necesar pentru ca ca aplicatia de backed sa afiseze un JSON cu urmatoarea structura 
      ```json
       {
          "clicks": 0
       }
      
      ```
      ori de cate ori vine un request pe adresa serverului "/api"
4. Instalati serverul mongodb si logati-va pe el prin mongosh, creati o baza de date numita "fs-test"      
5. Creati o colectie numita "clicks"
6. Inserati un document cu urmatoarea structura in acea colectie
    ```json
    {
      "type": "click",
      "datetime": "2023-01-01 01:01:01"
    }
    ```
    sa presupunem ca acest document va pastra informatia despre un click care a avut loc pe data indicata la ora indicata
7. Utilizand mongosh si documentatia mongodb, aflati numarul de documente din collectia "clicks", in mod normal - raspunsul ar rebui sa fie 1
8. Mai inserati 2 documente si completati informatia cu niste valori similare cu primul    
9. Instalati driverul nodejs pentru mongodb in aplicatia de backend
10. In baza exemplelor si documentatiei acestui driver, adaugati codul necesar, astfel incat aplicatie nodejs sa se conecteze cu baza de date si sa citeasca dincolectia "clicks" cantitatea de clickuri si sa o returneze in json-ul din punctul 3
11. Mai adaugati o cale (adresa) pe aplicatia de backend numita "/api/register_click" unde functia care raspunde de aceasta adresa, in momentul in care va veni un request de tip "get", va crea un document de formatul celui din punctul 6 si il va trimite in baza de date in colectia clicks
12. Create intr-un alt sub-folder o aplicatie react
13. In aplicatia react faceti o componenta numita ClickButton
14. Atunci can aceasta componenta se incarca (use effect) prin ajax/fetch trimiteti un request de tip GET pe adresa "/api" ca sa aflati cantitatea de clickuri care s-a acumulat in baza de date, raspunsul backendului va fi in formatul din punctul 3, aplicatia react va prelua acest numar de clickuri si il va afisa pe ClickButton
15. De fiece data user-ul apasa pe button, un callback va trimite prin ajax/fetch un request pe adresa "/api/register_click", inregistrand astfel un nou click in baza de date si tototata incrementand valoarea de clickuri de pe button


ATENTIE:
- Ca aplicatia finala sa functioneze, tre sa aveti pornite 3 parti: serverul bazei de date, aplicatia nodejs si aplicatia react
- Aplicatia react va comunica cu aplicatia nodejs prin http requests cu ajutorul fetch/ajax
- In react dati o privire peste useEffect si useState
