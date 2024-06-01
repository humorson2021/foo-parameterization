# Foo Parameterization

This project calculates the volume of a sphere using the Foo et al. parameterization.

## Build and Run

To build the project, use Maven:

```sh
mvn clean install
```
To run the application:
```shell
mvn spring-boot:run
```
Then you can test it on Postman:
```shell
GET http://localhost:8080/api/v1/volume?radius={the number you want to put}
```

