import java.io.*;
class Q43
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=Integer.parseInt(ob.readLine());
        Q43 q=new Q43();
        q.prime(n);
    }
    void prime(int p)
    {
        int flag=1;
        if(p==0||p==1)
           System.out.println("Not a prime number ");
        else if(p==2)
           System.out.println("Prime number ");
           else
            {
                for(int i=2;i<p;i++)
                {
                    if(p%i==0)
                      flag=0;
                }
                if(flag==1)
                   System.out.println("Prime number ");
                else
                   System.out.println("Not a Prime Number ");
            }
     }
}
