package com.stage.ott.requestDto;

import javax.validation.constraints.NotEmpty;

public class SearchItemDto {

	@NotEmpty(message = "userId cannot be blank")
	private String itemType;

	@NotEmpty(message = "userId cannot be blank")
	private String userId;

	private int pageNo = 0;
	private int pageSize = 10;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
