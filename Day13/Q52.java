import java.io.*;
class Q52
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,freven=0,frodd=0;
        System.out.println("Enter no.of elements : ");
        n=Integer.parseInt(ob.readLine());
        int ar[]=new int[n];
        System.out.println("Enter Array elements :");
        for(int i=0;i<n;i++)
          ar[i]=Integer.parseInt(ob.readLine());
          System.out.println("Frequency of Odd Array elements is :");
            for(int i=0;i<n;i++)
                {
                   if(ar[i]%2==0)
                       freven++;
                   else
                       frodd++;
                }
            System.out.println(frodd);   
           System.out.println("Frequency of Even Array elements is :");
           System.out.println(freven);
     }
}
