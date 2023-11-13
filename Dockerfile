# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

COPY . .

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
