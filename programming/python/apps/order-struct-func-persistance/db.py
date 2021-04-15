import json

def load(fileName):
    file = open( f"./data/{fileName}.json",  "r" )
    data = json.loads(file.read())
    return data