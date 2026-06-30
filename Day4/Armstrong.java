import java.io.*;
class Armstrong
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,n1,n2=0,len; System.out.println("Enter a number :"); n=Integer.parseInt(ob.readLine());
        n1=n;
        len=(""+n).length();
        while(n1>0)
        {
            int i=n1%10;
            n2=n2+(int)(Math.pow(i,len));
            n1=n1/10;
        }
        if(n2==n) System.out.println("Armstrong Number ");
            else
 System.out.println("Not an Armstrong Number ");
    }
}
