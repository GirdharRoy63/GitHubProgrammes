import java.io.*;
class GCD
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n1,n2,hold,hcf=0;
        System.out.println("Enter two numbers : ");
        n1=Integer.parseInt(ob.readLine());
        n2=Integer.parseInt(ob.readLine());
        if(n1>n2)
            hold=n2;
            else
               hold=n1;
            for(int j=1;j<=hold;j++)
            {
                if(n1%j==0&&n2%j==0)
                hcf=j;
            }
        System.out.println("GCD of two numbers is : " +hcf);
        
    }
}
