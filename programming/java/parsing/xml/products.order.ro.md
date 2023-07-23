## Parsing XML in Java



> Imaginati-va ca aveti urmatorul XML (products.xml)

```xml
<products>
  <product>
    <id>1</id>
    <name>Pizza</name>
    <price>
        <amount>100</amount>
        <currency>MDL</currency>
    </price>
    <available>5</available>
  </product>
  <product>
    <id>2</id>
    <name>Soup</name>
    <price>
        <amount>45</amount>
        <currency>MDL</currency>
    </price>
    <available>3</available>
  </product>
  <product>
    <id>3</id>
    <name>Salad</name>
    <price>
        <amount>35</amount>
        <currency>MDL</currency>
    </price>
    <available>2</available>
  </product>
</products>
```


SE CERE SA:
1. Scrieti o aplicatie formata din urmatoarele clase: RestaurantApp, Product(id,name,price,quantity), Money(amount,currency), Order(items, client,total), Client(name,phone)
2. In cadrul aplicatiei, veti face o functie care incarca toate datele din products.xml intr-o colectie de obiecte de tip Product (parsand XML-ul)
3. Aplicatia apoi va prezenta un meniu interactiv utilizatorului - intrebad-ul ce mancaru-ri vrea sa comande, ATENTIE, in timp ce clientul efectueaza comanda, alegand mancaruri, verificati daca cantitatea dorita este disponibila!
4. In timpul interactiunii cu utilizatorul in memorie intr-un obiect de tip Order - se vor pastra toate produsele alese in cantitatea indicata, de fiece data updatandu-se costul total
5. Atunci cand clientul va incheia comanda - aplicatia ii va cere numele si telefonul de contact si le va stoca in obiectul de tip Client
6. Dupa ce a fost incheiata comanda, toata informatia despre comanda efectuata trebuie salvata in urmatorul format, in fisierul 'order.xml'

```xml
<order>
    <client>
        <name>...</name>
        <phone>...</phone>
    </client>
    <items>
        <item>
            <product_id>...</product_id>
            <quantity>5</quantity>
        </item>
        ...
    </items>
    <total>
        <amount>...</amount>
        <currency>...</currency>
    </total>
</order>
```

7. Dupa ce au fost salvate datele despre comanda, nu uitati sa updatati datele din products.xml - scazand cantitatile pe care le-a luat clientul din cele disponibile
