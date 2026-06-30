import java.io.*;
class Q32
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,hold=1;
        System.out.println("Enter no. of rows : ");
        n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
               System.out.print(hold);
               System.out.println();
               hold++;
        }
    }
}
