# dropwizard-demo-app

### Run
* `./gradlew build` (run `gradlew.bat build` for Windows users)
* Enter the `build/distributions` directory
* Untar the `dropwizard-demo-app-1.0.0.sls.tgz` file (run `tar xvf dropwizard-demo-app-1.0.0.sls.tgz` if you have `tar` installed)
* Start up the application(run `./dropwizard-demo-app-1.0.0/service/bin/init.sh start`) 
### Queries
* Index :

*curl -X GET http://localhost:8080/api/date | json_pp*

* Find All:

*curl -X GET http://localhost:8080/api/pong | json_pp*


### Checkstyle

Open in browser `${project.rootDir}//build/reports/checkstyle/main.html`

