import java.io.*;
class Strong 
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new            DataInputStream(System.in);
        int n,n1,pro=1,sum=0;  System.out.println("Enter a number :");     n=Integer.parseInt(ob.readLine()); 
        n1=n;
        while(n1>0)
        {
            int i=n1%10;
            for(int j=1;j<=i;j++)
                pro=pro*j;
            sum=sum+pro;  
            pro=1;
            n1=n1/10;
        }
        if(sum==n)  System.out.println("Strong Number ");
              else                              System.out.println("Not a Strong Number ");
    }
}
