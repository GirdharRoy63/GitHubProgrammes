import java.io.*;
class SumDigit{
    public static void main(String[] args)throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter a number");
        int n=Integer.parseInt(ob.readLine());
        int n1=n,sum=0;
        while(n1>0)
        {
            int i=n1%10;
            sum=sum+i;
            n1=n1/10;
        }
                System.out.println("Sum of digits of number is : "+ sum);
    }
                            }
