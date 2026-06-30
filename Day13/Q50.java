import java.io.*;
class Q50
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,sum=0;
        double avg=0.0;
        System.out.println("Enter no.of elements : ");
        n=Integer.parseInt(ob.readLine());
        int ar[]=new int[n];
        System.out.println("Enter Array elements :");
        for(int i=0;i<n;i++)
          ar[i]=Integer.parseInt(ob.readLine());
          System.out.println("Sum of Array elements is :");
            for(int i=0;i<n;i++)
                sum=sum+ar[i];
            System.out.println(sum);
            System.out.println("Average of Array elements is :");   
           avg=(double)sum/(double)n; 
           System.out.println(avg);
     }
}
