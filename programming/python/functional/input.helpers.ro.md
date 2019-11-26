## Functii. Argumenti si valori returnate

* Deseori pentru a citi o valoare introdusa de la tastatura in python se recurge la functie **input()** care afiseaza un mesaj pe  ecran si returneaza valoarea introdusa de la tastatura:
  ```python
  value = input("Enter some value: ")
  ```
  doar ca aceasta functie mereu returneaza tipul de date "sir de caractere" - string, ceea ce cere inevitabil sa se utilizeze o careva "conversie" de tip - pentru ca valoarea introdusa sa poata fi utilizata intr-un mod sau altul.


* Pentru a usura developmentul unei aplicatii, vi se cere sa elaborati 3 functii de baza, fiecare din care este capabila sa citeasca de la tastatura o valoare si sa o returneze deja "convertita" in tipul dorit. Acest functii se numesc:
  - ```inputInt( message )``` 
  - ```inputFloat( message )``` 
  - ```inputBoolean( message )``` 

* fiecare din aceste functii trebuie in interiorul corpului lor sa utilizeze "input()" - ul standart
* fiecare din aceste functii va returna tipul indicat in denumirea functiei
---
* Dupa elaborarea acestora, ar trebui sa putem rula asa gen de programe ca:
  ```python
  n = inputInt("Enter the first integer: ")
  m = inputInt("Enter the second integer: ")
  
  print( n + m )
  ```

