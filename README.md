![image](https://github.com/user-attachments/assets/a2871daa-09d3-4705-9e9a-f64701d09359)

# -> Create your own "application.properties"
# -> located at: "wachichaw\src\main\resources"

Template HERE:

spring.application.name=wachichaw

server.port=8080

# CHANGE to your own database connection
spring.datasource.url=jdbc:mysql://localhost:3306/db_campusxperience

# CHANGE to your own username
spring.datasource.username=root
# CHANGE to your own password
spring.datasource.password=****

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.error.include-stacktrace=never
