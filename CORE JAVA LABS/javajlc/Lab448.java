public class Lab448{
public static void main(String args[]){
Student st1=new Student(99,"Sri");

Student st2=new Student(88,"Niwas");
System.out.println(st1);
System.out.println(st2);
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
public String toString(){
return sid+"\n"+name;
}
}

