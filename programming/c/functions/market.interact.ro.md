## Functii. Aplicatii cu interactive.

> Atunci cand se proiecteaza aplicatii dupa principiul "user-centric", unul din cele mai importante aspecte in realizarea lor este proiectarea interfetei prin care utilizatorul interactioneaza cu aplicatia, aceasta trebuie sa fie logica, consecventa, organizata si intuitiv corecta

---

* Mai jos aveti un fragment de cod, acesta reprezinta un scheleton al aplicatiei care permite realizarea unui set minim de functii asociate cu "online shopping" (achizitii electronice). Meniul utilizatorului este alcatuit din 4 actiuni de baza (le vedeti in array-ul "actions"). Catalogul de produse este alcatuit din 2 array-uri a cate 3 pozitii. Priviti cu atentie functia **main()**, in interiorul acesteia exista un ciclu do-while care repeta permanent aceiasi 3 pasi (1 din ei este deactivat la moment). Pasii repetati sunt: afiseaza, citeste optiunea de la utilizator, actioneaza! Si apoi iar de la inceput. Se cere sa:
  1. Rulati aplicatia si sa vedeti cum aceasta interactioneaza la moment cu utilizatorul.
  2. Decomentati functia  **execute_action()** si locul unde aceasta este apelata. Dupa cum vedeti functia primeste un argument de tip intreg - numarul actiunii selectat de la tastatura de catre utilizator.
  3. Tineti cont de faptul ca in acest exemplu in cos se poate de memorizat "index"-ul (pozitia) doar a unui singur produs in variabila **product_in_cart_index** (-1 inseamna ca nu exista inca produse alese)
  4. Completati constructia **switch()** astfel incat:
     1. Daca este ales punctul "1", interactiunea de mai departe cu utilizatorul sa arate asa:
        1. Sa se ceara pozitia produsului ce trebuie plasat in cos
        2. Sa se ceara cantitatea acestuia
        3. Sa se inscrie valorile respective in **product_in_cart_index**, **product_in_cart_quantity**
     2. Daca este ales "2" sa se afiseze denumirea, pretul si cantitatea produsului plasat in cos, daca nu exista produse in cos sa se afiseze "Cart empty!"
     3. Daca este ales "3" sa se afiseze Suma totala spre achitare, reiesind din cantitatea produsului ales
     4. Daca este apasat "0" ciclul automat se va opri, deoarete conditia din "while()" nu permite continuarea acestuia cand valoarea 0 a fost aleasa. Se cere ca inainte de oprire sa se afiseze mesajul "Thank you for using our services!"


```c
#include <stdio.h>

int product_in_cart_index = -1;
int product_in_cart_quantity = 0;

char product_names[3][30]={
    "Product 1",   //0
    "Product 2",   //1
    "Product 3",   //2
};
float product_prices[3]= {
    30.00,    //0
    15.00,    //1
    20.00     //2
};
char menu[]="\n\n\
********** PC **************\n\
****************************\n\
";
char actions[]="\
1. Add to cart\n\
2. Show cart\n\
3. Pay\n\
0. Exit\n\
****************************\n\
enter option >>\
";
void print_menu(){
    printf("%s",menu);
    for(int i=0;i<3;i++){
        printf("%-20s %7.2f\n",product_names[i],product_prices[i]);
    }
    printf("%s",actions);
}
int read_action(){
    int action;
    scanf("%d",&action);
    if(action<0 || action>4){
        printf("\nWRONG ACTION! TRY AGAIN!\n");
        return -1;
    } else {
        return action;
    }
}

// void execute_action(int action){
//     switch(action){
//     }
// }

int main(void) {
    int action = -1;
    do{
        print_menu();
        action = read_action();
        // execute_action(action);
    }while(action!=0);
}

```