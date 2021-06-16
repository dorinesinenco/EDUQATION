## lucrul cu modelele de proiectare / Proxy

* Să presupunem că trebuie să dezvoltăm un mecanism de stocare a datelor cu diferite opțiuni (de exemplu - în RAM, pe disc, ...) și să-l folosim astfel încât codul clientului (app.py) să nu observe nici măcar o diferența în utilizarea uneia sau altei soluții.

* să ne imaginăm un astfel de modul „storage.py”

    ```py
  
    class StorageProxy:
      def __init__(self,storageType = "memory"):
        if storageType == "memory":
          self.realStorage = MemoryStorage()
        elif storageType == "file":
          self.realStorage = FileStorage()


      def __getattr__(self,name):
        if name == "load":
          return self.realStorage.load
        if name == "save":
          return self.realStorage.save 

    ```
    obiectul aceastei clase va contine un obiect copil (realStorage) care va fi un mecanism real de stocare a datelor, iar
    proxy-ul înfășoară astfel motorul de stocare real, ascunzând logica de stocare și citire a datelor de nivel jos 
    
    obiectul care proxeaza transmite in lant două metode: încărcare, salvare - de la proxy catre mecanismul de stocare real
  
    Observati de asemenea, că atunci când obiectul-ul din clasa StorageProxy este inițializat, acesta nu folosește ambele mecanisme de stocare simultan, ci doar unul, în funcție de tipul selectat **storageType**
  
* să ne imaginăm un modul de stocare real de tip „în memorie” (memorystorage.py) - în RAM
   ```py
   class MemoryStorage:
    def __init__(self):
      self.data = None
     
    def save(self,data):
      self.data = data
    
    def load(self):
      return self.data      
   ```
* Imaginați-vă un modul de stocare „în fișier” (filestorage.py) ca fișier
     ```py
   class FileStorage:
    def __init__(self):
      self.name = "data.txt"
      
    def save(self,data):
      file = open(self.name, "w")
      file.write( data )
      file.close()
    
    def load(self):
      file = open(self.name, "r")
      data file.read()
      file.close()
      return data  

* Să continuăm logica în **app.py**      
  ```py
  storage = StorageProxy()   # in memory
  storage.save("Test Data")
  print(storage.load())
  
  storage = StorageProxy("file")   # in file
  storage.save("Test Data")
  print(storage.load())
  
  ```
  
ESTE NECESAR:
  * sa adăugați codul astfel încât să ruleze "app.py" cu verificarea primei variante și a celei de-a doua a depozitului fără erori
  * în **init** StorageProxy - adăugați **else** care va „arunca” o excepție cu mesajul „Wrong storage type” - atunci când încercați să utilizați un tip de stocare care nu există
  * adăugați și implementați al treilea mecanism de stocare "json" => **JSONStorage** (in fisier cu format json) cu funcționalitate echivalentă de încărcare / salvare și verificați funcționarea acestei stocări  
