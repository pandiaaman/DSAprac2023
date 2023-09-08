package coreJava;
/*
 * types of constructors
 *  default
 *  parameterized
 *  no args
 */
public class B_Constructor {

  int x;
  int y;
  String z;


  // private B_Constructor(){

  // }

  public B_Constructor(){
    //no args
    System.out.println("no args constructor");
  }

  public B_Constructor(int x, int y){
    this();
    System.out.println("constructor for x and y calling super");
    this.x = x;
    this.y = y;
  }

  public B_Constructor(int x, int y, String z){
    this(x,y);
    System.out.println("constructor for z calling super");
    this.z = z;
  }

  //getters and setters
  public int getX(){
    return this.x;
  }

  public int getY(){
    return this.y;
  }

  public String getZ(){
    return this.z;
  }
  



  public static void main(String[] args) {
    //constructors in java
    B_Constructor ob = new B_Constructor(1,3, "hello");
    System.out.println(ob.x + " " + ob.y + " " + ob.z);

    System.out.println(ob.getX());
    System.out.println(ob.getY());
    System.out.println(ob.getZ());
  }
}
