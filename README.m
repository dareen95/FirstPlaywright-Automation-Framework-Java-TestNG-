

🚀 Playwright Java E2E Automation Project
This project implements a professional End-to-End (E2E) automation suite for the SauceDemo website using Playwright Java. It is structured using the Page Object Model (POM) to ensure clean and maintainable code.

🧪 Automated Scenarios
The framework currently automates the complete Purchase Flow (E2ETest.java):

Login: Authenticates with standard_user.

Product Management: Adds the "Sauce Labs Backpack" to the cart.

Checkout: Navigates to the checkout page and fills in user information (First Name, Last Name, Zip Code).

Verification: Finalizes the order and asserts the success message: "Thank you for your order!".

📊 Reporting with Allure
The project is integrated with Allure Report to provide a rich, visual representation of test execution.

How to Generate the Report:
Run the Tests: Execute the following command to run your tests and generate raw results:

Bash
mvn clean test
Serve the Report: Convert the raw results into a visual dashboard and open it in your browser:

Bash
mvn allure:serve
🛠 Project Structure
src/main/java/pages/: Contains page objects (LoginPage, ProductsPage, CheckoutPage).

src/test/java/base/: Contains BaseTest for browser setup and teardown.

src/test/java/tests/: Contains the E2ETest class.

✨ Key Features
Page Object Model (POM): Decouples test logic from UI elements.

Visual Reports: Full integration with Allure for pass/fail tracking.

Screenshots: Automatically attaches screenshots to the report on failure (configured in BaseTest).
