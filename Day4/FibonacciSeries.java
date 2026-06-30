import java.io.*;
class FibonacciSeries 
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,n1=0,n2=1,hold;
        System.out.println("Enter number of terms : ");
        n=Integer.parseInt(ob.readLine());
        System.out.println("Fibonacci Series is : ");
        System.out.print(n1+","+n2+",");
            for(int j=3;j<=n;j++)
            {
              hold=n1+n2;
              System.out.print(hold+",");
              n1=n2;
              n2=hold;
            }
    }
}
