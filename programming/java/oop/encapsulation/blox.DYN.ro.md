## Principiul capsulei. Setters și Getters

* Setters and Getters - metode specializate care „controlează” accesul la partea internă a capsulei (obiect/clasă)


* Iată clasa „cutiei” obișnuite (**Box**) - care poate conține în interiorul oricărui copil al **ThingInteface** (orice lucru)

```java
/**
 1 ...
*/
interface ThingInteface {
    public void setName(String name);
    public String getName();
}

class Box {
    /**
    2 ...
    */
    ThingInteface content;

    // 3 ...    
   
}
```

* ESTE NECESAR SA:
   1. Explicați în comentariul ```1 ... ``` ce vă spune interfața **ThingInteface**?
   2. Ca parte a celui de-al doilea comentariu, scrieți într-o propoziție ceea ce înțelegeți deja despre conținutul „ThingInteface” folosind „Expresive Coding” ca bază?
   3. Adăugați codul clasei **Box**, astfel încât să interzică accesul direct în interiorul obiectului de tip Box la orice alt obiect
   4. Setați ``` set/get ``` (modificator și accesor) pentru proprietatea **content** conform convențiilor de dezvoltare Java
   5. Declarați încă 2 clase **Book** și **Journal** - implementând interfața lucrurilor, adăugați proprietăți în fiecare clasă: ```Integer pages``` și ```String title``` (număr de pagini și titlu), în **Book** adăugați o altă proprietate ```String authorName``` - numele autorului și ```Integer publishingYear``` - anul emiterii. În **Jurnal** adăugați proprietatea ```String category``` - categoria revistei (de exemplu - sport, despre mașini, despre politică).
   6. Toate proprietățile menționate trebuie să fie protejate de intruziunea externă DIRECTĂ de setter și getter
   7. Suplimentează toate clasele cu constructori impliciti și parametrizați
   8. Suprascrierea metodei ```toString()``` pentru toate clasele
   9. Răspundeți la întrebarea: stiind că proprietatea ```title``` din clasa cărții (**Book**) este privată și sa zicem, avem 2 obiecte din această clasă ( Book: oneBook, anotherBook ) - poate `` `oneBook``` sa acceseze proprietatea ```anotherBook.title``` direct - ? Argumentati!
   10. Creați clasa **Application** cu **main(...)** și în ea:
       1. Creați 2 boxe (firstBox, secondBox)
       2. Creați și puneți într-o cutie - o carte și în alta - o revistă
       3. Afisati ambele casete către consolă
       4. * Se poate „pune” aceeași carte în ambele cutii?
       5. * Dacă modificați ```titlul``` unei cărți din prima casetă după punctul 10.4, se va schimba și titlul cărții din a doua casetă? Dacă da - de ce?
