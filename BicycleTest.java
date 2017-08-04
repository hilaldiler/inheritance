package tr.org.linux.kamp.inheritance;

public class BicycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle myBike = new Bicycle(10, 2, "Sarı");
		
		MounthBicycle mb2= new MounthBicycle(myBike, 7);
		
		System.out.println("MountBicycle information : " + " Speed : "+
				mb2.getSpeed() +" Gear: " +mb2.getGear()+" Color: " + mb2.getColor() +" Spin: "+ mb2.getSpin());
				
		
		MounthBicycle mb1 = new MounthBicycle(3, 4, "White");
		mb1.setSpin(17);
		
		System.out.println("MountBicycle information : " + " Speed : "+
				mb1.getSpeed() +" Gear: " +mb1.getGear()+" Color: " + mb1.getColor() +" Spin: "+ mb1.getSpin());
				
		

	}

	@Override
	public String toString() {
		return "BicycleTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

}
