# Recruitment_task
Implementation of automation test.
<br />
Test steps (frontend option)
<br />
1 Log into the Zendesk sell web application (using the account).
<br />
2 Create a new Lead.
<br />
3 Check that the Lead status visible on the details page is set to "New".
<br />
4 Go into Settings -> Leads -> Lead statuses and change the name of the "New" status to some different name.

Requirements to run the test:
<br />
java version "1.8.0_201"
<br />
Apache Maven 3.6.0
<br />
Used libs.
<br />
org.seleniumhq.selenium
<br />
org.testng
<br />
org.apache.logging.log4j
<br />
org.apache.maven.plugins
<br />

In package driver.manager.DriverManager class please set the right path to Chrome driver.

Solution of recruiting task