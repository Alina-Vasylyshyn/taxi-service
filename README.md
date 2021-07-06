# "Taxi-service"
****
Simple imitation of a service taxi 

Technologies:

- Java WEB, Servlets, JDBC;
- HTML, CSS;
- MySQL
- Tomcat;
- Maven;

Settings:
1) Clone the project
2) Database configuration:
src/main/java/taxi/util/ConnectionUtil

public static final String URL = "jdbc:mysql://localhost:3306/DATABASE_NAME?serverTimezone=UTC";

public static final String USERNAME = "DATABASE_USERNAME";

public static final String PASSWORD = "DATABASE_PASSWORD";

public static final String JDBC_DRIVER = "DATABASE_JDBC_DRIVER";

3) Configuration Tomcat Got to: Run → Edit Configuration. then select Tomcat Server –>> Local. then Deployment ->> Fix ->> choose "taxi:war exploded" ->> in line application context write only "/" ->> apply ->> ok
