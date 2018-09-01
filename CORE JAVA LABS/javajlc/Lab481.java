public class Lab481{
public static void main(String args[]){
String str="Hi, welcome to jlc(java learing center),java world";
String str1=str.replace('j','X');
System.out.println(str1);

String str2=str.replaceFirst("java","SD");

System.out.println(str2);
String str3=str.replaceAll("java","SD");
System.out.println(str3);
System.out.println(str);
}
}

