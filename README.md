Introduction: [![Build Status](https://travis-ci.org/shirishk/Java-Selenium-TestNG-Automation-Framework.svg?branch=master)](https://travis-ci.org/shirishk/Java-Selenium-TestNG-Automation-Framework) [![Join the chat at https://gitter.im/shirishk/Java-Selenium-TestNG-Automation-Framework](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/shirishk/Java-Selenium-TestNG-Automation-Framework?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
---------------


Java, Selenium Web Driver, and TestNG were used to construct this test automation framework. This is applicable to many web-based applications.
With this strategy, the goal is to create several application-independent, reusable keyword components that may be utilized immediately for another web application without requiring any further work. 

Prerequisites:
---------------
*	Java jdk-11
*	Apache Maven 3 or higher
*	Please refer for any help in Maven. 
* 	http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
* 	http://www.tutorialspoint.com/maven/maven_environment_setup.htm

<p><a href="https://github.com/shirishk/Java-Selenium-TestNG-Automation-Framework/wiki/Logging"><h2>Logging:</h2></a></p>

*	log4j configured to capture the test execution logs
*	Configuration file is located at //config/log4j.xml
*	Execution log is captured in the //log/Automation_Execution.log

Reporting:
---------------
*  The framework produce index.html report. It resides in the same 'test-output' folder. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output. On clicking these will display detailed descriptions of execution.
