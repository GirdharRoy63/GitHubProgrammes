import java.io.*;
class Q51
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,max,min;
        System.out.println("Enter no.of elements : ");
        n=Integer.parseInt(ob.readLine());
        int ar[]=new int[n];
        System.out.println("Enter Array elements :");
        for(int i=0;i<n;i++)
          ar[i]=Integer.parseInt(ob.readLine());
          max=min=ar[0];
          System.out.println("Largest  of Array elements is :");
            for(int i=1;i<n;i++)
                {
                   if(max<ar[i])
                       max=ar[i];
                   if(min>ar[i])
                       min=ar[i];
                }
            System.out.println(max);   
           System.out.println("Smallest of Array elements is :");
           System.out.println(min);
     }
}
