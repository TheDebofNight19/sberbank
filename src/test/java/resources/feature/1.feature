#language: ru

Функционал: sberbank.ru


   Сценарий: Переход на сайт сбербанка

      Допустим Пользователь переходит по ссылке "https://www.sberbank.ru"
      Когда Пользователь попадает на страницу sberbank.ru
      Тогда Отображается название страницы "«Сбербанк» - Частным клиентам"

   Сценарий: Переход во Вклады

      Допустим Пользователь переходит через верхнее меню во "Вклады"
      Когда Осущестляется переход
      Тогда Название страницы "«Сбербанк» - Подбор вкладов"

   Сценарий: Переход на вкладку "Подобрать вклад"

      Допустим Пользователь находится на странице "«Сбербанк» - Подбор вкладов"
      Когда Пользователь перешел на вкладку "Подобрать вклад"
      Тогда Отображаются 4 чек-бокса и установлен чек-бокс «Онлайн»
          | Хочу снимать   |
          | Хочу пополнять |
          | Онлайн         |
          | Я - пенсионер  |
      К тому же Отображается 3 вклада
          | Вклад Сохраняй |
          | Вклад Управляй |
          | Вклад Пополняй |

   Сценарий: Выбор чек-боксов «Хочу снимать» и «Хочу пополнять»

      Допустим Пользователь выбирает чек-боксы
          | Хочу снимать   |
          | Хочу пополнять |
          | Онлайн         |
          | Я - пенсионер  |
#      Тогда Исчезли вклады «Сохраняй» и «Пополняй», остался вклад «Управляй»
#          | Вклад Сохраняй |
#          | Вклад Пополняй |
#          | Вклад Управляй |
#
##
#   Сценарий: Нажатие кнопки "Подробнее" вклада "Управляй"
#
#      Допустим Пользователь находится на вкладке "Подобрать вклад"
#      Когда Пользователь нажимет на кнопку "Подробнее" вклада "Управляй"
#      Тогда В новом окне открывается окно с названием «Сбербанк» -Вклад Управляй
#      К тому же На странице отображается надпись ""Вклад Управляй".
#








