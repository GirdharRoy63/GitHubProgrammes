import java.io.*;
class Q40
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++)
        {
          for(int j=n;j>i;j--)
            System.out.print(" ");
          for(int j=1;j<=i;j++) 
             System.out.print((char)(j+64));
          for(int j=i-1;j>=1;j--)
             System.out.print((char)(j+64));
          System.out.println(); 
        }
    }
}
