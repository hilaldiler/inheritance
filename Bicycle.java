package tr.org.linux.kamp.inheritance;

public class Bicycle {
	
	private int gear;
	private int speed;
	private String color;
	
	
	public Bicycle(int gear, int speed, String color) {
		super();
		this.gear = gear;
		this.speed = speed;
		this.color = color;
	}
	
	public void changeSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public void changeGear(int gear) {
		if(gear>0)
			this.gear = gear;
		System.out.println("Vites değeri sıfırdan küçük olamaz");		
	}
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	
	}
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + ", color=" + color + ", getGear()=" + getGear()
				+ ", getSpeed()=" + getSpeed() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
