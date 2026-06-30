import java.io.*;
class Q47
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,n1=0,n2=1,hold;
        System.out.println("Enter number of terms : ");
        n=Integer.parseInt(ob.readLine());
        System.out.println("Fibonacci Series is : ");
        if(n==1)
          System.out.print(n1+",");
          else
          {
           System.out.print(n1+","+n2+",");
           Q47 q=new Q47();
           q.Fibonacci(n1,n2,n-2);
          }
    }
   void Fibonacci (int p1,int p2,int p)
    {
        int hold=0;
         if(p==0)
             return;
             else
           {
            for(int j=1;j<=p;j++)
            {
              hold=p1+p2;
              System.out.print(hold+",");
              p1=p2;
              p2=hold;
            }
           }
    }
}
