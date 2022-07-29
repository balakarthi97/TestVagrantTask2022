
# Data validation between Wikipedia and IMDB
In this project, IMDB data is compared with Wikipedia data to validate the time and region of specific movies.

## Build With
- Selenium
- Java
- Cucumber
- Junit
- Maven
- POM

## Usage
You can check any movie with two websites by changing data in the properties file without affecting or changing the test cases.

## Way to Install and Run the Project
>Clone project using git repository url.
>Import file on vitual machine(Eg., Eclipse).
>From the Test Runner file you can directly execute the program. 

## Project Description
src/test/java > 3 packages. 
Page repository - contains all the web elements.
Resources - common helper class with java and selenium codes. 
Stepdefinition - Test Runner, Hooks, and Steps file. 

src/test/resouces > 1 Package & 1 File. 
Feature file - Test case scenario from end user point of view. 
Properties file - contains url and name. 

## End Notes
In order to verify the details and compare the data, Hard Assertions were used for strict validation. In the absence of matching data, the assertion will fail. Eclipse will provide a console report that we can use to validate.

In this program, one assert will fail when you attempt to run the program in this case. Actual movie name on IMDB and the actual movie name on Wikipedia are not equal.