# README 1 - Pulsar & Bike Information (IS-A Relationship)

## Project Overview

This project demonstrates the **IS-A** (Inheritance) relationship in object-oriented programming (OOP) using Java. It simulates a **Pulsar** motorcycle by setting properties such as color, maximum speed, and providing functionality to start the motorcycle. The **Pulsar** class is derived from the **Bike** class, showing the concept of inheritance.

### Main Classes

1. **Bike Class**:
   - This class holds basic attributes of a motorcycle, such as color and maximum speed.
   
2. **Pulsar Class**:
   - The **Pulsar** class extends the **Bike** class and demonstrates the **IS-A** relationship. It adds additional functionality, such as starting the motorcycle, on top of the properties inherited from the **Bike** class.

3. **Test Class**:
   - This class is used to test the functionality of the **Pulsar** class by setting the color and maximum speed of the motorcycle, displaying its info, and simulating the starting of the motorcycle.

## Features

- **Motorcycle Information**: The motorcycle's color and maximum speed can be set.
- **Start Functionality**: Simulates the action of starting the motorcycle.
- **IS-A Relationship**: The **Pulsar** class inherits from the **Bike** class, extending its behavior.

## Code Explanation

- The **Bike** class holds basic attributes such as color and max speed and provides a method to display these attributes.
- The **Pulsar** class inherits from **Bike** and adds specific behavior to start the motorcycle.
- The **Test** class is used to test the **Pulsar** functionality by setting the bike's properties and invoking the start method.

## Example Output

```
Motor Color: BLACK
Max Speed: 136 km/h
Starting Pulsar...
Pulsar Started!
```

## Conclusion

This project demonstrates the **IS-A** relationship (inheritance) by showing how one class can inherit the properties and behavior of another class. In this case, the **Pulsar** class extends the **Bike** class and adds its unique functionality, such as starting the motorcycle.

---

# README 2 - Car with Tire Pressure Check (HAS-A Relationship)

## Project Overview

This project demonstrates the **HAS-A** (Composition & Aggregation) relationship in object-oriented programming (OOP) using Java. In this project, a **Car** class contains four **Tire** objects, and before starting the car, the tire pressures are checked to ensure they are correctly inflated. This demonstrates the **HAS-A** relationship, where a car "has" tires, which are integral parts of the car's functionality.

### Main Classes

1. **Tire Class**:
   - The **Tire** class holds the tire's pressure, color, size, and type. It includes functionality to inflate the tire and adjust its pressure.
   
2. **Car Class**:
   - The **Car** class has four **Tire** objects. It checks whether all tires have the proper pressure before the car can be started.

3. **MainProgram Class**:
   - This class simulates the process of creating a car with tires, inflating them, and checking whether the car can start based on the tire pressure.

## Features

- **Tire Pressure Check**: Tires must be inflated to a certain pressure before the car can be started.
- **Car Start Functionality**: The car will only start if all tires have the correct pressure.
- **HAS-A Relationship**: The **Car** class "has" **Tire** objects. The car cannot function properly without its tires.

## Code Explanation

- The **Tire** class manages the tire's pressure and provides a method to inflate the tire.
- The **Car** class includes a collection of **Tire** objects and checks whether all tires are properly inflated before starting the car.
- The **MainProgram** class creates instances of tires and a car, inflates the tires, and checks if the car can start based on tire pressure.

## Example Output

```
Tire 1 pressure: 50 psi
Tire 2 pressure: 0 psi
Tire 3 pressure: 0 psi
Tire 4 pressure: 0 psi
The car failed to start
```

## Conclusion

This project demonstrates the **HAS-A** relationship (composition and aggregation) by showing how a **Car** class can contain **Tire** objects, which are essential for the car to function. The car cannot start if its tires are not properly inflated, showcasing how one object (the car) "has" other objects (the tires) that it depends on for its behavior.
