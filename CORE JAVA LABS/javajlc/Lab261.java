class Lab261
{
public static void main(String args[])
{
Student stu=new Student();
//stu.sid=99;
//stu.sname="Naresh";
stu.show();
}
} 
class Student
{
int sid;
String sname;
Student()
{
System.out.println("student default consturctor");
}
void show()
{
System.out.println(sid+"\t"+sname);
}
}
