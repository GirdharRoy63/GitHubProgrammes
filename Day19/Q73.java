import java.io.*;
class Q73
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int r,c;
        System.out.println("Enter row of matrices : ");
        r=Integer.parseInt(ob.readLine());
        System.out.println("Enter column of matrices : ");
        c=Integer.parseInt(ob.readLine());
        int ar1[][]=new int[r][c];
        int ar2[][]=new int[r][c];
        int ar3[][]=new int[r][c];
        System.out.println("Enter 1st Array element : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
          ar1[i][j]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Enter 2nd Array element : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
               ar2[i][j]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Addition of two matrices is :");
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
              ar3[i][j]=ar1[i][j]+ar2[i][j];
        }
        for(int i=0;i<r;i++) 
        {
            for(int j=0;j<c;j++)
               System.out.print(ar3[i][j]+"\t");
           System.out.println();
        }
    }
}
