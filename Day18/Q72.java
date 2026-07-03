import java.io.*;
class Q72
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
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
             {
                if(ar[i]<ar[j])
                {
                  int t=ar[i];
                  ar[i]=ar[j];
                  ar[j]=t;
                }
            }
        }
     System.out.println("Array in Descending order is : ");
     for(int i=0;i<n;i++)
        System.out.print(ar[i]+"\t");

   }
 }
