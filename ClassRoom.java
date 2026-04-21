import java.util.ArrayList;
import java.util.Collections;
public class ClassRoom{
   public static void swap(ArrayList<Integer> list,int indx1,int indx2){
        int temp=list.get(indx1);
        list.set(indx1,list.get(indx2));
        list.set(indx2,temp);
      }
    public static void main(String []arg){
        //classname objname=new classname();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String>  list1=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();

         list.add(2);
         list.add(5);
         list.add(9);
         list.add(3);
         list.add(6);

       /*   list.add(3,9);
        System.out.println(list);
        // operation of ArrayList
        //add
        list.add(6);
        System.out.println(list);

        //get element
        int element=list.get(2);
        System.out.println(element);

        //set
        list.set(2,10);
        System.out.println(list);

        //remove
        list.remove(3);
        System.out.println(list);

        //contain
        System.out.println(list.contains(10));
        System.out.println(list.contains(11));
*/
        //size of array
        /*System.out.println(list.size()); 
        for(int i=0;i<list.size();i++){
          System.out.print(list.get(i));
        }
        System.out.println();*/

        //reverse order
        /*for(int i=list.size()-1;i>=0;i--){
          System.out.print(list.get(i)+" ");
        }
        System.out.println();*/

        //find max in array
      /*int max = Integer.MIN_VALUE;

      for(int num : list){
      if(num > max){
        max = num;
    }
}
 System.out.println("Maximum value: " + max);*/
  
     /* //swap 
      int indx1=1,indx2=3;
      System.out.println(list);
      swap(list,indx1,indx2);
      System.out.println(list);*/

      System.out.println(list);
      //sorting a array list
      Collections.sort(list);
      System.out.println(list);//assending order
      Collections.sort(list,Collections.reverseOrder());
      System.out.println(list);//descending order
    }
}
