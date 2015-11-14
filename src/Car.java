
public class Car {
//Car ist der Name des Typen den wir abbilden wollen
	
	//Attribute
	public int CurrentGear;
	public int CurrentSpeed;
	public String Color;
	public String Brand;
	public int Year;
	
		//Auto schaltet in den nöchsten Gang
		public void nextGear() {
			CurrentGear++;
		}
		
		//Gang wird neu gesetzt
		public void setCurrentGear(int newGear) {
			CurrentGear = newGear;
		}
		
		//Geschwindigkeit um 10 erhöhen
		public void accelerate() {
			CurrentSpeed += 10;
		}
		
		public void accelerate(int customSpeed) {
			CurrentSpeed += customSpeed;
		}
	

}
