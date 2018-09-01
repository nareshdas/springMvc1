class Lab270{
public static void main(String args[]){
Student stu1=new Student(88,"Naresh");
stu1.show();
Student stu2=new Student(99,"Ramesh");
stu2.show();
}
}
class Student{
int sid;
String sname;
Student(int sid,String sname){
System.out.println("Student 2-arg constructo");
this.sid=sid;
this.sname=sname;
}
void show(){
System.out.println(sid+"\t"+sname);
}
}
