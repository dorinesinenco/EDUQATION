## Module. Programarea modulara

> Foarte multe aplicatii moderne sunt construite in baza diferitor module. Modulele permita aplicarea principiului "decuplarii" logicii.


* Sa presupunem ca trebuie sa realizati o aplicatie care va afisa temperatura medie pentru aceasta zi, preluand-o din diferite surse (de la diferiti provideri meteo). In acest exemplu vom simula receptionarea datelor de la doi prestatori de date: unul privat (sa presupunem ca acesta este cumva un partener prin contract) si altul public (de obicei asa gen de prestatori ofera datele deschis fara contracte speciale).

* organizati structura proiectului in felul urmator:
   /meteo-app/    (folderul principal) 
       - app.py   (fisierul principal)
       - public_meteo_provider.py      (primul provider de date meteo)
       - private_meteo_provider.py     (al doilea provider de date meteo)


* in fiecare din cele doua module (private si public) adaugati o singura functie numita
    ```
    getCurrentTemperature( location )
    ```
    aceasta primeste in calitate de argument - location, in variabila **location** vor fi inserate oricare din urmatoarele 3 optiuni:
        - "Chisinau"
        - "Balti"
        - "Orhei"
    si in dependenta de localitatea aleasa - sa returneze o careva temperatura (una falsa - pentru a testa logica programului)   
* Se cere, sa importati ambele module in **app.py** si sa calculati media temperaturii oferite pentru aceiasi locatie de ambii provideri, aceasta medie sa fie afisata pe ecran.     

 
