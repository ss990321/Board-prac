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

"createdAt": "2022-08-18T11:45:52.611009",
"modifiedAt": "2022-08-18T11:45:52.611009",
