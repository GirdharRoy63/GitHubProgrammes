import java.io.*;
class Q46
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n,len; 
        System.out.println("Enter a number :"); 
        n=Integer.parseInt(ob.readLine());
        len=(""+n).length();
        Q46 q=new Q46();
        q.armstrong(n,len);
    }
    void armstrong (int n1,int l)
    {
        int n2,sum=0;
        n2=n1;
        while(n1>0)
        {
            int i=n1%10;
            sum=sum+(int)(Math.pow(i,l));
            n1=n1/10;
        }
        if(n2==sum) 
        System.out.println("Armstrong Number ");
            else
 System.out.println("Not an Armstrong Number ");
    }
}
