import java.io.*;
class Q94
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    String str="",str1="";
    int fre=1,len;
    System.out.println("Enter a String : ");
    str=ob.readLine();
    str=str.trim();
    str=str+" ";
    len=str.length();
    for(int i=0;i<len;i++)
    {
       char c1=str.charAt(i);
       fre=1;
       for(int j=i+1;j<len;j++)
        {
            char c2=str.charAt(j);
            if(c1==c2)
                fre++;
            else
            {
                i=j-1;
                break;
            }
        }
          if(fre>1)
            str1=str1+c1+fre;
          else
             str1=str1+c1;
          System.out.println(i);
    }
    System.out.println("Compressed String is :\n"+str1);
   }
 }
