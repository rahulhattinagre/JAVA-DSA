class Student{
    String name;
    int age;

    Student(){//default constructor
        name="Rahul";
        age=22;
    }
    Student(String name,int age){//parameterized constructor
        this.name=name;
        this.age=age;
    }
    Student(Student s2){//copy constructor
        this.name=s2.name;
        this.age=s2.age;
    }

}
    public class Constructor {
        public static void main(String[] args) {
            Student s1=new Student();
            System.out.println(s1.name+","+s1.age);
            Student s2=new Student("Rohit",21);
            s2.age=26;
            System.out.println(s2.name+","+s2.age);
            Student s3=new Student(s2);
            System.out.println(s3.name+","+s3.age);

        }
}