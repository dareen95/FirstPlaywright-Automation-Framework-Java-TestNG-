# 🚀 Playwright Java E2E Automation Project

This project implements a professional **End-to-End (E2E)** automation suite for the [SauceDemo](https://www.saucedemo.com/) website using **Playwright Java**. The framework is built using the **Page Object Model (POM)** design pattern to ensure clean, maintainable, and scalable code.

---

## 🧪 Automated Scenarios
The framework currently automates the complete **Purchase Flow** (located in `E2ETest.java`):

1.  **Login**: Authenticates using `standard_user` credentials.
2.  **Product Management**: Selects the "Sauce Labs Backpack" and adds it to the shopping cart.
3.  **Checkout**: Navigates to the checkout page and populates user information (First Name, Last Name, and Zip Code).
4.  **Verification**: Finalizes the order and asserts the presence of the success message: `"Thank you for your order!"`.

---

## 📊 Reporting with Allure
The project is fully integrated with **Allure Report** to provide a rich, interactive, and visual representation of test execution.



### **How to Generate the Report:**

1.  **Run the Tests**:
    Execute the following command to run your tests and generate raw results in the `allure-results` folder:
    ```bash
    mvn clean test
    ```

2.  **Serve the Report**:
    Convert the raw results into a visual dashboard and open it in your default browser:
    ```bash
    mvn allure:serve
    ```

---

## 🛠 Project Structure
The project follows a standard Maven structure:

* **`src/main/java/pages/`**: Contains Page Objects (`LoginPage`, `ProductsPage`, `CheckoutPage`) which decouple UI locators from test logic.
* **`src/test/java/base/`**: Contains the `BaseTest` class for browser initialization and teardown.
* **`src/test/java/tests/`**: Contains the functional test classes like `E2ETest`.

---

## ✨ Key Features
* **Page Object Model (POM)**: Enhances code readability and reduces maintenance effort.
* **Visual Reports**: Seamless integration with Allure for detailed pass/fail tracking.
* **Screenshots on Failure**: Configured in `BaseTest` to automatically capture and attach full-page screenshots to the Allure report if a test fails.
* **Maven Lifecycle**: Uses Maven for dependency management and test execution.

---

## ⚙️ Prerequisites
Before running the project, ensure you have the following installed:
* **Java JDK 17+**
* **Apache Maven** (Added to System Path)
* **Allure Command Line Tool** (Added to System Path)
