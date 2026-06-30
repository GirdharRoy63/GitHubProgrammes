import java.io.*;
class Q24
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int x,n,pro=1;
        System.out.println("Enter base : ");
        x=Integer.parseInt(ob.readLine());
        System.out.println("Enter power : ");
        n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++)
           pro=pro*x;
           System.out.println("Result of x raised to power n is :\n" + pro);
    }
}
