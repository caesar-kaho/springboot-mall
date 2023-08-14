# Spring Boot Backend Demo 
# 電商平台後端系統

## 開發環境
* IDE：IntelliJ IDEA Ultimate
* 程式語言：Java 11
* Framework：Spring Boot 2.3.7.RELEASE
* Database： MySQL

## REST API
### 商品功能
### 註冊和登入功能
### 訂單功能
---

# 商品功能
## 取得商品列表
`GET / products`

	--Request
	curl -i http://localhost:8080/products

 	--Response
 	HttpStatus 200 OK

## 篩選商品列表
`GET / products?param=value`

	--Request
	curl -i http://localhost:8080/products?category=CAR&search=B
 
 	--Response
 	HttpStatus 200 OK

 ## 取得指定 ID 商品的資訊
 `GET / products/ {productId}`

 	--Request
 	curl -i http://localhost:8080/products/1
  
  	--Response
 	HttpStatus 200 OK

  ## 新増商品
  `POST / products`

  	--Request
  	curl -i http://localhost:8080/products

	RequestBody
 	{
	  "productName":"Honda",
	  "category": "CAR",
	  "imageUrl": "http://test.com",
	  "price":2000,
	  "stock": 10
	}
 
 	--Response
	HttpStatus 201 CREATED

 ## 更新商品

 ### Request

 `PUT / products/{productId}`
 
	--Request
 	curl -i http://localhost:8080/products/1
  	RequestBody
   	{
	  "productName":"Toyota",
	  "category": "CAR",
	  "imageUrl": "http://test.com",
	  "price":2000,
	  "stock": 10
	}
 
 	--Response
 	HttpStatus 200 OK

 ## 刪除商品
 `DELETE/ products/{productId}`

 	--Request
	curl -i http://localhost:8080/products/1

  	--Response
	HttpStatus 204 NO Content

# 註冊功能
`POST/ users/register`

	--Request
 	curl -i http://localhost:8080/users/register
  	RequestBody
	{
	  "email":"test8@gmail.com",
	  "password":"234"
	}
 	-Response
  	HttpStatus 201 Created

# 登入功能
`POST / users/login`

	--Request
 	curl -i http://localhost:8080/users/register
  	RequestBody
	{
	  "email":"test8@gmail.com",
	  "password":"234"
	}
 	--Response
	HttpStatus 200 OK


