# dropwizard-demo-app

### Run
* Run `./gradlew build` (run `gradlew.bat build` for Windows users)
* Enter the `build/distributions` directory
* Untar the `dropwizard-demo-app-1.0.0.sls.tgz` file (run `tar xvf dropwizard-demo-app-1.0.0.sls.tgz` if you have `tar` installed)
* Start up the application(run `./dropwizard-demo-app-1.0.0/service/bin/init.sh start`) 
* Check the application status(run `./dropwizard-demo-app-1.0.0/service/bin/init.sh status`) 
* Stop the application(run `./dropwizard-demo-app-1.0.0/service/bin/init.sh stop`) 
### Queries
* Get current data:

*curl -X GET http://localhost:8080/api/date | json_pp*

* Ping:

*curl -X GET http://localhost:8080/api/pong | json_pp*


### Checkstyle
* Run `./gradlew checkstyleMain checkstyleTest` (run `gradlew.bat checkstyleMain checkstyleTest` for Windows users)

* Check out the reports:</br>
`./build/reports/checkstyle/main.html`</br>
`./build/reports/checkstyle/test.xml`


