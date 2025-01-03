# My Chatting App

This is a basic chatting application built using Java. The application allows users to send and receive chat messages in real-time.

## Project Structure

```
my-chatting-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── App.java
│   │   │           ├── controller
│   │   │           │   └── ChatController.java
│   │   │           ├── model
│   │   │           │   └── Message.java
│   │   │           └── service
│   │   │               └── ChatService.java
│   │   └── resources
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd my-chatting-app
   ```

2. **Build the project**:
   Ensure you have Maven installed, then run:
   ```
   mvn clean install
   ```

3. **Run the application**:
   Execute the main class:
   ```
   mvn exec:java -Dexec.mainClass="com.example.App"
   ```

## Usage Guidelines

- Use the `ChatController` to send and fetch messages.
- The `Message` class represents the structure of a chat message.
- Configuration settings can be modified in `application.properties`.

## Dependencies

This project uses Maven for dependency management. Please refer to the `pom.xml` file for a list of dependencies used in this project.