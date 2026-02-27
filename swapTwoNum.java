public class swapTwoNum {
    public static void main(String[] args) {
        //swap two number without using third variable
        int a=5;
        int b=3;
        a=a^b; //5^3=6
        b=a^b; //6^3=5
        a=a^b; //6^5=3
        System.out.println("a="+a+", b="+b);
    }
    
}
