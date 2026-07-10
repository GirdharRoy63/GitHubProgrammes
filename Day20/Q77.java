import java.io.*;
class Q77
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     int r1,c1,r2,c2,r3,c3,same;
     System.out.println("Enter row and column of 1st Matrices : ");
     r1=Integer.parseInt(ob.readLine());
     c1=Integer.parseInt(ob.readLine());
     int ar1[][]=new int[r1][c1];
     System.out.println("Enter row and column of 2nd Matrices : ");
     r2=Integer.parseInt(ob.readLine());
     c2=Integer.parseInt(ob.readLine());
     int ar2[][]=new int[r2][c2];
     if(c1!=r2)
        System.out.println("Multiplication of Matrices not possible ");
    else
    {
      System.out.println("Enter elements of 1st Matrix : ");
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
            ar1[i][j]=Integer.parseInt(ob.readLine());
      }
      System.out.println("Enter elements of 2nd Matrix : ");
      for(int i=0;i<r2;i++)
      {
        for(int j=0;j<c2;j++)
            ar2[i][j]=Integer.parseInt(ob.readLine());
      }
      r3=r1;
      c3=c2;
      same=c1;
      System.out.println("1st Array is : ");
      for(int i=0;i<r1;i++)
      {
        for(int j=0;j<c1;j++)
           System.out.print(ar1[i][j]+"   ");
        System.out.println();
      }
      System.out.println("2nd Array is : ");
      for(int i=0;i<r2;i++)
      {
        for(int j=0;j<c2;j++)
           System.out.print(ar2[i][j]+"   ");
        System.out.println();
      }
      int ar3[][]=new int[r3][c3];
      for(int i=0;i<r3;i++)
      {
        for(int j=0;j<c3;j++)
          ar3[i][j]=0;
      }
      for(int i=0;i<r3;i++)
      {
        for(int j=0;j<c3;j++)
        {
            for(int k=0;k<same;k++)
                ar3[i][j]+=ar1[i][k]*ar2[k][j];
        }
      }
      System.out.println("Multiplication of Matrices is : ");
      for(int i=0;i<r3;i++)
      {
        for(int j=0;j<c3;j++)
           System.out.print(ar3[i][j]+"   ");
        System.out.println();
      }
    }
  }
 }
