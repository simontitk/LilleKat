compound_in, num = input().split(" ")
compound_out = input()

def get_stock(compound: str):
    stock = {}
    i = 0
    while i < len(compound):
        element = compound[i]
        increase = 1
        j = k = i + 1
        while j < len(compound) and compound[j].isdigit():
            j += 1
        if k != j:
            increase = int(compound[k:j])
        stock[element] = stock.get(element, 0) + increase
        i = j
    return stock

stock_out = get_stock(compound_out) 
stock_in = get_stock(compound_in)

try:
    print(min([stock_in[element] * int(num) // stock_out[element] for element in stock_out]))
except:
    print(0)