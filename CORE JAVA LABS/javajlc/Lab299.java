class Lab299{
public static void main(String args[]){
Hello h=new Hello();
String a=h.add(99,"jlc");
System.out.println(a);
String b=h.add("jlc",99);
System.out.println(b);
}
}
class Hello{
String add(int b,String a){
System.out.println("add int,string");
return a+b;
}
String add(String a,int b){
System.out.println("add string ,int");
return a+b;
}
}
