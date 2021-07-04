## Obiecte si referinte intre acestea

> part 2

* continuam sa dezvoltam sistemul de fisiere virtual, imbunatatind clasa **Directory**

* in loc sa adaugam direct fisierele in lista
  ```py
  someDirectory.files.append(File("some-file.ext"))
  ```
  
  adaugam clasei **Directory** o metoda numita **pasteFile()** care va plasa fisierul in lista fisierelor din directioriu dat
  ```py
  class Directory:
    ...
    def pasteFile(self,file):
      self.files.append(file)
    ...
  ```
  
  e tot acelasi rezultat, doar ca printr-o metoda adaugatoare, adica - pentru ca sa adaugam un fisier in directoriu acum, vom apela
  ```py
  someDirectory.pasteFile(File("some-file.ext"))
  ```
  
SE CERE:
  1. sa se modifice codul pana in acest moment, sa se verifice (de ex. din prima parte, codul care adauga imagini in mapa sa se rescrie prin metoda noua)
  2. sa se adauge IN metoda **pasteFile()** o verificare astfel incat sa nu poata fi adaugat un fisier atunci cand exista deja un fisier cu acelasi nume in lista
  3. sa se adauge IN clasa **Directory** metoda **deleteFile(fileName)**, care va primi denumirea fisierului si il va elimina din lista
  
