class Lab337{
public static void main(String args[]){
Hello h=new Hello();
}
}
class Hai{
{
System.out.println("Hai->IB:");
}
static{
System.out.println("Hai->SB");
}
}
class Hello extends Hai{
{
System.out.println("Hello->IB");
}
static{
System.out.println("Hello->SB");
}
}
