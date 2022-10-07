def Del_Word(s):
    return False if 'абв' in s else True

print('Введите текст ')
a = input()

a = a.split()
print(a)
a = list(filter(Del_Word,a))
print(a)