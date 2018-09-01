public class Lab504{
public static void main(String [] args){
StringBuffer sb=new StringBuffer("JLC");
System.out.println("C:"+sb.capacity());
System.out.println("L:"+sb.capacity());
sb.trimToSize();
System.out.println("C:"+sb.capacity());
System.out.println("L:"+sb.capacity());
}
}

