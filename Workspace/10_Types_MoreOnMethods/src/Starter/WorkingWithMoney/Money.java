package Starter.WorkingWithMoney;

public class Money {
	private boolean validMoney;
	private int pence;
	private int pounds;
	
	
	
	public Money( int pnds, int pennies ){
		getValidMoney();
		if( validMoney == true ){
			//System.out.println("valid pennies");
			changePoundsAndPence(pnds, pennies);
		} else {
			//System.out.println("not valid pennies");
			setPounds(pnds);
			setPence(pennies);
		}
		
		
	}
	
	public int getPence() {
		return pence;
	}
	
	public void setPence(int pence) {
		this.pence = pence;
	}
	
	
	public boolean getValidMoney() {
		int pennies = this.pence;
		int pnds = this.pounds;
		if( pennies >= 0 && pennies < 100 && pnds >= 0 ){
			setValidMoney(true);
		} else {
			setValidMoney(false);
		}
		return validMoney;
	}
	
	public void setValidMoney(boolean validMoney) {
		this.validMoney = validMoney;
	}
	
	public String getCurrentMoney() {
		if ( getValidMoney() ) {
			return String.format("Current money is: �%d.%02d", getPounds(), getPence());
		} else {
			return String.format("error: invalid money. getValidMoney returned %s", getValidMoney());
		}
	}

	public int getPounds() {
		return pounds;
	}
	
	public void setPounds(int pounds){
		this.pounds = pounds;
	}
	
	public void addMoney(int pnds, int pennies) {
		int totalPounds = this.pounds + pnds;
		int totalPence = this.pence + pennies;
		System.out.println(String.format("Pounds: %d \tPence: %d", totalPounds, totalPence));
		//changePoundsAndPence(pounds, pence);
		
	}
	
	public void addMoney(int pence) {
		
	}
	
	
	public void changePoundsAndPence(int pounds, int pence){
		
		int totalPence = 100*pounds + pence;
		int totalPenceRemainder = totalPence % 100;
		int newPounds = (totalPence - ( totalPence % 100 ) )/100;
		this.pounds = newPounds;
		System.out.println(totalPence);
		System.out.println(totalPenceRemainder);
		System.out.println(newPounds);
		this.pence = totalPenceRemainder;
		
	}

	public int[] getCurrentMoneyArray(){
		int[] mArr = new int[2];
		mArr[0] = getPounds();
		mArr[1] = getPence();
		return mArr;
	}
	
	
	
	public String toString() {
		return String.format("Money Value: �%d.%02d ", this.pounds, this.pence);
	}
	
	
	
	
	
	
} // end of class
