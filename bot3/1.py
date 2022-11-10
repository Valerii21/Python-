import telebot
bot = telebot.TeleBot('5705362473:AAEECXwJP8CM_2vXgH7evFy4abQMs7O2Mn0')

@bot.message_handler(commands=["start"])
def start(message):

    bot.send_game(chat_id=message.chat.id,game_short_name='simplegame')


@bot.callback_query_handler(func=lambda callback_query:callback_query.game_short_name == 'simplegame')
def game(call):
     
     bot.answer_callback_query(callback_query_id=call.id, url='https://yandex.ru/games/app/97835?utm_medium=search&utm_source=yandex&utm_campaign=rus_games_general-igra-bezkav_yandex_search_460.new%7C59207487&utm_term=%D0%B8%D0%B3%D1%80%D0%B0%20%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD#app-id=97835&catalog-session-uid=catalog-ef3860b7-8ab9-5af6-a682-0ac34fa0fdd0-1668073176418-aca0&rtx-reqid=9216465734800721162&pos=%7B%22listType%22%3A%22categorized%22%2C%22tabCategory%22%3A%22common%22%7D')


if __name__ == "__main__":
    bot.polling()