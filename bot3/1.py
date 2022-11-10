import telebot
bot = telebot.TeleBot('5705362473:AAEECXwJP8CM_2vXgH7evFy4abQMs7O2Mn0')

@bot.message_handler(commands=["start"])
def start(message):

    bot.send_game(chat_id=message.chat.id,game_short_name='simplegame')

if __name__ == "__main__":
    bot.polling()