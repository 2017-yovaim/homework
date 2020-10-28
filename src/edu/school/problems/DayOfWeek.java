package edu.school.problems;

public enum DayOfWeek {
	MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(0);

	private int weekDay;

	private DayOfWeek(int weekDay) {
		this.weekDay = weekDay;
	}

	public String toString() {
		if (weekDay == 1)
			return ("Monday");
		else if (weekDay == 2)
			return ("Tuesday");
		else if (weekDay == 3)
			return ("Wednesday");
		else if (weekDay == 4)
			return ("Thursday");
		else if (weekDay == 5)
			return ("Friday");
		else if (weekDay == 6)
			return ("Saturday");
		return ("Sunday");
	}

	public String toString(int numberOfLetters) {
		String result = "";
		String day = this.toString();
		for(int i = 0; i < numberOfLetters; i++) {
			result += day.charAt(i);
		}
		
		return(result);
	}
	
	public static DayOfWeek getDayOfWeek(int v) {
		if(v == 1)
			return MONDAY;
		else if(v == 2)
			return TUESDAY;
		else if(v == 3)
			return WEDNESDAY;
		else if(v == 4)
			return THURSDAY;
		else if(v == 5)
			return FRIDAY;
		else if(v == 6)
			return SATURDAY;
		else if (v == 0) 
			return SUNDAY;
		return null;
	}
}
