
public class Demo {

	public static void main(String[] args) {
		//Hier verwenden wir nun unsere Klassen und legen Autos damit an
		
		Car porsche911 = new Car();
		porsche911.Brand = "Porsche";
		porsche911.Color = "black";
		porsche911.Year = 2000;
		porsche911.setCurrentGear(3);
		
		System.out.println("Aktueller Gang Porsche: " + porsche911.CurrentGear);
		porsche911.nextGear();
		System.out.println("Aktueller Gang Porsche: " + porsche911.CurrentGear);
		porsche911.accelerate();
		System.out.println("Porsche fährt: " + porsche911.CurrentSpeed);
		porsche911.accelerate(30);
		System.out.println("Porsche fährt: " + porsche911.CurrentSpeed);
		porsche911.accelerate();
		System.out.println("Porsche fährt: " + porsche911.CurrentSpeed);
		
		Car golf5 = new Car();
		golf5.Brand = "VW";
		golf5.Color = "White";
		golf5.Year = 2012;
		golf5.setCurrentGear(0);
		
		System.out.println("Aktueller Gang Golf: " + golf5.CurrentGear);
		golf5.nextGear();
		System.out.println("Aktueller Gang Golf: " + golf5.CurrentGear);

	}

}
