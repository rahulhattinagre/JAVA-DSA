class Animal{
    String color;
    Animal(){
        System.out.println("Animal is created....");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="Brown";//super keyword is used to call parent class constructor
        System.out.println("Horse is created....");
    }
}
public class Superkeyword {
    public static void main(String[] args) {
        Horse h=new Horse();
        System.out.println(h.color);
    }
}
