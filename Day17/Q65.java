import java.io.*;
class Q65
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n1,n2,hold=0;
        System.out.println("Enter size of two Arrays : ");
        n1=Integer.parseInt(ob.readLine());
        n2=Integer.parseInt(ob.readLine());
        int ar1[]=new int[n1];
        int ar2[]=new int[n2];
        int ar3[]=new int[n1+n2];
        System.out.println("Enter 1st Array Elements : ");
        for(int i=0;i<n1;i++)
             ar1[i]=Integer.parseInt(ob.readLine());
        System.out.println("Enter 2nd Array Elements : ");
        for(int i=0;i<n2;i++)
              ar2[i]=Integer.parseInt(ob.readLine());
        for(int i=0;i<n1;i++)
          ar3[hold++]=ar1[i];
        for(int i=0;i<n2;i++)
          ar3[hold++]=ar2[i];
          System.out.println("Merged Array is : ");
        for(int i=0;i<(n1+n2);i++)
          System.out.print(ar3[i]+"\t");
    }
}
