SIMPLE USER JPA PROJECT

Requirements:
- JDK 17
- Spring Tool Suite (STS)

Import:
1. Extract SimpleUserJPA.zip.
2. In STS: File > Import > Maven > Existing Maven Projects.
3. Browse to the extracted SimpleUserJPA folder.
4. Select pom.xml and click Finish.
5. Wait for Maven dependencies to download.
6. Run SimpleUserJpaApplication.java > Run As > Spring Boot App.

No PostgreSQL setup is needed. This version uses an in-memory H2 database.

Test:
POST http://localhost:8080/api/users/register
Body > raw > JSON:
{
  "username": "keshav",
  "email": "keshav@gmail.com",
  "password": "12345"
}

Note: This is a minimal learning/lab example. It stores the password as provided; do not use this password handling in a real application.
