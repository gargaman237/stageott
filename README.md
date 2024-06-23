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
- Maven 3.8.6
- Docker (for running MongoDB)

### Running MongoDB
**Start MongoDB using Docker**:
    ```sh
    docker run -d -p 27017:27017 --name mongodb mongo
    ```
    
**Create and import the database**:
     ```sh
	mongorestore -d stageott ~/<pathToYourDirectory>/stageott/source-db
    ```
### Setting Up the Project
**clone the repo using below command**:
    ```sh
    git clone https://github.com/gargaman237/stageott.git
    cd stageott
    ```
    
**Build the project**:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

### API Endpoints
API Endpoint can be find here on the below Endpoint
http://localhost:8011/stageott/swagger-ui.html#/

- **Add Item to My List**: `POST /users/add`
  - Request Body:
    ```json
    {
	  "id": "user1",
	  "username": "aman1",
	  "favoriteGenres": [
	    "ACTION",
	    "COMEDY"
	  ],
	  "dislikedGenres": [
	    "HORROR"
	  ],
	  "watchHistory": [
	    {
	      "contentId": "movie1",
	      "watchedOn": "2023-06-23T18:25:43.511Z",
	      "rating": 5
	    }
	  ],
	  "myList": [
	    {
	      "itemId": "item1",
	      "itemType": "Movie"
	    },
	    {
	      "itemId": "item3",
	      "itemType": "Movie"
	    }
	  ]
	}
    ```


- **Add Item to My List**: `POST /mylist/add-item`
  - Request Body:
    ```json
    {
      "userId": "user1",
      "itemId": "item1",
      "itemType": "Movie"
    }
    ```

- **Remove Item from My List**: `DELETE /mylist/remove-item`
  - Request Body:
    ```json
    {
      "userId": "user1",
      "itemId": "item1"
    }
    ```

- **List My Items**: `POST /mylist/list-item`
  - Request Body:
    ```json
    {
     "itemType": "string",
     "pageNo": 0,
     "pageSize": 0,
     "userId": "string"
    }
    ```


