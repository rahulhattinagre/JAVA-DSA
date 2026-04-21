import java.util.ArrayList;
import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class MultidimAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

        ArrayList<Integer> List1=new ArrayList<>();
        ArrayList<Integer> List2=new ArrayList<>();
        ArrayList<Integer> List3=new ArrayList<>();

        for(int i=0;i<=5;i++){
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }
        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);

        System.out.println(mainList);
            for(int i=0;i<mainList.size();i++){
                ArrayList<Integer> currentList=mainList.get(i);
                for(int j=0;j<currentList.size();j++){
                    System.out.print(currentList.get(j)+" ");
                }
                System.out.println();
            }
    }
}
