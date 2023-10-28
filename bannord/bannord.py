forbidden = set(input())
text = input().split(" ")

newwords = []

for word in text:
    newwords.append(word)
    for letter in forbidden:
        if letter in word:
            newwords[-1] = "*"*len(word)
            break

newwords = " ".join(newwords)
print(newwords)
      




