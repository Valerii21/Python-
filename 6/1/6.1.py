import math
# импорт reduce
from functools import reduce


list_number = list()
while True:
    number = input()
    # проверка на пустую строку
    if number == '':
        break
    list_number.append(int(number))
# использование reduce, 1 аргумент - функция НОД, 2 аргумент - список
result = reduce(math.gcd, list_number)
print(result)