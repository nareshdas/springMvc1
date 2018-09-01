class Lab264{
public static void main(String args[]){
Student stu1=new Student();
stu1.Student(77,"sd");
stu1.show();
}
}
class Student{
int sid;
String sname;
Student(int id,String sn){
System.out.println("Student -2arg constructor");
sid=id;
sname=sn;
}
Student(){
System.out.println("Student Default constructor");
}
void show(){
System.out.println(sid+"\t"+sname);
}
}
