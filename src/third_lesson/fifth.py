m = int(input())
v = []

for i in range(m):
    v.append(set(input()))

n = int(input())
nums = []
mcnt = 0
for i in range(n):
    s = input()
    y = set(s)
    cnt = 0
    for j in v:
        if j <= y:
            cnt += 1
    nums.append((s, cnt))
    mcnt = max(mcnt, cnt)

for i in nums:
    if i[1] == mcnt:
        print(i[0])
