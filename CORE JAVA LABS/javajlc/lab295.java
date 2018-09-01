class Lab295{
public static void main(String args[]){
Hello h=new Hello();
h.show('A');
h.show((char)65);
}
}
class Hello{
void show(int x){
System.out.println("show(char)");
}
}
