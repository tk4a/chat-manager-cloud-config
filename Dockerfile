FROM adoptopenjdk/openjdk12:latest
MAINTAINER arteemtkacheev@gmail.com
COPY build/libs/chat-manager-cloud-config-1.0.jar cloud-config.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "cloud-config.jar"]