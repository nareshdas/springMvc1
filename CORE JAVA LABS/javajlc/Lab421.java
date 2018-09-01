interface Inter3{
void show();
}
class A{
public void show(){
System.out.println("AA>>>>>show");
}
}
class B extends A implements Inter3{}
class Lab421{
public static void main(String args[]){
B ref=new B();
ref.show();
}
}

