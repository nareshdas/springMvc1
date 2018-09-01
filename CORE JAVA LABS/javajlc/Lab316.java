class Lab316{
public static void main(String args[]){
Hello h1=new Hello();
h1.m1();
}
}
class Hello{
void m1(int...a){
System.out.println("m1 show ");
}
void m1(String...a){
System.out.println("m2");
}
}


