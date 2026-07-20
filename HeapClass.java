import java.util.ArrayList;

public class HeapClass {

    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            //add at last automatically arraylist
            arr.add(data);
            int x = arr.size() - 1;//last index;

            while (x > 0) {
                int par = (x - 1) / 2;//get parent
                if (arr.get(x) < arr.get(par)) {
                    int temp = arr.get(x);
                    arr.set(x, arr.get(par));
                    arr.set(par, temp);

                    x = par;
                } else {
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        System.out.print(h.arr);
    }
}
