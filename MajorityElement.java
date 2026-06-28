import java.util.HashMap;
public class MajorityElement {
    public int majorNum(int nums[]){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }else{
            map.put(nums[i],1);
        }
        }
        for(int i=0;i<nums.length;i++){
           if(map.get(nums[i])>nums.length/2){
            return nums[i];
           }
        }
        return -1;
    }    
    public static void main(String[] args){
        int nums[]={7,0,0,0,1,7,2,0,0};
        MajorityElement me=new MajorityElement();

        System.out.println("Majority Number : "+me.majorNum(nums));
    }
}
