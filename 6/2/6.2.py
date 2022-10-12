text = input()
# для подсчета всех идущих подряд Решек
count_letter_r = 1
# для нахождения самой длинной последовательности Решек
max_count_letter_r = 1
for letter in range(len(text) - 1):
    # Cверяем по индексам 2 соседних элемента на Р
    if text[letter] == text[letter + 1] == 'Р':
        count_letter_r += 1
        # Ищем максимальную длину такой последовательности
        if count_letter_r > max_count_letter_r:
            max_count_letter_r = count_letter_r
    else:
        # Если не равны, обнуляем последовательность Решек, 1 потому что отчет начинается с пары.
        count_letter_r = 1
# Проверяем, была ли решка вообще
if 'Р' not in text:
    print(0)
else:
    print(max_count_letter_r)


