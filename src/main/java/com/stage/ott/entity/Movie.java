package com.stage.ott.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {
	@Id
	private String id;
	private String title;
	private String description;
	//private List<Genre> genres;
	private List<Genre> genres;
	private Date releaseDate;
	private String director;
	private List<String> actors;
}
