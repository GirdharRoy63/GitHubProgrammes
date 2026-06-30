import java.io.*;
class LCM
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n1,n2,hold,lcm;
        System.out.println("Enter two numbers : ");
        n1=Integer.parseInt(ob.readLine());
        n2=Integer.parseInt(ob.readLine());
        lcm=n1*n2;
        if(n1>n2)
            hold=n1;
            else
               hold=n2;
            for(int j=hold;j<=lcm;j++)
            {
                if(j%n1==0&&j%n2==0)
                {
                lcm=j;
                break;
                }
            }
        System.out.println("LCM of two numbers is : " +lcm);
        
    }
}
