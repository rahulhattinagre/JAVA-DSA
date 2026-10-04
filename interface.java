interface A{
  void sow();
  void config();
}
class B implements A{
  public void show(){
  System.out.println("showing");
}
  public void config(){  
  System.out.println("Config");
}
}
public static void main(String []args){
  A obj=new B();
obj.show();
obj.config();
}
}
