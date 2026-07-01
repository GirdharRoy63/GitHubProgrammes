import java.io.*;
class Q37
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter no. of rows : ");
        n=Integer.parseInt(ob.readLine());
        for(int i=n;i>=1;i--)
        {
          for(int j=1;j<i;j++)
            System.out.print(" ");
          for(int j=n;j>=i;j--) 
             System.out.print("*");
          for(int j=n;j>i;j--)
             System.out.print("*");
          System.out.println(); 
        }
    }
}
        
