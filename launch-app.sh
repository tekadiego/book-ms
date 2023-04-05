#!/bin/sh
echo "The student-app api is starting ..."
#exec java -jar -Xms1g -Xmx2g -Dspring.profiles.active=k8s "student-app.jar"
exec java -jar -Xms1g -Xmx2g "book-ms.jar"