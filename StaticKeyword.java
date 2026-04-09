class Student{
    static int calPercentage(int math,int Physics,int Bio){
        int total=(math+Physics+Bio)/3;
        return total;
    }
    String name;
    int rollno;

    static String clgname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.clgname="SITS ";

       Student s2=new Student();
       System.out.println(s2.clgname);

       Student s3=new Student();
      // s3.clgname="Sits Narhe"; 
              System.out.println(s3.clgname);
 
    }
}
