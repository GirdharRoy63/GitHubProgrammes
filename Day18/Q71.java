import java.io.*;
class Q71
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     int n,num,st=0,lt,mid,p=0;
     System.out.println("Enter no. of elements : ");
     n=Integer.parseInt(ob.readLine());
     int ar[]=new int[n];
     lt=n-1;
     System.out.println("Enter elements of Array : ");
     for(int i=0;i<n;i++)
       ar[i]=Integer.parseInt(ob.readLine());
     System.out.println("Enter element to be Searched : ");
       num=Integer.parseInt(ob.readLine());
     for(int i=0;i<n;i++)
     {
        for(int j=i+1;j<n;j++)
        {
           if(ar[i]>ar[j])
          {
            int t=ar[i];
            ar[i]=ar[j];
            ar[j]=t;
          }
        } 
       }
     System.out.println("Array in Sorted order is : ");
     for(int i=0;i<n;i++)
       System.out.print(ar[i]+" ");
    System.out.println();
     while(st<=lt)
     {
        mid=(st+lt)/2;
        if(ar[mid]>num)
             lt=mid-1;
        else if(ar[mid]<num)
             st=mid+1;
        else
            {
                System.out.println("Element is present at "+ (mid+1)+" position ");
                break;
            }    
     }
    if(st>lt)
       System.out.println("Element not present in the Array ");

   }
}
