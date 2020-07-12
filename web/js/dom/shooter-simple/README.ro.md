# Operarea cu Evenimentele in DOM


* Aveti la baza [aceasta mapa](./) cu fisierul HTML si JS, realizati urmatoarele:
  1. Downladati si rulati pagina HTML, veti vedea o tzinta de tir
  2. Prin intermediul JS, gasiti elementul div#target si atasati functia **shoot()** pentru evenimentul "click" in acest element. Va captura acesta si clicurile din elementele mostenitoare?
  3. Capturati obiectul evenimentului "click" si extrageti coordonatele mouse-ului in acel moment fata de parinte. Nu uitati ca aceste coordonate se masoare de la coltul din stanga-sus al div#target
  4. Declarati o variabila globala **score** egala cu zero - initial
  5. In momentul in care are loc click-ul, aflati distanta in pixeli de la centru elementului #target (centru se afla in 100px, 100px) pana la locul unde a avut loc click-ul. Pentru a calcula distanta, folositi formula geometrica a distantei in plan intre doua puncte (x1,y1 - x2,y2)
  6. Dupa ce ati calculat distanta de la "centru" tzintei, cu ajutorul unei constructii conditionale (if-else-if) stabiliti punctajul (score) acumulat pe baza:
     1. daca e la peste 100+ pixeli de centru - 0 puncte
     2. daca e intre 75 .. 100 - 5 puncte
     3. daca e intre 50 .. 75 - 10 puncte
     4. daca e intre 25 .. 50 - 20 puncte
     5. daca e intre 0  .. 25 - 40 puncte 
  7. Afisati scorul acumulat in pagina!