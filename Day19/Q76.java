import java.io.*;
class Q76
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int r,c,sum=0;
        System.out.println("Enter row of matrices : ");
        r=Integer.parseInt(ob.readLine());
        System.out.println("Enter column of matrices : ");
        c=Integer.parseInt(ob.readLine());
        int ar[][]=new int[r][c];
        System.out.println("Enter Array elements:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ar[i][j]=Integer.parseInt(ob.readLine());
            }
        }
        System.out.println("Sum of Diagonal Elements is : ");
      for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              if(i==j)
                sum=sum+ar[i][j];
             }
        }
        System.out.println(sum);
    }
}
