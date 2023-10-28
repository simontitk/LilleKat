import sys
sys.setrecursionlimit(21000)

class Knight:
    def __init__(self, index, health, strength):
        self.index = int(index)
        self.health = int(health)
        self.strength = int(strength)
    

knights = [Knight(i, *input().split(" "))  for i in range(int(input()))]


def fight(i, j):

    if j == len(knights):
        return i

    k1 = knights[i]
    k2 = knights[j]

    winner_index = strike(k1, k2)
    
    return fight(winner_index, j+1)


def strike(k1, k2):

    k2.health -= k1.strength
    if k2.health <= 0:
        return (k1.index)
    else:
        return strike(k2, k1)

if len(knights) == 1:
    print(1)
else: 
    print(fight(0, 1)+1)