class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class BankAccount {
    public String username;
    private int password;

    public void setPassword(int pwd) {
        password = pwd;
    }

    public int getPassword() {
        return password;
    }

    void setusername(String newusername) {
        username = newusername;
    }
}

public class Oops {   // public class (must match file name)
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());

        BankAccount myACC = new BankAccount();
        myACC.username = "Rahul";
        System.out.println(myACC.username);

        myACC.setPassword(34455);
        System.out.println(myACC.getPassword());
    }
}