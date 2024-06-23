package com.stage.ott.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Genre {

	ACTION, COMEDY, DRAMA, FANTASY, HORROR, ROMANCE, SCIFI;

	public List<Genre> getEnumGenreValues() {
		return new ArrayList<Genre>(Arrays.asList(values()));
	}

}
