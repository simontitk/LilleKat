import math


def walk_instructions(instr):

    x = float(instr[0])
    y = float(instr[1])
    deg = float(instr[3])

    actions = [instr[i] for i in range(4, len(instr)-1, 2)]
    values = [float(instr[i]) for i in range(5, len(instr), 2)]

    for i in range(len(actions)):
        if actions[i] == "turn":
            deg += values[i]
        if actions[i] == "walk":
            x += (math.cos(math.radians(deg)) * values[i])
            y += (math.sin(math.radians(deg)) * values[i])

    return x, y

while True:
    n = int(input())
    if n == 0:
        break

    x_list = []
    y_list = []

    for i in range(n):
        x, y = walk_instructions(input().split(" "))
        x_list.append(x)
        y_list.append(y)

    x_avg = sum(x_list) / n
    y_avg = sum(y_list) / n
    distances = [math.hypot((x_list[i] - x_avg), (y_list[i] - y_avg)) for i in range(n)]

    print(x_avg, y_avg, max(distances))

