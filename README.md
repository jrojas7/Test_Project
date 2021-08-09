# Test Project

I would like to share with you a little bit of Serenity BDD which is a course that I am taking now.
I created 3 test cases, 2 for an Ecommerce site and one for API testing. All of them created only on Serenity BDD.
The test cases are the following:
1. Verify that it is possible to create a new account in the http://automationpractice.com/index.php site.
2. Verify that it is possible to buy a product in the http://automationpractice.com/index.php site.
3. Verify that the email michael.lawson@reqres.in is in page 2 in https://reqres.in/ using GET https://reqres.in/api/users?page=2.

There is nothing wrong with creating our own framework, an example of that could be Java + Selenium + Test NG (it takes you more time), and use Postman for the API test case, 
but writing them on Serenity framework reduce the amount of work, you just need to add the dependencies needed in the POM file.

As a framework, Serenity give us the following advantages:
- UI testing with Selenium.
- API testing with Rest Assure
- Mobile testing for Appium.
- Supports different types of frameworks like: Cucumber, Junit, JBehave
- Supports Parallel execution
- Tagging tests
- Data driven testing
- Integration with Git, Jenkins
- Allows Maven and Gradle
- Support for running tests on Browser Stack and Sauce Labs

About the test cases:
- I added videos for all the test cases (3 TCs) in GitHub.
- The test case for register users in the site, is using fake data from an imported library added as a dependency in the POM file, 
it uses data from the library in the registration form, so this saves time, and is useful when creating test cases for filling forms.
- About the test case to buy a product in the Ecommerce site, the code was completed and it was working, 
but I updated the software and it broke out at the middle of the test. Please, feel free to review the code. 
- I am using Page Object Model and Screenplay Pattern.


Regards,
Juan Carlos Rojas.
