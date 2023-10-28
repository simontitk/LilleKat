def SSD(b, n):
    result = 0
    while n != 0:
        result += (n % b) ** 2
        n = n // b
    return result

for i in range(int(input())):
   L =[ int(j) for j in input().split(" ")]
   print(L[0], SSD(L[1], L[2]))