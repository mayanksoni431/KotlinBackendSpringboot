# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

WORKDIR /app

RUN ls -l build/libs

COPY ./build/libs/*.jar app.jar

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
