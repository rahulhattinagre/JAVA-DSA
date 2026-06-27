import java.util.Arrays;

public class SortArray012 {

    public static void sortArray(int nums[]) {
        int cont0=0;
        int cont1=0;
        int cont2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cont0++;
            }
            else if(nums[i]==1){
                cont1++;
            }
            else
            {
                cont2++;
            }
        }
        for(int i=0;i<cont0;i++){
            nums[i]=0;
        }
        for(int i=cont0;i<cont0+cont1;i++){
            nums[i]=1;
        }
        for(int i=cont0+cont1;i<nums.length;i++){
            nums[i]=2;
        }
      //  Arrays.sort(nums);
    }

    public static void main(String[] args) {

        int nums[] = {1,0,2,1,0,2,1,0};

        sortArray(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}