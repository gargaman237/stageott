package com.stage.ott.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stage.ott.entity.User;
import com.stage.ott.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    
    //add user json
  	/*
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
  	 */

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
