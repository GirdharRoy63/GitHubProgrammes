import java.io.*;
class proDigit{
    public static void main(String[] args)throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter a number");
        int n=Integer.parseInt(ob.readLine());
        int n1=n,pro=1;
        while(n1>0)
        {
            int i=n1%10;
            pro=pro*i;
            n1=n1/10;
        }
                System.out.println("Product of digits of number is : "+ pro);
    }
}
