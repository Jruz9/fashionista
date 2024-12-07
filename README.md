# Fashionista

 Fashionista is a wardrobe organization 
 application that allows users to put clothes
into **_Looks_** from the clothes they want. In
addition, from your looks you can create _**Collections**_
of looks you can customize for any occasion you want. 

# Requirements:
- Backend
  - Java 17
  - Postgres 14+
  - Spring Boot 3.4.0
- FrontEnd
  - React 18.2
  - NPM
  - Material UI 
# Setup:
## Local Mysql Database
- Open mysql gui console and run the schema sql file
to create the local database

## Build React frontend
- Inside the frontend folder, open the fashionista-frontend
and npm install using the package.json
- Run `node app.js`

## Build java backend
- IDE with java developer tools will recognize the pom xml if your in the java backend folder tree and auto build for it. If that does not happen continue forward 👇
- Open the main folder in the project and run build package option in the pom xml file for Intelj and similar or `maven build` in the command line 


# Database structure:
![Fashion backend ERD](/fashionAppERD.jpg "Fashion backend ERD")