# syntax=docker/dockerfile:1
FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . .

RUN find . -name prototype-*.jar -exec cp {} ./app.jar \;

CMD ["java","-jar", "app.jar"]

EXPOSE 8080
