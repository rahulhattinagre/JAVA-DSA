public class bitOperation{
public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return  0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n| bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);

        return n & bitMask;
    }
   public static int updateIthBit(int n,int i,int newBit){
        
        n=clearIthBit(n,i);
        int bitMask=newBit<<i;
        return n| bitMask;
    }
 public static int clearLastIthBit(int n,int i){
         int bitmask=(~0)<<i;
         return n |bitmask;
    }
    public static void main(String []args){
        /*System.out.println(5&6);
        System.out.println(5|6);
        System.out.println(5^6);
        System.out.println(~5);
        System.out.println(5<<2);
        System.out.println(6>>1);*/
        //evenOrOdd(5);
        //evenOrOdd(6);
        //evenOrOdd(8);
       // System.out.println(getIthBit(10,2));
        //System.out.println(setIthBit(10,2));
        //System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(updateIthBit(10,2));
    }
    
}
