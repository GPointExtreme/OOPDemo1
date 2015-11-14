
public class Konto {
	
	private String inhaber;
	private double kontostand;
	
	public void setInhaber(String inhaber) {
		this.inhaber = inhaber;
		kontostand = 0;
	}
	
	public void aufbuchen(double wert) {
		kontostand += wert;
	}
	
	public void abbuchen(double wert) {
		if (kontostand >= wert) {
			kontostand -= wert;
		}
		else {
			System.out.println("Wert ist zu hoch!");
		}
		
	}
		
	public double getkontostand() {
		return kontostand;
	}
		
	
	

}
