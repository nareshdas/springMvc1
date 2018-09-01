class Lab347{
public static void main(String args[]){
new B(10);
}
}
class A{
A(){

System.out.println("A (D C)");
}}

class B extends A{
B(){

System.out.println("B> DC");
}
B(int a){
this();
System.out.println("B int");
}
}
