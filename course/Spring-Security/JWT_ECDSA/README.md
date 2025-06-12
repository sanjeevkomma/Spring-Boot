# To Read
* JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object.
* This information can be verified and trusted because it is digitally signed.
* JWTs can be signed using a secret (with HMAC algorithm) or a public/private key pair using RSA
* JWS = JSON Web Signature
* JWSHeader = JWSAlgorithm.RS256, JWSAlgorithm.HS256
* JWSSigner = JWSSigner, MACSigner

# JWT STRUCTURE
* JWTs consist of three parts separated by dots (.), which are: 
1. **Header** : The header typically consists of two parts: the type of the token, which is JWT, and the hashing algorithm such as HMAC SHA256 or RSA
2. **Payload** : Payload contains the claims. Claims are statements about an entity (typically, the user) and additional metadata. There are three types of claims: reserved, public, and private claims
3. **Signature** : To create the signature part you have to take the encoded header, the encoded payload, a secret, the algorithm specified in the header, and sign that

# What is JWT (JSON Web Token)?
* JWT is a compact, URL-safe token format often used to represent claims (like identity, permissions). It’s not tied to OAuth 2.0 but is commonly used with it
# Structure:
```php-template
<Header>.<Payload>.<Signature>
```
* **Header:** Type of token + signing algorithm
* **Payload:** Claims (user ID, role, etc.)
* **Signature:** To verify the token hasn't been tampered with
* All encoded in Base64URL

# What JWT is:
| Aspect                            | Description                                                                                     |
| --------------------------------- | ----------------------------------------------------------------------------------------------- |
| 🔧 **Standard**                   | It is a **specification defined in [RFC 7519](https://datatracker.ietf.org/doc/html/rfc7519)**. |
| 📦 **Token format**               | A compact, URL-safe **data format** used to represent claims between two parties.               |
| 🪪 **Used for**                   | Authentication, authorization, session management, secure data exchange.                        |
| 🔐 **Can be signed or encrypted** | Typically signed with HMAC or RSA/EC (for integrity); optionally encrypted for confidentiality. |

# What JWT is not:
| ❌                   | Explanation                                                                                     |
| ------------------- | ----------------------------------------------------------------------------------------------- |
| Not a **protocol**  | JWT does not define how systems should communicate — OAuth 2.0 or OpenID Connect are protocols. |
| Not a **framework** | It’s not a structured toolset or workflow.                                                      |
| Not a **library**   | It is implemented **by libraries**, but not a library itself.                                   |


# Reference
* [Get Started with JSON Web Tokens](https://auth0.com/learn/json-web-tokens/)

# ECDSA(Elliptic Curve Digital Signature Algorithm)
# Definition

# To Read


