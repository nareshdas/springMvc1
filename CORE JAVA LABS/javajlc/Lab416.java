interface Inter1{
void m1();
int A=10;
}
interface Inter2{
void m2();
int B=11;
}
class Hello implements Inter1,Inter2{
public void m1()
{
System.out.println("Hello>>>>>m1");
}
public void m2(){
System.out.println("Hello>>>>>>m2");
}
}
class Lab416{
public static void main(String args[]){
Hello h=new Hello();
System.out.println(h.A);
System.out.println(h.B);
h.m1();
h.m2();
}
}
