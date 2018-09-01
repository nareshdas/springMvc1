class Lab275{
public static void main(String args[]){
Hello h=null;
h.show();
h=new Hello();
Hello.show();
}
}
class Hello{
static void show(){
System.out.println("static show");
}
}