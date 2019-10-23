## Transmiterea datelor din formular spre server.

* Utilizand AJAX si mai nou FETCH API putem prin JS curat sa transmitem / obtinem date spre server.

* In primul rand reorganizam structura codului:
  * Creati o mapa pentru proiect numita "voting-app/"
  * in aceasta creati pagina "index.html" care contine acel FE cu formularul pentru votare
  * tot in mapa plasati fisierul javascript pentru partea client si numiti-l "client.js" conectati-l la index.html - acolo aveti deja logica de data trecuta scrisa - care obtine datele din formular si face o mica verificare cu try/catch
  * Dati o privire [aici](https://googlechrome.github.io/samples/fetch-api/fetch-post.html) si [aici](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API/Using_Fetch) si completati codul vostru din partea frontend asa incat acesta sa expedieze votul ales din FORMULAR prin metoda POST pe adresa "http://localhost:3000/vote". Aceasta logica trebuie completata tot in "client.js"
  * Creati un fisier numit "server.js", acolo startati un simplu httpServer care sa astepte cereri pe adresa "localhost:3000", in callback-ul serverului, primind obiectul request - verificati daca adresa .url este "/vote" atunci afisati in consola votul primit din browser :). Atentie - daca datele sunt transmise asa cum este indicat in exemplele de mai sus prin fetch si metoda post - le veti putea pescui din "body" - corpul requestului!!!
  
