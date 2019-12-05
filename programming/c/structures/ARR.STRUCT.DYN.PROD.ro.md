## Lucrul cu structurile de date. Lucrul cu array-urile. Alocare dinamica si pointeri.


* Sa presupunem ca pana la functia **main()** ati declarat tipul de date structurat care tine minte despre un produs. 
  ```c
  struct product {
     char name[60];
     char category[30];
     float price;
  };
  ``` 
  vom declara un pointer catre tipul de date **struct product** pentru a putea aloca dinamic un set de structuri de acest tip.
  Sa presupunem ca trebuie sa se introduca de la tastatura un numar de produse care va fi indicat ulterior (nu stim exact din start cate vor fi):
  ```c
  int main() {
        struct product*  products;
        int size = 0;
        printf("How many products? ");
        scanf("%d", &size);


        products = malloc( sizeof(struct product) * size );

        for(int i = 0; i < size; i++){
            printf("Enter product %d name: , i + 1);
            scanf("%s", (*(products+i)).name);
            // ???
        }

        for(int i = 0; i < size; i++){
            // ???
        }

        // ???
    }
  ```
  dupa cum vedeti - de la tastatura se introduce mai intai numarul dorit de produse, dupa care se aloca memorie asa incat sa incapa numarul indicat de structuri, incepand cu adresa rezervata prin "malloc()".

  Mai jos in cod, dupa cum vedeti, avem un ciclu care pentru fiecare produs scaneaza doar numele acestuia.  


* Complectati codul marcat cu "// ???" astfel incat in primul ciclu - sa se scaneze categoria si pretul produsului.
* Complectati codul marcat cu "// ???" astfel incat cel de al doilea ciclu sa afiseze lista de produse cu toate detaliile.
* Eliberati memoria - la incheierea programului.