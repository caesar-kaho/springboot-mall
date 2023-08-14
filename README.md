# Spring Boot Backend Demo 
# 電商平台後端系統

## 開發環境
* IDE：IntelliJ IDEA Ultimate
* 程式語言：Java 11
* Framework：Spring Boot 2.3.7.RELEASE
* Database： MySQL

## REST API
### 商品功能
* 商品的查詢、新増、更新、刪除功能
* 可按照 category 和關鍵字篩選商品列表
* 預設商品列表以最新至最舊排序
### 註冊和登入功能
* 會員註冊和會員登入
* 電郵是否重複註冊驗證
* 密碼用 MD5 Hash 記錄到資料庫
### 訂單功能
* 新増和查詢會員訂單
* 自動更新商品庫存
* 驗證庫存是否足夠應付訂單
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

# 註冊和登入功能

## 會員註冊

`POST/ users/register`

	--Request
 	curl -i http://localhost:8080/users/register
  	RequestBody
	{
	  "email":"test@gmail.com",
	  "password":"123"
	}
 	-Response
  	HttpStatus 201 Created

## 會員登入
`POST / users/login`

	--Request
 	curl -i http://localhost:8080/users/login
  	RequestBody
	{
	  "email":"test@gmail.com",
	  "password":"123"
	}
 	--Response
	HttpStatus 200 OK

 # 訂單功能

 ## 取得 userId 的訂單資訊
 `GET / users/{userId}/orders`

 	--Request
  	curl -i http://localhost:8080/users/1/orders

    	--Response
     	HttpStatus 200 OK

## 新増 userId 的訂單資訊
`POST / users/{userId}/orders`

	--Request
 	curl -i http://localhost:8080/users/1/orders
  	RequestBody
	{
	  "buyItemList":[
	    {
	      "productId":1,
	      "quantity":1
	    },
	    {
	      "productId":10,
	      "quantity":1
	    }
	  ]
	}

 	--Response
  	Httpstatus 201 Created


