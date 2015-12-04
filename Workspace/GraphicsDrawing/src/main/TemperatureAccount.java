package main;

public class TemperatureAccount {
	
	public double celcius;
	
	
	
	public TemperatureAccount(double celcius){
		this.celcius = celcius;
	}
	
	public double convertToC(double f ){
		return ( (f-32.0) * (5/9) );
	}
	
	public double convertToF(double c ){
		return ( (9*c/5) + 32.0 );
	}

	public double getCelcius() {
		return celcius;
	}

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}

}
