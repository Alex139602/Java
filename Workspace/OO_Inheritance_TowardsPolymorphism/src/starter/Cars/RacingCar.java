package starter.Cars;

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
	
   @Override public String getModel(){
	   return "Formula 1 " + super.getModel();
   }
	public RacingCar(String model, String driver, int turboFactor) {
		super(model);
        setDriver(driver);
        setTurboFactor(turboFactor);
    }
	
	@Override public void accelerate(int seconds){
		setSpeed( this.getSpeed() + ( 5 * seconds * this.turboFactor ) );
	}
	
}
