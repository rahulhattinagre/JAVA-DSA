public class reverseArrays {
    public static void reverseArrays(int arrays[]) {
       int first=0 , last=arrays.length-1;
       while(first<last){
        //swap
        int temp=arrays[last];
        arrays[last]=arrays[first];
        arrays[first]=temp;

        first++;
        last--;

       }
    }
    public static void main(String[] args) {
        int arrays[]={1,2,3,4,5};
        reverseArrays(arrays);

        for(int i=0;i<arrays.length;i++){
            System.out.print(arrays[i]+" ");
        }
        System.out.println();
    }
    
}
