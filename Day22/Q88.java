import java.io.*;
class Q88
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    String str1="",str2="";
    System.out.println("Enter a String : ");
    str1=ob.readLine();
    for(int i=0;i<str1.length();i++)
    {
        char c=str1.charAt(i);
        if(c!=' ')
            str2=str2+c;
    }
    System.out.println("Without Space String is : "+str2);
  }
}
