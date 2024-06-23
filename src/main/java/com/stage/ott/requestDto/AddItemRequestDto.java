package com.stage.ott.requestDto;

import javax.validation.constraints.NotEmpty;

public class AddItemRequestDto {

	@NotEmpty(message = "userId cannot be blank")
	private String userId;
	@NotEmpty(message = "itemId cannot be blank")
	private String itemId;
	@NotEmpty(message = "itemType cannot be blank")
	private String itemType;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
