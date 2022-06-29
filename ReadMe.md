# Product Service With SpringBoot Microservices

    1- Product Service : Ürünlerin oluşturulup görüntülendiği bir ürün kataloğu görevi gören servis. 
    2- Order Service : Ürünlerin sipariş edilebildiği servis.
    3- Inventory Service : Ürünlerin stokta olup olmadığını kontrol eden servis. 
    4- Notification Service : Sipariş verildikten sonra bildirim gönderebilir (e-mail gibi)

    * Order Service, Inventory Service ve Notification Service birbiriyle etkileşimde olacaklardır.

   <hr> <br>

 ## Projenin Diagramı : 
    
   ![sttt](https://user-images.githubusercontent.com/96151920/176319634-fc40477c-f40e-4304-bb74-555b03d5ed96.JPG)
    
    * Product Service (MongoDb)
    * Order Service (PostgreSQL)
    * Order Service ile Notification Service arasındaki ilişli Asenkron olacak. (RabbitMQ)
    * Order Service ile Inverntory Service arasındaki ilişli Senkronize olacak. (PostgreSQL)

<hr> <br>

* Product Katmanlı Mimari tabanları oluşturuldu. 
  * Model -> Product
  * Dao -> ProductRepository 
  * Dto -> ProductRequest
  * Controller -> ProductController
  * Service -> ProductService 

<hr><br>

Product PostMapping ve GetMapping endpointler oluşturulduktan sonra Docker aracılığı ile MongoDB Compass ayağa kaldırılıp database oluşturuldu ve Postman ile GET ve POST istekleri test edildi. <br>

![6](https://user-images.githubusercontent.com/96151920/176447274-a231df89-e064-455f-a986-1855a3cbd8ef.JPG)


![5](https://user-images.githubusercontent.com/96151920/176447320-ad50b437-8ac5-4600-93aa-dca5fb9665e7.JPG)


POST methodu ile gönderildiğinde console kısmımızda "Bu id" deki ürün kaydedildi mesajını aldığımız görünmektedir.

![3](https://user-images.githubusercontent.com/96151920/176445459-55fead6c-94a0-44f0-a183-b166ca5405e2.JPG)


GET methodu ile gönderdiğimiz ürüne id'si ile birlikte ulaşabiliyoruz. 

![4](https://user-images.githubusercontent.com/96151920/176445849-e5c56702-5e6c-4de9-bbc5-91c432f5d518.JPG)


<br>

    Product bölümümüz için testlerimizi yapabilmek adına pom.xml kısmına Testcontainers ve junit ekleyip,
    test bölümümüzde Product için Integration test yazıldı.



## Teknolojiler

* Java
* Java SpringBoot
* Postman
* MongoDb
* Docker
* Testcontainers
* Spring Security 
