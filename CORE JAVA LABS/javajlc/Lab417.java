class Hello implements Inter1,Inter2{
public void m1(){
System.out.println("Hellloo>>>>m1");
}
public void m2(){
System.out.println("Hello>>>>m222");
System.out.println(B);
System.out.println(C);
System.out.println(A);
}
public void m3(){
System.out.println("Hellllo>>>>>m33333");
//System.out.println(B);
//System.out.println(C);
}

}
class Lab417{
public static void main(String args[]){
Hello h=new Hello();
h.m1();
h.m2();
h.m3();
}
}
