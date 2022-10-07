"""Программа для поиска совпадений между
    двумя списками, используя функцию filter()
"""

# Список строк с похожими элементами
list1 = ["абв"]
list2 = ["абв", "Scala", "JavaScript", "Go", "PHP", "CSharp"]

# функция, которая проверяет строки на вхождение
def filter_duplicate(string_to_check):
    if string_to_check in ll:
        return False
    else:
        return True

# Применение filter() для удаления повторяющихся строк
ll = list2
out_filter = list(filter(filter_duplicate, list1))
ll = list1
out_filter += list(filter(filter_duplicate, list2))

print("Отфильтрованный список:", out_filter)