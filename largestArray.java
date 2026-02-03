public class largestArray {
    public static int getLargest(int []num){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;


        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("Smallest number is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arrays[]={2,5,7,9,0,10,30,29};
        System.out.println(" Largest Number : "+getLargest(arrays));
    }
}