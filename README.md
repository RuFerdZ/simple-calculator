# Simple Calculator API 💻

This project implements a simple calculator API using Spring Boot. It provides endpoints for performing basic arithmetic operations, string concatenation, exponentiation, and mathematical functions.

## Endpoints (Documentation) 📝

## Arithmetic Operations ➕➖✖️➗

| Endpoint             | Description                                     | Request Parameters       | Return Type |
|----------------------|-------------------------------------------------|---------------------------|-------------|
| `/calc/add`          | Adds two integers                               | `a` (int), `b` (int)      | `int`       |
| `/calc/subtract`     | Subtracts one integer from another              | `a` (int), `b` (int)      | `int`       |
| `/calc/multiply`     | Multiplies two integers                         | `a` (int), `b` (int)      | `int`       |
| `/calc/divide`       | Divides one integer by another (handles division by zero) | `a` (int), `b` (int) | `int`       |
| `/calc/remainder`    | Calculates the remainder of dividing one integer by another | `a` (int), `b` (int) | `int`       |

**Note:** The `/calc/divide` endpoint gracefully handles division by zero, returning a suitable error message.

## String Manipulation 🔤

| Endpoint             | Description                                     | Request Parameters       | Return Type |
|----------------------|-------------------------------------------------|---------------------------|-------------|
| `/calc/concat`       | Concatenates two strings                        | `a` (String), `b` (String)| `String`    |

## Mathematical Functions 🧮

| Endpoint             | Description                                     | Request Parameters       | Return Type |
|----------------------|-------------------------------------------------|---------------------------|-------------|
| `/calc/power`        | Calculates `a` raised to the power of `b` (handles negative powers) | `a` (double), `b` (double) | `long` |
| `/calc/square`       | Calculates the square of a number              | `a` (double)              | `long` |
| `/calc/sqrt`         | Calculates the square root of a number          | `a` (double)              | `double` |
| `/calc/log`          | Calculates the natural logarithm (base e) of a number | `a` (double)         | `double` |

**Note:** The `/calc/power` endpoint can handle negative powers.

**Note:**
- The `/calc/divide` endpoint handles division by zero gracefully, returning a suitable error message.
- The `/calc/power` endpoint can handle negative powers.

## Environments 🌐

This project supports three environments: development (dev), staging, and production. The base URL for each environment will vary depending on your deployment setup. You'll need to replace `[BASE_URL]` in the links below with the appropriate values.

## Postman Collection 📦

A Postman collection for testing these endpoints across all environments is available at [link to Postman collection] (link not provided for security reasons). However, you can easily create your own collection using the information provided in the "Endpoints (Documentation)" table.

## Environment Links 🔗

- Development: `[BASE_URL]/calc`
- Staging: `[BASE_URL]/calc`
- Production: `[BASE_URL]/calc`

## Building and Running 🏃‍♂️

1. Clone this repository.
2. Ensure you have Gradle installed.
3. Run `gradle build` to build the project.
4. Start the application using your preferred method (e.g., Spring Boot application runner).

## Running with Docker 🐳

To run the Spring Boot Calculator API using Docker, follow these steps:

1. Install Docker on your machine by following the instructions on the official Docker website: [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/)
2. Build the Docker image using the provided Dockerfile:



        docker build -t calculator-api .
    
3. Once the image is built, you can run the container:

        docker run -p 8080:8080 calculator-api

The API will be accessible at `http://localhost:8080`.