## работа с шаблонами проектирования / Proxy

* Предположим нам необходимо разработать механизм хранения данных с разными вариантами (напр - в оперативной памяти, на диске, ...), и сделать его использование таким чтобы клинетский код (app.py) даже не заметил разницу в использование того или иного решения.

* представим себе такой модуль "storage.py"

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
  объект данного класса примет в себе дочерний объект (realStorage) который будет реальным хранилищем
  прокси оборачивает таким образом реальный механизм хранения, скрывая низкого уровня логику сохранения и чтения данных 
  но передает по цепочке два метода через себя : load, save
  
  заметьте так же что при инициализации прокси, он не задействует оба механизма хранения, а только один, в зависимости от выбраного типа **storageType**
  
* представим себе модуль реального хранилища типа "in memory" (memorystorage.py) - в оперативной памяти
   ```py
   class MemoryStorage:
    def __init__(self):
      self.data = None
     
    def save(self,data):
      self.data = data
    
    def load(self):
      return self.data      
   ```

* представим себе модуль хранилища типа "in file" (filestorage.py) в виде файла
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

* Продолжим логику в **app.py**
  ```py
  storage = StorageProxy()   # in memory
  storage.save("Test Data")
  print(storage.load())
  
  storage = StorageProxy("file")   # in file
  storage.save("Test Data")
  print(storage.load())
  
  ```

ТРЕБУЕТСЯ:
  * дополнить код так чтобы app.py запустился и проверка первого варианта и второго хранилища - прошла без ошибок
  * в **init** StorageProxy - добавить **else** который "выпустит" exception с сообщением "Wrong storage type" - когда пытаются использовать не существующий тип хранилища
  * добавить и реализовать третий тип хранилища "json" => **JSONStorage** с load/save эквивалентным функционалом и проверить работу этого хранилища 
  
