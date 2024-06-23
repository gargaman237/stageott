package com.stage.ott.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "user")
public class User {
	@Id
	private String id;
	private String username;
	private List<Genre> favoriteGenres;
	private List<Genre> dislikedGenres;
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

	public List<Genre> getFavoriteGenres() {
		return favoriteGenres;
	}

	public void setFavoriteGenres(List<Genre> favoriteGenres) {
		this.favoriteGenres = favoriteGenres;
	}

	public List<Genre> getDislikedGenres() {
		return dislikedGenres;
	}

	public void setDislikedGenres(List<Genre> dislikedGenres) {
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
