> De regula in CSS proprietatea "margin" este utilizata pentru a adauga spatiu intre elemente invecinate

> Luati aminte! Proprietatea "margin" se comporta diferit in directie verticala si orizontala pentru modelele de tip boxa

> Cand aplicati "margin" nu uitati sa luati in consideratie daca elementul este in flux!

--- 

Stiati oare ca:

* Utilizand "margin" cu valoarea "auto" putem centra un element boxa pe orizontala atunci cand latimea acestuia este setata!

* In modelul boxa (de ex div, h1, h2, section, etc) **margin** din partea de sus al primului element copil cat si **margin** de jos al ultimului element copil vor iesi in afara spatiului parintelui, iar spatiul **margin** dintre elemente (dintre doua blocuri consecutive) functioneaza in regim de suprapunere (castiga cel mai mare)!

---

* Vizualizati rezultatul final [result](./result.png). In acest exemplu este desenata o cladire, sahta unui lift si lift-ul in sine, in lift este "BOB". Toate elementele sunt de tip bloc. In baza scheletului [index](./index.html) sa se faca urmatoarele puncte (toate sa fie executate exclusiv utilizand **margin**):
    1. Centrati pe orizontala toate blocurile
    2. Deplasati liftul in jos pe ecran pana la etajul intai
    3. Raspundeti la intrebarea: - daca vom sterge blocul "start" ce se va schimba?
    4. Raspundeti la intrebarea: - ce rol joaca blocul "start"? 

BONUS!!! Avand solutia facuta, ce s-ar intampla daca blocului "start" i-am da **margin** in partea de jos egala cu aceiasi valoare ca si margin setat liftului? dar daca valoarea va fi mai mare?       
