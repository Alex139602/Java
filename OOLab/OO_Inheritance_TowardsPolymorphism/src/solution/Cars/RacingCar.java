package Solution.Cars;

public class RacingCar extends Car {
    private String driver ;
    public String getDriver() {
		return driver;
	}
	private void setDriver(String driver) {
		this.driver = driver;
	}
	
	private int turboFactor ;
	public int getTurboFactor() {
		return turboFactor;
	}
	private void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
    public String getModel() { 
        return "Formula 1 " + super.getModel();     
    }

    public RacingCar(String model, String driver, int turboFactor)
    {
    	super(model); 
        setDriver(driver);
        setTurboFactor(turboFactor);
    }

    public void accelerate(int seconds) {
    	int increase = 5 * seconds * getTurboFactor();
    	setSpeed(increase + getSpeed()); 
    }
}
