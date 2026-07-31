class One{
  void display(){
    System.out.println("this is from class one");
}
}
//Single inheritance
class Two extends One{
  // polymorphism
  @Override
  void display(){
    System.out.println("This is from class Two");
  }
}
//hierarical inheritance
class Three extends Two{
  
  void display(int x){
    
    int y=10;
    int z=x+y;
    System.out.println("Sum of "+x+" and "+y+" is "+z);
  }
}
// hierarical inheritance
class Four extends Two{
  // void display
  @Override
  void display(){
      System.out.println("hierarical inheritence");
  }
}
public class Inherit {
    public static void main(String[] args) {
        Three t=new Three();
        t.display();
        t.display(10);
          }
}
