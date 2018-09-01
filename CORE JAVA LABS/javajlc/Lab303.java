class Lab304{
public static void main(String args[]){
hello h=new Hello();
h.show(null);
h.show("jlc");
h.show(h);
}
}
class Hello{
void show(String str){
System.out.println("show(String)");
}
void show(object str){
System.out.println("show(object)");
}
}
