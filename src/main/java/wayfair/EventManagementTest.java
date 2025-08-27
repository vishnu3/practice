package wayfair;

import wayfair.model.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManagementTest {
    public static void main(String[] args) {
        // Create test data
        // Create people
        IPerson person1 = new Person("First1", "Last1");
        IPerson person2 = new Person("First2", "Last2");
        IPerson person3 = new Person("First", "Last3");

        // Create events
        Set<IEventInfo> events = new HashSet<>();
        IEventInfo event1 = new EventInfo("Event1", LocalDate.of(2022, 6, 9), 58, false);
        IEventInfo event2 = new EventInfo("Event2", LocalDate.of(2020, 2, 26), 20, false);
        IEventInfo event3 = new EventInfo("Event3", LocalDate.of(2023, 3, 15), 23, true);

        // Create EventManager
        EventManager eventManager = new EventManager(events);
        eventManager.addEvent(event1);
        eventManager.addEvent(event2);
        eventManager.addEvent(event3);

        // Process the operations
        // 1 0 2 -> Register person1 for event3
        eventManager.register("Event3", person1);
        // 1 1 0 -> Register person2 for event1
        eventManager.register("Event1", person2);
        // 1 1 0 -> Register person2 for event1 (duplicate, should be ignored)
        eventManager.register("Event1", person2);

        // Print results
        System.out.println("Event Count:");
        eventManager.getEventCountByYears().forEach(System.out::println);

        System.out.println("\nRegistrations:");
        eventManager.getEventRegistrationsCountByYears().forEach(System.out::println);

        System.out.println("\nAttendees:");
        eventManager.getEventAttendeesCountByYears().forEach(System.out::println);

    }
}
