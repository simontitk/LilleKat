n, d = [int(i) for i in input().split(" ")]
r = (sum([int(input()) for i in range(n)])<= d)
print("Jebb") if r else print("Neibb")
    