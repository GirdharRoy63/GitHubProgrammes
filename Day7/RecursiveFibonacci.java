import java.io.*;
class RecursiveFibonacci
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,n1=0,n2=1;
        System.out.println("Enter number of terms : ");
         n=Integer.parseInt(ob.readLine());
         System.out.println("Fibonacci Series is : ");
         if(n==1)
         System.out.println(n1+",");
          else
          {
         System.out.print(n1+","+n2+",");
         RecursiveFibonacci r=new RecursiveFibonacci();
         r.series(n1,n2,n-2);
          }
    }
    void series(int p1,int p2,int p)
    {
        if(p==0)
          return;
          else
          {
             int sum=p1+p2;
             p1=p2;
             p2=sum;
             System.out.print(sum+",");
             series(p1,p2,--p);
          }
     }
}
