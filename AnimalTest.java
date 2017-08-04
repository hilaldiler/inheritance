package tr.org.linux.kamp.inheritance;

public class AnimalTest {

	
	/*
	 * inheritance --> extends 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal("Köpek", "Kuçi","boy",2);
		Animal a2 = new Animal();
		
		a2.setName("Badi");
		a2.setAge(3);
		a2.setGender("by");
		a2.setType("Köpek");
		
		System.out.println(a2.getAge()+" "+ a2.getName()+" "+ a2.getType());
		
		a1.hunt();
		a1.eat();

	}

}
