import java.io.*;
class Q29
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter no. of rows : ");
        int n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
               System.out.print("*");
               System.out.println();
        }
    }
}
