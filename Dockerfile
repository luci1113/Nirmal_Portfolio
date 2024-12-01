FROM ubuntu

RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt install -y openjdk-17-jdk
RUN apt install -y maven

COPY . .
RUN mvn clean install


RUN cd target/ && cp portfolio-with-spring-0.0.1.jar /portfolio-with-spring-0.0.2.jar

ENTRYPOINT [ "java", "-jar","portfolio-with-spring-0.0.2.jar" ]