
# FullStack Automation Test FinalProject

## This project created to demonstrate my knowledge and skills in Automation Testing.
 
![alt text](https://miro.medium.com/max/624/1*YI4Vk_zfRg-sbjw8pgg9Eg.png "Logo Title Text 1")




<a href="https://www.youtube.com/watch?v=8d_0tl1fBVY
" target="_blank">Short Video Demonstration</a>    

### About
 
The project demonstrates a smart automation infrastructure. It is built in hierarchy order of modules. The modules contain number of classes with methods. There are main/common/helpers/actions/page object modules. In this way, the tests can be created in very simple way with a minimum lines of code. Also the infrastructure allows to work with different kinds of applications. Big advantage of the infrastructure is that it can be easy maintained!
[https://i0.wp.com/q-automations.com/wp-content/uploads/2019/05/jenkinsseleniummaventest.png?resize=890%2C337&ssl=1
](https://miro.medium.com/max/624/1*YI4Vk_zfRg-sbjw8pgg9Eg.png)
###  Project Overview
The project is an example of infrastructure for automation testing of different kinds of applications:

* Web based application
* Mobile application
* Web API
* Electron application
* Desktop application

###  Infrastructure project includes using of:
* Page Object Design Pattern
•* Project Layers(Extensions/Work Flows/Test Cases...)
* Support of Different Clients/Browsers
* Failure Mechanism
* Common Functionality
* External Files Support
* Reporting System (including screenshots)
* Visual Testing
* DB support
*CI support

###  List of applications were used in this project:
* Grafana webpage - Web based application
* Mortgage calculator - Mobile application
* Grafana API - Web API
* Electron application
* Windows calculator - Desktop application

###  Tools & Frameworks used in the project:
* TestNG - Testing Framework
* Listeners - interface used to generate logs and customize the TestNG reports
* MySQL Free Online DB - used for login to Grafana web page
* [Jenkins](https://www.jenkins.io/) - for tests execution
* REST Assured - for API testing
* [Allure](https://qameta.io/allure-report/) Reports - as the main reporting system

###  Tests Execution:
Each of the applications has a few tests for demonstration purpose. These tests can be developed in a very simple way, due to a lot of work with the infrastructure. 
[Sanity Tests](https://github.com/ShlomiTagenya/Automation-Project/tree/master/src/test/java/sanity)

###  Known Issues:
Sometimes can be conflicts with some dependencies the applications are using. Hence, the project is for DEMO purpose only. In production it should be divided into several projects
