FROM openjdk:12

ADD onlyone-portal-edgeserver.jar /usr/local/onlyone-portal-edgeserver/

VOLUME /var/log/onlyone-portal

WORKDIR /usr/local/onlyone-portal-edgeserver/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "onlyone-portal-edgeserver.jar"]