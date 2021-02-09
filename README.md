# Test_Project

Why I used Serenity BDD framework and Java?

I was thinking to use Selenium + Java + Test NG in order to write one of the test cases, and use Postman for the other one, 
but I decided to use Serenity BDD framework, because I was able to execute both test cases there.
There is nothing wrong with creating our own framework (it takes you more time), 
but it was useful for me writing both test cases in this framework at this time. 
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
- I added videos for all the test cases instead screenshots.
- Since there was needed to create an account to buy a product, I added one more test case, 
which is for register users in the site using fake data from an imported library, 
the test case uses data from the library in the registration form, so this saves time, and is useful when creating test cases for filling forms.
- About the test case to buy a product in the Ecommerce site, the code was completed and it was working, 
but I updated the software and it broke out at the middle of the test. Please, feel free to review the code.  


Regards,
Juan Carlos Rojas.
