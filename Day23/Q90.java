import java.io.*;
class Q90
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     String str;
     int len,pos=0;
     char c1,c2,hold=' ';
     System.out.println("Enter a String : ");
     str=ob.readLine();
     len=str.length();
     System.out.println("First Repeating character is : ");
     for(int i=0;i<len;i++)
     {
        pos=0;
        c1=str.charAt(i);
        for(int j=i+1;j<str.length();j++)
       {
         c2=str.charAt(j);
         if(c1==c2&&c2!=' ')
           {
              pos=1;
              hold=c1;
              break;
           }
       }
       if(pos==1)
       {
        System.out.println(hold);
        break;
       }
      }
    }
  }     
