package com.stage.ott.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user")
public class User {
	@Id
	private String id;
	private String username;
	private List<String> favoriteGenres;
	private List<String> dislikedGenres;
	private List<WatchHistory> watchHistory;
	private List<Item> myList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getFavoriteGenres() {
		return favoriteGenres;
	}

	public void setFavoriteGenres(List<String> favoriteGenres) {
		this.favoriteGenres = favoriteGenres;
	}

	public List<String> getDislikedGenres() {
		return dislikedGenres;
	}

	public void setDislikedGenres(List<String> dislikedGenres) {
		this.dislikedGenres = dislikedGenres;
	}

	public List<WatchHistory> getWatchHistory() {
		return watchHistory;
	}

	public void setWatchHistory(List<WatchHistory> watchHistory) {
		this.watchHistory = watchHistory;
	}

	public List<Item> getMyList() {
		return myList;
	}

	public void setMyList(List<Item> myList) {
		this.myList = myList;
	}

}
