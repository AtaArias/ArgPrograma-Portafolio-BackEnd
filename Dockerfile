FROM amazoncorretto:19-alpine-jdk
MAINTAINER ata_arias
COPY backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/backend-0.0.1-SNAPSHOT.jar"]
