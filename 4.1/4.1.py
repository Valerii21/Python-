# Задание 1. Вычислить число pi c заданной точностью d

def nikalant_row(d: int) -> float:
    pi, sign, m = 3, 1, 2
    while abs(pi - (pi + sign*4/(m**3+3*m**2+2*m))) > 10**(-d-1):
        pi = pi + sign*4/(m**3+3*m**2+2*m)
        sign = -1*sign
        m = m+2
    return round((pi + (pi + sign*4/(m**3+3*m**2+2*m)))/2, d)

d = int(input('Введите точность определения числа ПИ (количество знаков после запятой): '))
pi = nikalant_row(d)
print(f'С точностью {d=}, число {pi=}; ')