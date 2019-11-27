## Module. Programarea modulara

> Foarte multe aplicatii moderne sunt construite in baza diferitor module. Modulele permita aplicarea principiului "decuplarii" logicii.


* Sa presupunem ca trebuie sa realizati o aplicatie care va afisa temperatura medie pentru aceasta zi, preluand-o din diferite surse (de la diferiti provideri meteo). In acest exemplu vom simula receptionarea datelor de la doi prestatori de date: unul privat (sa presupunem ca acesta este cumva un partener prin contract) si altul public (de obicei asa gen de prestatori ofera datele deschis fara contracte speciale). Programul va prelua pentru una si aceiasi localitate - sa zicem "Chisinau" valoarea temperaturii din doua surse, va calcula media si va afisa cu scopul ca sa dea o valoare mai sigura.

* organizati structura proiectului in felul urmator:
   /meteo-app/    (folderul principal) 
       - app.py   (fisierul principal)
       - public_meteo_provider.py      (primul provider de date meteo)
       - private_meteo_provider.py     (al doilea provider de date meteo)


* in fiecare din cele doua module (private si public) adaugati una si aceiasi functie numita
    ```
    **getCurrentTemperature( location )**
    ```
    aceasta primeste in calitate de argument - location (string), in variabila **location** vor fi inserate oricare din urmatoarele 3 optiuni:
        - "Chisinau"
        - "Balti"
        - "Orhei"
    si in dependenta de localitatea aleasa - functia trebuie sa returneze o careva temperatura (una falsa - pentru a testa logica programului). Fiecare prestator trebuie sa returneze pentru aceiasi localitate o temperatura putin diferita (cu o diferenta de 1-2 grade maxim!).   
* Se cere, sa importati ambele module in **app.py** si sa calculati media temperaturii oferite pentru aceiasi locatie de ambii provideri, aceasta medie sa fie afisata pe ecran.  
* Sa se utilizeze functia **round()** pentru ca atunci cand este afisata temperatura medie, precizia sa fie doar O CIFRA dupa virgula
* Sa se afiseze rezultatul in urmatorul format
  ```
  The temperature for "Chisinau" is 11.2C
  ```    
* BONUS!!! - utilizand modulul standard "random" in fiecare din provider sa se genereze temperatura in mod aliator intr-un diapazon de la -50..+50 de grade pentru a face lucrurile mai realistice :)  

 
