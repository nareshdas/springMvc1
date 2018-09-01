public class Lab447{
public static void main(String args[]){


Student st1=new Student(99,"Sri");
System.out.println(st1);
System.out.println("?? Defoult value");
String cname=st1.getClass().getName();
int hc=st1.hashCode();
String hx=Integer.toHexString(hc);
String msg=cname+"@"+hc;
System.out.println(msg);

}
}
class Student
{
int sid;
String name;
Student(int sid,String name){
this.sid=sid;
this.name=name;
}
}

