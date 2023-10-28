
a = input()
c = 0

if (">" in a) and ("<" in a):
    l = 0
    c = 0
    i = len(a) - 1
    while i >= 0:
        print(a[i])
        if a[i] == "<":
            l += 1
        if a[i] == ">":
            c += l
        i -= 1
print(c)


