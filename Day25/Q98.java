import java.io.*;
class Q98
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     String str1,str2,str3="";
     int len1,len2,count=0,k,pos=0;
     System.out.println("Enter two Strings : ");
     str1=ob.readLine();
     str2=ob.readLine();
     len1=str1.length();
     len2=str2.length();
     char ar[]=new char[len1+len2];
     System.out.println("Common characters in Strings are : ");
     for(int i=0;i<len1;i++)
     {
        pos=0;
        char c1=str1.charAt(i);
        for(int j=0;j<len2;j++)
        {
          char c2=str2.charAt(j);
            if(c1==c2&&c2!=' ')
            {
              for(k=0;k<=count;k++)
              {
                if(ar[k]!=c1&&ar[k]!=c2)
                    pos=1;
                  else
                  {
                    pos=0;
                    break;
                  }
              }
                  if(pos==1)
                  {
                    ar[count++]=c1;    
                  System.out.print(c1+",");
                  }
            }
         }
       }
     }
  }
