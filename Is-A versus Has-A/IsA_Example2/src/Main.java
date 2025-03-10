public class Main {
    
    public static void main(String[] args) {
        Animal dog = new Dog("Çomar",3);
        Animal cat = new Cat("Maviş",2);

        cat.makeSound();
        dog.makeSound();

        System.out.println(cat);
        System.out.println(dog);
    }
}
