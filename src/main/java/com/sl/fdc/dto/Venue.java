package com.sl.fdc.dto;

import org.codehaus.jackson.annotate.JsonValue;

/**
 *
 * @author Stefan Lourens
 */
public enum Venue {
	HOME, AWAY;

	@JsonValue
	public String toJSON() {
		return toString().toLowerCase();
	}

}
