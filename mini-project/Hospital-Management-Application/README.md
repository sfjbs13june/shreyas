### spring boot application

```
https://start.spring.io/
```
### build the project
```
mvn clean install
mvn install dockerfile:build
```
### Run the application
```
docker-compose -f docker-compose-mongo.yml up -d
```
### Stop the application
```
docker-compose -f docker-compose-mongo.yml down -d
```

### Build the application
```
mvn spring-boot:run
```

### Run Project
```
- cd docker
- docker-compose up -d
- cd..
- mvn spring-boot:run

```
### Curl Commands
### Doctor Controller
### GET:
```
curl --location --request GET 'localhost:8080/doctor/doctorAppointment?doctorName=Shreyas' \
--header 'Authorization: Basic ZG9jdG9yNDU2OnBhc3N3b3Jk'
```

### Post:
```

```