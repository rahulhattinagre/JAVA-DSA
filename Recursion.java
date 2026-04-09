public class Recursion {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1); 
    }
    // increasing order
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
      printInc(n-1);
      System.out.print(n+" ");   
    }
    // factorial 0!=1;
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    // sum f n natural number
    public static int sumOfN(int n){
        if(n==1){
            return 1;
        }
        int sumNm1=sumOfN(n-1);
        int sum=n+sumNm1;
        return sum;
    }
    //fibonacci series 0,1,1,2,3,5,8,13,21....
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibNm1=fib(n-1);
        int fibnm2=fib(n-2);
        int fibn=fibNm1+fibnm2;
        return fibn;
    }

    public static boolean isSorted(int arr[],int i){ //i is starting index
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,6,5};
       System.out.println(isSorted(arr, 0));
    }
    }
