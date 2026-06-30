import java.io.*;
class Palindrome {
    public static void main(String[] args)throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter a number");
        int n=Integer.parseInt(ob.readLine());
        int n1=n,len,rev=0;
        len=(n1+"").length();
        while(n1>0)
        {
            int i=n1%10;
            rev=rev+i*(int)(Math.pow(10,len-1));
            len--;
            n1=n1/10;
        }
        if(rev==n)
                System.out.println("Palindrome number");
    else
       System.out.println("Number not palindrome ");
        
    }
}
