public class DividenConquer{
    public static int search(int arr[],int target,int si,int ei){
        //basecase
        if(si>ei){
            return-1;
        }
        //find mid
        int mid=si+(ei-si)/2;//(si+ei)/2

        //case foundcheck mid is target
        if(arr[mid]==target){
            return mid;
        }

        //mid on L1;
        if(arr[si]<=arr[mid]){
            //case a left side
            if(arr[si]<=target && target<arr[mid]){
                return search(arr,target,si,mid-1);
            }
            //right side
            else{
                return search(arr, target, mid+1, ei);
        }
    }else{
            //case right side of L2
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    //majority element appears more than n/2 times
    public static int majority(int[] num){
        int Mcount=num.length/2;

        for(int i=0;i<num.length;i++){
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[i]==num[j]){
                    count+=1;
                }
            }
            if(count>Mcount){
                return num[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        //int arr[]={4,5,6,7,0,1,2};
        //int target=6;
        //int tarindx=search(arr,target,0,arr.length-1);
        //System.out.println(tarindx);
        int num[]={2,2,1,1,1,2,2};
        int ans=majority(num);
        System.out.println(ans);
    }
}