package structural.adapter.calendar;

import structural.adapter.calendar.adapters.AppleCalendarAdapter;
import structural.adapter.calendar.adapters.CalendarAdapter;
import structural.adapter.calendar.adapters.GoogleCalendarAdapter;
import structural.adapter.calendar.adapters.MicrosoftCalendarAdapter;

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
