package com.stage.ott.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "watchHistory")
public class WatchHistory {
	private String contentId;
	private Date watchedOn;
	private Integer rating;

	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public Date getWatchedOn() {
		return watchedOn;
	}

	public void setWatchedOn(Date watchedOn) {
		this.watchedOn = watchedOn;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	// getters and setters
}
