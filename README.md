# Smart Parking Management System (SPMS)

A cloud-native, microservice-based system for managing parking spaces efficiently in urban environments.

---

## 🚀 Project Overview

SPMS is built using **Spring Boot** and follows a **microservices architecture**. It allows drivers to:

* Search for parking spots
* Reserve and pay digitally
* View booking history

And enables parking owners to:

* Manage space availability
* Monitor usage

---

## 🧱 Microservices Modules

This project is organized as a multi-module Maven project:

```
SPMS-Project/
├── eureka-server         # Service registry
├── config-server         # Centralized configuration
├── api-gateway           # API Gateway and routing
├── parking-service       # Parking spot management
├── user-service          # User and owner management
├── vehicle-service       # Vehicle information service
├── payment-service       # Simulated payment processing
```

Each service is an independent Spring Boot application.

---

## 🔧 Technologies Used

* Java 17
* Spring Boot 3.2.5
* Spring Cloud 2022.0.4
* Eureka Discovery
* Spring Cloud Gateway
* Spring Cloud Config
* H2 Database (for local testing)
* Maven
* Postman (for API testing)

---

## 📦 How to Run

### 🟢 Prerequisites

* JDK 17+
* Maven
* IntelliJ IDEA (recommended)
* Internet access (for Git config repo)

### 🔷 1. Clone the Repository

```bash
[git clone https://github.com/your-username/spms-project.git
cd spms-project](https://github.com/jayasanki/AD-2_Final_CW.git)
```

### 🔷 2. Start Services in Order

1. `eureka-server`
2. `config-server` *(Make sure GitHub config repo is accessible)*
3. `api-gateway`
4. Start all business services:

   * `parking-service`
   * `user-service`
   * `vehicle-service`
   * `payment-service`

---

## 🔗 Remote Configuration Repository

All service configs are loaded from this GitHub repo:

**Config Repo:** [spms-config-repo](https://github.com/your-username/spms-config-repo)

Each service has its own config file:

```
spms-config-repo/
├── parking-service.yml
├── user-service.yml
├── vehicle-service.yml
├── payment-service.yml
```

---

## 📬 Postman Collection

You can test all services using this collection:

📁 [Postman Collection](./postman_collection.json)

Import this JSON into Postman to access all API endpoints.

---

## 🖥 Eureka Dashboard Screenshot

See all running services here:

![Eureka Dashboard](./docs/screenshots/eureka_dashboard.png)

Access URL: [http://localhost:8761](http://localhost:8761)

---

## 📚 Useful Commands

### Build the entire project

```bash
mvn clean install
```

### Run a single module

From IntelliJ: Right-click → `Run [ModuleName]Application`

Or use terminal:

```bash
cd eureka-server
mvn spring-boot:run
```

---

## 📄 License

This project is for educational purposes only.
