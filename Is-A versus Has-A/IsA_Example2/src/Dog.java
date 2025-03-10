public class Dog extends Animal {
    
    public Dog(String name, int age) {
        super(name, age);  // Animal constructor'ını çağırıyoruz.
    }
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
   
}
