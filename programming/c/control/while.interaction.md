## Constructiile "while" si "if/else". Actiuni repetitive

> Ciclul **while** ca si multe altele, pot fi utilizate uneori pentru a crea un algoritm de interactiune cu utilizatorul, aproape toate aplicatiile moderne pun accent pe interactiunea cu utilizatorul (jocuri, aplicatii cu interfete grafice, aplicatii de oficiu, etc). 
> Am putea intr-un model simplificat sa zicem ca interactiunea cu utilizatorul este un "dialog" din **intrebari** si **raspunsuri** repetate

---

* Dati o privire la programul de mai jos:

  ```c

  int pin_secret = 1234;
  int pin;

  while( pin != pin_secret ){
      printf("PIN: ?");
      scanf("%d",&pin);
  }  

  ```  
  Prima variabila este pin-ul secret cunoscut de sistem, cea de a doua - pinul care va fi citit de la tastatura, fiind introdus de utilizator. Algoritmul se va repeta, dupa cum vedeti, atat timp cat pin-ul introdus nu va coincide ( != ) cu pin-ul secret.

* Se cere sa:
  1.  Rulati aceasta aplicatie si sa verificati cum se comporta
  2.  Completati algoritmul cu inca o variabila si conditie, astfel incat acest algoritm sa nu permita introducerea pin-ului mai mult de 3 ori