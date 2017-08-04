package tr.org.linux.kamp.inheritance;

public class HumanTest {

	public static void main(String[] args) {
		
		//Sınıf üzerinden nesne oluşturduk
		Human merve = new Human();
		Human merve2 = new Human("Mrv","123456","45",3);

		//Nesnenin durumlarını atadık
		merve.name="Merve";
		merve.age=23;
		merve.gender="girl";
		merve.id="201311062";
		
		//Nesnenin davranıslarını girdik 
		merve.slepp();
		merve.eat();
		merve.speak();
		
		
		
		
	}
}
