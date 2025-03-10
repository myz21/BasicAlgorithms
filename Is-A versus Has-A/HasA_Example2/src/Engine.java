public class Engine {
    int horsePower; //beygir gücü
    String type; //tip
    
    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void getEngineInfo(){
        System.out.println("Horsepower: "+horsePower+" type: "+type);
    }

}