## Lucrul cu structurile de date/JSON

* ! Creati un nou proiect (folder) si deschideti-l separat pentru ca toate caile de cautare a fisierelor sa functioneze corect
* Creati un fisier manual numit "data.json", utilizand redactorul de cod, si completati-l cu urmatorul cod:

  ```json
    {
      "type": "book",
      "title": "Basics of Programming in Python",
      "pages": 100
    }
  ```
  dupa cum se poate vedea acest text in formatul JSON structureaza un "obiect" (in Python echivaleaza cu **dict**) care contine date despre o carte
  
* Creati in aceiasi mapa (folder)   fisierul aplicatiei numit "app.py" cu urmatorul cod de start:
  
  ```python
  from json import loads, dumps
  file = open("data.json", "r") 
  book = loads( file.read() )
  
  print(book)
  print(type(book))
  ```
  
  dupa cum se poate vedea, acest cod va citi din fisier tot continutul **file.read()** si il va "decoda" (tehnic se numeste - parsing) utilizand standardul JSON - pentru a-l transpune in structura de tip **dict** - in Python

* Vom "muta" codul care citeste datele despre carte intr-o functie:
  ```python
  from json import loads, dumps
  
  def readBookData():
    file = open("data.json", "r") 
    book = loads( file.read() )
    return book
    
  book = readBookData()
  
  print(book)
  print(type(book))
  ```
  
* Vom crea un "modul" separat pentru a da la o parte functiile create de noi, pentru aceasta e nevoie sa se creeze un fisier numit "book.py"  si sa se mute codul functiei in el, dupa aceasta codul aplicatiei (app.py) va fi:
  ```python
  from book import *
  
  book = readBookData()
  
  print(book)
  print(type(book))
  ```
  
* SE CERE:
  1. Sa se adauge si functia **writeBookData( book )** - care primeste in calitate de argument un dictionar cu datele despre carte si le salveaza in acelasi fisier in format JSON


