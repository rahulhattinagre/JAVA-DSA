import java.util.*;
public class testString {
    public static void printChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }  

    //Convert the first letter of every word to uppercase.


    

    //string Compress
    public static String compress(String str){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    //count how many times vowels user can entered
    public static void main(String[] args) {
       // String firstName= "Rahul";
        //String lastName= "Hattinagre";
        //String fullName= firstName+" "+lastName;
       // System.out.println(fullName.charAt(0));
        //printChar(fullName);
      //  String str="i am rahul";
      //  System.out.println(toUpperCase(str));
     // String str="aaabbbccddd";
      //System.out.println(compress(str));

        //count how many times vowels user can entered
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str =sc.next();
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' ||ch=='e' ||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);

    }
}
