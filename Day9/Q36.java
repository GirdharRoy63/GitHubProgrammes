import java.io.*;
class Q36
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n=Integer.parseInt(ob.readLine());
        for(int i=1;i<=n;i++)
        {
          System.out.print("*");
            for(int j=2;j<n;j++)
            {
                if(i==1||i==n)
               System.out.print("*");
               else
                System.out.print(" ");
            }
          System.out.print("*"); 
          System.out.println();
        }
    }
}
