# Spring tutorial

##Requirements

1. PostgreSQL:
    You can install _PostgreSQL-9.4_ follow this link https://www.postgresql.org/download/linux/ubuntu/
2. Maven:
    For install maven 3 run next command:
    ```
        $ sudo apt-get install -y maven
    ```
3. JDK 8:
    You can install _JDK 8_ follow this link http://tecadmin.net/install-oracle-java-8-jdk-8-ubuntu-via-ppa/

##Run the app

For downloading all dependencies from pom.xml run:
```
    $ mvn clean install
```

For run application from directory root type in prompt:
```
    $ mvn spring-boot:run
```
This command start server on address *localhost:9000*