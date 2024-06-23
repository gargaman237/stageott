package com.stage.ott.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "episode")
public class Episode {
	private int episodeNumber;
	private int seasonNumber;
	private Date releaseDate;
	private String director;
	private List<String> actors;
}
