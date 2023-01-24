## Import Project
Import Project from Spring Starter to Intellij

## Build the Project
Use Command
```
$ mvn clean install
```

## Build Docker

```
$ mvn install dockerile:bulid
```

## List Docker Images

```
$ docker images 
```

## Running the application in docker container

```
$ docker run -p 8080:8080 shreyas100/student-app:0.0.1-SNAPSHOT 
```

## List docker running container
``` 
$ Docker ps
```