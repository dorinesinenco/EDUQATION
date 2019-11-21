## Functii. Argumenti si valori returnate

> Functiile pot primi valori din exterior si returna valori in locul unde au fost apelate. O functie isi creeaza propriul "spatiu" de vizibilitate local, in afara caruia variabilile nu pot fi accesate!

* Sa se declare doua functii care corespunde urmatorelor prototipuri (formule)
  ```c
  float euro_to_usd( float amount );
  float usd_to_euro( float amount );
  ```

* Algoritmul fiecareia din aceste functii trebuie sa arate cam asa:
  * sa declare o valoare (variabila) locala care contine coneficientul de schimb valutar dintre cele doua valute
  * sa declare o variabila in care prin formula de conversie se va inregistra rezultatul in baza "amount"-ului primit
  * sa se returneze valoarea inapoi, utilizand instructiunea **return**

* Pentru convenienta vom presupune ca intre cele doua valute (EURO si USD) coeficientul este 1.2

* Dupa ce ati creat functiile, daca le vom apela utilizand codul care urmeaza:  

  ```c
  int main(){
      printf("%f\n", euro_to_usd(1000) );
      printf("%f\n", usd_to_euro(1200) );
  }
  ```
  rezultatul ar trebuie sa fie
  ```
  1200.00
  1000.00
  ```
 
