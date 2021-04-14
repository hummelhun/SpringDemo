POST request küldése Postmanban
POST kiválasztása
az url az api végpontja:
http://localhost:8080/api/v1/student
Body
  -raw
  -JSON(application/json)
{
        "name": "Bilal",
        "email": "bilal.ahmed@mail.com",
        "dob": "1995-12-17"
}

https://www.toolsqa.com/postman/post-request-in-postman/
------------------------------_
DELETE
http://localhost:8080/api/v1/student/2
----------------------------------_
PUT küldése
http://localhost:8080/api/v1/student/1?name=Maria
----------------------------------_
Maven clean és install után, a target mappában létrejövő .jar futtatható
C:\Users\Pogácsás Csaba\IdeaProjects\SpringDemo\target>java -jar SpringDemo-0.0.1-SNAPSHOT.jar

ha több példányt akarunk futtatni, akkor a port foglalt lesz, ez a következő képpen konfigurálható
C:\Users\Pogácsás Csaba\IdeaProjects\SpringDemo\target>java -jar SpringDemo-0.0.1-SNAPSHOT.jar --server.port=8081