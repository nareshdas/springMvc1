class lab282{
public static void main(String args[]){
Operation.showRemainder(10,4);
Operation.showRemainder(10,0);
}
}
class Operation{
static void showRemainder(int a, int b){
if(b==0)
return 0;
System.out.println(a%b);
}
}
 