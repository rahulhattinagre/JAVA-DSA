import java.util.ArrayList;
public class ClassRoom{
    
    public static void main(String []arg){
        //classname objname=new classname();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String>  list1=new ArrayList<>();
        ArrayList<Boolean> list2=new ArrayList<>();

         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);

       /*   list.add(3,9);
        System.out.println(list);
        
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
        System.out.println(list.size()); 
        for(int i=0;i<list.size();i++){
          System.out.print(list.get(i));
        }
        System.out.println();
    }
}