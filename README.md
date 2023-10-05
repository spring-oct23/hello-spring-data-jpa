# hello-spring-data-jpa

## Project setup
At the top-level directory create an application.properties file with the following information:

```shell
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://rdbm:3306/gftXX
spring.datasource.username=gftXX
spring.datasource.password=gftXX
spring.jpa.hibernate.ddl-auto=none
```

Please use your own information in place of gftXX for database name, username and password.

## Run in development mode

```shell
mvn spring-boot:run
```
