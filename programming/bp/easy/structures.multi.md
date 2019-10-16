# Structuri multidimensionale
> sa presupunem ca avem o aplicatie care permite preluarea unei comenzi cu ajutorul functiilor si a unei structuri asociative

* Se cere sa se completeze codul de mai jos pentru a realiza momentele descrise in comentarii

```python
# avem o structura cu date care pastreaza informatia despre meniu (ca un fel de baza de date)
menu = [
    { "name": "Potato Free", "price": 50 },
    { "name": "Summer Salad","price": 30 },
    { "name": "Pizza",       "price": 80 },
    { "name": "Kebab",       "price": 40 }
]

def showMenu():
    for i in range(4):
        # completati codul aici astfel incat aceasta functie sa afiseze meniul cu datele din
        # structura de mai sus in felul urmator:
        # 1. Potato Free  - 50MDL
        # 2. Summer Salad - 30MDL
        # 3. ....
```

* Daca in continuare am apela "showMenu()" intr-un ciclu care ar permite sa alegem unele optiuni de mancaruri si sa calculam costul final, codul ar incepe de la:

```python
# aceasta variabila va acumula produsele comandate
order = [

] # deocamdata nu avem mancaruri comandate
# ciclu infinit prin while
while True:
    # arata meniu
    showMenu()
    # citeste optiunea aleasa de utilizator
    option = input( "Choose option> " ) # sa nu uitam ca meniul de mai sus prezinta fiecare mancare printr-un numar
    # vom considera ca optiunea "0" este - iesirea din aplicatie
    if option == "0":
        break

    # daca de exemplu utilizatorul a ales optiunea "1"
    if option == "1":
        print( f"You chose {menu[option-1]["name"]}" )    # de ce scriem option-1 aici?
        # aflam cate bucati / portii doreste utilizatorul
        portions = int(input( "How many do you want? " ))  # de ce utilizam int() ?
        # calculam totalul pentru aceasta bucata
        total = portions * menu[option-1]["price"]
        # adaugam in lista mancarea comandata cu cantitate si cost total
        order.append( { "name": menu[option-1]["name"], "portions": portions, "total": total  }  )

# cand se va incheia acest ciclu rulati urmatoarea functie - care va afisa lista de produse comandate
# si care ar trebui sa calculeze totalul final

def showOrder():
      for i in range(len(order)):      # len() - numarul de elemente intr-o multime
        # completati codul aici astfel incat aceasta functie sa afiseze lista comenzii cu datele din
        # structura de mai sus in felul urmator:
        # 1. Potato Free  3 x 50MDL = 150MDL
        # 2. Summer Salad 2 x 30MDL = 60MDL
        # total: 210MDL

```