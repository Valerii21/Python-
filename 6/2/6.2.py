stroka = input().split('O')
res = max(stroka, key=len)
print(len(res))