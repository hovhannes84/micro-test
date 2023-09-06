FROM openjdk:17

# Установите рабочую директорию внутри контейнера
WORKDIR /app

# Копируйте JAR-файл с вашим приложением в контейнер
COPY target/authors.jar authors.jar

# Определите порт, который ваше приложение будет использовать
EXPOSE 8081

# Команда для запуска вашего Spring Boot-приложения
CMD ["java", "-jar", "authors.jar"]