package com.stage.ott.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Genre {

	Action, Comedy, Drama, Fantasy, Horror, Romance, SciFi;

	public List<Genre> getEnumGenreValues() {
		return new ArrayList<Genre>(Arrays.asList(values()));
	}

}
