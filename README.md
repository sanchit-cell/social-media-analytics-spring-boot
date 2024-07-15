

```markdown
# Social Media Analytics Dashboard Backend

This project is a backend service for a Social Media Analytics Dashboard. It is built using Spring Boot and provides APIs to manage users, posts, ads, and promotions. The backend uses an in-memory H2 database to store and retrieve data.

## Prerequisites

- Java 17
- Maven
- Docker (for containerization)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/yourusername/social-media-analytics-backend.git
cd social-media-analytics-backend
```

### Build and Run the Application

#### Using Maven

To build and run the application locally using Maven:

```bash
mvn clean install
mvn spring-boot:run
```

The application will start and run on `http://localhost:8080`.

#### Using Docker

To build and run the application using Docker:

1. Build the Docker image:

```bash
docker build -t social_media_analytics .
```

2. Run the Docker container:

```bash
docker run -p 8080:8080 social_media_analytics
```

The application will be accessible at `http://localhost:8080`.

## API Endpoints

### Users

- `GET /users` - Retrieve all users
- `GET /users/{id}` - Retrieve a user by ID

### Posts

- `GET /posts` - Retrieve all posts
- `GET /posts/user/{userId}` - Retrieve all posts by user ID

### Ads

- `GET /ads` - Retrieve all ads
- `GET /ads/user/{userId}` - Retrieve all ads by user ID

### Promotions

- `GET /promotions` - Retrieve all promotions
- `GET /promotions/user/{userId}` - Retrieve all promotions by user ID

## Database

The application uses an in-memory H2 database. Upon starting the application, the database schema and initial data are loaded from `src/main/resources/schema.sql` and `src/main/resources/data.sql`.

### H2 Console

You can access the H2 console at `http://localhost:8080/h2-console`. The default JDBC URL is `jdbc:h2:mem:testdb`, with the username `sa` and an empty password.

## Project Structure

```bash
src/
├── main/
│   ├── java/
│   │   └── com/example/social_media_analytics/
│   │       ├── controller/
│   │       ├── model/
│   │       ├── repository/
│   │       ├── service/
│   │       └── SocialMediaAnalyticsApplication.java
│   ├── resources/
│   │   ├── static/
│   │   ├── templates/
│   │   ├── application.properties
│   │   ├── data.sql
│   │   └── schema.sql
└── test/
    └── java/
        └── com/example/social_media_analytics/
```

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- H2 Database
- Lombok

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
```

### Conclusion

This `README.md` file provides a comprehensive overview of your Spring Boot backend project, including setup instructions, API endpoints, and project structure. It will help other developers understand and use your project effectively.
