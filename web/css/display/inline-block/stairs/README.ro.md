## Regimul Display cu boxe in rand

> In acest regim elementele de tip "block" se aranjeaza in rand unul dupa altul.
> Deoarece elementele se comporta si ca block si ca text e util sa va invatati a utiliza proprietatile:
> text-align, font-size, vertical-align, line-height - corespunzatoare componentei text si margin,padding, width, height   - corespunzatoare blocului.


* Sa presupunem ca avem un heading de ordinul intai [index.html](./index.html) care este deja partial stilizat. Acesta contine doua elemente **small** si **span** care din start se aranjeaza in rand (inline) si un element de tip **div** - block, care in mod normal care pe urmatorul rand.

* Pentru ca div-ul sa treaca in acelasi rand, a fost nevoie sa i se indice regimul **inline-block**
* Atat timp cat celelalte doua elemente **span** si **small** raman in regimul **inline** nu prea vom avea variante de aranjare pe verticala, din cauza ca fiecare din acestea se va subordona liniei de text "propriu" (unde line-height este aproximativ cat inaltimea fontului). Din acest motiv le indicam si lor regimul de "boxe" in rand.


* Completati valorile marcate cu ``` ??? ``` in stiluri pentru a obtine rezultatul 
 
   ![result-1](./result-1.png)

* Schimbati valorile astfel incat treptele sa coboare de la stanga la dreapta   