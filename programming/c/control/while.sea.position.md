## Constructiile "while" si "if/else". Actiuni repetitive

> Constructiile repetitive sunt deseori asociate cu algoritmi iterativi cel mai des de "pasire" inainte/inapoi

---

* Urmatorul fragment de cod afiseaza un soi de "harta" unidimensionala, a unui fluviu lungimea caruia este 20 de unitati. Variabila "position" indica amplasarea unei barci mici pe acest fluviu. Daca in conditiile indicate: 

  ```c
  int position = 10;
  int n = 1;
  while( n<=20 ){
    if( n == position ){
      printf("w");
    } else{
      printf("~");
    }
    n++;
  }
  ```  
  programul va afisa urmatoarea "harta"

  ```~~~~~~~~~w~~~~~~~~~~```


* Se cere sa se:
  1. Modifice programul astfel incat amplasarea barcii pe rau sa poata fi indicata de la tastatura si rezultatul sa fie vizibil DOAR daca pozitia indicata se cuprinde intre 1 si dimensiunea hartii, in caz contrar sa se afiseze "Wrong data!"
  2. Modifice programul astfel incat acesta sa fie capabil sa arate amplasarea unui tanker (cu lungimea de 5 unitati) pe fluviu, centrul caruia se va afla in pozitia indicata. Ca sa fie clar, de exemplu indicant pozitia 4 - rezultatul amplasarii pe harta a tankerului va fi

  ```~wwWww~~~~~~~~~~~~~~```

  ATENTIE!!! tankerul nu poate sa iasa in afara fluviului nici macar cu o unitate!