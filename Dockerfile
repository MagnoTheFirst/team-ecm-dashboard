FROM openjdk:15-jdk-alpine
EXPOSE 8081
VOLUME /tmp
ADD target/team_dashboard-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]