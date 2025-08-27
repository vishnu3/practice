package wayfair.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventInfo implements IEventInfo {
    private String eventName;
    private LocalDate eventDate;
    private int capacity;
    private boolean canceled;
    private List<IPerson> registrations;
    private List<IPerson> attendees;

    public EventInfo(String eventName, LocalDate eventDate, int capacity, boolean canceled) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.capacity = capacity;
        this.canceled = canceled;
        this.registrations = new ArrayList<>();
        this.attendees = new ArrayList<>();
    }

    @Override
    public void register(IPerson person) {
        if (!canceled && registrations.size() < capacity && !registrations.contains(person)) {
            registrations.add(person);
        }
    }

    @Override
    public void attend(IPerson person) {
        if (!canceled && registrations.contains(person) && !attendees.contains(person)) {
            attendees.add(person);
        }
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public List<IPerson> getRegistrations() {
        return registrations;
    }

    public List<IPerson> getAttendees() {
        return attendees;
    }
}
