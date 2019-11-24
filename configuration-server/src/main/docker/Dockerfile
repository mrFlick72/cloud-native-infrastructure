FROM openjdk:12

ADD configuration-server.jar /usr/local/configuration-server/

VOLUME /var/log/onlyone-portal

WORKDIR /usr/local/configuration-server/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "configuration-server.jar"]