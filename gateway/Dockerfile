FROM openjdk:17

# Установите рабочую директорию внутри контейнера
WORKDIR /app

# Копируйте JAR-файл с вашим приложением в контейнер
COPY target/gateway.jar gateway.jar

# Определите порт, который ваше приложение будет использовать
EXPOSE 8222

# Команда для запуска вашего Spring Boot-приложения
CMD ["java", "-jar", "gateway.jar"]