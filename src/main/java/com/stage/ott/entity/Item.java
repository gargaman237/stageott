package com.stage.ott.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "item")
public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String itemId;
	private String itemType; // "Movie" or "TVShow"

	public Item(String itemId2, String itemType2) {
		// TODO Auto-generated constructor stub
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

}