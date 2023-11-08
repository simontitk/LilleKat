from collections import defaultdict

n = int(input())

kat = defaultdict(int)
dom = defaultdict(int)

for i in range(n): 
    kat[input()] += 1

for i in range(n): 
    dom[input()] += 1

print(sum([min(kat[key], dom[key]) for key in kat if key in dom]))