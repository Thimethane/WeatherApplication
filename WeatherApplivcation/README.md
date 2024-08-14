README.md
# Weather Application

## Overview

The Weather Application is a JavaFX-based application that provides weather information and forecasts. It integrates with a weather API to fetch and display data in a user-friendly interface.

## Features

- Display current weather conditions
- Show a 7-day weather forecast
- Convert temperatures between Celsius and Fahrenheit
- Dynamic background based on weather conditions
- Error handling and history tracking

## Setup Instructions

### Prerequisites

- JDK 22
- Maven
- (Optional) NetBeans IDE

### Getting Started

1. **Clone the Repository**

    ```bash
    git clone https://github.com/yourusername/WeatherApplication.git
    cd WeatherApplication
    ```

2. **Configure Maven**

   Update your `pom.xml` file to ensure it includes the required dependencies and plugins.

3. **Build the Project**

    ```bash
    mvn clean install
    mvn javafx:jlink
    ```

4. **Run the Application**

    ```bash
    mvn javafx:run
    ```

## Usage

Launch the application to view current weather, forecasts, and convert temperature units. The background of the application changes based on the current weather conditions.

## Troubleshooting

- Ensure JavaFX components are correctly included in the `pom.xml`.
- Use `mvn clean install -U` to force update Maven dependencies.
- For detailed debug information, use `mvn -X javafx:run`.

## License

This project is licensed under the [MIT License](LICENSE).
