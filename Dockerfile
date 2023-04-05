FROM openjdk:17

ARG JAR_FILE=book-launcher/target/book-ms.jar

WORKDIR /opt/app

COPY ${JAR_FILE} book-ms.jar

COPY launch-app.sh launch-app.sh

RUN chmod 777 launch-app.sh

ENTRYPOINT ["./launch-app.sh"]