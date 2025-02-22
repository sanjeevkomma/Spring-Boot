

# Info
# Reliability of a REST API
* Availability
* Fault Tolerance
* Performance
* Scalability
* Consistency
* Security
* Monitoring and Logging
* Documentation
* Versioning
* Testing





# Query Params
|SNo| #Param  | ##Intent |
| :--- | :--- | :--- |
| 1 | application/json | |






# HTTP Headers
|SNo| #HTTP Header  | ##Intent |
| :--- | :--- | :--- |
| 1 | application/json | |

# Content Types
|SNo| #Content Type  | ##Intent |
| :--- | :--- | :--- |
| 1 | application/json | |
| 2 | text/html | |
| 3 | multipart/form-data | |
| 4 | text/html | |
| 5 | text/html | |
| 6 | text/html | |

# HTTP Status Codes
|SNo| #HTTP Status Code  | ##Intent |
| :--- | :--- | :--- |
| 1 | 200 | |
* ![image](https://user-images.githubusercontent.com/7721150/229872458-44606c57-b0d4-4d33-a25c-789d8f9d4306.png)











2. [What does API do?](https://www.linkedin.com/posts/bytebytego_systemdesign-coding-interviewtips-activity-7054685582408441856-UXkH?utm_source=share&utm_medium=member_android)
* ![image](https://user-images.githubusercontent.com/7721150/234066254-58ae591c-7bd8-4a27-b72d-d93c14412778.png)
* 1 receives HTTP request from client<br>
  2 parses and validates attributes in the request, or its header<br>
  3 performs allow/deny list checks<br>
  4 talks to identity provider to authenticate and authorize<br>
  5 rejects if rate limit is exceeded<br>
  6 and 7 - finds the service to route to by path matching.<br>
  8 transforms the request into the appropriate protocol and sends it to backend service<br>
  9 can <br>
  · handle errors<br>
  · deal with faults (circuit break). <br>
  · log and monitor the request<br>
  · cache data


# Reference
* [REST API Official Tutorial](https://restfulapi.net/)
* [Cross-Origin Resource Sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
* [REST Architectural Constraints](https://restfulapi.net/rest-architectural-constraints/)
* [REST vs GraphQL vs gRPC](https://blog.bitsrc.io/rest-vs-graphql-vs-grpc-684edfacf810)
* [How to Choose HTTP or gRPC for Your Next API](https://blog.postman.com/how-to-choose-http-or-grpc-for-your-next-api/)

# Images
1. REST URIs
* ![image](https://user-images.githubusercontent.com/7721150/176473420-5b9a3ff9-1766-44e4-98f7-2ca329d27aa4.png)

# API Information
 1. 𝗔𝗣𝗜 𝗙𝘂𝗻𝗱𝗮𝗺𝗲𝗻𝘁𝗮𝗹𝘀: https://lnkd.in/e8eMet_k
 2. 𝗔𝗣𝗜 𝗦𝗶𝗺𝗽𝗹𝗶𝗳𝗶𝗲𝗱: https://lnkd.in/er9JiGxw
 3. 𝗔𝗣𝗜 𝗠𝗲𝘁𝗵𝗼𝗱𝘀: https://lnkd.in/ey9v7-hU
 4. 𝗔𝗣𝗜 𝗧𝗲𝗿𝗺𝗶𝗻𝗼𝗹𝗼𝗴𝗶𝗲𝘀: https://lnkd.in/eRsPMzpd
 5. 𝗔𝗣𝗜 𝗔𝘂𝘁𝗵𝗲𝗻𝘁𝗶𝗰𝗮𝘁𝗶𝗼𝗻: https://lnkd.in/eNPfpAdE
 6. 𝗔𝗣𝗜 𝗦𝘁𝗮𝘁𝘂𝘀 𝗖𝗼𝗱𝗲𝘀: https://lnkd.in/egXizUrS
 7. 𝗥𝗘𝗦𝗧 𝗔𝗣𝗜 𝘃𝘀 𝗚𝗿𝗮𝗽𝗵𝗤𝗟: https://lnkd.in/eZHREdgC
 8. 𝗔𝗣𝗜 𝗜𝗻𝘁𝗲𝗴𝗿𝗮𝘁𝗶𝗼𝗻: https://lnkd.in/eDASPP5m
 9. 𝗔𝗣𝗜 𝗜𝗻𝘁𝗲𝗴𝗿𝗮𝘁𝗶𝗼𝗻 𝗶𝗻 𝗗𝗲𝘁𝗮𝗶𝗹: https://lnkd.in/eZwFVrH7
10. 𝗔𝗣𝗜 𝗧𝗲𝘀𝘁𝗶𝗻𝗴: https://lnkd.in/emgmWJqH
11. 𝗔𝗣𝗜 𝘄𝗶𝘁𝗵 𝗣𝘆𝘁𝗵𝗼𝗻: https://lnkd.in/eM23ah2y
12. 𝗔𝗣𝗜 𝗦𝗰𝗮𝗹𝗶𝗻𝗴: https://lnkd.in/e3mZSvmn
13. 𝗗𝗲𝘃𝗲𝗹𝗼𝗽𝗶𝗻𝗴 𝗥𝗼𝗯𝘂𝘀𝘁 𝗔𝗣𝗜𝘀: https://lnkd.in/eBXzbFyg
14. 𝗔𝗣𝗜𝘀 𝘄𝗶𝘁𝗵 𝗣𝗼𝘀𝘁𝗺𝗮𝗻: https://lnkd.in/ezue3d4B
15. 𝗧𝗲𝘀𝘁𝗶𝗻𝗴 𝗔𝗣𝗜𝘀 𝘄𝗶𝘁𝗵 𝗣𝗼𝘀𝘁𝗺𝗮𝗻: https://lnkd.in/eCPnGTGi
16. 𝗔𝗣𝗜 𝗦𝗲𝗰𝘂𝗿𝗶𝘁𝘆: https://lnkd.in/e79ZYfPa
17. 𝗔𝗣𝗜𝘀 𝗳𝗼𝗿 𝗘𝘃𝗲𝗿𝘆𝗼𝗻𝗲: https://lnkd.in/e4WGDffA
============================================================================================



# Request Types
|SNo| #Type  | ##Intent |
| :--- | :--- | :--- |
| 1 | XHR ( XML HTTP Request ) | XHR is a JavaScript API to create AJAX requests|
| 2 | Preflight | A preflight request is a small request that is sent by the browser before the actual request |

# API Course
1. API and REST API Fundamentals - https://lnkd.in/e8eMet_k
2. API Methods - https://lnkd.in/ey9v7-hU
3. API Terminologies - https://lnkd.in/eRsPMzpd
4. API Authentication - https://lnkd.in/eNPfpAdE
5. API Status Codes - https://lnkd.in/egXizUrS
6. REST API vs GraphQL - https://lnkd.in/eZHREdgC
7. API Integration - https://lnkd.in/eDASPP5m
8. API Testing - https://lnkd.in/emgmWJqH
9. API with Python - https://lnkd.in/eM23ah2y
10. API Scaling - https://lnkd.in/e3mZSvmn
11. Designing and Developing Robust APIs - https://lnkd.in/eBXzbFyg
12. Designing APIs with Postman- https://lnkd.in/ezue3d4B
13. Testing APIs with Postman - https://lnkd.in/eCPnGTGi





