FROM openjdk:12

ADD eureka-server.jar /usr/local/eureka-server/

WORKDIR /usr/local/eureka-server/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "eureka-server.jar"]