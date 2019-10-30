## Constructiile "while" si "if/else". Actiuni repetitive

> Daca o actiune de curatare a ecranului / afisare pe ecran ar fi repetata de mai multe ori, am putea obtine un soi de "animatie" sau "grafica" pe ecran

* Atat timp cat aplicatia scrisa de voi (fie ca e in C, fie ca e in alt limbaj) ruleaza direct in CLI ( linia de comanda textuala, numita si terminal ), avand permisiunile necesare, poate executa practic orice comanda de sistem ( de la curatare ecran / consola, pana la copiere de fisiere )
* In "C" exista o functie numita **system** care poate rula comenzi de sistem in linia de comanda. In orice terminal textual modern exista o comanda care curata ecranul, pentru sisteme de operare Windows este "cls", pentru sisteme UNIX orientate este "clear"

---

* ca sa intelegeti mai bine, incercati sa rulati programul de mai jos (atentie!!! functia "system" face parte din "stdlib"), pentru Windows substituiti "clear" cu "cls"  



  ```c

  printf("Hello, this will be deleted!");
  system("clear");
  printf("Byeee!");

  ```  
  Daca totul a rulat corect, pe un ecran absolut curat veti vedea doar textul din cel de al doilea printf();

* Atentie, in anumite console aceasta comanda s-ar putea sa se comporte gresit sau cu anumite "defecte" de afisare

* Daca veti incerca exemplul de mai jos pe ecran:
  ```c
  int n = 0;
  while(1){
		system("clear");
		printf("\n%d",n);
		n++;
	}
  ``` 
  Veti vedea un contor care creste cu o viteza enorma pe ecran, intr-un singur rand, datorita faptului ca ecranul este "sters" - adica se elimina valoarea precedenta, apoi se afiseaza valoarea noua


* Urma
* Se cere sa se:
  1.