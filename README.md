# dropwizard-demo-app

### Run
* ./gradlew build
* java -jar target/dropwizard-demo-app-1.0.jar server configuration.yml

### Queries
* Index :

*curl -X GET http://localhost:8080/api/date | json_pp*

* Find All:

*curl -X GET http://localhost:8080/api/pong | json_pp*


### Checkstyle

Open in browser `${project.rootDir}//build/reports/checkstyle/main.html`

