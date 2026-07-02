import java.io.*;
class Q79
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    int r,c,sum=0;
    System.out.println("Enter row and column : ");
    r=Integer.parseInt(ob.readLine());
    c=Integer.parseInt(ob.readLine());
    int ar[][]=new int[r][c];
    System.out.println("Enter elements of matrix :");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
            ar[i][j]=Integer.parseInt(ob.readLine());
    }
    System.out.println("Entered matrix is : ");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
           System.out.print(ar[i][j]+"\t"); 
        System.out.println();     
    }
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
            sum=sum+ar[i][j];
        System.out.println("Sum of "+(i+1)+" row is : "+sum);
        sum=0;
    }
   }    
}
