k, n = [int(i) for i in input().split(" ")]

if k == 2 and n != 0:
    print("YES")

elif n == 1:
    print("YES")

elif n == 2:
    print("NO")

elif n % 2 == 1:
    print("MAYBE")

elif (k == 10) and (n % 2 == 0):
    print("NO")

elif (n % 2 == 0) and (n >= 2*(k-1)):
    print("MAYBE")

else:
    print("NO")
