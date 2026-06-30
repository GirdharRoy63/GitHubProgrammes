import java.io.*;
class Perfect 
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new            DataInputStream(System.in);
        int n,sum=0; System.out.println("Enter a number :"); n=Integer.parseInt(ob.readLine()); 
        for(int i=1;i<n;i++)
        {
         if(n%i==0)
           sum=sum+i;
        }
        if(sum==n) System.out.println("Perfect number");
        else
 System.out.println("Not a Perfect number");
    }
}
