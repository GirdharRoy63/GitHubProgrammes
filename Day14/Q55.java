import java.io.*;
class Q55
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     int n,max,max2,hold=0;
     System.out.println("Enter size of Array : ");
     n=Integer.parseInt(ob.readLine());
     int ar[]=new int[n];
     System.out.println("Enter array elements : ");
     for(int i=0;i<n;i++)
        ar[i]=Integer.parseInt(ob.readLine());
     max=ar[0];
     for(int i=0;i<n;i++)
     {
        if(max<ar[i])
        {
            max=ar[i];
            hold=i;
        }
     }
      if(max!=ar[0])
         max2=ar[0];
      else
         max2=ar[1];
     for(int i=0;i<n;i++)
     {
        if(max2<ar[i]&&i!=hold)
              max2=ar[i];
     }
     System.out.println("Second Maximum element is :\n"+max2);
    }
}
