import java.io.*;
class primeRange
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in); 
        System.out.println("Enter starting number:");
        int n1=Integer.parseInt(ob.readLine());
        System.out.println("Enter ending number:");
        int n2=Integer.parseInt(ob.readLine());
        int flag=1;
        System.out.println("Prime numbers within this range are : ");
      if(n1==2)
           System.out.println(n1);
      else
      {
        for(int j=n1;j<=n2;j++)
        {
                for(int i=2;i<j;i++)
                if(j%i==0)
                 flag=0;
            
      if(flag==1)
        System.out.println(j);
     flag=1;
       }    
      }
        }
}
