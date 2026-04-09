class Animal{
    void eat(){
        System.out.println("Eating...");
    }
    void breathe(){
        System.out.println("Breathing...");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swimming...");
    }
}
class dog extends Animal{
    int leg;
    void sound(){
        System.out.println("BOW BOW BO....");
    }
}
public class Inheritance {
    public static void main(String[] args){
        dog f1=new dog();
        f1.eat();
        f1.breathe();
        f1.leg=4;
        System.out.println("Number of legs :"+f1.leg);
        f1.sound();

        Fish f2=new Fish();
        f2.swim();
        f2.eat();

    }
}