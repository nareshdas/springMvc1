class Lab262
{
public static void main(String args[])
{
Student stu1=new Student();//88,"Naresh");

stu1.show();
Student stu2=new Student();//99,"Ravi");
stu2.show();
}
}
class Student
{
int sid;
String sname;
Student()//int id,String sn)
{
System.out.println("student 2 arg constructor");
sid=id;
sname=sn;
}
void show()
{
System.out.println(sid+"\t"+sname);
}
}