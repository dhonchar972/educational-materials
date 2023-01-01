# определяем базовый образ
FROM node 
    # объявляем автора
    LABEL maintainer dhonchar972@gmail.com
    # клонируем код приложения
    RUN git clone -q https://github.com/docker-in-practice/todo.git
    # перемещаем в новый клонированный каталог
    WORKDIR todo
    # запускаем команду установки менеджера пакетов (npm)
    RUN npm install > /dev/null
    # указываем, что контейнеры из собранного образа должны прослушивать этот порт
    EXPOSE 8000
    # указываем, какая команда будет запущена при запуске
    CMD ["npm", "start"]
