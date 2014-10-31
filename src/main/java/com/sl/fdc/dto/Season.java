package com.sl.fdc.dto;

import java.util.Date;

/**
 *
 * @author Stefan Lourens
 */
public class Season {

	private int id;
	private String caption;
	private String league;
	private String year;
	private Date lastUpdated;

	public Season() {
	}

	public int getId() {
		return id;
	}

	public String getCaption() {
		return caption;
	}

	public String getLeague() {
		return league;
	}

	public String getYear() {
		return year;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

}
