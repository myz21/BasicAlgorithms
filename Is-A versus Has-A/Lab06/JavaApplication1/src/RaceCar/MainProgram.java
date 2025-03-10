
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire t1 = new Tire(0, "black", 18, "ZigZak");
		Tire t2 = new Tire(0, "red", 18, "ZigZak");
		Tire t3 = new Tire(0, "white", 18, "ZigZak");
		Tire t4 = new Tire(0, "pink", 18, "ZigZak");
		Tire[] tires = {t1, t2, t3, t4};
		
		t1.inflate(50);
		//create an instance of Car
		Car supercar = new Car("red", "x",tires);
		
		boolean started = false;
		started = supercar.Start();
		
		if(started == true) {
			System.out.print("the car is running");
		}
		else {
			System.out.print("the car fail to start");
		}
		//this example only shpws a check for tire pressure.
		//The car start method should also check to see if the engine is installed.
		
		
	
	}

}
