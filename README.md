# com.piton.com
<hr/>

In this project, where we tested the [EventManagement](https://e2e-assessment.piton.com.tr) site, we worked with the [Cucumber]() framework. POM (page object model) design model was used in accordance with the OOP (object oriented programming) concept. Test steps were done from the web using Selenium.

## Project introduction

- [FrameWork](#FrameWorks-contents)
- [Test Steps](#Test-Steps)
- [kütüphane](#kütüphane)





 <hr/>

## FrameWorks contents

![Screenshot_1](https://user-images.githubusercontent.com/101714396/210014860-c4423825-3d86-406c-a385-8bf4815d9def.jpg)

<br/>

### [pages package](https://github.com/clgnmmr/com.A101.FinalCase/blob/master/com.HepsiBurada.TestNG/src/test/java/pages/HepsiBuradaPage.java) <br/>
In this file, we have classes where we keep the locates of the elements that we will test the site we have.
To get the locate we want, we create a constructar with the name of the clas we created, and call the <b>PageFactory </b> clade into it and call the driver we created and use the <b> this </b> key, which we make clear. We can create our locates with the <b> FindBy </b> notation so that we can call our locates. We can create methods that can perform the functions we want in it.

![Screenshot_2](https://user-images.githubusercontent.com/101714396/210014882-2e47f585-8863-4795-95a4-0596e97bea76.jpg)

### [stepdefinitions package](https://github.com/clgnmmr/com.A101.FinalCase/blob/master/com.HepsiBurada.TestNG/src/test/java/tests/HepsiBuradaTest.java) <br/>
Here, on the other hand, we have classes in which we have methods that enable all of our codes to work. We write the codes of the steps we want to do by calling our locations, our driver here.
We have methods written in the <b> gherking</b> language for the tests to run.

![Screenshot_3](https://user-images.githubusercontent.com/101714396/210014915-a8135592-0d7d-4d8d-8d7c-f616594b80d7.jpg)


### [utilities package](https://github.com/clgnmmr/com.A101.FinalCase/tree/master/com.HepsiBurada.TestNG/src/test/java/utilities) <br/>
In this file of our helper class, we have classes and methods that we constantly need. We have classes and methods that will make our project more understandable.
<b> Driver.class </b> , <b> ConfigReader.class</b> , <b> ReusableMehod.class </b> etc. We have files.

![Screenshot_4](https://user-images.githubusercontent.com/101714396/210014939-8ae75ac3-bf74-4488-8d5d-015977534b18.jpg)


 [resources package](https://github.com/clgnmmr/com.A101.FinalCase/tree/master/com.HepsiBurada.TestNG/src/test/resources) <br/>
 Our file contains the <b> log file </b>, which contains the data (html, txt, etc.) we have received for the Log. <b> report file </b> for reports, <b> screenshot file </b> where the direct screenshot of that locate when error is received
 and there is the <b>testdata file </b> where the information to be asserted is constantly added.

![Screenshot_5](https://user-images.githubusercontent.com/101714396/210014946-4764db60-5e32-478a-bdc3-fe6a4bec720f.jpg)


###  [configuration.properties](https://github.com/clgnmmr/com.A101.FinalCase/blob/master/com.HepsiBurada.TestNG/configuration.properties)
We have variables that we use constantly in our properties file. To use these data, the properties file is created as <b> Key = value </b>. In order to call other classes, the properties file is extracted from the utilities file.
By calling the <b> ConfigReader </b> class, we can call the information in this file to the places we want, by the method number in it.

![Screenshot_12](https://user-images.githubusercontent.com/101714396/200138192-5f420192-03e9-4795-8d36-3d124b5ef725.jpg)

### [pom.xml](https://github.com/clgnmmr/com.A101.FinalCase/blob/master/com.HepsiBurada.TestNG/pom.xml)

In this file, which contains the information of all our works and codes, we can place the library of the codes we want to use in the <b> dependencies </b> tag and keep the updated information constantly.
Thanks to this place, we can provide access to all codes.

![Screenshot_6](https://user-images.githubusercontent.com/101714396/210014975-97343461-a6a7-4d42-bf40-5fb0de0af6c3.jpg)

### [runner package](https://github.com/clgnmmr/com.A101.FinalCase/blob/master/com.HepsiBurada.TestNG/src/hepsiburadaTest.xml)
This file contains the Cucumber framework annotations.
Any tests or feature files we want can be run from here.

<hr/>

## Test Steps

<br/>

```
1. Login Module
    Test Case 1 - User should see login form if not authenticated. Login Form
                  should contain username password and login button
    Test Case 2 – User should see validation errors if click the login button without
                  fill the login form
    Test Case 3 – User should navigate to the dashboard and see welcome
                  message if authenticate successfully


```


<br/>

```
2. Event Module
    Test Case 1 - User should view create event form if click the Create Event
                  button on dashboard
    Test Case 2 – User should view validation errors if click the Create Event button
                  without fill the event form
    Test Case 3 – User should be able to add new participant when click the Add
                  Participant button
    Test Case 4 – User should view error message if removes all participants
    Test Case 5 – User should be able to create new event if fills all required fields
                  and redirect to dashboard page with create successful message
    Test Case 6 – User should be able to edit event. When user click the edit
                   button all event fields must be filled according to editing event
    Test Case 7 – User should be able to update event if required fields filled and
                  redirect to dashboard page with update successful message
```

<br/>

```
3. Dashboard Module
    Test Case 1 – User should view dashboard if authenticated
    Test Case 2 – User should redirect to login page if not authenticated
    Test Case 3 – User should view list of events if any event created otherwise
                  user should view notification message states no registered event found
    Test Case 4 – User should be able navigate edit event when click the edit
                  event button
    Test Case 5 – User should be able to delete event when click the delete
                  button
    Test Case 6 – User should be able to view event participants

```
<hr/>


## kütüphane <br/>

- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- [cucumber-java](https://mvnrepository.com/artifact/org.testng/testng)
- [cucumber-junit](https://mvnrepository.com/artifact/com.aventstack/extentreports)
- [faker](https://mvnrepository.com/artifact/com.aventstack/extentreports)
- [slf4j-api](https://mvnrepository.com/artifact/org.slf4j/slf4j-api)
- [slf4j-reload4j](https://mvnrepository.com/artifact/org.slf4j/slf4j-reload4j)

<br/>

![Screenshot_7](https://user-images.githubusercontent.com/101714396/210014994-d1a08466-2e85-4b61-ad53-79075eb5dc10.jpg)


<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="git" width="100" height="40"/> </a>

<hr/>
