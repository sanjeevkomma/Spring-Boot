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

# Summary
* OAuth 2.0 is a protocol / authorization framework specification, not a codebase
* It tells developers what to do, not how to do it in code.
* It is language-agnostic and can be implemented in any language
* Frameworks like Spring Security, Passport.js, or Django OAuth Toolkit are software implementations of this protocol
  
# References
* [OAuth 2.0 Official](https://oauth.net/2/)
