# Definition
* OAuth 2.0 is an authorization framework (defined in [RFC 6749](https://datatracker.ietf.org/doc/html/rfc6749)) that provides a standard protocol for applications to delegate access securely without sharing passwords
* OAuth 2.0 is a protocol or authorization framework specification
* OAuth 2.0 is not a framework like Spring or Django
* Spring Security framework is an implementation of OAuth protocol

# Terminology
* OAuth = Open Authorization
* RFC = Request for Comments

# ToRead
* OAuth 2.0 is not tied to a specific programming language—it's a protocol (authorization framework) defined in a specification (RFC 6749), which is written in plain English technical standards (not code)
* ![image](https://github.com/user-attachments/assets/b9a9159d-4b46-428a-a7b6-6ab34f4449be)
* ![image](https://github.com/user-attachments/assets/70f69887-1914-44b5-8520-ee5198faa133)

# Implementations of OAuth
| Language                 | Popular OAuth 2.0 Libraries / Frameworks                  |
| ------------------------ | --------------------------------------------------------- |
| **Java**                 | Spring Security OAuth, Apache Oltu (deprecated), Keycloak |
| **JavaScript / Node.js** | `passport.js`, `node-oauth2-server`, `grant`              |
| **Python**               | `oauthlib`, `Authlib`, Django OAuth Toolkit               |
| **C# / .NET**            | IdentityServer, ASP.NET Core Identity                     |
| **Go**                   | `golang.org/x/oauth2`, `osin`                             |
| **PHP**                  | `league/oauth2-server`                                    |
| **Ruby**                 | `doorkeeper`, `omniauth`                                  |
| **Rust**                 | `oxide-auth`                                              |
| **C++**                  | Custom integrations via liboauth or Boost libraries       |

# Analogy
* ![image](https://github.com/user-attachments/assets/18d7475d-8fd9-4fad-85ba-4de999e05b55)

# Why OAuth 2.0 is used:
* **Secure authorization** without exposing credentials
* **Delegated access**: e.g., let a travel app access your Google calendar
* **Granular access control** (scopes): only allow specific actions
* **Supports multiple flows** for different types of clients (web, mobile, service-to-service)

# OAuth 2.0 Key Roles:
| Role                     | Description                                        |
| ------------------------ | -------------------------------------------------- |
| **Resource Owner**       | The user who owns the data (you)                   |
| **Client**               | The app requesting access (e.g., a mobile app)     |
| **Authorization Server** | Issues tokens (e.g., Google, GitHub)               |
| **Resource Server**      | Hosts the protected APIs (e.g., your calendar API) |


# Summary
* OAuth 2.0 is a protocol / authorization framework specification, not a codebase
* It tells developers what to do, not how to do it in code.
* It is language-agnostic and can be implemented in any language
* Frameworks like Spring Security, Passport.js, or Django OAuth Toolkit are software implementations of this protocol

# #######################################
# How OAuth 2.0 Relates to [JWT](https://github.com/sanjeevkomma/Spring-Boot/tree/main/course/Spring-Security/JWT_ECDSA)
* OAuth 2.0 defines how to get tokens, not what the token looks like. JWT is a format for those tokens.
* In many systems:
    * The **OAuth server issues JWTs** as access tokens or ID tokens
    * The **client uses the JWT** to access the resource server
    * The **resource server validates** the JWT's signature and reads the claims
 
* Example:
    1. User logs into your app via Google (OAuth 2.0).
    2. Google returns an access token (usually a JWT).
    3. Your app uses that JWT to call your backend API.
    4. Backend verifies the JWT and grants access.
  
# Why Use JWT in OAuth?
| Feature       | Benefit                                                   |
| ------------- | --------------------------------------------------------- |
| **Stateless** | No need to store token in a DB — self-contained           |
| **Compact**   | Easy to transmit via headers                              |
| **Secure**    | Signed and optionally encrypted                           |
| **Flexible**  | Can contain custom claims (e.g., user roles, email, etc.) |

# Visual Flow:
```plaintext
[User] ────> [Client App]
                  │
                  │ (redirects)
                  ▼
           [OAuth Server]
                  │
        Issues Access Token (JWT)
                  ▼
           [Client App] ────> [API Server]
                         (passes JWT)
                  │
           Validates & Authorizes
```

# Summary
| Concept  | OAuth 2.0                | JWT                          |
| -------- | ------------------------ | ---------------------------- |
| Purpose  | Authorization framework  | Token format                 |
| Defines  | Flows, scopes, roles     | Claims, signing, structure   |
| Relation | OAuth **can issue JWTs** | JWT **can be used in OAuth** |


# References
* [OAuth 2.0 Official](https://oauth.net/2/)
