n = int(input())

ta, da = [int(i) for i in input().split(" ")]
tb, db = [int(i) for i in input().split(" ")]

total_a = (n * ta) + ((n * (n - 1)) / 2) * da
total_b = (n * tb) + ((n * (n - 1)) / 2) * db

if total_a < total_b:
    print("Alice")

elif total_a > total_b:
    print("Bob")

else:
    print("=")
