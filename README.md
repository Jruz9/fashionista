# Fashionista
![Fashion backend ERD](/fashionAppERD.jpg "Fashion backend ERD")
## Description
 Fashionista is a Fashion organizing application that allows users to create outfits and collections in many different ways.
The application has a modern ui that allows users to fashion easier and faster. Users can import their clothes and create outfits and collections, use AI or libraries for custom clothing. 
## Motivation
The motivation for this project actually came when I was deciding what to dress in and forgetting what went well together.
Looking for apps on the web and app store I found that not many made this type of app and most that existed were beyond old.
The solution for me was to create a fashion app that allowed for creating outfits and improve a users fashion taste.
The goal for this application is to allow users to organize their clothing to make outfits they are confident in and increase fashion prowess.
## Quick start
Make sure you have JDK 17+ installed on your computer
- ```Git clone https://github.com/Jruz9/fashionista.git```
- Run command in project folder to make jar(compiles app). ```mvn clean install```
- Click on your jar file and the application will run.
  - _Note that the app will run and no data will appear since no database is connected._
## Usage
- Add clothing
- Make outfits from clothing
- Create collections of outfits
- Create unique clothing from preset AI image generation (pending)
- Display weather for location (pending)
- Create custom recommendation of clothing for each day(concept)
- Create custom outfits based on machine learning. (concept)
- Show fashion news from multiple outlets (pending) 

## Contributing:

### Requirements:
- Backend
  - Java 17+
  - MySql
  - Spring Boot 3.4.0
- FrontEnd
  - React 18.2
  - NPM
  - Material UI 11
- Operating system:
  - Windows
    - can be adapted for each os if there is an issue or using a docker image setup for the application.
### Getting java
-  Download Java development kit from here ```https://adoptium.net/marketplace/?version=17&os=any```
### Setting up Local Mysql Database
- Open mysql gui console and run the schema sql file to create the local database
### Build React frontend
- Inside the frontend folder/src folder, open the fashionista-frontend
and run in terminal : ```npm install``` 
- In the same folder Run ```node app.js```
### Build java backend
- IDE with java developer tools will recognize the pom xml if your in the java backend folder tree and auto build for it. If that does not happen continue forward 👇
- Open the main folder in the project and run build package option in the pom xml file for IntelliJ and similar or ```maven build``` in the command line
  - additional information included here for troubleshooting if needed: https://stackoverflow.com/questions/38315279/how-to-compile-maven-project-from-command-line-with-all-dependencies
### Database structure:
