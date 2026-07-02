import java.io.*;
class Q78
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int r,c,pos=1;
        System.out.println("Enter row and column :");
        r=Integer.parseInt(ob.readLine());
        c=Integer.parseInt(ob.readLine());
        if(r!=c)
           System.out.println("Not a Symmetric Matrix ");
           else
           {
           int ar1[][]=new int[r][c];
           int ar2[][]=new int[r][c];
        System.out.println("Enter array elements :");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
               ar1[i][j]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Original Matrix is : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
               System.out.print(ar1[i][j]+"\t");
            System.out.println(); 
        }
        System.out.println("Transpose of above matrix is : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
               ar2[i][j]=ar1[j][i];
        }
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
               System.out.print(ar2[i][j]+"\t");
            System.out.println();  
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
              {
                  if(ar1[i][j]!=ar2[i][j])
                  pos=0;
              }
        }
        if(pos==0)
          System.out.println("Not a Symmetric Matrix ");
          else
            System.out.println("Symmetric Matrix ");
     }
   }
}
