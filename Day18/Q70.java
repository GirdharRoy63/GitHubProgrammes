import java.io.*;
class Q70
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     int n,minIdx;
     System.out.println("Enter size of Array : ");
     n=Integer.parseInt(ob.readLine());
     int ar[]=new int[n];
     System.out.println("Enter array elements : ");
     for(int i=0;i<n;i++)
        ar[i]=Integer.parseInt(ob.readLine());
     for(int i=0;i<n-1;i++)
     {
        minIdx=i;
        for(int j=i+1;j<n;j++)
        {
            if(ar[minIdx]>ar[j])
                minIdx=j;
        }
        int t=ar[minIdx];
        ar[minIdx]=ar[i];
        ar[i]=t;
     }
      System.out.println("Array in Sorted order is : ");
      for(int i=0;i<n;i++)
        System.out.print(ar[i]+"  ");
 }
}
