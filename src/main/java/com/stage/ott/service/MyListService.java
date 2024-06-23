package com.stage.ott.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//MyListService.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.ott.entity.Item;
import com.stage.ott.entity.User;
import com.stage.ott.repository.UserRepository;
import com.stage.ott.requestDto.SearchItemDto;

@Service
public class MyListService {

	@Autowired
	private UserRepository userRepository;

	public User addItemToMyList(String userId, String itemId, String itemType) {
		User user = userRepository.findById(userId).orElse(new User());
		if (user.getMyList().stream().noneMatch(item -> item.getItemId().equals(itemId))) {
			user.getMyList().add(new Item(itemId, itemType));
		}
		return userRepository.save(user);
	}

	public User removeItemFromMyList(String userId, String itemId) throws Exception {
		Optional<User> userOpt = userRepository.findById(userId);
		if (userOpt.isPresent()) {
			User user = userOpt.get();
			user.setMyList(user.getMyList().stream().filter(item -> !item.getItemId().equals(itemId))
					.collect(Collectors.toList()));
			return userRepository.save(user);
		} else {
			throw new Exception("User not found");
		}
	}

	public List<Item> listMyItems(SearchItemDto searchItemDto) throws Exception {
		Optional<User> userOpt = userRepository.findById(searchItemDto.getUserId());
		if (userOpt.isPresent()) {
			User user = userOpt.get();
			int start = (searchItemDto.getPageNo() - 1) * searchItemDto.getPageSize();
			int end = Math.min(start + searchItemDto.getPageSize(), user.getMyList().size());
			return user.getMyList().subList(start, end);
		} else {
			throw new Exception("User not found");
		}
	}
}
