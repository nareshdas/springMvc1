class Lab312{
public static void main(String args[]){
Hello h =new Hello();
h.sum(new int[0]);
h.sum(new int[]{12,34,45});
h.sum(new int[]{10,20,50,30});
}
}
class Hello{
void sum(int arr[]){
System.out.println("sum");
System.out.println("length:"+arr.length);
int s=0;
for(int a:arr){
s=s+a;
}
System.out.println("sum is:"+s);
}
}

