package com.sl.fdc.dto;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Stefan Lourens
 */
public class Ranking {

	private String league;

	/**
	 * TODO: For some reason rankings are nested arrays
	 */
	@JsonProperty("ranking")
	private List<List<TeamRanking>> rankings;

	public Ranking() {
	}

	public String getLeague() {
		return league;
	}

	public List<TeamRanking> getRankings() {
		return rankings.get(0);
	}


}
