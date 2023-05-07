FROM openjdk:17

## JAR_PATH book-launcher/target

ARG JAR_FILE=book-launcher/target/book-ms.jar

WORKDIR /opt/app

COPY ${JAR_FILE} book-ms.jar

COPY launch-app.sh launch-app.sh

EXPOSE 8080

RUN chmod 777 launch-app.sh

ENTRYPOINT ["./launch-app.sh"]