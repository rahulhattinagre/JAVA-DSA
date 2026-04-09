//compile time polymorphism(overloding)
class Calculate{
    public int add(int a,int b){
        return a+b;
    } 
    public float add(float a,float b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
//overriding
class animal{
    void eat(){
        System.out.println("Eating.....");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("Woof! Woof!");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        //compile time poly.. overloading
        Calculate calc = new Calculate();
        System.out.println(calc.add(2,4));
        System.out.println(calc.add((float)2.1,(float)3.9));
        System.out.println(calc.add(2,4,6));

        //overiding
        animal d1= new dog();
        d1.eat();
    }
}
