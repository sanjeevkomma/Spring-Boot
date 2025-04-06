# Test the API
1. POST a user:
```bash
   curl -X POST http://localhost:8080/users \
   -H "Content-Type: application/json" \
   -d '{"id": "u1", "name": "Rahul", "email": "rahul@example.com"}'
```
2. GET users:
* curl http://localhost:8080/users
