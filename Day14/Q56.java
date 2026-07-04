import java.io.*;
class Q56
 {
  public static void main(String as[])throws Exception
   {
     DataInputStream ob=new DataInputStream(System.in);
     int n,hold=0,pos=1,du=1;
     System.out.println("Enter size of Array : ");
     n=Integer.parseInt(ob.readLine());
     int ar[]=new int[n];
     int ar2[]=new int[n*n];
     System.out.println("Enter Array elements : ");
     for(int i=0;i<n;i++)
        ar[i]=Integer.parseInt(ob.readLine());
    System.out.println("Duplicate elment is : ");
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
              {
                if(ar[i]==ar[j])
                  ar2[hold++]=j;
              }
    }
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
        {
          pos=1;
            if(ar[i]==ar[j])
           {
             du=1;
             for(int k=0;k<hold;k++)
               {
                if(i==ar2[k])
                    pos=0;
               }
             if(pos==0)
               break;
            }
          }          
            if(pos==1&&du==1)
             System.out.println(ar[i]);
          du=0;
      }
  }
}
