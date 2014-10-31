package com.sl.fdc.dto;

/**
 *
 * @author Stefan Lourens
 */
public class TeamRanking {

	private int rank;
	private String team;
	private String crestURI;
	private int points;
	private int goals;
	private int goalsAgainst;
	private int goalDifference;

	public TeamRanking() {
	}

	public int getRank() {
		return rank;
	}

	public String getTeam() {
		return team;
	}

	public String getCrestURI() {
		return crestURI;
	}

	public int getPoints() {
		return points;
	}

	public int getGoals() {
		return goals;
	}

	public int getGoalsAgainst() {
		return goalsAgainst;
	}

	public int getGoalDifference() {
		return goalDifference;
	}

}
