package time;

public class NewTime {
	
	private int hours;
	private int minutes;
	
	public NewTime(){
		this(0,0);
	}
	
	public NewTime( int hh, int mm ) {
		this.setHours(hh);
		this.setMinutes(mm);
	}
	
	public boolean valid24Time(){ // for checking instance valid times
		if ( (this.getHours() >= 0 && this.getHours() < 24) && ( this.getMinutes() >= 0 && this.getMinutes() < 60)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean valid24Time( int hh, int mm ){ // for checking if an inputed set of hours and minutes is valid instead of for an instance
		if ( ( hh >= 0 && hh < 24) && ( mm >= 0 && mm < 60) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addTime(int hrs, int mins){ // addTime and subtractTime should handle the overflow of time, eg 30:73 gets converted to 7:13
		if ( valid24Time(hrs, mins) == true ){ // doesnt allow adding if the input time is not valid, so cant add 99 hours 7000 minutes
			
			int totalMinutesOverall = this.hours*60 + hrs*60 + this.minutes + mins;
			int totalMinsDayRemainder = totalMinutesOverall % (24*60);
			
			int newMinutesRemainder = totalMinsDayRemainder % 60;
			int newHours = (totalMinsDayRemainder - newMinutesRemainder) / 60;
			
			/*System.out.println(totalMinutesOverall);
			System.out.println(totalMinsDayRemainder);
			System.out.println(newHours);
			System.out.println(newMinutesRemainder);*/
			
			this.setHours(newHours);
			this.setMinutes(newMinutesRemainder);
			
		} else {
			System.out.println("invalid time");
			return;
		}
		
	}
	
	public void subtractTime(int hrs, int mins){ // only allows passing of positive time, so that the time doesnt get confused by subtracting negatives
		if ( valid24Time(hrs, mins) == true ){
			int thisTotalMinutes = this.hours*60 + this.minutes;
			int subTotalMinutes = hrs*60 + mins;
			int timeToTakeAway = Math.abs(thisTotalMinutes - subTotalMinutes); // returns absolute value of the time needed to be taken away.
			int minsInADay = 24*60;
			
			/*System.out.println(thisTotalMinutes);
			System.out.println(subTotalMinutes);*/
			
			int newMins = minsInADay - timeToTakeAway;
			int newHours = (newMins - (newMins % 60))/60;
			
			//System.out.println(newHours);
			
			this.setHours(newHours);
			this.setMinutes(newMins % 60);
			
		} else {
			System.out.println("invalid time");
			return; // stops the method
		}
	}
	
	public String getCurrentTime(){
		return String.format( "%d:%02d", this.getHours(), this.getMinutes() );
	}
	
	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setHours(int hours) {
			this.hours = hours;
	}

	public void setMinutes(int minutes) {
			this.minutes = minutes;	
	
	}
	
	
	
	
	
	
	
	
	
} // end of class
