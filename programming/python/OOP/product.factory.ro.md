## Lucrul cu clase și obiecte în Python3

* În programarea orientată pe obiecte (OOP), o **fabrică** este numit un obiect (o functie) care poate crea alte obiecte


* Declarați clasa **Product** cu o structură goală
* Declarați separat funcția **newProduct (name, price, quantity)** care va primi 3 caracteristici separate ale produsului și va crea un obiect de tip **Product** in baza caracteristicilor primite și îl va returna (apropo, această funcție în cod joacă rolul unei „fabrici”)
* Declarați o funcție **printProduct (product)** care va primi un obiect de produs și va afișa datele prin string formatat (f"{}")
* Declarați o funcție **compareProducts (product1, product2)** care va primi 2 obiecte de produs și le va compara prețurile, după care va afișa numele celui mai ieftin
* Asigurati-va ca toata logica ce tine de produs se va afla in modulul "product.py" si ca clasa "Product" nu va fi vizibila direct logicii care consuma modulul "product.py"
* OPȚIONAL - refaceti funcția **newProduct (dictProduct)** astfel încât în loc de 3 argumente separate aceasta să primească date despre produs sub formă de **dict** (adica argumentul functiei sa reprezinte un dictionar cu proprietatile acestuia)
