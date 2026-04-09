abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal is created...");
    }
    void eat(){
        System.out.println("Eating....");
    }
    abstract void walk();
}
class dog extends Animal{
    dog(){
        System.out.println("Dog is created...");
    }
    void walk(){
        System.out.println("dog is walking on 4 legs..");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse is created...");
    }
    void walk(){
        System.out.println("Horse is galloping on 4 legs..");
    }
}
public class Abstraction {
    public static void main(String[] args) {
      Horse h1= new Horse();
      h1.eat();
      h1.walk(); 
      
      dog d1=new dog();
      d1.eat();
      d1.walk();

    }
    
}
