import java.io.*;
class Q31
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter no. of rows : ");
        int n=Integer.parseInt(ob.readLine());
        for(int i=65;i<=(64+n);i++)
        {
            for(int j=65;j<=i;j++)
               System.out.print((char)j);
               System.out.println();
        }
    }
}
