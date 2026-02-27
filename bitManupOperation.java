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
public static int clearrangeIthBit(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1-i)<<-1;

        int bitmask=a | b;
        return n & bitmask;
    }
         public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }
        public static int countSetBit(int n){
        int count =0;
        while (n>0) {
        if((n & 1)!= 0){
            count++;
        }           
        n=n>>1;
        }
        return count;
    }
         public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n & 1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
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
        System.out.println(updateIthBit(10,2,4));
        System.out.println(countSetBit(10));
        System.out.println(isPowerOfTwo(8));
        System.out.println(fastExpo(3,5));
    }
    
}
