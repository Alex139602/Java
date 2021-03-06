
public class NewWeight {
	
	private int stones;
	private int pounds;
	private int ounces;
	
	public NewWeight( int stn, int pnds, int oz ) { 
		
		if ( validWeight() == true ){
			setStones(stn); 
			setPounds(pnds);
			setOunces(oz);
		} else {
			System.out.println("Not valid weight");
			//write to log file
		}
		
	} // end of constructor
	
	public boolean validWeight(){ // returns if it is a valid weight for this instance 
		if ( this.stones >= 0 && ( this.pounds >= 0 && this.pounds < 14 ) && ( this.ounces >= 0 && this.ounces < 16 ) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validWeight(int stn, int pnds, int oz){ // returns if it is a valid weight for the input parmeters. probably more useful than the no args validWeight
		if ( stn >= 0 && ( pnds >= 0 && pnds < 14 ) && ( oz >= 0 && oz < 16 ) ) {
			return true;
		} else {
			return false;
		}
	}
	
	public String addWeight(int stn, int pnds, int oz){  // should be able to handle any weight inputs by using all weights to oz and then back
		String str = "weight added successfully.";
		int totalStonesOunces = (stn*14*16) + (this.stones*14*16) ;
		int totalPoundsOunces = (pnds*16) + (this.pounds*16);
		int totalOunces = this.ounces + oz; 
		int totalWeight = totalStonesOunces + totalPoundsOunces + totalOunces;
		
		// work out the remainders
		
		int leftoverStonesAsOunces = totalWeight % (14*16);
		int newStones = (totalWeight - leftoverStonesAsOunces) / (14*16);
		int leftoverOunces = leftoverStonesAsOunces % 16; 
		int newPounds = (leftoverStonesAsOunces - leftoverOunces) / 16;
		
		System.out.println(totalWeight);
		System.out.println(newStones);
		System.out.println(newPounds);
		System.out.println(leftoverOunces + " pnds"); 
		
		
		// change the old objects properties to the new correct values
		
		this.setStones(newStones);
		this.setPounds(newPounds);
		this.setOunces(leftoverOunces);
		
		return str;
		
	}
	
	public void makeWeightCorrect(){ this.addWeight(0,0,0); }
	
	public String subtractWeight(int subStones, int subPounds, int subOunces){
		String str = "";
		int thisStones = this.stones;
		int thisPounds = this.pounds;
		int thisOunces = this.ounces;
		
		int thisTotalOunces = thisStones*14*16 + thisPounds*16 + thisOunces;
		int subTotalOunces = subStones*14*16 + subPounds*16 + subOunces;
		int totalLeftoverOunces = thisTotalOunces - subTotalOunces;
		// work out the remainders
		
		
		
		// change the old objects properties to the new correct values
		if ( totalLeftoverOunces <= 0 ) {
			str = "youre taking away more than you had! you're back at 0 for all values.";
			this.setStones(0);
			this.setPounds(0);
			this.setOunces(0);
		} else {
			int newStones = totalLeftoverOunces % (14*16);
			int leftoverPoundsOunces = totalLeftoverOunces - newStones;
			int newPounds = leftoverPoundsOunces % 16;
			int leftoverOunces = leftoverPoundsOunces - newPounds;
			
			System.out.println(newStones);
			System.out.println(leftoverPoundsOunces);
			System.out.println(newPounds);
			System.out.println(leftoverOunces);
			str = "weight subtracted successfully.";
			
			this.setStones(newStones);
			this.setPounds(newPounds);
			this.setOunces(leftoverOunces);
		}
		return str;
		
	}
	
	public NewWeight askForWeight(){
		int[] weights = Utilities.int_returnThreeJTextFields("Stones", "Pounds", "Ounces");
		NewWeight newWeight = new NewWeight( weights[0], weights[1], weights[2] );
		return newWeight;
	}
	
	public String toString(){ // lots of conditions
		int thisStones = this.stones;
		int thisPounds = this.pounds;
		int thisOunces = this.ounces;
		String str = String.format("%d stones %d lbs %d oz", thisStones, thisPounds, thisOunces); // gives all the info just incase 
		if ( thisStones == 0 ) { // write no stones 
			if ( thisPounds == 0 ) {
				str = String.format( "%d oz", thisOunces );
			} else if ( thisOunces == 0 ) {
				str = String.format( "%d oz", thisPounds );
			} else if ( thisPounds == 0 && thisOunces == 0 ) {
				str = ""; // null string implementation
			} else {
				str = String.format( "%d lbs %d oz", thisPounds, thisOunces );
			}
		} else if ( thisStones == 1 ) { // write stone not stones
			if ( thisPounds == 0 ){
				str = String.format("%d stone %d oz", thisStones, thisOunces);
			} else if ( thisOunces == 0 ) {
				str = String.format("%d stone %d lbs", thisStones, thisPounds);
			} else if ( thisPounds == 0 && thisOunces == 0 ) {
				str = String.format("%d stone", thisStones );
			} else {
				str = String.format( "%d stone %d lbs %d oz", thisPounds, thisOunces );
			}
		} else {
			if ( thisPounds == 0 ){
				str = String.format("%d stones %d oz", thisStones, thisOunces);
			} else if ( thisOunces == 0 ) {
				str = String.format("%d stones %d lbs", thisStones, thisPounds);
			} else if ( thisPounds == 0 && thisOunces == 0 ) {
				str = String.format("%d stones", thisStones );
			} else {
				str = String.format( "%d stone %d lbs %d oz", thisPounds, thisOunces );
			}
		}
		return str;
	}

	public int getStones(){ return this.stones; }

	public int getPounds(){ return this.pounds; }

	public int getOunces(){ return this.ounces; }
	
	public void setStones(int stn) { 
		if(stn >= 0){
			this.stones = stn;
		}
	}
	
	public void setPounds(int pnds) { 
		if (pnds >= 0 && pnds < 14) {
			this.pounds = pnds;
		}
		 
	}
	
	public void setOunces(int oz) { 
		if (oz >= 0 && oz < 16 ) {
			this.ounces = oz; 
		}
	}
	
	public String getCurrentWeight(){
		String str = "";
		if ( validWeight() == true ){
			str = this.toString();
		}
		return str;
	}
	
} // end of class
