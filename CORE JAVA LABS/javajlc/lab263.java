class Lab263
{
public static void main(String args[])
{
Student stu1=new Student(99,"Sri","raju", 9999);
stu1.show();
Student stu2=new Student(88,"jai","sriram");
stu2.show();
Student stu3=new Student(77,"rani");
stu3.show();
}
}
class Student
{
int sid;
String sname;
String email;
long phone;
Student(int id ,String sn,String em,long ph)
{
System.out.println("student 4-arg constructor");
sid=id;
sname=sn;
email=em;
phone=ph;
}
Student(int id,String sn,String em)
{
System.out.println("Student 3 arg constructor");
sname=sn;
sid=id;
email=em;
}
Student(int id,String sn)
{
System.out.println("student 2 arg constuctor");
sid=id;
sname=sn;
}
Student()
{
System.out.println("Student default constructor");
}
void show()
{
System.out.println(sid+"\t"+sname+"\t"+email+"\t"+phone);
}
}