package com.sl.fdc.dto;

import java.util.Date;

/**
 *
 * @author Stefan Lourens
 */
public class Fixture {

	private int id;
	private Date date;
	private int matchday;
	private String homeTeam;
	private String awayTeam;
	private int goalsHomeTeam;
	private int goalsAwayTeam;

	public Fixture() {
	}

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public int getMatchday() {
		return matchday;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public int getGoalsHomeTeam() {
		return goalsHomeTeam;
	}

	public int getGoalsAwayTeam() {
		return goalsAwayTeam;
	}

}
