public class Cat extends Animal {
    
    public Cat(String name, int age) {
        super(name, age);  // Animal constructor'ını çağırıyoruz.
    }

    @Override
    public void makeSound(){
    System.out.println("Meov");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
