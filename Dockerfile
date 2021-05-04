FROM openjdk:8-jre-alpine

LABEL name = "Spring Boot Swagger"

ENV JAVA_OPTS "-Xmx1G -Xms1G"

ENV NO_PROXY "127.0.0.1,localhost,192.168"
ENV no_proxy "127.0.0.1,localhost,192.168"
RUN apk add unzip

WORKDIR /app

COPY ./build/distributions/com.sprint-1.0-SNAPSHOT.zip ./controller.zip

RUN unzip controller.zip -d /app
RUN mv com.sprint-1.0-SNAPSHOT controller
ENTRYPOINT ["java","-jar","/app.jar"]

EXPOSE 8080
