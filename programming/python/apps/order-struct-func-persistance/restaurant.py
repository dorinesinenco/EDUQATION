from os import system
# title - optional
def printItems( items, title = None ):
    system("clear")
    if title != None:
        print("#"*30)
        print(title)
    print("#"*30)
    for i in range(len(items)):
        print( 
        f"{i+1:2} {items[i]['name']:15} {items[i]['price']['amount']:7.2f}{items[i]['price']['currency']}"
    )
    print("#"*30)
    input("Hit ENTER to continue ... ")


def printActionsMenu(items, title=None):
    system("clear")
    if title != None:
        print("#"*20)
        print(title)
    print("#"*20)
    for i in range(len(items)):
        print(
            f"{i+1:2} {items[i]:15}"
        )
    print("#"*20)
    
    option = int(input(">>> "))
    return option


def createOrderItem(food, item_i, item_q):
    return {
        "name": food[item_i]['name'],
        "quantity": item_q,
        "price": {
            "amount": item_q * food[item_i]['price']['amount'],
            "currency": "MDL"
        }
    }
