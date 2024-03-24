# Author Farid Mehdiyev CRUD Application

For starting crud application, first of all we have to install java jdk (we can check it with java -version in our terminal) - then we have to install and configure maven 

Second step is generating dependencies via spring initialzr. I have adedd Spring Web, Spring Data JPA, and Mysql database driver, thymeleaf and validation.


First of all, starting our project , our database should work correctly and i configured my database with the phpadmin (mysql)


I have created entity model that is called Product then configured it with annotation as a @Entitiy.

Then created repository (you can see from the commits) and service layer

For running project we have to use

mvn spring-boot:run


Link of the video is - https://youtu.be/zeCkdgDHBH0
