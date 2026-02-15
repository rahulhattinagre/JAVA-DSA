public class practice {
    public static double checkStringPalindrome(String str){
       int x=0,y=0;
         for(int i=0;i<str.length();i++){
            int dir=str.charAt(i);
            if(dir=='E'){
                x++;
            }else if(dir=='w'){
                x--;
            }else if(dir=='N'){
                y++;
            }else{
                y--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (double)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String str="WENSNSEW";
        System.out.println( checkStringPalindrome(str));
        
        
    }
}