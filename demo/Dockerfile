FROM openjdk:18
EXPOSE 8086
ADD target/user-mysql.jar user-mysql.jar
ENTRYPOINT ["java","-jar","/user-mysql.jar"]