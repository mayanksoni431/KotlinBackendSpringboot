# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

WORKDIR /app

RUN find . -name '*.jar'

COPY  ./target/*.jar app.jar

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
