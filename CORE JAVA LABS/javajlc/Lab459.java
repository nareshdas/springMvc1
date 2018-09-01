public class Lab459{
public static void main(String args[]){
String srt1="JLC";
String srt2=new String("JLC");
//String srt3=new String("JLC");
String srt3=srt2.intern();
//System.out.println(srt1);

//System.out.println(srt2);

//System.out.println(srt3);

//System.out.println(srt1==srt2);

System.out.println(srt1==srt3);
System.out.println(srt2==srt3);
System.out.println();
String srt4="OK".intern();
String srt5="OK";
System.out.println(srt4==srt5);


}
}
