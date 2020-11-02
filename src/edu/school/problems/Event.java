package edu.school.problems;

public class Event {
	private String name;
	private Date date;
	
	public Event() {
		name = "";
		date = new Date();
	}

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
		String result = date.toStringEvent() + name;
		return (result);
	}
}
