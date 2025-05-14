# TestNGWebAutomationFramework-

**TestNG Web Automation Framework** is a robust, reusable, and scalable framework built for automating web applications using the **TestNG** testing framework. The project is designed to provide a structure that allows for easy maintenance and scalability in automated testing processes, especially for web-based applications.

This framework supports the usage of **Selenium WebDriver** for browser automation and **Page Object Model (POM)** for structuring the test scripts efficiently.

## Key Features

- **TestNG Integration**: Leverage the power of the TestNG framework for test execution and parallel test running.
- **Page Object Model (POM)**: Implements the POM design pattern to enhance reusability and maintainability.
- **Cross-Browser Support**: Easily configure WebDriver to run tests on different browsers (Chrome, Firefox, etc.).

## Project Structure

- **src/main/java**: Contains Java classes for core functionality like WebDriver initialization, utilities, and test data management.
- **src/test/java**: Contains test scripts following the TestNG framework, using POM and data-driven approaches.

## Prerequisites

Make sure you have the following installed:

- **Java** (version 8 or higher)
- **Maven** (for dependency management)
- **TestNG** (test framework)
- **Selenium WebDriver** (for browser automation)

## Setup Instructions:

1. **Clone the Repository**:
```bash
git clone https://github.com/your-username/TestNGWebAutomationFramework.git

2. **Navigate to the Project Directory**:
cd TestNGWebAutomationFramework

3. **Install Dependencies Using Maven**:
mvn install

4. **Run Tests**:
To run the tests, use the following Maven command:
mvn test
