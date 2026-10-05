
@FunctionalInterface
interface A {

    public int add(int i);
}

class FunctionalInterface {

    public static void main(String[] args) {

        A obj = (int i) -> return i + 8;

        int result = obj.add(8);

        System.out.println(result);
    }
}
