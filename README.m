# 🚀 Playwright Java E2E Automation Project

This project implements a professional **End-to-End (E2E)** automation suite for the [SauceDemo](https://www.saucedemo.com/) website using **Playwright Java**. The framework follows the **Page Object Model (POM)** for maximum maintainability.

---

## 🧪 Automated Scenarios
The framework currently automates the complete **Purchase Flow** (located in `E2ETest.java`):

* **Step 1: Login** ➔ Authenticates using `standard_user` credentials.
* **Step 2: Product Management** ➔ Selects the "Sauce Labs Backpack" and adds it to the cart.
* **Step 3: Checkout** ➔ Navigates to the checkout page and fills in user information.
* **Step 4: Verification** ➔ Finalizes the order and asserts the success message.

---

## 📊 Reporting with Allure
The project is fully integrated with **Allure Report** for a rich, interactive dashboard.

### **How to Run & View Reports:**

1.  **Run Tests:**
    ```bash
    mvn clean test
    ```

2.  **Generate Report:**
    ```bash
    mvn allure:serve
    ```

---

## 🛠 Project Structure
| Component | Description |
| :--- | :--- |
| **Pages** | Encapsulated UI locators and actions. |
| **Base** | Browser initialization and configuration. |
| **Tests** | Functional end-to-end test scripts. |

---

## ✨ Key Features
* **POM Design**: Clean separation between test logic and UI elements.
* **Auto-Screenshots**: Automatically captured and attached to reports on failure.
* **Ready-to-Run**: Fully configured with Maven and Allure.

---

## ⚙️ Prerequisites
* **Java JDK 17+**
* **Maven** (Added to System Path)
* **Allure CLI** (Added to System Path)
