package com.stage.ott;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.stage.ott.entity.Item;
import com.stage.ott.entity.User;
import com.stage.ott.requestDto.AddItemRequestDto;
import com.stage.ott.requestDto.RemoveItemRequestDto;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyListTest {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testAddItemToMyList() {
		AddItemRequestDto request = new AddItemRequestDto();
		request.setUserId("user1");
		request.setItemId("item1");
		request.setItemType("Movie");
		ResponseEntity<User> response = restTemplate.postForEntity("/mylist/add-item", request, User.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody().getMyList()).hasSize(1);
	}

	@Test
	public void testRemoveItemFromMyList() {
		AddItemRequestDto addItemRequestDto = new AddItemRequestDto();
		addItemRequestDto.setUserId("user1");
		addItemRequestDto.setItemId("item1");
		addItemRequestDto.setItemType("Movie");
		restTemplate.postForEntity("/mylist/add-item", addItemRequestDto, User.class);

		RemoveItemRequestDto removeItemRequestDto = new RemoveItemRequestDto();
		removeItemRequestDto.setUserId("user1");
		removeItemRequestDto.setItemId("item1");
		ResponseEntity<User> response = restTemplate.postForEntity("/mylist/remove", removeItemRequestDto, User.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody().getMyList()).hasSize(0);
	}

	@Test
	public void testListMyItems() {
		AddItemRequestDto addItemRequestDto1 = new AddItemRequestDto();
		addItemRequestDto1.setUserId("user1");
		addItemRequestDto1.setItemId("item1");
		addItemRequestDto1.setItemType("Movie");
		AddItemRequestDto addItemRequestDto2 = new AddItemRequestDto();
		addItemRequestDto2.setUserId("user2");
		addItemRequestDto2.setItemId("item2");
		addItemRequestDto2.setItemType("TVShow");
		restTemplate.postForEntity("/mylist/add-item", addItemRequestDto1, User.class);
		restTemplate.postForEntity("/mylist/add-item", addItemRequestDto2, User.class);

		ResponseEntity<Item[]> response = restTemplate.getForEntity("/mylist/list?userId=user1&page=1&size=10",
				Item[].class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(response.getBody()).hasSize(2);
	}
	
	//add user json
	/*
	 * 
		 {
	  "id": "user1",
	  "username": "john_doe",
	  "preferences": {
	    "favoriteGenres": ["ACTION", "COMEDY"],
	    "dislikedGenres": ["HORROR"]
	  },
	  "watchHistory": [
	    {
	      "contentId": "movie1",
	      "watchedOn": "2023-06-23T18:25:43.511Z",
	      "rating": 5
	    }
	  ],
	  "myList": []
	}
	 */
	
	
}
