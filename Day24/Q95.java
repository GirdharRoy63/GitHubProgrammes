import java.io.*;
class Q95
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    String str1="",str2="",str3="";
    int len1,len2,max=0,hold=0;
    System.out.println("Enter a String : ");
    str1=ob.readLine();
    str1=str1+" ";
    len1=str1.length();
    for(int i=0;i<len1;i++)
    {
        char c=str1.charAt(i);
        if(c!=' ')
            str2=str2+c;
        else
        {
            len2=str2.length();
            if(max<len2)
            {
                max=len2;
                hold=i;
            }
            str2="";
        }
    }
    for(int i=hold-1;i>=0;i--)
    {
        char c=str1.charAt(i);
        if(c==' ')
            break;
        else
            str3=c+str3;
    }
    System.out.println("Longest Word is :\n"+str3);
   }
 }
