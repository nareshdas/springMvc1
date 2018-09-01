class Lab375{
public static void main(String args[]){
B bobj=new B();
bobj.show(99);
bobj.SHOW("JLC");
}
}
class A{
void show(int ab){
System.out.println("A>>>show");
}
}
class B extends A{
void SHOW(String ab){
System.out.println("B>>>>SHOW");
}
}
