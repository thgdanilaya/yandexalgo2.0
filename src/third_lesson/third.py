s = input().split()
d = {}

for i in s:
    if i not in d:
        d[i] = 1
    else:
        d[i] += 1
for i in d:
    if d[i] == 1:
        print(i, sep=" ")
