import java.io.*;
class Q85
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    String str1="",str2="";
    System.out.println("Enter a String : ");
    str1=ob.readLine();
    for(int i=str1.length()-1;i>=0;i--)
    {
      char c=str1.charAt(i);
      str2=str2+c;
    }
    if(str1.equalsIgnoreCase(str2))
        System.out.println("Palindrome String ");
    else
        System.out.println("Not a Palindrome String ");
    }
}
