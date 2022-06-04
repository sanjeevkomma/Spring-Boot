# To Read
* Preflight Request = A preflight request is a small request that is sent by the browser before the actual request. In that preflight, the browser sends headers that indicate the HTTP method and headers that will be used in the actual request

# HTTP Verbs
|SNo| #HTTP Verb  | Request URI | ##Intent | #Type |
| :---: | :---: | :---: |:---:|:---:|
| 1 | GET | | Request Header, Request Body , Response Header, Response Body| Safe , Idempotent , Cacheable|
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
| 3 | Stateless |No client context shall be stored on the server between requests. The client is responsible for managing the state of the application |
| 4 | Cacheable |Well-managed caching partially or completely eliminates some client-server interactions, further improving scalability and performance |
| 5 | Layered system | |
| 6 | Code on demand (optional) | |


# Reference
* [Cross-Origin Resource Sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
* [REST Architectural Constraints](https://restfulapi.net/rest-architectural-constraints/)
