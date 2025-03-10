
public class Car {

	private String color;
	private String name;
	//create array of Tires
	private Tire[] tires;
	
	private Engine e;
	
	//in order to start successfuly must have 4 tires 
	//with 32psi and engine installed 
	public boolean Start(){
		
		boolean success = true;
	//the loop will check four tires pressures
		for(int i=0; i<tires.length;i++) {
			if(tires[i].getPressure()<32) {
				System.out.println("Tire #"+i+"is too low to start the car");
				success = false;
			}
		}

		return success;


	}
	
	
	public Car(String color, String name, Tire[] tires) {
		super();
		this.color = color;
		this.name = name;
		this.tires = tires;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Tire[] getTires() {
		return tires;
	}
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
	
	
}
