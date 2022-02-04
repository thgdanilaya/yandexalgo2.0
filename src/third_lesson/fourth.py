n = int(input())
t = set(i for i in range(1, n+1))
s = set()
while True:
    q = input()
    if q != "NO" and q != "YES" and q != "HELP":
        s = set(list(map(int, q.split())))
    elif q == "YES":
        t &= s
    elif q == "NO":
        t -= s
    else:
        break

print(" ".join(list(map(str, t))))

