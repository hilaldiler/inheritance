 package tr.org.linux.kamp.inheritance;

//insan classı olusturuldu

public class Human {

	String name;
	String gender;
	String id;
	int age;

	public Human() {
		System.out.println("Human is cerated...\n");
	}

	public Human(String name, String gender, String id, int age) {
		//super(); //tüm classlar bir nesnedir. hepsi Object clasından extend ediyor.
		this();
		this.name = name;
		this.gender = gender;
		this.id = id;
		this.age = age;
	}

	public static void slepp() {

		System.out.println("sleppingg..");
	}

	public static void eat() {

		System.out.println("eating..");

	}

	public static void speak() {

		System.out.println("speakingg..");

	}

	public static void moveTo() {

		System.out.println("movingtoo..");

	}

	public static void thinking() {

		System.out.println("thinking..");

	}

}
