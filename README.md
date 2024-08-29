# Selenium Automation Project (Page Object Model)
![WhatsApp Image 2024-07-21 at 21 07 46_67dd7f30](https://github.com/user-attachments/assets/e907bca7-591e-4752-9abd-aece85bf620c)


# Objective:
The objective of this assignment is to build a Selenium script that automates the process of searching for a product, adding it to the cart, and completing the checkout process on the website Tutorials Ninja.
# Code screenshot
![image](https://github.com/user-attachments/assets/126ee40e-346a-4b10-9ca9-d796bb43c2c8)




## Table of Contents
- [Introduction](#introduction)
- [Project Structure](#project-structure)
- [Features](#features)
- [Tools & Technologies](#tools--technologies)
- [Installation](#installation)
- [Usage](#usage)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Introduction
This project demonstrates the use of **Selenium** with the **Page Object Model (POM)** design pattern to automate web application testing. The script automates the workflow of searching for a product, adding it to the cart, and completing the checkout process on the **Tutorials Ninja** website.

## Project Structure
The project follows the Page Object Model structure for better maintainability and scalability.

```
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- pages (Page Object classes)
|   |   |   |-- utils (Utilities and helper functions)
|   |-- test
|   |   |-- java
|   |   |   |-- tests (Test classes)
|-- resources (Test data, configuration files)
|-- pom.xml (Maven dependencies)
```

## Features
- Automates end-to-end product search, cart addition, and checkout process.
- Implements Page Object Model for better code management.
- Modular and reusable code for easier maintenance.
- Parameterized tests with support for different browsers (Chrome, Firefox, etc.).

## Tools & Technologies
- **Selenium WebDriver**
- **Java**
- **JUnit/TestNG**
- **Maven** (for dependency management)
- **Page Object Model (POM)**
- **ChromeDriver/GeckoDriver** (for browser automation)
- **Eclipse/IntelliJ IDEA** (for development)

## Installation

### Prerequisites
- Java 11 or higher
- Maven
- Selenium WebDriver
- IDE (Eclipse/IntelliJ IDEA)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/selenium-pom-project.git
   ```
2. Navigate to the project directory:
   ```bash
   cd selenium-pom-project
   ```
3. Install dependencies using Maven:
   ```bash
   mvn clean install
   ```

4. Download and set up **ChromeDriver** or **GeckoDriver**:
   - For ChromeDriver: [ChromeDriver download](https://sites.google.com/a/chromium.org/chromedriver/)
   - For GeckoDriver: [GeckoDriver download](https://github.com/mozilla/geckodriver/releases)

5. Configure browser drivers in the project setup.

## Usage

### Running Tests
To run the tests:
```bash
mvn test
```

### Running Tests on Different Browsers
You can configure the browser in the `config.properties` file to run tests on different browsers:
```properties
browser=chrome
```
Or, pass the browser as a system property:
```bash
mvn test -Dbrowser=firefox
```

## Running Tests
- Tests are executed using **JUnit/TestNG** frameworks.
- After execution, test reports are generated and stored in the `/target` folder.

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests to improve the project.

