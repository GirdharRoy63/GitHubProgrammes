import java.io.*;
class Q75
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int r,c;
        System.out.println("Enter row and column :");
        r=Integer.parseInt(ob.readLine());
        c=Integer.parseInt(ob.readLine());
        int ar1[][]=new int[r][c];
        int ar2[][]=new int[c][r];
        System.out.println("Enter array elements :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
               ar1[i][j]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Original Matrix is : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
               System.out.print(ar1[i][j]+"\t");
            System.out.println(); 
        }
        System.out.println("Transpose of above matrix is : ");
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
               ar2[i][j]=ar1[j][i];
        }
         for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
               System.out.print(ar2[i][j]+"\t");
            System.out.println();  
        }
     }
}


          
