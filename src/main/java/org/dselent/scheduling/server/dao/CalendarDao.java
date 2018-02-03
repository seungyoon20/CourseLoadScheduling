package org.dselent.scheduling.server.dao;

import java.sql.SQLException;

import org.dselent.scheduling.server.model.Calendar;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarDao extends Dao<Calendar>
{
	// add functions here as needed
	public Calendar findByYear(int year) throws SQLException;
	public Calendar findBySemester(String semester) throws SQLException;
	public Calendar findByDay(String day) throws SQLException;
	public Calendar findByStartingTime(String startTime) throws SQLException;
	public Calendar findByEndingTime(String endTime) throws SQLException;
}