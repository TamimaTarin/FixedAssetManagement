Introduction: 
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

Logging:

*	log4j configured to capture the test execution logs
*	Configuration file is located at //config/log4j.xml
*	Execution log is captured in the //log/Automation_Execution.log

Reporting:
---------------
*  The framework produce index.html report. It resides in the same 'test-output' folder. This reports gives the link to all the different component of the TestNG reports like Groups & Reporter Output. On clicking these will display detailed descriptions of execution.
