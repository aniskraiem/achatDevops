FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/achatDecops-1.0.jar achatDecops-1.0.jar
ENTRYPOINT ["java","-jar","/achatDecops-1.0.jar"]