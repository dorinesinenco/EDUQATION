## Dezvoltam aplicatia de recunoastere a numelui in baza fetei


* Trebuie sa se:
  1. Separe logica pe functii:
   - adaugati un modul numit ```images.py```  cu functia ```saveImage( url, name )```, care ar primi url-ul de pe care trebuie descarcata imaginea si respectiv numele persoanei care o reprezinta, aceasta functie tre sa se ingrijoreze si de crearea folderului cu numele persoane
   - tot in acest modul adaugati constanta ```IMAGE_BASE_FOLDER``` care va contine calea folderului principal in care se vor salva toate imaginile prin functia de mai sus (de ex "images/")
   - ATENTIE!!! dupa cum observati functia de salvare a imaginilor nu primeste ca argument NUMARUL imaginii, logica acesteia trebuie modificata in asa maniera incat, functia data daca primeste sa zicem asa un apel ```saveImate("some/internet/url", "John")``` - sa verifice/creeze mapa "John" daca aceasta nu exista, iar daca exista sa verifice care a fost numarul ULTIMEI imagini salvate in aceasta mapa, si automat sa numeroteze imaginea curenta cu numarul +1. de exemplu, daca in mapa "John" deja exista "0000.jpg" si "0001.jpg", functia automat sa salveze imaginea curenta cu "0002.jpg" 
   - Adaugati modulul ```se.py``` (search engine - prescurtare) care va contine logica de cautare pe pagina oricarui motor
   - In acest modul, adaugati functia ```searchImagesForName( name, quantity, settings )``` - care va primi numele cautat, numarul de poze dorit a fi cautat si setarile care vor descrie procesul de cautare: ```settings``` tre sa reprezinte un dictionar cu urmatoarele chei: browser - in care va fi lansata cautarea, searh_url - calea catre pagina motorului de cautare, search_input_class - clasa din DOM prin care putem gasi inputul in care sa se introduca numele, result_img_class - clasa prin care putem filtra rezultatele, search_filter_image_btn_class - clasa prin care poate fi activat filtrul de imagini, search_delay - retinerea in secunde inainte de a incepe cautarea. Daca numarul de poze nu este indicat - sa fie default 100


  2. Rescrieti logica aplicatiei (app.py) astfel incat sa cautati cateva nume dintr-o lista (4-5 nume) facand asa incat sa zicem - pentru fiecare nume cautarea sa se faca din firefox, chrome in google si yandex
   
