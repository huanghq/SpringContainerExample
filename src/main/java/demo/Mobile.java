package demo;

public class Mobile{
	private String brand;
	private Battery battery;
	private Simcard simcard;

	public Mobile(String brand){
		this.brand = brand;
	}
	public void setBattery(Battery battery){
		this.battery =  battery;
	}
	public void setSimcard(Simcard simcard){
		this.simcard = simcard;
	}
	public void poweron(){
		System.out.println("Mobile: " +  this.brand + " powered on");
		System.out.println("Battery: " + this.battery.getPower() );
		System.out.println("Simcard: " + this.simcard.getNumber() );

	}
}