## Supraincarcarea operatorilor

> Supraincarcarea operatorilor permite sa definiti operatii noi in C++ pentru obiectele claselor pe care le creati (cum ar fi, +,-,>,<,...)

* Sa presupunem ca exista clasa **Student** cu urmatoarele caracteristici
  * firstName - prenume
  * lastName - nume
  * mark - nota
* Adaugati constructor cu parametri si o metoda de printare a datelor studentului
* supraincarcati urmatorii operatori pentru clasa Student:
  * student++ - mareste nota cu 1 bal
  * student-- - micsoreaza nota cu 1 bal
  * student1 > student2 - true daca primul invata mai bine ca celalalt
  * student1 < student2 - true daca primul invata mai rau ca celalalt
   