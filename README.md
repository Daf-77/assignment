# Assignment

To complete the assignment, I used BDD framework. 

Testing tools: Selenium WebDriver, Cucumber, Junit. 

Programming language: Java.

Structure: 

Since it's BDD based framework, it has two layers (business and implementation). 

You can find feature file under resources/features package. To make the code dynamic test case was parameterized.

Configuration.properties file was used to externalize data to make the code more maintainable.

Pages package: 
I implemented POM design pattern to create and store objects of web elements in Pages classes. You can see that some web elements are located and objects are created using @FindBy annotation and some are located within regular methods. I used regular method to be able to make those values dynamic so I could achieve parameterization by placing values from feature file (which @FindBy annotation doesn’t allow to do).

Runners package: 
I setup my CukesRunner and FailedTestRunner in this package. I generate methods from feature files run my tests, generate reports with help of this class. All the failed tests’ info will automatically be stored in rerun.txt so I can run them separately in a FailedTestRunner. 

Step-def package:
Contains step definition classes (technical level) where all the test cases are automated. It also has a Hook class for adding certain steps, which should be executed before and after running test scripts.

Utils:
This package has ConfigurationReader class, which reads the data from configuration.properties and makes it accessible to use in automated test scripts. 

There is also Driver class, where I setup a WebDriver for multiple browsers. To switch the browser just change the browser name in configuration.properties file.

