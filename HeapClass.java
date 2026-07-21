
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

        public int peek() {
            return arr.get(0);
        }

        //heapify
        public void heapify(int i) {
            int mini = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.size() && arr.get(left) < arr.get(mini)) {
                mini = left;
            }
            if (right < arr.size() && arr.get(mini) > arr.get(right)) {
                mini = right;
            }

            if (mini != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(mini));
                arr.set(mini, temp);

                heapify(mini);
            }
        }

        public int remove() {
            //get 0 index
            int data = arr.get(0);

            //swap both
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //after swaping remove leaf
            arr.remove(arr.size() - 1);

            //call heap beacause fix the heap
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);

        while (!h.isEmpty()) {
            System.out.print(h.peek() + "  ");
            h.remove();
        }

    }
}
