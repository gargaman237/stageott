package com.stage.ott.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stage.ott.entity.Item;
import com.stage.ott.entity.User;
import com.stage.ott.requestDto.AddItemRequestDto;
import com.stage.ott.requestDto.RemoveItemRequestDto;
import com.stage.ott.requestDto.SearchItemDto;
import com.stage.ott.service.MyListService;

@RestController
@RequestMapping("/mylist")
public class MyListController {

	@Autowired
	private MyListService myListService;

	private static Logger logger = LoggerFactory.getLogger(MyListController.class.getName());
	
	@GetMapping("/test")
	public String test() {
		return "Here is your application working";
	}

	@PostMapping("/add")
	public User addItemToMyList(@RequestBody AddItemRequestDto request) {
		return myListService.addItemToMyList(request.getUserId(), request.getItemId(), request.getItemType());
	}

	@DeleteMapping("/remove")
	public User removeItemFromMyList(@RequestBody RemoveItemRequestDto request) {
		try {
			return myListService.removeItemFromMyList(request.getUserId(), request.getItemId());
		} catch (Exception e) {
			logger.info("Exception at removeItemFromMyList method : {}", e.getMessage());
		}
		return null;
	}

	@GetMapping("/list")
	public List<Item> listMyItems(@RequestBody SearchItemDto searchItemDto) {
		try {
			return myListService.listMyItems(searchItemDto);
		} catch (Exception e) {
			logger.info("Exception at listMyItsems method : {}", e.getMessage());
		}
		return null;
	}
}
