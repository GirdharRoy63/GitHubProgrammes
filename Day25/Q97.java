import java.io.*;
class Q97
 {
  public static void main(String as[])throws Exception
   {
    DataInputStream ob=new DataInputStream(System.in);
    int n1,n2,count=0;
    System.out.println("Enter no. of elements of 1st Array :");
    n1=Integer.parseInt(ob.readLine());
    int ar1[]=new int[n1];
    System.out.println("Enter elements in sorted order : ");
    for(int i=0;i<n1;i++)
        ar1[i]=Integer.parseInt(ob.readLine());
    System.out.println("Enter no. of elements of 2nd Array :");
    n2=Integer.parseInt(ob.readLine());
    int ar2[]=new int[n2];
    int ar3[]=new int[n1+n2];
    System.out.println("Enter elements in sorted order : ");
    for(int i=0;i<n2;i++)
        ar2[i]=Integer.parseInt(ob.readLine());
    for(int i=0;i<n1;i++)
         ar3[count++]=ar1[i];
    for(int i=0;i<n2;i++) 
        ar3[count++]=ar2[i];   
    System.out.println("Merged Array is : ");
    for(int i=0;i<(n1+n2);i++)
        System.out.print(ar3[i]+"   ");
  }
 }
