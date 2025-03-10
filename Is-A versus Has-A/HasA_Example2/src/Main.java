public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(140, "sedan" );
        Car car = new Car("Opel","Astra",engine);

        car.printCarInfo();
    }
}
