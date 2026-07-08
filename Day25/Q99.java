import java.io.*;
class Q99
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     String str1,str2="",str3="";
     int n;
     System.out.println("Enter number of names : ");
     n=Integer.parseInt(ob.readLine());
     String ar[]=new String[n];
     System.out.println("Enter names : ");
     for(int i=0;i<n;i++)
         ar[i]=ob.readLine();
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
            if(ar[i].compareTo(ar[j])>0)
            {
                String t=ar[i];
                ar[i]=ar[j];
                ar[j]=t;
            }
        }
     }
     System.out.println("Names in alphabetical order are : ");
     for(int i=0;i<n;i++)
       System.out.print(ar[i]+"  ,  ");

    }
}
