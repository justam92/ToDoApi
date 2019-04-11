# ToDoApi
Back-End for To-Do Aplication

# API

### Task

```json
{
	'id': long,
	'name': string,
	'deadline': date,
	'insertionDate': date,
	'updateDate': date
}
```

# Endpoints

### Task

 * `GET:/tasks` - get all
 * `DELETE:/tasks/:id` - delete by id
 * `POST:/tasks` - insert
 * `PUT:/tasks` - update


# Configuration

In order to run ToDoApi, it is necessary to provide few configuration properties. Properties should be stored in configuration file that will be called in next step.

### Database address

Pattern:
```sh
spring.datasource.url=jdbc:mysql://<SERVER_URL>:<PORT>/<DATABASE_NAME>?useSSL=false
```

Example:
```sh
spring.datasource.url=jdbc:mysql://somehost.com:3306/mydb?useSSL=false
```

### Database user name

Pattern:
```sh
spring.datasource.username=<DATABASE_USERNAME>
```

Example:
```sh
spring.datasource.username=mylogin
```

### Database password

Pattern:
```sh
spring.datasource.password=<DATABASE_PASSWORD>
```

Example:
```sh
spring.datasource.password=mypassword
```

# Run&Build

### Build executable jar

Pattern:
```sh
mvn clean install -Dspring.config.additional-location=<LOCATION_OF_CONFIG_PROPERTIES_FILE>
```

Example:
```sh
mvn clean install -Dspring.config.additional-location=C:\\Users\\SomeUser\\config.properties
```

```sh

```

### Run via maven

Pattern:
```sh
spring-boot:run -Dspring.config.additional-location=<LOCATION_OF_CONFIG_PROPERTIES_FILE>
```

Example:
```sh
spring-boot:run -Dspring.config.additional-location=C:\\Users\\SomeUser\\config.properties
```

### Run jar file

Pattern:
```sh
nohup java -jar ToDoApi-<VERSION>.jar --spring.config.additional-location=<LOCATION_OF_CONFIG_PROPERTIES_FILE> &
```

Example:
```sh
nohup java -jar ToDoApi-1.0.0.jar --spring.config.additional-location=config.properties &
```

### Stop application

Pattern:
```sh
kill -9 $(ps aux | grep '[T]oDoApi-<VERSION>.jar' | awk '{print $2}')
```

Example:
```sh
kill -9 $(ps aux | grep '[T]oDoApi-1.0.0.jar' | awk '{print $2}')
```