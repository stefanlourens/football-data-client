package com.sl.fdc.resources;

import com.sl.fdc.dto.Fixture;
import com.sl.fdc.dto.Ranking;
import com.sl.fdc.dto.Season;
import com.sl.fdc.dto.Team;
import com.sl.fdc.dto.Venue;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 *
 * @author Stefan Lourens
 */
public interface FootballData {

	@GET
	@Path("/soccerseasons")
	@Consumes(APPLICATION_JSON)
	public List<Season> listSeasons();

	@GET
	@Path("/soccerseasons/{seasonId}/ranking")
	@Consumes(APPLICATION_JSON)
	public Ranking getSeasonRankings(@PathParam("seasonId") int seasonId);

	@GET
	@Path("/soccerseasons/{seasonId}/ranking")
	@Consumes(APPLICATION_JSON)
	public Ranking getSeasonRankings(
			@PathParam("seasonId") int seasonId,
			@QueryParam("matchday") int matchday
	);

	@GET
	@Path("/soccerseasons/{seasonId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getSeasonFixtures(@PathParam("seasonId") int seasonId);

	@GET
	@Path("/soccerseasons/{seasonId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getSeasonFixtures(
			@PathParam("seasonId") int seasonId,
			@QueryParam("matchday") int matchday
	);

	@GET
	@Path("/soccerseasons/{seasonId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getSeasonFixtures(
			@PathParam("seasonId") int seasonId,
			@QueryParam("matchday") int matchday,
			@QueryParam("timeFrame") String timeFrame
	);

	@GET
	@Path("/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> listFixtures();

	@GET
	@Path("/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> listFixtures(@QueryParam("timeFrame") String timeFrame);

	@GET
	@Path("/teams/{teamId}")
	@Consumes(APPLICATION_JSON)
	public Team getTeam(@PathParam("teamId") int teamId);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(@PathParam("teamId") int teamId);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(
			@PathParam("teamId") int teamId,
			@QueryParam("season") int year
	);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(
			@PathParam("teamId") int teamId,
			@QueryParam("venue") Venue venue
	);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(
			@PathParam("teamId") int teamId,
			@QueryParam("timeFrame") String timeFrame
	);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(
			@PathParam("teamId") int teamId,
			@QueryParam("season") int year,
			@QueryParam("timeFrame") String timeFrame
	);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(
			@PathParam("teamId") int teamId,
			@QueryParam("season") int year,
			@QueryParam("venue") Venue venue
	);
	
	@GET
	@Path("/teams/{teamId}/fixtures")
	@Consumes(APPLICATION_JSON)
	public List<Fixture> getTeamFixtures(
			@PathParam("teamId") int teamId,
			@QueryParam("season") int year,
			@QueryParam("timeFrame") String timeFrame,
			@QueryParam("venue") Venue venue
	);

	
	
	

	
}
