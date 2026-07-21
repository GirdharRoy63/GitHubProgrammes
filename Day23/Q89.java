import java.io.*;
class Q89
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     String str;
     int len,j;
     char c1,c2;
     System.out.println("Enter a String : ");
     str=ob.readLine();
     len=str.length();
     System.out.println("First Non-Repeating character is : ");
     for(int i=0;i<len;i++)
     {
        c1=str.charAt(i);
        for(j=i+1;j<len;j++)
       {
           c2=str.charAt(j);
           if(c1==c2)
             break;
       }
       if(j==len&&c1!=' ')
       {
        System.out.println(c1);
        break;
       }
      }
    }
  }     
