for i in range(int(input())):
    sounds = [w for w in input().split(" ")]
    known_sounds = set()
    while True:
        try:
            known_sounds.add(input().split(" goes ")[1])
        except:
            print(" ".join([w for w in sounds if w not in known_sounds]))
