interface Inter5{
int AB=90;
}
class Hello{
String AB="JLC";
}

class Hai implements Inter5{
void show(){
System.out.println(super.AB);
System.out.println(Inter5.AB);
}
}
