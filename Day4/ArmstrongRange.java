import java.io.*;
class ArmstrongRange
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n1,n2,len,hold,sum=0; System.out.println("Enter starting number :"); n1=Integer.parseInt(ob.readLine()); System.out.println("Enter ending number :"); n2=Integer.parseInt(ob.readLine()); System.out.println("Armstrong Numbers are: ");
        for(int i=n1;i<=n2;i++)
        {
         len=(""+i).length();
         hold=i;
        while(hold>0)
        {
            int j=hold%10;
            sum=sum+(int)(Math.pow(j,len));
            hold=hold/10;
        }
        if(i==sum)
   System.out.println(i);
        sum=0;
        }
    }
}
