public class Backtracking {
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recurssin
        arr[i]=val;
        changearr(arr,i+1,val+1);//fn call step
        arr[i]=arr[i]-2; //backtracking step
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //findsubsets of String
    public static void findSubsets(String str,String ans,int i){
        //base case
        if(i== str.length()){
            if(ans.length()== 0){
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //recurssion 
        //YES choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //NO choice
        findSubsets(str, ans, i+1);

    } 
    public static void main(String[] args){
        //int arr[]=new int[5];
        //changearr(arr,0,1);
        //printarr(arr);
        String str="abc";
        findSubsets(str, " ", 0);
    }
}
