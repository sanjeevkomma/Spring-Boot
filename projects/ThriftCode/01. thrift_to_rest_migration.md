# Thrift to REST Migration Guide

## 🚧 Why Migrate from Thrift to REST?

| Thrift (Before)          | REST (After)               |
|--------------------------|----------------------------|
| Binary over TCP          | JSON over HTTP             |
| Strongly typed services  | Human-readable APIs        |
| Harder cross-language use| Broad ecosystem/tooling    |
| Requires generated code  | Use standard HTTP clients  |

---

## ✅ Step-by-Step Migration Plan

### 1. Analyze Existing Thrift Services

- Review all `.thrift` files
- Identify:
  - Services and methods
  - Data types (structs, enums, exceptions)
  - Dependencies between services

### 2. Define REST Endpoints

For each Thrift method, define corresponding REST endpoints:

| Thrift                      | REST Example                           |
|----------------------------|----------------------------------------|
| `User getUser(i32 id)`     | `GET /users/{id}`                      |
| `void addUser(User user)`  | `POST /users`                          |
| `bool deleteUser(i32 id)`  | `DELETE /users/{id}`                   |
| `list<User> getAll()`      | `GET /users`                           |

Design with:
- **HTTP verbs**: `GET`, `POST`, `PUT`, `DELETE`
- **Status codes**: `200`, `201`, `400`, `404`, etc.
- **JSON** request/response formats

### 3. Convert Thrift Structs to DTOs (JSON Models)

Example Thrift:
```thrift
struct User {
  1: i32 id,
  2: string name,
  3: string email
}
```

Java DTO:
```java
public class UserDto {
    private int id;
    private String name;
    private String email;
    // getters/setters
}
```

### 4. Implement REST Controllers (Spring Boot Example)

```java
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable int id) {
        return ResponseEntity.ok(userService.getUser(id));
    }

    @PostMapping
    public ResponseEntity<Void> addUser(@RequestBody UserDto user) {
        userService.addUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
```

### 5. Reimplement Business Logic (If Needed)

You can:
- Reuse existing **service implementation**
- Refactor it to use DTOs instead of Thrift types

### 6. Remove Thrift Transport Layer

Delete/disable:
- Thrift servers (e.g., `TSimpleServer`)
- Thrift client proxies
- `.thrift` files and generated code (once fully migrated)

### 7. Add OpenAPI/Swagger for Documentation (Optional)

Gradle dependency:
```groovy
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.2.0'
```

Access the Swagger UI:
```
http://localhost:8080/swagger-ui.html
```

### 8. Test Thoroughly

- Write **unit and integration tests**
- Ensure **backward compatibility** if required
- Use **Postman** or **curl** for manual testing

---

## ⚠️ Migration Strategy Options

| Strategy              | Description                                 |
|-----------------------|---------------------------------------------|
| **Big Bang**          | Replace Thrift entirely (faster, riskier)   |
| **Strangler Pattern** | Gradually replace Thrift endpoints with REST|
| **Dual Mode**         | Support both Thrift and REST for a period   |

---

## 🔄 Example Mapping: Thrift → REST

| Thrift Type   | REST Equivalent (JSON) |
|---------------|------------------------|
| `i32`, `i64`  | Number                 |
| `string`      | String                 |
| `list<T>`     | JSON Array             |
| `struct`      | JSON Object            |
| `exception`   | HTTP Status + JSON Error Body |
