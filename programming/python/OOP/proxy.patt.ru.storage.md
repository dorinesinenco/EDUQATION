## работа с шаблонами проектирования / Proxy

* представим себе такой модуль "storage.py"

  ```py
  
  class StorageProxy:
    def __init__(self,realStorage):
      self.realStorage = realStorage
    
    def __getattr__(self,name):
      if name == "load":
        return self.realStorage.load
      if name == "save":
        return self.realStorage.save 
    
  ```
  объект данного класса примет в себе дочерний объект (realStorage) который будет реальным хранилищем
  прокси оборачивает таким образом реальный механизм хранения, скрывая низкого уровня логику сохранения и чтения данных 
  
 * представим себе модуль хранилища типа "in memory" (memorystorage.py)
   ```py
   class MemoryStorage:
    def __init__(self):
      self.data = None
      
     
    def save(self,data):
      self.data = data
    
    def load(self):
      return self.data      
   ```

 * представим себе модуль хранилища типа "in file" (filestorage.py)
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
   ```
  
