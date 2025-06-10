| Concept           | **JWT (JSON Web Token)**                                                    | **Encryption**                                                             |
| ----------------- | --------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| **Definition**    | A compact, URL-safe token format for securely transmitting claims           | A method to convert readable data (plaintext) into unreadable (ciphertext) |
| **Purpose**       | Identity, claims, or authorization sharing (can be signed and/or encrypted) | Protect confidentiality by preventing unauthorized access to data          |
| **Types**         | ✅ **JWS** (Signed), ✅ **JWE** (Encrypted)                                   | Symmetric (AES), Asymmetric (RSA, ECC)                                     |
| **Focus**         | Authentication / Authorization tokens                                       | Data confidentiality and privacy                                           |
| **Readable?**     | Yes, **if not encrypted** (base64-encoded payload is human-readable)        | No – ciphertext is not readable without decryption                         |
| **Tamper Proof?** | Yes, if signed (JWS)                                                        | Not inherently – encryption protects data, not integrity                   |
| **Use With JWT**  | ✅ JWTs are often signed using HMAC or RSA/ECDSA                             | ✅ JWTs can also be encrypted (JWE)                                         |
