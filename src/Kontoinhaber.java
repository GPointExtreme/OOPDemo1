
public class Kontoinhaber {

	public static void main (String[] args) {
		
		Konto MaxMustermann = new Konto();
		
		MaxMustermann.setInhaber("MaxMustermann");
		
		MaxMustermann.aufbuchen(1000);
		System.out.println(MaxMustermann.getkontostand());
		MaxMustermann.abbuchen(500);
		System.out.println(MaxMustermann.getkontostand());
		MaxMustermann.aufbuchen(1000);
		System.out.println(MaxMustermann.getkontostand());
		
	}
	
}
