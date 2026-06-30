import java.io.*;
class Q49
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter no.of elements : ");
        n=Integer.parseInt(ob.readLine());
        int ar[]=new int[n];
        System.out.println("Enter Array elements :");
        for(int i=0;i<n;i++)
          ar[i]=Integer.parseInt(ob.readLine());
          System.out.println("Array elements are :");
            for(int i=0;i<n;i++)
               System.out.print(ar[i]+"\t");
        }
}
