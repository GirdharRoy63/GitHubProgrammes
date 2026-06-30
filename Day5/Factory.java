import java.io.*;
class Factor
{
    public static void main (String as[])throws Exception 
    {
        DataInputStream ob=new            DataInputStream(System.in);
        int n; 
        System.out.println("Enter a number :"); 
        n=Integer.parseInt(ob.readLine()); 
        System.out.println("Factors of input number are : ");
            for(int j=1;j<n;j++)
             {
                 if(n%j==0)
                    System.out.println(j);
             }
    }
}
