# TestRepo
Test Engineer FTE - Take home assignment

## Table of contents

- Introduction
NOTE: This test reproduces all the escenerios required for the assignment.

This test contains Feature 1 and Feature 2 (which has 2 escenarios)
Feature 1 is divided in 2 Escenarios
Scenario 1: User creates post 
Which from my understanding fills out the New Post page, submits the information and confirms is already there.

Escenario 2: User fails to create post because of missing title
Same as before but user won't fill out the title this time.

Escenario 2: User fails to create post because of missing subtitle
Same as before but user won't fill out the subtitle.

Feature 2: User updates posts (which has 3 escenarios)
Scenario 1: User completely updates a post successfully
Which from my understanding user updates the title, subtitle and body aftewards it submits the form, then it must be redirected to form's detail page and match data filled in.

Scenario 2: User partially updates a post successfully
Scenario 3: User attempts to update another user's post and fails
User must get an  403 unauthorized error

- Requirements
Make sure you have the Selenium Chrome dependencies to run the test and using intelliJ with Java Languange (I will add the same files I used that made my test passed either way)
Also please make sure you are using the same import libraries used for the test
Make sure you have downloaded the following files to run the test
Main.java
chromedriver
pom.xml
Workspace.xml 
I also added other additional files that might needed but so far my test runs using those files
If you cannot run the test using my credentials, login with your account since Escenario 1 specifies you should be already logged but I added my credentials as part of the test in case might be helpful, but if they don't work run the test already logged in by commenting line 21 (username) line 24 (password) and line 27 (login)

- Installation
IntelliJ IDEA 2022.1.2 (Community Edition)
selenium-java-4.6.0
ChromeDriver must match selenium

- FAQ
  Feel free to ping me on slack if you have any questions!
  Or email me to damaris.saavedra@dexcom.com
