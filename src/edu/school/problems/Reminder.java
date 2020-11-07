package edu.school.problems;

import java.time.LocalDate;

public class Reminder {
	private Event events[];
	private int eventsIndex;

	public Reminder() {
		events = new Event[30];
		eventsIndex = 0;
	}

	public void addEvent(Event newEvent) {
		if (eventsIndex == 30) {
			System.out.println("Your reminder is full.");
		} else {
			events[eventsIndex] = newEvent;
			eventsIndex++;
		}

		// not sure when an event mustn't be added
	}

	public Event[] getAllEvents(Date date) {
		Date currentDate;
		int countTodayEvents = 0;
		for (int i = 0; i < eventsIndex; i++) {
			if (events[i].getDate().isSameDate(date) == true) {
				countTodayEvents++;
			}
		}
		Event[] eventsOnCurrentDate = new Event[countTodayEvents];
		
		
		int currentEventIndex = 0;
		for (int i = 0; i < eventsIndex; i++) {
			currentDate = events[i].getDate();

			if (date.isSameDate(currentDate) == true) {
				eventsOnCurrentDate[currentEventIndex] = new Event();
				eventsOnCurrentDate[currentEventIndex] = events[i];
				currentEventIndex++;
			}
		}

		return eventsOnCurrentDate;
	}

	public void remind() {
		LocalDate currentDate = LocalDate.now();

		int currentDay = currentDate.getDayOfMonth();
		int currentMonth = currentDate.getMonthValue();
		int currentYear = currentDate.getYear();
		// looked it up on w3schools and javatpoint; eclipse automatically suggested
		// methods getDayOfMonth, getMothValue, and getYear

		Date d = new Date(0, 0, 0, currentDay, currentMonth, currentYear);
		Event[] currentDateEvents = new Event[eventsIndex];
		currentDateEvents = getAllEvents(d);

		for (int i = 0; i < currentDateEvents.length; i++) {
			if (currentDateEvents[i] != null)
				System.out.println(currentDateEvents[i]);
			else
				break;
		}
	}
}
