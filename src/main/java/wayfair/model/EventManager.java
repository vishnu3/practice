package wayfair.model;

import java.util.*;
import java.util.stream.Collectors;

public class EventManager implements IEventManager {
    private Set<IEventInfo> eventList;

    public EventManager(Set<IEventInfo> eventList) {
        this.eventList = eventList != null ? eventList : new HashSet<>();
    }

    public void addEvent(IEventInfo event) {
        if (event == null) return;
        boolean eventExists = eventList.stream()
                .anyMatch(e -> ((EventInfo)e).getEventName().equals(((EventInfo)event).getEventName()));
        if (!eventExists) {
            this.eventList.add(event);
        }
    }

    public void register(String eventName, IPerson person) {
        if (eventName == null || person == null) return;
        eventList.stream()
                .filter(event -> ((EventInfo)event).getEventName().equals(eventName))
                .findFirst()
                .ifPresent(event -> event.register(person));
    }

    public void attend(String eventName, IPerson person) {
        if (eventName == null || person == null) return;
        eventList.stream()
                .filter(event -> ((EventInfo)event).getEventName().equals(eventName))
                .findFirst()
                .ifPresent(event -> event.attend(person));
    }

    public List<String> getEventCountByYears() {
        Map<Integer, Long> countByYear = eventList.stream()
                .collect(Collectors.groupingBy(
                        event -> ((EventInfo)event).getEventDate().getYear(),
                        TreeMap::new,  // Using TreeMap for natural ordering by year
                        Collectors.counting()));

        return countByYear.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .collect(Collectors.toList());
    }

    public List<String> getEventRegistrationsCountByYears() {
        Map<Integer, Integer> registrationsByYear = eventList.stream()
                .collect(Collectors.groupingBy(
                        event -> ((EventInfo)event).getEventDate().getYear(),
                        TreeMap::new,
                        Collectors.summingInt(e -> ((EventInfo)e).getRegistrations().size())));

        return registrationsByYear.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .collect(Collectors.toList());
    }

    public List<String> getEventAttendeesCountByYears() {
        Map<Integer, Integer> attendeesByYear = eventList.stream()
                .collect(Collectors.groupingBy(
                        event -> ((EventInfo)event).getEventDate().getYear(),
                        TreeMap::new,
                        Collectors.summingInt(e -> ((EventInfo)e).getAttendees().size())));

        return attendeesByYear.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .collect(Collectors.toList());
    }
}
