
public class NewWeight {
	
	private int stones;
	private int pounds;
	private int ounces;
	
	public NewWeight( int stn, int pnds, int oz ) { stones = stn; pounds = pnds; ounces = oz; } // end of constructor
	
	public boolean validWeight(){
		if ( this.stones >= 0 && ( this.pounds >= 0 && this.pounds < 14 ) && ( this.ounces >= 0 && this.ounces < 16 ) ) {
			return true;
		} else {
			return false;
		}
	}
	public boolean validWeight(int stn, int pnds, int oz){
		if ( stn >= 0 && ( pnds >= 0 && pnds < 14 ) && ( oz >= 0 && oz < 16 ) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public void addWeight(int stn, int pnds, int oz){
		
		
		
	}
	
	public void subtractWeight(int stn, int pnds, int oz){
		
		
	}
	
	public NewWeight calculateCorrectWeight(NewWeight nw1, NewWeight nw2){
		NewWeight endingWeight = null;
		
		
		
		
		return endingWeight;
	}
	
	
	public NewWeight askForWeight(){
		int[] weights = Utilities.int_returnThreeJTextFields("Stones", "Pounds", "Ounces");
		NewWeight newWeight = new NewWeight( weights[0], weights[1], weights[2] );
		return newWeight;
	}
	
	public String toString(){
		String NWToString = "";
		int thisStones = this.stones;
		int thisPounds = this.pounds;
		int thisOunces = this.ounces;
		if(validWeight()){
			if( thisStones == 0 ){
				NWToString += String.format("%d lbs %d oz", thisPounds, thisOunces);
			} else if ( thisStones == 1 ) {
				NWToString += String.format("%d stone %d oz", thisStones, thisOunces);
			} else if ( thisPounds == 0 ) {
				NWToString += String.format("%d stn %d oz", thisStones, thisOunces);
			} else if( thisOunces == 0 ) {
				NWToString += String.format("%d stn %d lbs", thisStones, thisPounds);
			} else {
				NWToString += String.format("%d stn %d lbs %d oz", thisStones, thisPounds, thisOunces);
			}
		} 
		return NWToString;
	}

	public int getStones(){ return this.stones; }

	public int getPounds(){ return this.pounds; }

	public int getOunces(){ return this.ounces; }
	
} // end of class
