import java.security.PublicKey;

public class Oops {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);
        
        BankAccount myACC=new BankAccount();
        myACC.username="Rahul";
        System.out.println(myACC.username);
        myACC.setPassword("rahulhattinagre");
    }
    }
    class Pen{
        String color;
        int tip;
    void setColor(String newColor){
        color=newColor;
}
    void setTip(int newTip){
        tip=newTip;
    }
}

