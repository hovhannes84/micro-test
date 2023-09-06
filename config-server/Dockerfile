FROM openjdk:17

# Установите рабочую директорию внутри контейнера
WORKDIR /app

# Копируйте JAR-файл с вашим приложением в контейнер
COPY target/config-server.jar config-server.jar

# Определите порт, который ваше приложение будет использовать
EXPOSE 8888

# Команда для запуска вашего Spring Boot-приложения
CMD ["java", "-jar", "config-server.jar"]