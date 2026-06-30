import java.io.*;
class Q35
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,hold=65;
        System.out.println("Enter no. of rows : ");
         n=Integer.parseInt(ob.readLine());
        for(int i=65;i<=(64+n);i++)
        {
            for(int j=65;j<=i;j++)
               System.out.print((char)hold);
               System.out.println();
               hold++;
        }
    }
}
