FROM amazoncorretto:17-alpine-jdk
MAINTAINER KEVIN
COPY target/finanzas-0.0.1-SNAPSHOT.jar finanzas.jar
ENTRYPOINT ["java", "-jar","/finanzas.jar"]