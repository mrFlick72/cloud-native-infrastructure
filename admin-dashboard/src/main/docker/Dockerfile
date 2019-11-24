FROM openjdk:12

ADD admin-dashboard.jar /usr/local/admin-dashboard/

VOLUME /var/log/onlyone-portal

WORKDIR /usr/local/admin-dashboard/

CMD ["java", "-Xms512m", "-Xmx1g", "-jar", "admin-dashboard.jar"]