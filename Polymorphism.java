// Advanced Polymorphism Example for GitHub Project

// Compile Time Polymorphism (Method Overloading)
class Calculate {

    // Integer addition
    public int add(int a, int b) {
        return a + b;
    }

    // Float addition
    public float add(float a, float b) {
        return a + b;
    }

    // Three integer addition
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Double addition
    public double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism (Method Overriding)
class Animal {

    void eat() {
        System.out.println("Animals eat food.");
    }

    void sound() {
        System.out.println("Animal makes sound.");
    }
}

// Dog class
class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog eats meat.");
    }

    @Override
    void sound() {
        System.out.println("Woof! Woof!");
    }
}

// Cat class
class Cat extends Animal {

    @Override
    void eat() {
        System.out.println("Cat drinks milk.");
    }

    @Override
    void sound() {
        System.out.println("Meow! Meow!");
    }
}

// Main Class
public class Polymorphism {

    public static void main(String[] args) {

        System.out.println("===== Compile Time Polymorphism =====");

        Calculate calc = new Calculate();

        System.out.println("Addition of 2 integers: " + calc.add(2, 4));

        System.out.println("Addition of 2 floats: " +
                calc.add((float) 2.1, (float) 3.9));

        System.out.println("Addition of 3 integers: " +
                calc.add(2, 4, 6));

        System.out.println("Addition of 2 doubles: " +
                calc.add(10.5, 20.5));

        System.out.println("\n===== Runtime Polymorphism =====");

        // Runtime Polymorphism
        Animal a1 = new Dog();
        a1.eat();
        a1.sound();

        System.out.println();

        Animal a2 = new Cat();
        a2.eat();
        a2.sound();

        System.out.println("\n===== Array of Objects =====");

        // Dynamic Method Dispatch
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Dog()
        };

        for (Animal a : animals) {
            a.sound();
        }
    }
}
