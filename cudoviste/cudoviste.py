spaces = [0, 0, 0, 0, 0]
h, w = [int(x)-1 for x in input().split(" ")]
L1 = input()
for i in range(h):
    L2 = input()
    for j in range(w):
        spots = L1[j:j+2] + L2[j:j+2]
        if "#" in spots:
            continue
        spaces[spots.count("X")] += 1
    L1 = L2
for space in spaces:
    print(space)

