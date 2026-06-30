import java.io.*;
class prime
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in); 
        System.out.println("Enter a number:");
        int n=Integer.parseInt(ob.readLine());
        int flag=1;
            if(n!=2)
            {
                for(int i=2;i<n;i++)
                if(n%i==0)
                 flag=0;
            }
            else 
              flag=1;
              if(flag==1)
            System.out.println("Prime number");
            else
            System.out.println("Not a prime number ");
    }
  }
