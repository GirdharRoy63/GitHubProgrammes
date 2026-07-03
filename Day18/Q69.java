 import java.io.*;
class Q69
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     int n;
     System.out.println("Enter size of Array : ");
     n=Integer.parseInt(ob.readLine());
     int ar[]=new int[n];
     System.out.println("Enter array elements : ");
     for(int i=0;i<n;i++)
        ar[i]=Integer.parseInt(ob.readLine());
    for(int i=0;i<n-1;i++)
    {
        for(int j=0;j<n-1-i;j++)
             {
                if(ar[j]>ar[j+1])
                {
                  int t=ar[j];
                  ar[j]=ar[j+1];
                  ar[j+1]=t;
                }
            }
        }
         System.out.println("Array in Sorted order is : ");
     for(int i=0;i<n;i++)
        System.out.print(ar[i]+"\t");

   }
 }
