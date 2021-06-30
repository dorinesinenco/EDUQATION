## Obiecte si referinte intre ele
* Sa presupunem ca ni se cere sa "inventam" un fel de sistem de fisiere (asa cum este cel pe care il utilizam pe Linux,Windows,Mac,...), doar ca mult mai simplu, bazat pe obiecte, clase si relatii dintre ele
* In acest sistem vom avea doua clase: Directory si File, prima clasa reprezinta un obiect care tine minte o mapa, iar cea de a doua un fisier
* sa creeam clasele
  ```py
  class Directory:
    def __init__(self,name):
      self.name = name
      self.files = []
  ```
  dupa cum se poate vedea, clasa unui folder, reprezinta un obiect care va avea nume si o lista de fisiere aflate in acel folder
  ```py
  class File:
    def __init__(self,name):
      self.name = name
  ```
  dupa cum se poate vedea, clasa care reprezinta obiectul unui fisier, are doar denumire
  
* adaugam metoda care reprezinta obiectul de tip File in string:
  ```py
  ...
  def __str__(self):
    return f"\tFile {self.name:15}\n"
  ...
  ```
* adaugam metoda care reprezinta obiectul de tip Directory in string:
  ```py
  ...
  def __str__(self):
    content = ""
    for file in self.files:
      content += str(file)
    return f"Dir {self.name:15}\n{content}"
  ...
  ```  
* Cream o mica structura de fisiere/directorii, sa presupunem ca aceasta structura reprezinta un set de poze
  ```py
  photos = Directory("Photos")
  photos.files.push(File("summer_o1.jpg"))
  photos.files.push(File("summer_o2.jpg"))
  photos.files.push(File("summer_o3.jpg"))
  
  ```
* afisam structura pe ecran
  ```py
  print(photos)
  ```
* SE CERE SA:
  1. asamblati codul si sa va convingeti ca ruleaza fara erori
  2. explicati intr-un comentariu - cum functioneaza ultima instructiune din cod si de ce afisand doar un obiect, le vedem pe toate
  
