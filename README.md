# week03_Spring
<hr>

## Use Case

![유스케이스](https://user-images.githubusercontent.com/110081578/185285663-a6598d7e-5996-49d5-a32c-df1701dc3148.JPG)
<hr>

## API 명세서

Method |  URL | Request | Response
---|---|---|---|
GET | /api/posts | 
GET | /api/posts{id} |
POST | /api/posts | {“title”: “title”, “username”: “username”,
“contents”: “contents”,
“password”: “password”
} | 
POST | /api/posts{id} | {
“password”: “password”
} | 
PUT | /api/posts{id} | {
"title": "title2",
" username": " username2",
"content": "content2",
"password": "password2"
} |
DELETE | /api/posts{id} |
