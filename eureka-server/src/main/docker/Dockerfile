FROM openjdk:11

ADD eureka-server.jar /usr/local/eureka-server/

VOLUME /var/log/onlyone-portal

WORKDIR /usr/local/eureka-server/

CMD ["java", "-jar", "eureka-server.jar"]