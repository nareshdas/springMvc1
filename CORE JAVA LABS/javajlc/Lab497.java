public class Lab497{
public static void main(String args[]){
String str="JCL,java learing center .No 1 in java training and placement.java is a popular language.";
String res[]=str.split("java",0);
System.out.println("length:"+res.length);
for(int i=0;i<res.length;i++){
String st=res[i];
System.out.println(i+"\t"+st);
}
String res1[]=str.split("java",5);
System.out.println("length:"+res1.length);
for(int i=0;i<res1.length;i++){
String st=res1[i];
System.out.println(i+"\t"+st);
}

}
}
