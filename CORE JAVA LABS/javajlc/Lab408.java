abstract class Hello{
int a;
Hello(int a){
//this.a=a;
System.out.println("Hello int ");
}
{
System.out.println("Hello IB");
}
void show(){
System.out.println("Hello show");
}
}
class Hai extends Hello{
Hai(int a){
super (a);
}
}
class Lab408{
public static void main(String args[]){
Hai hai= new Hai(10);
hai.show();
}
}
 