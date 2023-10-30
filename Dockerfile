#FROM adoptopenjdk:17-jre-hotspot AS builder
##ARG JAR_FILE=*.jar
##CMD ["java", "-jar", "/build/libs/coyukdae-BE-0.0.1-SNAPSHOT.jar"]
#COPY build/libs/coyukdae-BE-0.0.1-SNAPSHOT.jar /build/libs/coyukdae-BE-0.0.1-SNAPSHOT.jar
#WORKDIR /app
##ENTRYPOINT ["java", "-jar", "coyukdae-BE-0.0.1-SNAPSHOT.jar"]
#CMD ["java", "-jar", "coyukdae-BE-0.0.1-SNAPSHOT.jar"]

FROM openjdk:17-alpine
WORKDIR /usr/src/app
COPY build/libs/coyukdae-BE-0.0.1-SNAPSHOT.jar /build/libs/coyukdae-BE-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","./build/libs/demo-0.0.1-SNAPSHOT.jar"]