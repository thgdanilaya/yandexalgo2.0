s = input().split()
f = set()
for i in s:
    if i not in f:
        print("NO")
    else:
        print("YES")
    f.add(i)
