# Java EE Demo
Java EE Web project that demonstrates the use of servlets

This web project (developed in Eclipse IDE for Enterprise Java and Web Developers) enables the users to leave their data and display it. It was deployed locally on an Apache Tomcat instance.

The application's entry point is the index.jsp file. It prompts for user data through an HTML form, which is forwarded upon submission to the ProcessData web servlet (its doPost method, that processes HTTP POST requests). 

The user data is stored in a MySQL database instance, locally. The /JavaEEDemo/src/main/webapp/WEB-INF/lib/mysql-connector-j-9.1.0.jar\ enables the app to connect to the MySQL database and
the doPost method is responsible for creating a new user (in the customers table).

After that, the user is redirected to DisplayData.jsp page and shown their data.

**How to use**

Run MySQL service locally and create a database named test. Then execute the following commands:

```
CREATE TABLE customer(
	 first_name VARCHAR(30) NOT NULL,
	 last_name VARCHAR(30) NOT NULL,
	 phone VARCHAR(20) NOT NULL,
	 cust_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY);
  
CREATE USER 'dbadmin'@'localhost' IDENTIFIED BY 'admin';
 
GRANT ALL PRIVILEGES ON test.customer TO 'dbadmin'@'localhost';
```

Run the Tomcat server (in Eclipse Servers tab) and add the JavaEEDemo resource to it.<br>

The application is now available at localhost:8080/JavaEEDemo/index.jsp<br>

After submitting your data, you will be redirected to the greeting page, which displays the data.
