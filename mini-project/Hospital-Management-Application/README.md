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





### Patient Controller
### GET:

```
curl --location --request GET 'localhost:8080/patient/patientappointment?patientName=Shreyas' \
--header 'Authorization: Basic cGF0aWVudDQ1NjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=22BA6D4BD021AE334673E17DAF523919'
```



### Prescription Controller
### GET:
```
curl --location --request GET 'localhost:8080/prescription/viewprescription?patientName=Shreyas' \
--header 'Authorization: Basic cGF0aWVudDQ1NjpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=22BA6D4BD021AE334673E17DAF523919'
```


### Dockerization
### Creating Docker Image
```
mvn install dockerfile:build 
```

### List docker images
```
docker images  
```

### List Running Containers
```
docker ps 
```

### Running the Application with Docker Compose
```
Docker-compose up-d
Docker-compose down 
```
