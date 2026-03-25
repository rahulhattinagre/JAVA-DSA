class address {
    String city;

    address(String city) {
        this.city = city;
    }
}

class Student {
    String name;
    int age;
    address addr;

    // parameterized constructor
    Student(String name, int age, address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    // 🔹 Shallow Copy Constructor
    Student(Student s, boolean shallow) {
        this.name = s.name;
        this.age = s.age;
        this.addr = s.addr;   //same reference
    }

    // 🔹 Deep Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.addr = new address(s.addr.city); //  new object
    }
}

public class ShallowDeep_copy {
    public static void main(String[] args) {

        address a1 = new address("Pune");
        System.out.println(a1.city);
        Student s1 = new Student("Rahul", 22, a1);

        // 🔹 Shallow Copy
        Student s2 = new Student(s1, true);

        // 🔹 Deep Copy
        Student s3 = new Student(s1);

        s2.addr.city = "Mumbai";
        System.out.println("Shallow Copy:");
        System.out.println(s1.addr.city); // changes

        s3.addr.city = "Delhi";
        System.out.println("Deep Copy:");
        System.out.println(s1.addr.city); //  unchanged
    }
}