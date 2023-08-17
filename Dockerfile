FROM eclipse-temurin:17 AS build
LABEL maintainer="danez7000@gmail.com"
WORKDIR /zoo
COPY . /zoo

RUN apt-get update && apt-get install -y maven

RUN mvn clean package

FROM eclipse-temurin:17
WORKDIR /zoo
COPY --from=build /zoo/target/ZooStore-0.0.4-SNAPSHOT.jar /zoo/zoostore-docker.jar


ENTRYPOINT ["java", "-jar", "zoostore-docker.jar"]