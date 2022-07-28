FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/prova-java-0.0.1-SNAPSHOT.jar prova-java-jar
ENTRYPOINT ["java","-jar","/prova-java-.jar"]