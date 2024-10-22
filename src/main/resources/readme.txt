-> Create your own "application.properties"

Template HERE:

spring.application.name=wachichaw

server.port=8080

spring.datasource.url=jdbc:mysql://localhost:3306/db_campusxperience // database connection

spring.datasource.username=root // username
spring.datasource.password=**** // password

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.error.include-stacktrace=never