import java.io.*;
class LinearSearch
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,num,pos=0,i;
        System.out.println("Enter no. of elements :");
        n=Integer.parseInt(ob.readLine());
        int ar[]=new int[n];
        System.out.println("Enter array elements :");
        for(int j=0;j<n;j++)
        {
               ar[j]=Integer.parseInt(ob.readLine());
        }
        System.out.println("Enter element to be searched : ");
        num=Integer.parseInt(ob.readLine());
        for(i=0;i<n;i++)
        {
            if(ar[i]==num)
            {
                pos=i;
                break;
            } 
        }
         if(i==n)
             System.out.println("Element not present in Array");
          else
             System.out.println("Element is present at "+(pos+1)+" position");
        }
     }
