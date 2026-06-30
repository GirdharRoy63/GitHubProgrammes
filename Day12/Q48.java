import java.io.*;
class Q48
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new            DataInputStream(System.in);
        int n; 
        System.out.println("Enter a number :");
        n=Integer.parseInt(ob.readLine()); 
        Q48 q=new Q48();
        q.perfect(n);
    }
    void perfect (int p)
    {
        int sum=0;
        for(int i=1;i<p;i++)
        {
         if(p%i==0)
           sum=sum+i;
        }
        if(sum==p)
          System.out.println("Perfect number");
        else
          System.out.println("Not a Perfect number");
    }
}
