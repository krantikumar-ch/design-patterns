package structural.adapter.calendar;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CalendarClientTest {

    @Test
    void scheduleAppleCalendar() {
        CalendarClient calendarClient = new CalendarClient("apple");
        Date today = new Date();
        String actual =  calendarClient.scheduleCalendar(today);
        String expected = "Your meeting "+today+" scheduled in apple calendar";
        assertTrue(expected.equals(actual));
    }

    @Test
    void scheduleMicrosoftCalendar() {
        CalendarClient calendarClient = new CalendarClient("microsoft");
        Date today = new Date();
        String actual =  calendarClient.scheduleCalendar(today);
        String expected = "Your meeting "+today+" scheduled in microsoft calendar";
        assertTrue(expected.equals(actual));
    }

    @Test
    void scheduleGoogleCalendar() {
        CalendarClient calendarClient = new CalendarClient("google");
        Date today = new Date();
        String actual =  calendarClient.scheduleCalendar(today);
        String expected = "Your meeting "+today+" scheduled in google calendar";
        assertTrue(expected.equals(actual));
    }
}