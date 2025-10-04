\# Decentralized Supply Chain - Authentication Service



This project is the backend authentication and authorization service for a decentralized supply chain management system, built for a 15-hour hackathon. It handles user registration with role assignments and provides secure, token-based (JWT) authentication for all participants in the supply chain.



---



\## Tech Stack 🛠️

\- \*\*Java 17\*\*

\- \*\*Spring Boot 3\*\*

\- \*\*Spring Security 6\*\*

\- \*\*Spring Data JPA\*\*

\- \*\*JSON Web Tokens (JWT)\*\* for stateless authentication

\- \*\*H2 Database\*\* (In-memory for development)

\- \*\*Maven\*\* for dependency management

\- \*\*Lombok\*\*



---



\## Setup and Run 🚀



1\.  \*\*Clone the repository:\*\*

&nbsp;   ```bash

&nbsp;   git clone <YOUR\_GITHUB\_REPO\_URL.git>

&nbsp;   ```

2\.  \*\*Navigate to the project directory:\*\*

&nbsp;   ```bash

&nbsp;   cd auth-service

&nbsp;   ```

3\.  \*\*Build the project using Maven:\*\*

&nbsp;   ```bash

&nbsp;   mvn clean install

&nbsp;   ```

4\.  \*\*Run the application:\*\*

&nbsp;   Open the project in your IDE and run the `AuthServiceApplication.java` file. The server will start on `http://localhost:8080`.



---



\## API Endpoints 🎮

The following public endpoints are available for user authentication.



\### Register a New User

\* \*\*Endpoint:\*\* `POST /api/auth/register`

\* \*\*Description:\*\* Creates a new user with a specific role.

\* \*\*Request Body:\*\*

&nbsp;   ```json

&nbsp;   {

&nbsp;       "username": "test\_manufacturer",

&nbsp;       "password": "password123",

&nbsp;       "role": "MANUFACTURER"

&nbsp;   }

&nbsp;   ```

\* \*\*Available Roles:\*\* `ADMIN`, `MANUFACTURER`, `RETAILER`, `LOGISTICS`, `CONTRIBUTOR`, `VIEWER`

\* \*\*Success Response:\*\* A JWT token.



\### Login an Existing User

\* \*\*Endpoint:\*\* `POST /api/auth/login`

\* \*\*Description:\*\* Authenticates a user and returns a JWT.

\* \*\*Request Body:\*\*

&nbsp;   ```json

&nbsp;   {

&nbsp;       "username": "test\_manufacturer",

&nbsp;       "password": "password123"

&nbsp;   }

&nbsp;   ```

\* \*\*Success Response:\*\* A JWT token.

