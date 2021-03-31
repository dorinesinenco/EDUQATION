## GIT. Operarea cu aceiasi resursa in echipa / bransarea 

* Acest exercitiu presupune interactiunea in echipa cu aceiasi resursa (bransa - branch).


* Ideea esentiala este urmatoare, imaginati-va ca aveti toti acelasi punct de pornire, de la care fiecare vrea sa faca o varianta separata (un experiment), respectiv fiecare isi va face o bransa experimentala unde va face modificari astfel incat intr-un final "masterul" proiectului sa faca "merge" in bransa principala adunand toate schimbarile care au fost facut pana acum

PASII CE TREBUIE EXECUTATI:
  1. Un reprezentant al echipei sa creeze o bransa numita "git-training--split-merge" local si sa o propage pe repozitoriul in care lucreaza echipa (ATENTIE!! acest lucru va fi facut o singura data)
  2. Tot el sa plaseze fisierul "author-name---bait" in acea bransa  unde author-name este numele utilizatorului ce a plasat fisierul
  3. In fisier, autorul o sa salveze o linie de text cu continutul "GOOD line of code", adica un cod scris corect
  4. Momentul in care in fisier va fi doar linia "GOOD line of code" va fi marcat in istoria bransei date cu TAG-ul "GOOD-CODE"
  5. Tot autorul va adauga in continuare in fisier "BAD line of code", adica un cod scris gresit
  6. Momentul in care in fisier a aparut linia cu cod cu eroare va fi marcat in istoria bransei date cu TAG-ul "BAD-CODE"
  7. Aceste doua schimbari vor fi aplicate local si apoi push-uite pe remote
  8. Raspundeti la intrebarea - in ce pozitie se afla HEAD pe remote dupa aceste schimbari?
  9. Fiecare din ceilalti membri ai echipei vor CLONA (downloada) bransa respectiva si vor face o bransa proprie numita "git-training--split-merge---author-name", ATENTIE!!! bransa trebuie facuta in baza "git-training--split-merge" in starea in care se afla marcata prin tag-ul "CODE OK"
  10. In bransa nou obtinuta (local) redenumiti fisierul "author-name---bait" asa incat sa corespunda cu numele vostru de utilizator
  11. Aplicati schimbarile si propagati bransa in remote  

* REZULTATUL final va fi o colectie de branse unde in fiecare bransa va fi doar cate un fisier cu numele autorului si DOAR cu linia de cod "GOOD", fara eroarea lasata in bransa initiala
