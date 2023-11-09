def get_fav(n):
    max_count = -1
    fav = ""
    for i in range(n):
        word = input()
        word_count = 0
        for j in range(len(word)-1):
            if word[j:j+2] in chars:
                word_count += 1
        if word_count > max_count:
            max_count = word_count
            fav = word
    print(fav)

chars = {"aa","ee","ii","oo","uu","yy"}

while True:
    n = int(input())
    if n == 0:
        break
    get_fav(n)