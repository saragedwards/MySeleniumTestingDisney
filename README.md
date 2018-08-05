# MySeleniumTestingDisney

Basic Selenium test using the Disney.com website 
- Adds tickets to the cart and validates that the cart contents are correct

Features:  
* Utilizes Page Object Model
* Utilizes TestNG annotations and reporting
* Supports ability to select different numbers of days of tickets, ticket types, and number of Adult and Child tickets by 
  specifying these values in the test cases and passing them to the methods in the page objects. In some cases, page objects loop through clicking button incrementers multiple times based on the number passed in from the test case.
* Supports code reuse by using inheritance of base class which instantiates the driver object
* Utilizes various locator methods, i.e. ID, Name, XPath (including parent locators)
* Utilizes hard assertions in the test case to validate end results
