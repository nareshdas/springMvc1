class Lab292{
public static void main(String args[]){
Hello h=new Hello();
System.out.println(h.isDigit('A'));
System.out.println(h.isDigit('B'));
}
}
class Hello{
boolean isDigit(char ch){
System.out.println("isDigit:"+ch);
if(ch>=48&& ch<=57)
return true;
else
return false;}}
