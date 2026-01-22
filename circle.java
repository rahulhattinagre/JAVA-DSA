import java.util.*;
public class circle {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the radius of circle:");
            double radius= sc.nextDouble();
            double diameter = 2 * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Diameter :"+diameter);
            System.out.println("radius:"+radius);
            System.out.println("The area of circle is :"+area);
        }
}
