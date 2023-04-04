package structural.adapter.calendar;

import structural.adapter.calendar.adapters.CalendarAdapter;

import java.util.Date;

/**
 * Design a calendar service to schedule a meeting.
 *
 * This meeting should reflect client calendar.
 * The client calendar would be Google calendar, Microsoft Calendar, Apple Calendar
 * Consider these three calendars are third party api's and would return different output formats
 *
 * once meeting scheduled client should get the confirmation messages says
 * "Your meeting {date} scheduled in {calender} calendar"
 */
public class CalendarClient {
    private CalendarAdapter calendarAdapter;

    public CalendarClient(String type){
        calendarAdapter = CalendarAdaptorFactory.getCalendarAdapter(type);
    }

    public String scheduleCalendar(Date scheduleDate){
        String message = calendarAdapter.scheduleMeeting(scheduleDate);
        return message;
    }
}
