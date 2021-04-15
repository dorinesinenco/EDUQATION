from db import *
from restaurant import *

food = load('food')
order = {
    "items": []
}
while True:
    action = printActionsMenu(
        [
            "Show food",
            "Order food",
            "Show order",
            "Exit",
        ],
        "MAIN MENU"
    )
    
    if action == 1:
        printItems( food, "TODAYS MENU" )
    
    if action == 2:
        item_i = int(input("Which item ? ")) - 1 # index
        item_q = int(
            input(f"How many «{food[item_i]['name']}» do you want ? ")
        )
        order["items"].append(
            createOrderItem(food, item_i, item_q)
        )

    if action == 3:
        printItems( order["items"], "YOUR ORDER")
        
    if action == 4:
        break
    


