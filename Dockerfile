FROM openjdk:17
COPY target/boto.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","boto.jar"]

