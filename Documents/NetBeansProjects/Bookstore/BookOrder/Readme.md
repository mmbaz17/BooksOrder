# Read Me First
Steps to build and deploy the application
Run the application using XMLParser class,  that will store xml values to H2 database.

Deploying:
Right click the class called booksearch.java and select run

The application will be built and deployed in embedded Tomcat container,

While running, Open Postman Appln, 
a) To Create a record
select the Method as Post, and insert URL as http://localhost:8083/books, In Body Select Content-type as JSON

Type 
{
"bookid":"47",
"category":"wedding",
"title":"boom",
"year":"2004",
"price":"12",
"author":"R. mads"
}


Click Send  (200 indicates status Success)


To view The information stored in H2 Database
Step 1- The application should be running 
Step 2- Type http://localhost:8083/h2-console/login.jsp?jsessionid=2ce5a92b314995a0409d1950a7b585d8 in browser
Step 3- database url should be left as:   jdbc:h2:mem:books_data , driver is: org.h2.Driver username is: sa , password is: 
Step 4-Clicck connect
Step 5- You should see a node with your database url, expand the node and see your created Table by hibernate framework.
Also you should verify the requests made via postman


b) To search by book id or Author

Select Method as Get, and insert URL as http://localhost:8083/book/{Specify Id}, In Body, Content type as JSON

c)  To Update

Select Method as Put, and insert URL as http://localhost:8083/book/{SpecifyId}, In Body, Content type as JSON

Use available Id like this below and Change any field 
{
"bookid":"47",
"category":"wedding",
"title":"boom",
"year":"2004",
"price":"12",
"author":"R. mads"
}

Click Send

d) To Delete
Select Method as Delete, and insert URL as http://localhost:8083/book/{47}, In Body, Content type as JSON

Click Send

