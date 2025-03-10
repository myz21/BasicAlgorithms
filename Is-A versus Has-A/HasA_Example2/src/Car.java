public class Car {
    
    String make;
    String model;
    Engine engine; //has-a ilişkisi
    
    Car(String make, String model, Engine engine){
        this.make =make;
        this.model = model;
        this.engine = engine;
    }
    
    public void printCarInfo(){
        System.out.println("The brand is "+make+" and the model is "
        +model);

        engine.getEngineInfo();
    }
}
