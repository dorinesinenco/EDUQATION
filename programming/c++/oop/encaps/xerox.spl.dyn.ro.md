## Obiecte si clase



* Deseori "logica creationala" pentru o anumita clasa este "scoasa" si plasata in alta clasa

* Sa presupunem ca avem clasa unui document printat pe hartie (cerere, contract, ordin, ...):
 
  ```c++
    class PaperDocument {

    };

  ``` 
    * in care trebuie sa adaugati proprietatile:
        1. ttype (string) - tipul documentului ("contract", "order",...)
        2. title (string) - titlul documentului
        3. content (string) - continutul documentului
    * adaugati constructorul cu parametri si metoda **print()** care va afisa pe ecran documentul pentru verificare     

* Sa presupunem de asemenea ca avem clasa **Xerox** - care reprezinta o masina de copiat documente. Aceasta clasa NU are proprietati, dar are 2 metode:
    
  ```c++
    class Xerox {
        
        PaperDocument copy(PaperDocument original){
            // ???
        }
        PaperDocument[] copy(PaperDocument original, int quantity){
            // ???
        }

    };

  ``` 
  * in ambele metode din clasa creaza si returneaza copia exacta a obiectului documentului **original** diferenta este ca prima returneaza o singura copie, cealalta o lista de copii (array)
  * completati codul si in clasa **Xerox** astfel incat ruland in **main()**:
    1.  sa obtineti mai intai un obiect (document) de tip "contract" cu titlul "Contract de Angajare" si cu continutul "1. Regim de lucru 8 ore pe zi\n2. Salariul per ora 15$". 
    2.  Sa ii creati o copie careia sa ii modificati tipul in "copie contract".
    3.  Sa creati inca 3 copii in baza copiei contractului carora sa le schimbati tipul in "copie arhivata contract"
    4.  Sa se afiseze originalul si copiile pe ecran

    