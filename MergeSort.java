public class MergeSort {
    
    public static void printarr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;

        mergeSort(arr, si, mid);       // left
        mergeSort(arr, mid+1, ei);     // right

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];

        int i = si;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    //applying Merge Sort on an array of Strings:
    public static void mergeString(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeString(arr, si, mid);//left
        mergeString(arr, mid+1, ei);//right
        merge2(arr, si, mid, ei);
    }
    public static void merge2(String arr[],int si,int mid,int ei)
    {
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if (arr[i].compareTo(arr[j]) <= 0){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i]=temp[k];
    }
}
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeString(arr, 0, arr.length - 1);
        printarr(arr);
        //mergeSort(arr, 0, arr.length - 1);
        //printarr(arr);
    }
}
