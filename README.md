# My List Feature for OTT Platform

## Overview
This project implements the "My List" feature for an OTT platform, allowing users to save their favorite movies and TV shows to a personalized list. 
The backend services manage the user's list, including adding, removing, and listing saved items. The solution is built with Java 8, Spring Boot, and MongoDB.

## Features
- **Add to My List**: Add a movie or TV show to the user's list.
- **Remove from My List**: Remove an item from the user's list.
- **List My Items**: Retrieve all items in the user's list with pagination.

## Technologies Used
- **Backend**: Java 8, Spring Boot
- **Database**: MongoDB
- **Testing Framework**: JUnit
- **Build Tool**: Maven

## Project Setup

### Prerequisites
- Java 8
- Maven
- Docker (for running MongoDB)

### Setting Up Spring Boot Project

1. **clone the repo using below command**:
git clone https://github.com/gargaman237/stageott.git

### Running MongoDB

2. **Start MongoDB using Docker**:
    ```sh
    docker run -d -p 27017:27017 --name mongodb mongo
    ```

