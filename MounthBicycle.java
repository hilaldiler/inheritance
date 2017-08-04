package tr.org.linux.kamp.inheritance;

public class MounthBicycle extends Bicycle {
	
	int spin; //dönüş oranı
	
	public MounthBicycle(int gear, int speed, String color) {
		super(gear, speed, color);
		
	}
	
	public MounthBicycle(Bicycle b, int s) {
		super(1, 2, "beyaz");
		spin=s;
	}

	public MounthBicycle(int gear, int speed, String color, int spin) {
		super(gear, speed, color);
		this.spin = spin;
	}
	
	public void spinUp(int spin) {
		this.spin+= spin;
		
	}

	public int getSpin() {
		return spin;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}
	
	
	
	
	

}
