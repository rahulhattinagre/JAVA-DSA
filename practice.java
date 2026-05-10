public class practice {
    public static int searchKey(int num[],int key){
        int start=0 ,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
        }
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5,6,7,8,9,5};
        int key=5;
        System.out.println(searchKey(num, key));
    }
}