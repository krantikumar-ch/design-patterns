package structural.calendar;

import structural.calendar.adapters.AppleCalendarAdapter;
import structural.calendar.adapters.CalendarAdapter;
import structural.calendar.adapters.GoogleCalendarAdapter;
import structural.calendar.adapters.MicrosoftCalendarAdapter;

public class CalendarAdaptorFactory {

    public static CalendarAdapter getCalendarAdapter(String type){
        if("apple".equalsIgnoreCase(type)){
            return new AppleCalendarAdapter();
        }
        if("microsoft".equalsIgnoreCase(type)){
            return new MicrosoftCalendarAdapter();
        }
        return new GoogleCalendarAdapter();
    }
}
