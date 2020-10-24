package edu.school.problems;

public class Date {
	private int seconds;
	private int minutes;
	private int hour;
	private int day;
	private int month;
	private int year;

	public Date() {
		seconds = 0;
		minutes = 0;
		hour = 0;
		day = 1;
		month = 1;
		year = 1;

		// Happy New A.D Year!
	}

	public Date(int secondsValue, int minutesValue, int hourValue, int dayValue, int monthValue, int yearValue) {
		if (secondsValue < 60 && secondsValue >= 0)
			seconds = secondsValue;
		if (minutesValue < 60 && minutesValue >= 0)
			minutes = minutesValue;
		if (hourValue < 24 && hourValue >= 0)
			hour = hourValue;
		if (dayValue <= 31 && dayValue >= 1)
			day = dayValue;
		if (monthValue <= 12 && monthValue >= 1)
			month = monthValue;
		year = yearValue;

		// for standard use; doesn't have proper day data validation
	}

	public void setSeconds(int secs) {
		if (secs < 60 && secs >= 0)
			seconds = secs;
	}

	public void setMinutes(int mins) {
		if (mins < 60 && mins >= 0)
			minutes = mins;
	}

	public void setHour(int h) {
		if (h < 24 && h >= 0)
			hour = h;
	}

	public void setMonth(int m) {
		if (m >= 1 && m <= 12)
			month = m;
	}

	public void setYear(int y) {
		year = y;
	}

	public void setDay(int d, int m) {
		if (m == 2) {
			if (isLeapYear()) {
				if (d >= 1 && d <= 29) {
					day = d;
				}
			} else if (d >= 1 && d <= 28) {
				day = d;
			}

		} else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			if (d >= 1 && d <= 31) {
				day = d;
			}
		} else {
			if (d >= 1 && d <= 30) {
				day = d;
			}
		}
	}

	public int getSeconds() {
		return (seconds);
	}

	public int getMinutes() {
		return (minutes);
	}

	public int getHour() {
		return (hour);
	}

	public int getDay() {
		return (day);
	}

	public int getMonth() {
		return (month);
	}

	public int getYear() {
		return (year);
	}
	
	public String toString() {
		String result = hour + ":" + minutes + ":" + seconds + ", " + day + "." + month + "." + year;
		return(result);
	}

	public boolean isLeapYear() {
		if (year % 100 == 0)
			if (year % 400 == 0)
				return (true);
			else
				return (false);
		else if (year % 4 == 0)
			return (true);
		else
			return (false);
	}

	public int compareTo(Date d) {
		if (year == d.year && month == d.month && day == d.day && hour == d.hour && minutes == d.minutes
				&& seconds == d.seconds) {
			return (0);
		}
		if (year > d.year) {
			return (1);
		} else if (year < d.year) {
			return (-1);
		} else {
			if (month > d.month) {
				return (1);
			} else if (month < d.month) {
				return (-1);
			}
			if (day > d.day) {
				return (1);
			} else if (day < d.day) {
				return (-1);
			}
			if (hour > d.hour) {
				return (1);
			} else if (hour < d.hour) {
				return (-1);
			}
			if (minutes > d.minutes) {
				return (1);
			} else if (minutes < d.minutes) {
				return (-1);
			}
			if (seconds > d.seconds) {
				return (1);
			} else {
				return (-1);
			}

		}
	}
	
	public int dayInTheYear() {
		if(month == 1)
			return(day);
		int dayPosition = 0;
		for(int i = 1; i < month; i++) {
			if(i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				dayPosition += 31;
			}
			else {
				dayPosition += 30;
			}
		}
		dayPosition += day;
		
		return(dayPosition);
	}
	
	public int weekInTheYear() {
		int dayPos = dayInTheYear();
		int weekPosition = dayPos / 7;
		return(weekPosition);
		}
	
	public void secondsPlus1() {
		if(seconds < 59)
			seconds++;
		else if(minutes < 59) {
			seconds = 0;
			minutes++;
		}
		else if(hour < 23) {
			seconds = 0;
			minutes = 0;
			hour++;
		}
		else if((month == 2 && day < 28) || ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day < 31) || ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day < 30)){
			seconds = 0;
			minutes = 0;
			hour = 0;
			day++;
		}
		else if(month < 12) {
			seconds = 0;
			minutes = 0;
			hour = 0;
			day = 1;
			month++;
		}
		else {
			seconds = 0;
			minutes = 0;
			hour = 0;
			day = 1;
			month = 1;
			year++;
		}
	}

}
