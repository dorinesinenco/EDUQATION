## Pregatirea structurii bazei de date

inainte sa incepeti, recomand sa dati o privire peste acest material https://habr.com/ru/company/oleg-bunin/blog/348172/

!!! INCERCATI TOATE COMENZILE SA LE RULATI DIN SHELL


STRUCTURA

1. Creati tabelul **products** cu urmatoarea structura:
  * id - integer PK - cheie primara 
  * name - character varying (100) - cu limita in numar de caractere - 100 
  * created - datetime - campul care va tine minte cand produsul a fost adaugat
  * updated - datetime - campul care va tine minte cand produsul a fost modificat
  * category_id - integer NOT NULL - valoarile din acest camp vor face legatura cu id-urile din tabelul de categorii
  * price_id - integer NOT NULL - пvaloarile din acest camp vor face legatura cu id-urile din tabelul cu sume de bani si va servi drept pret
2. Creati tabelul **categories** cu urmatoarea structura:
  * id - integer PK - cheie primara
  * name - character varying (50) - cu limita in numar de caractere - 50 
  * ??? - merita oare sa adaugam campurile created, updated in acest tabel? argumentati
3. Creati tabelul **money** (aici tinem minte toate sumele de bani, indiferent de ce rol joaca fiecare suma) cu urmatoarea structura: 
  * id - integer PK - cheie primara
  * amount - integer - cantitatea (cati bani sunt)
  * currency_code - character varying (3) - cod valutar, ??? - sunt 3 simboluri indeajuns ca lungime pentru acest camp?

---

DATE

* Vom crea o categorie ce va contine 2 produse fiecare cu pretul sau

```sql
INSERT INTO categories VALUES(1,'Smartphones');

INSERT INTO money VALUES(1,1000,'USD');
INSERT INTO products VALUES(1,'iPhone XI',  '2021-01-01 00:00:01', null, 1,1);

INSERT INTO money VALUES(2,1500,'USD');
INSERT INTO products VALUES(2,'iPhone XII', '2021-01-01 00:00:01', null, 1,2);
```
1. EXECUTATI ACESTE INTEROGARI
2. OBSERVATI faptul ca INSERT este scris intr-o formula mai compacta, cum credeti cand este utilizata varianta compacta a operatiunii de inserare - ce trebuie de respectat?
3. DE CE datele au fost adaugate mai intai in **categories** si **money** si abia apoi in **products**
4. desenati de mana diagrama care ar lega, in viziunea voastra, datele adaugate pana acum intre ele


---

INTEROGAM DATE

```sql
SELECT categories.name, products.name, amount, currency_code 
FROM products 
JOIN categories ON products.category_id = categories.id
JOIN money ON products.price_id = money.id;
```

Am unit 3 tabele intr-o singura interogare, cum credeti - de ce in fata **name** a fost necesar sa mentionam denumirea tabelelor?












