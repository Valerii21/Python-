# Задание 4.2. Задайте натуральное число N. Напишите программу, которая составит список простых множителей 
# числа N.

def check_number_simple(n: int):
    i = 2
    while n % i != 0 or i == n - 1:
        i += 1
    if i == n:
        return n


def fill_simple_list(n: int) -> list:
    return [i for i in range(2, n + 1) if check_number_simple(i) is not None and n % i == 0]


n = int(input('Введите натуральное число N: '))
simple_list = fill_simple_list(n)
print(simple_list)