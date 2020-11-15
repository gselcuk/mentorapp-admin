FROM openjdk:13-jdk-alpine
VOLUME /tmp
COPY target/*.jar mentorapp-admin.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/mentorapp-admin.jar"]