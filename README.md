# inventory

Purpose:
  1. provide inventory functionality.
  2. expose as web service endpoints.

Build:
  1. mvn clean package
  2. java -jar .\target\inventory-0.0.1-SNAPSHOT.jar
  
[![Vista-Ridge-Mall-Drive](https://circleci.com/gh/Vista-Ridge-Mall-Drive/inventory.svg?style=svg)](https://app.circleci.com/pipelines/github/Vista-Ridge-Mall-Drive/inventory)  
  
  
Docker Build Option 1:
  1. mvn spring-boot:build-image
  2. docker images  
  3. docker run -p 9090:9090 -t inventory-0.0.1-SNAPSHOT

Docker Build Option 2:
  1. mvn clean package
  2. docker images  
  3. docker run -p 9090:9090 -t inventory-0.0.1-SNAPSHOT

  
Target Environment:
  1. Netflix Architecture  
  
Dev Database:
  1. connect to http://localhost:9090/h2
  2. click connect button
  3. edit application.properties file. change value of spring.datasource.url