public class stringFun{
  public static void main(String args[]){
    String str1="Rahul hattinagre";
    String str2="Nanded";
    System.out.println(str1.concat(str2));
    System.out.println(str1.contains(str2)); System.out.println(str1.toUpperCase());
    System.out.println(str1.lastIndexOf(str2));
    System.out.println(str1.toLowerCase());
    System.out.println(str1.charAt(2));
    System.out.println(str1.lastIndexOf(str2));
    System.out.println(str1.indexOf('a'));  
    System.out.println(str1.endsWith(str2))
    System.out.println(str1.replace("Nanded","Pune"));
    System.out.println(str1.substring(0));
    System.out.println(str1.split(""));
    System.out.println(str1.equals(str2));
    System.out.println(str1.startsWith("Rahul"));
    System.out.println(str1.trim());
    System.out.println(str1.endsWith(str2));
    System.out.println(str1.contains(str2));
    System.out.println(str1.compareTo(str2));
    System.out.println(str1.matches(str2));
    System.out.println(str1.repeat(3)); 
    System.out.println("java".equalsIgnoreCase("JAVA")); // true
    
  }
}