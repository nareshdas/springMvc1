public class Lab445{
public static void main(String args[]){
System.out.println("\n********* with employee");
Employee em1=new Employee(94,70923103);
Employee em2=new Employee(94,70923103);
Employee em3=new Employee(99,12345678);
Employee em4=em1;
System.out.println(em1.hashCode());
System.out.println(em2.hashCode());
System.out.println(em3.hashCode());
System.out.println(em4.hashCode());
System.out.println(em1==em2);
System.out.println(em1==em3);
System.out.println(em1==em4);
System.out.println(em3==em4);
}
}
class Employee{
int eid;
long phone;
Employee(int eid,long phone){
this.eid=eid;
this.phone=phone;
}
public int hashCode()
{
return (int)(phone|eid);
}
}
