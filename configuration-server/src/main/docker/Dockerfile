FROM openjdk:11

ADD configuration-server.jar /usr/local/configuration-server/

WORKDIR /usr/local/configuration-server/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "configuration-server.jar"]