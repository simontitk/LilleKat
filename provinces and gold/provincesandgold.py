Au, Ag, Cu = [int(i) for i in input().split(" ")]

sum = 3*Au + 2*Ag + 1*Cu

def get_victory(n):
    if n >= 8:
        return "Province or "
    if n >=5:
        return "Duchy or "
    if n >= 2:
        return "Estate or "
    else:
        return ""

def get_treasure(n):
    if n >= 6:
        return "Gold"
    if n >=3:
        return "Silver"
    return "Copper"

print(get_victory(sum) + get_treasure(sum))


