# spring-rest-minimal

This is a minimal spring based application with REST controller ready to be deployed on Tomcat.

To try it, do the following:

1. Build it with maven: `mvn clean package`
2. Deploy war-file on an existing tomcat instance just by copying it into tomcat's `webapps` folder: `cp .\target\spring-rest-minimal.war C:\tomcat\webapps\`
3. Start/restart tomcat if necessary.
4. Visit http://localhost:8080/spring-rest-minimal/hey and ensure that it is working: the following text should be displayed: 
```
 {"id":1,"contents":"Hello, World!"}
 ```
5. You can also use `name` parameter: http://localhost:8080/spring-rest-minimal/hey?name=John
```
{"id":2,"contents":"Hello, John!"}
```