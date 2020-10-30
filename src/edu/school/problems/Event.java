package edu.school.problems;

public class Event {
	private String name;
	private Date date;

	public Event(String n, Date d) {
		if (n != null && !n.isEmpty())
			name = n;
		if (d != null)
			date = d;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public String toString() {
		String result = "What's the event: " + name;
		result += "\nWhen: " + date;
		return (result);
	}
}
