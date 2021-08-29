## FINISAREA structurii DB



TABELE

* inainte de a incepe faceti cunostinta cu ceea ce inseamna AUTO INCREMENT / SERIAL in postgresql si notiunea de FOREIGH KEY


1. Creati tabelul **clients** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * full_name - character varying (50) - limita pentru numele clientului - 50 caractere
  * created - datetime - data cand a fost adaugat clientul in db
  * updated - datetime - data cand informatia despre client s-a schimbat

2. Creati tabelul **contacts** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * type - character varying (10) - tipul informatiei de contact, limita ca lungime (gen: 'phone', 'email', 'address') - 10 caractere
  * value - character varying (100) - informatia de contact limita ca lungime (gen: '+12356789', 'dummyemail@domain.example', 'Some str., 99') - 100 caractere
  * client_id - integer NOT NULL - campul, valorile caruia se vor lega de inregistrarile clientilor (cui ii apartin datele de contact)
  
3. Creati tabelul **orders** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * created - datetime - data cand a fost adaugata comanda in baza de date
  * updated - datetime - data cand informatia despre comanda a fost modificata
  * price_id - integer NOT NULL - campul valorile caruia se vor referi la sume de bani din tabelul money, va servi drept cost total al comenzii
  * client_id - integer NOT NULL - campul, valorile caruia se vor lega de inregistrarile clientilor (cui ii apartine comanda)
  

4. Creati tabelul **order_items** cu urmatoarea structura:
  * id - integer PK - cheie primara SERIAL
  * quantity integer NOT NULL - numarul de unitati (cantitatea) de produse intr-un item
  * order_id - integer NOT NULL - valorile acestui camp se vor referi la tabelul de comenzi (la ce comanda se refera item-ul curent)
  * product_id - integer NOT NULL - valorile acestuia se vor referi la tabelul cu produse (produsul care se contine in item-ul curent)


LEGATURILE (FOREIGN KEYS)

1. Creati cheie referentiala intre products.category_id --- > categories.id
2. Creati cheie referentiala intre products.price_id    --- > money.id
3. Creati cheie referentiala intre contacts.client_id   --- > clients.id 
4. Creati cheie referentiala intre orders.price_id      --- > money.id 
5. Creati cheie referentiala intre orders.client_id     --- > clients.id 
6. Creati cheie referentiala intre order_items.order_id    --- > orders.id 
7. Creati cheie referentiala intre prodorder_itemsucts.product_id    --- > products.id 



Schema
Desenati schematic cu propriile maine (creion, pix, foaie) structura si legaturile intre tabele asa cum vi le imaginati voi, aceasta va permite intelegerea mai buna a structurii de date, ca in imaginea de mai jos

![image](https://user-images.githubusercontent.com/4667821/129709999-651874f9-f6cf-49a9-ad21-04199af137ab.png)



