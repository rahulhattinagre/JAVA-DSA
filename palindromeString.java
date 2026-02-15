public class palindromeString {
    //string is palindrome or not
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)==str.charAt(n-1-i)){
                return true ;
            }
        }
        return false;
    }

    //find sortest path EWNS NSEW
    public static float findpath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            int dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2 + y2); 
    }
    public static void main(String[] args) {
       // String str="NSEWNSEWWESN";
        //System.out.println(findpath(str));
        String fruits[]={"apple","mongo","banana","orange","pineapple"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}