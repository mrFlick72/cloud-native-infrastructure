FROM openjdk:11

ADD admin-dashboard.jar /usr/local/admin-dashboard/

WORKDIR /usr/local/admin-dashboard/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "admin-dashboard.jar"]