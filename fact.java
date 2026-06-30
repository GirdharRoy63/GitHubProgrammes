import java.io.*;
class fact{
    public static void main(String[] args)throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter a number");
        int n=Integer.parseInt(ob.readLine());
        int fac=1;
        if(n<0) 
        System.out.println("Factorial of number not possible");
        else if(n==0)
            System.out.println("Factorial of number is 1");
            else
            {
                for(int i=1;i<=n;i++)
                fac=fac*i;
                System.out.println("Factorial of number is : "+ fac);
            }
       }
}
