# To Read
* Preflight Request = A preflight request is a small request that is sent by the browser before the actual request. 
* In that preflight, the browser sends headers that indicate the HTTP method and headers that will be used in the actual request
* REST API can be synchronous and asynchronous depends on the implementation. In synchronous, client sends a request and wait for a response, while in asynchronous, client sends a request and moves ahead

# Terminology
* Idempotent = ( Multiple requests = Single request )
* Safe = 

# HTTP Verbs
|SNo| #HTTP Verb  | Request URI | ##Intent | #Type |
| :--- | :--- | :--- |:---|:---|
| 1 | GET | | Request Header, Request Body , Response Header, Response Body| 1. Safe <br>2. Idempotent <br>3. Cacheable|
| 2 | POST | | |Not Safe , Not Idempotent , Not Cacheable |
| 3 | PUT | | | Idempotent , Not Cacheable , Not Safe|
| 4 | PATCH | | | |
| 5 | DELETE | | |Idempotent , Not Cacheable , Not Safe |
| 6 | COPY | | | |
| 7 | HEAD | | Request Header, NO Request Body , Response Header, NO Response Body|Safe , Idempotent , Cacheable |
| 8 | OPTIONS | |OPTIONS doest invoke any action or any operation on the resource, but it provides necessary information for communicating with that server |Safe , Idempotent , Not Cacheable |
| 9 | LINK | | | |
| 10 | UNLINK | | | |
| 11 | PURGE | | | |
| 12 | LOCK | | | |
| 13 | UNLOCK | | | |
| 14 | PROPFIND | | | |
| 15 | VIEW | | | |
| 16| TRACE | |TRACE method performs a message loop-back test along the path to the target resource, providing a useful debugging mechanism |Safe , Idempotent , Not Cacheable |

# Query Params
|SNo| #Param  | ##Intent |
| :---: | :---: | :---: |
| 1 | application/json | |


# Authorization
|SNo| #Authorization Type  | ##Intent |
| :---: | :---: | :---: |
| 1 | Inherit auth from parent | This is the default auth type. In this, authorization type will be the same as the parent, which means whatever the auth type you selected for that collection (parent); the same auth type will be selected for the request, which is under that collection|
| 2 | No Auth |If you select this type, Postman will not send any auth data with the request |
| 3 | API key |This is to send the Key and Value along with the API request |
| 4 | Bearer Token |This auth type allows the Authorization of requests by using an access key |
| 5 | Basic Auth |This allows users to send username and password along with the request for API login |
| 6 | Digest Auth |This is the two-point authentication of your API request. In this auth type user will send a request where the server will reply with a number that can only be used once. Then the user again will send the request along with username, password, and that realm number for Authorization of the request |
| 7 | OAuth |This auth type is to access third-party API data |
| 8 | Hawk Authentication |This enables users to use partial cryptographic verification to authenticate their requests. Hawk Auth id, which is your API authentication ID value and Hawk Auth key, which is your API authentication key value, is required for Authorization under this auth type |
| 9 | AWS Signature |For Amazon Web Services requests, this auth type is used |
| 10 | NTLM Authentication (Beta) |This is the auth type for windows OS and standalone systems |
| 11 | Akamai EdgeGrid |Akamai technologies use this auth type for authorizing requests |



# HTTP Headers
|SNo| #HTTP Header  | ##Intent |
| :---: | :---: | :---: |
| 1 | application/json | |

# Content Types
|SNo| #Content Type  | ##Intent |
| :---: | :---: | :---: |
| 1 | application/json | |
| 2 | text/html | |
| 3 | multipart/form-data | |
| 4 | text/html | |
| 5 | text/html | |
| 6 | text/html | |

# HTTP Status Codes
|SNo| #HTTP Status Code  | ##Intent |
| :---: | :---: | :---: |
| 1 | 200 | |

# REST Architectural Constraints
|SNo| #Constraint  | ##Intent |
| :---: | :---: | :---: |
| 1 | Uniform interface |Once a developer becomes familiar with one of your APIs, he should be able to follow a similar approach for other APIs |
| 2 | Client–server |Servers and clients may also be replaced and developed independently, as long as the interface between them is not altered |
| 3 | Stateless | client context will not be stored on the server between requests. The client is responsible for managing the state of the application |
| 4 | Cacheable |Well-managed caching partially or completely eliminates some client-server interactions, further improving scalability and performance |
| 5 | Layered system | |
| 6 | Code on demand (optional) | |


# Reference
* [REST API Official Tutorial](https://restfulapi.net/)
* [Cross-Origin Resource Sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
* [REST Architectural Constraints](https://restfulapi.net/rest-architectural-constraints/)

# Images
1. REST URIs
* ![image](https://user-images.githubusercontent.com/7721150/176473420-5b9a3ff9-1766-44e4-98f7-2ca329d27aa4.png)

