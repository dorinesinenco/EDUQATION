## Modele de programare / proiectare OOP

> În programarea OOP - un furnizor (provider) este numit de obicei o componentă care oferă / furnizează un fel de bunuri (date / servicii)


* Să presupunem că avem următoarea clasă (în fișierul NumberProvider.py)

  ```py
    from random import randint
    from time import sleep

    class NumberProvider: 
        def __init__(self,min=-100,max=100): 
            # 1. validation
            self.min = min
            self.max = max

        def generate(self):
            return randint(self.min,self.max)


        def whenPositive(self, positiveCB):
            self.positiveCB = positiveCB


        def whenNegative(self):
            # 2. ???
            pass

        def start (self):
            while True:
                number = self.generate()
                if number >= 0:
                    self.positiveCB(number)
                # 2. ???    
                sleep(1)
               
  ```  
  Daca observati constructorul clasei (```__init__```), atunci cand se va crea un nou obiect din aceasta clasa, acesta va "tine minte" max si min in atributele obiectului curent (ale provider-ului), astfel incat acesta sa poate apoi genera valori numerice random in diapazonul indicat (min, max)

* Trebuie sa:
  1. Salvați acest cod în fișierul „NumberProvider.py”.
  2. Creați un alt fișier ("app.py" - fișierul principal al aplicației) care va conține codul.
     ```py
        from NumberProvider import NumberProvider
        provider = NumberProvider()
        provider.start()
     ```
     imediat ce veti rula aplicatia, aceasta va crea un obiect de tip furnizor și îl va rula imediat, întrebare: -de ce este „NumberProvider” menționat de două ori în **import**?
    observati de asemeni faptul ca functia .start() va porni un timer care va repeta generarea unui numar pozitiv si va apela "callback"-ul corespunzator
     
  3. Rulați aplicația și explicați ce eroare „AttributeError: obiectul„ NumberProvider ”nu are atributul„ positiveCB ””?
  4. În app.py adăugați următoarea funcție
     "" py
        Acțiune pozitivă def (număr):
           print („Am primit un număr pozitiv >>>”, număr)
     ",
     aceasta va fi o funcție care va „reacționa” de fiecare dată când apare un număr pozitiv.
     
  5. După adăugarea acestor modificări, reporniți aplicația și verificați consola, eroarea va apărea în continuare.
  6. !!! Adăugați următoarea comandă la "app.py" ÎNAINTE "provider.start ()"
     "" py
     provider.whenPositive (positiveAction)
     ",
  7. Rezultatul ar trebui să se schimbe în ceva similar.
     ! [imagine] (https://user-images.githubusercontent.com/4667821/118925914-2c7b6400-b948-11eb-8117-30af35c5750a.png)

  8. Răspundeți la întrebarea - de ce a dispărut eroarea?
  9. (marcat 1 în cod) Adăugați cod la constructor astfel încât să verifice min / max dacă sunt numere întregi și, dacă nu, imprimați o eroare prin „print ()”: utilizați ** type () ** pentru aceasta
  10. (marcat 2 în cod) Introduceți codul, astfel încât furnizorul să poată accepta și o funcție care răspunde numerelor negative.
