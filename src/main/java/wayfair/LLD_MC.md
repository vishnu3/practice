# Wayfair Onsite Loop: Event Management

## Description
A company needs to manage events and create related reports. Implement the required classes and functionality.
- Create a class called `Person` that implements the `/Person` interface.
  - The constructor takes two strings, `firstName`, and `lastName`, and initializes the `firstName` and `lastName` properties.
- Create a class called `Eventino` that implements the `/Eventinfo` interface.
  - The constructor:
    - takes the values and initializes the properties `string eventName`, `DateOnly eventDate`, `int capacity`, and a `boolean, canceled` flag.
    - initializes two properties `List<|Person>`: `Registration`, and `Attendees`.
  - It has these methods:
    - `Register` takes an `/Person` as a parameter. It adds the person to the `Registration` list if these tests pass:
      - The event is not canceled.
      - There are fewer registrants than the event capacity.
      - The person is not already registered.
    - `Attend` takes an `/Person` as a parameter. It adds the person to the `Attendees` list if these tests pass:
      - The event is not canceled.
      - The person is registered.
      - The person is not already marked as an attendee.
- Create a class called `EventManager` that implements the `/EventManager` interface.
  - It has a constructor that initializes the `Events` list.
  - It has the following methods:
    - `AddEvent` takes an `/Eventinfo` as a parameter. It adds the event to the `Events` list if the event name is not already in the list.
    - `Register` takes an `eventName` and an `/Person` as parameters. It registers the person for the event with the given name if it exists in the `Events` list.
    - `Attend` takes an `eventName` and an `/Person` as parameters and marks the person as an attendee for the event with the given name if it exists in the `Events` list and the person is registered.
    - `GetEventCountByYears` returns a list of strings showing the number of events that occurred each year, ordered by year.
    - `GetEventRegistrationCountByYears` returns a list of strings showing the total number of registrations for events that occurred each year, ordered by year.
    - `GetEventAttendeesCountByYears` returns a list of strings showing the total number of attendees for events that occurred each year, ordered by year.

## Example
There are 3 people, Jane Smith, John Doe, Richard Roe. There are 2 events:
- Event1 in 2021
- Event2 in 2020

These actions occur:
- John Doe registered for Event1
- John Doe registered for Event2
- Richard Roe registered for Event1
- Jane Smith registered for Event1
- Jane Smith registered for Event2
- John Doe attended Event1
- Richard Roe attended Event1

And the output will be:
```
Event Count:
2020 - 1
2021 - 1

Registrations:
2020 - 2
2021 - 3

Attendees:
2020 - 0
2021 - 2
```

And the output will be:
```
Event Count:
2020 - 1
2021 - 1

There was 1 event each year. John Doe and Jane Smith registered for Event2 in 2020. John Doe, Jane Smith, and Richard Roe registered for Event in 2021. There were two attendees. John Doe and Richard Roe attended Event1 in 2021.
```

## Input Format For Custom Testing
The first line contains an integer `n`, the number of people. Each of the next `n` lines contains a person's information (FirstName, LastName). The next line contains an integer `m`, the number of events. Each of the next `m` lines contains the event information (Name, EventDate, Capacity, Canceled). The next line contains an integer `k`, the number of processes. Each of the next `k` lines contains the process information for Register and Attend. This consists of 3 space-separated integers defined below.
- 1 is register, 2 is attend
- index of the person in the persons list in the code stub
- index of the event in the events list in the code stub.

## Event Management System Test Cases

### Test Case Description
There is one event each year. Only two people, First1 Last1 and First2 Last2 register for an event, Event1. Neither actually attends an event. 

Note: In the second line of process information, First Last1 tries to attend Event2. Since First Last is not registered for the event, they could not attend.

### Input For Custom Testing

#### People
```
3
First1 Last1
First2 Last2
First Last3
```

#### Events
```
3
Event1 2022.06.09 58
Event2 2020.02.26 20
Event3 2023.03.15 23 0
```

#### Process Information
```
9
1 0 2
1 1 0
1 1 0
```

### Output

#### Event Count:
```
2020 - 1
2022 - 1
2023 - 1
```

#### Registrations:
```
2020 - 0
2022 - 0
2023 - 1
```

#### Attendees:
```
2020 - 0
2022 - 0
2023 - 0
```

### Explanation
Event was canceled so it means persons cannot register or attend this event. Canceled events are also counted in "Event Count".
