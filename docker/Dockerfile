# определяем базовый образ
FROM python:3.6

# объявляем автора
LABEL maintainer dhonchar972@gmail.com

# клонируем код приложения
RUN git clone -q https://github.com/docker-in-practice/todo.git //или// RUN mkdir -p /usr/src/app/

# перемещаемся в новый клонированный каталог(базовый рабочий каталог)
WORKDIR /usr/src/app/

# скопировать все файлы текущей дериктории в "/usr/src/app/"
COPY . /usr/src/app/

# добавляем jar "myapp" в директорию и именуем его "backend"
ADD /target/myapp-1.0-SNAPSHOT.jar backend.jar

# запускаем команду установки менеджера пакетов (npm)
RUN npm install > /dev/null

# указываем, что контейнеры из собранного образа должны прослушивать этот порт
EXPOSE 8000

# переменные окружение
ENV TZ Europe/Kiev

# указываем, какая команда будет исполнена при запуске, CMD - запуск через shell(#!/bin/sh), ENTRYPOINT - без shell
CMD ["npm", "start"]  // или // ENTRYPOINT ["npm", "start"]
