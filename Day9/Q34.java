import java.io.*;
class Q34
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n=Integer.parseInt(ob.readLine());
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
               System.out.print(j);
               System.out.println();
        }
    }
}
