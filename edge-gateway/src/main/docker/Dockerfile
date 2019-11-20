FROM openjdk:11

ADD onlyone-portal-edgeserver.jar /usr/local/onlyone-portal-edgeserver/

WORKDIR /usr/local/onlyone-portal-edgeserver/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "onlyone-portal-edgeserver.jar"]