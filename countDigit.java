import java.io.*;
class countDigit{
    public static void main(String[] args)throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter a number");
        int n=Integer.parseInt(ob.readLine());
        int n1=n,count=0;
        while(n1>0)
        {
            int i=n1%10;
            count++;
            n1=n1/10;
        }
                System.out.println("Number of digits in number is : "+ count);
    }
}
