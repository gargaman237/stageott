package com.stage.ott.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

public class TVShow {
	@Id
	private String id;
	private String title;
	private String description;
	// private List<String> genres;
	private List<Genre> genres;
	private List<Episode> episodes;
}
