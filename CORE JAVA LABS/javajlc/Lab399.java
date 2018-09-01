class Shape{
void area(){
System.out.println("Hello");
}
}
class Square extends Shape{}
class Lab399{
public static void main(String args[]){
Shape sp=new Square();
sp.area();
}
}

