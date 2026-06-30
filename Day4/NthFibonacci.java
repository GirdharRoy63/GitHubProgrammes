import java.io.*;
class NthFibonacci 
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,n1=0,n2=1,sum=0;
        System.out.println("Enter no. of  term of Fibonacci Series : ");
        n=Integer.parseInt(ob.readLine());
        System.out.println("Nth Fibonacci Term is : ");
        if(n==1)
           System.out.println("0");
           else if(n==2)
              System.out.println("1");
           else
          {
            for(int j=3;j<=n;j++)
            {
              sum=n1+n2;
              n1=n2;
              n2=sum;
              if(j==n)
                 System.out.println(sum);
            }
          }
    }
}
