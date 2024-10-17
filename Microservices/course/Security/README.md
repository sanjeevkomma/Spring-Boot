# To Read

# Terminology
* Bearer Token = Bearer token is what we generate and keep on client side and send all the time when api is called to authorize based on bearer token
* JWT Token = JWT is a library use to generate and verify bearer token
* OAuth 1.0 = OAuth 1.0 requires client to send two security tokens for each API call, and use both to generate the signature
* OAuth 2.0 = OAuth 2.0 signatures are not required for the actual API calls once the token has been generated. It has only one security token


# Security Standards
|SNo| #Approach  | #Intent | #Definition |
| :--- | :--- | :--- |:--- |
|1 | OAuth 2.0 Authentication framework | * OAuth is used for authorization( To grant access to functionality/data/etc.. without having to deal with the original authentication) <br>* OAuth 2.0 is a authorization protocol (that may use a JWT as a token format | OAuth2 solve a problem that user wants to access the data using client software like browse based web apps, native mobile apps or desktop apps. OAuth2 is just for authorization, client software can be authorized to access the resources on-behalf of end user using access token |
| 2| OpenId Connect Core 1.0 | OpenID is used for authentication( To prove who you are) | OpenID Connect builds on top of OAuth2 and add authentication. OpenID Connect add some constraint to OAuth2 like UserInfo Endpoint, ID Token, discovery and dynamic registration of OpenID Connect providers and session management. JWT is the mandatory format for the token|
|3 | OpenId Connect Discovery 1.0 | It defines how clients dynamically discover information about OpenID Providers | |
|4 | JSON Web Token ( JWT ) |  | It is just a token format. JWT tokens are JSON encoded data structures contains information about issuer, subject (claims), expiration time etc. It is signed for tamper proof and authenticity and it can be encrypted to protect the token information using symmetric or asymmetric approach. JWT is simpler than SAML 1.1/2.0 and supported by all devices and it is more powerful than SWT(Simple Web Token)|
|5 | JSON Web Signature ( JWS ) |  | |
|6 | CSRF protection |  |You don't need implement the CSRF protection if you do not store token in the browser's cookie|

# Grant Types in OAuth 2.0
|SNo| #Approach  | #Intent |
| :---: | :---: | :---: |
|1 | authorization_code | used in web applications |
| 2| client_credentials | used in service to service communication |
|3 | refresh_token | used to refresh your access token on or before expiry |
|4 | password | use your password for login |

# Best Practices To Secure Microservices
|SNo| #Approach  | #Intent |
| :---: | :---: | :---: |
|1 | Defense in Depth Mechanism |  |
| 2| Tokens and API Gateway |  |
|3 | Distributed Tracing |  |
| 4| Session Management | |
| 5| First Session | |
| 6| Mutual SSL | |
|7 | OAuth | |
1. Defense in Depth Mechanism
* ![image](https://user-images.githubusercontent.com/7721150/169539060-32477129-a9f8-45b5-a85c-c53458dcd955.png)
2. Tokens and API Gateway
* ![image](https://user-images.githubusercontent.com/7721150/169539533-b0a7f7ec-4c49-418e-be3d-1cb7459ada37.png)
* ![image](https://user-images.githubusercontent.com/7721150/169544117-47e3ee4d-b991-47ae-a592-f6c4804de872.png)
* ![image](https://user-images.githubusercontent.com/7721150/169544509-85bbd236-ef9c-47e2-b758-7146fb7a53fc.png)
* ![image](https://user-images.githubusercontent.com/7721150/169544724-ed9cf25a-755c-46fa-9d0a-c56d9be72398.png)
3. Distributed Tracing & Session Management
* ![image](https://user-images.githubusercontent.com/7721150/169540471-a88b6a61-58b5-40bc-bfe1-f3ad5eb2a2ae.png)
* ![image](https://user-images.githubusercontent.com/7721150/169541054-f8801eb7-9beb-4c31-a5ec-79b9af176b8a.png)
4. First Session & Mutual SSL
* ![image](https://user-images.githubusercontent.com/7721150/169541822-d6e79243-3cbf-4979-8680-e747863546cc.png)
* ![image](https://user-images.githubusercontent.com/7721150/169542792-ec6bc4d2-2662-4486-a840-7bb29ddec965.png)
5. OAuth
* ![image](https://user-images.githubusercontent.com/7721150/169543032-9281ab73-a7a6-4911-9888-1035b9af3c4d.png)

# Problems faced in MicroServices
1. ![image](https://user-images.githubusercontent.com/7721150/169547913-6a5d3b28-d5e6-4160-abbe-d1905a012b43.png)
2. ![image](https://user-images.githubusercontent.com/7721150/169548038-9860cdff-f02f-4aa8-92df-3ebad48c2887.png)
3. ![image](https://user-images.githubusercontent.com/7721150/169548386-e8c32d62-2286-4bd9-b85e-3ecb9c3564ed.png)

# Reference
* [Best Practices To Secure Microservices](https://www.youtube.com/watch?v=wpA0N7kHaDo)
