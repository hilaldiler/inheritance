package tr.org.linux.kamp.inheritance;

/*
 * A classı ->parent
 * int x ve y();
 * 
 * class B extends A
 */

public class Animal {
	

	private String type;
	private String name;
	private String gender;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(String type, String name, String gender, int age) {
		super();
		this.type = type;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	//davranıs - metotlar
	
	public void eat() {
		System.out.println("Animal yemek yedi.");
	}
	
	public void hunt() {
		System.out.println("Animal avlandı");
	}
	
	// get-set metotları
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}
