## Lazy Streams

> In python exista biblioteci asemanatoare cu "JAVA Stream API", una din ele este: https://pypi.org/project/lazy-streams/ - "lazy streams". Acestea reprezinta o maniera alternativa de a scrie un flux de procesare a datelor. Este o maniera care simplifica codingul si il face mai "linear". De asemeni, in acest mod - se aplica iarasi principiul "IoC" - Inversion of Control: unde codul scris de noi sub forma de lambda/functii este oferit, iar fluxul decide cand sa fie apelat.

---

* Se cere sa:
  1. dati o privire peste cateva exemple de pe documentatia acestei biblioteci
  2. dati raspuns la inrebarea: - care este diferenta dintre operatii terminale si non-terminale (tranziente) in flux, se recomanda sa va faceti o lista conspectata cu toate aceste operatii si esenta lor (nu sunt atat de multe)
  3. declarati o clasa "Product" care contine: name, category, price
  4. cu ajutorul bibliotecii Faker - generati o lista din 30-50 obiecte de tip "Product" cu diapazon de preturi intre 10 si 1000 de unitati intregi
  5. cu ajutorul "lazy-streams", scrieti un cod in asa mod incat din lista de produse generate sa fie alese doar top cele mai scumpe 5 produse si afisate in ordinea descresterii pretului pe ecran 
  
