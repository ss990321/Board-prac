# week03_Spring
<hr>

## Use Case

![유스케이스](https://user-images.githubusercontent.com/110081578/185285663-a6598d7e-5996-49d5-a32c-df1701dc3148.JPG)

<hr>

## API 명세서

Method |  URL | Request | Response
---|---|---|---|
GET | /api/posts | | {<br>"id":1,<br>"createdAt":"2022-08-18T11:45:52.611009",<br>"modifiedAt":"2022-08-18T11:45:52.611009",<br>"title":"title",<br>"username":"username",<br>"contents": "contents"<br>}<br>{<br>"id":2,<br>"createdAt":"2022-08-18T03:53:17.715",<br>"modifiedAt":"2022-08-18T03:53:17.715",<br>"title":"title",<br>"username":"username",<br>"contents":"contents"<br>}
GET | /api/posts/{id} | | {<br>"id":2,<br>"createdAt":"2022-08-18T03:53:17.715",<br>"modifiedAt":"2022-08-18T03:53:17.715",<br>"title":"title2",<br>"username":"username2",<br>"contents": "contents2",<br>}
POST | /api/posts | {<br>“title”:“title”,<br>“username”:“username”,<br>“contents”:“contents”,<br>“password”:“password”<br>} | {<br>"createdAt":"2022-08-18T11:45:52.611009",<br>"modifiedAt":"2022-08-18T11:45:52.611009",<br>"id":1,<br>"username":"username",<br>"contents":"contents",<br>"title":"title",<br>"password":"password"<br>}
POST | /api/posts/{id} | {<br>“password”:“password”<br>} | true 
PUT | /api/posts/{id} | {<br>"title":"modifiedtitle",<br>"username":"modifiedusername",<br>"contents":"modifiedcontents",<br>"password":"modifiedpassword"<br>} | {<br>"createdAt":"2022-08-18T11:45:52.611009",<br>"modifiedtAt":"2022-08-18T04:01:32.353",<br>"id":1,<br>"username":"modifiedusername",<br>"contents":"modifiedcontents",<br>"title":"modifiedtitle",<br>"password":"modifiedpassword"<br>}
DELETE | /api/posts/{id} | | 1

<hr>

## Why?
**1. 수정, 삭제 API의 request를 어떤 방식으로 사용하셨나요? (param, query, body)**
>수정api : 수정할 게시글id - param, 수정내용 - body<br>
>삭제api : 삭제할 게시글id - param



**2. 어떤 상황에 어떤 방식의 request를 써야하나요?**
>GET, DELETE : 데이터 식별 - param<br>
>POST, PUT : 데이터 저장 - body 


**3. RESTful한 API를 설계했나요? 어떤 부분이 그런가요? 어떤 부분이 그렇지 않나요?**


**4. 적절한 관심사 분리를 적용하였나요? (Controller, Repository, Service)**


**5. 작성한 코드에서 빈(Bean)을 모두 찾아보세요!**


**6. API 명세서 작성 가이드라인을 검색하여 직접 작성한 명세서와 비교해보세요!**


