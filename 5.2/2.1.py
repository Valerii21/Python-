from random import *
import os


welcome_text = ('Приветствую Вас!\n'
                'Хотите сыграть в игру "512 шагов"?\n'
                'Правила:\n'
                '512 конфет, вы берете поочереди,\n'
                'причем, за один раз можно взять не больше 28 конфет.\n'
                'Выигрывает тот, кто последним ходом заберет все конфеты.\n'
                'Начнем?')
print(welcome_text)

message = ['твоя очередь', 'бери конфеты', 'бери']


def player_vs_player():
    candies_total = 512
    max_take = 28
    count = 0
    player_1 = input('\nВаше имя?: ')
    player_2 = input('\nИмя соперника?: ')

    print(f'\n{player_1} и  {player_2} Начнем игру!\n')
    print('\nДля начала опеределим кто первый начнет игру.\n')

    x = randint(1, 2)
    if x == 1:
        lucky = player_1
        loser = player_2
    else:
        lucky = player_2
        loser = player_1
    print(f'Поздравляю {lucky} ты ходишь первым !')

    while candies_total > 0:
        if count == 0:
            step = int(input(f'\n{choice(message)} {lucky} = '))
            if step > candies_total or step > max_take:
                step = int(input(
                    f'\nМожно взять только {max_take} конфет {lucky}, попробуй еще раз: '))
            candies_total = candies_total - step
        if candies_total > 0:
            print(f'\nНа кону еще {candies_total}')
            count = 1
        else:
            print('Конфеты кончились')

        if count == 1:
            step = int(input(f'\n{choice(message)}, {loser} '))
            if step > candies_total or step > max_take:
                step = int(input(
                    f'\nМожно взять только {max_take} конфет {loser}, попробуй еще раз: '))
            candies_total = candies_total - step
        if candies_total > 0:
            print(f'\nНа кону еще {candies_total}')
            count = 0
        else:
            print('Конфеты кончились!')

    if count == 1:
        print(f'{loser} ПОБЕДИЛ')
    if count == 0:
        print(f'{lucky} ПОБЕДИЛ')

player_vs_player()
