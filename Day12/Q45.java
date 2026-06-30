import java.io.*;
class Q45 {
    public static void main(String[] args)throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        System.out.println("Enter a number : ");
        int n=Integer.parseInt(ob.readLine());
        int len;
        len=(n+"").length();
        Q45 q=new Q45();
        q.palindrome(n,len);
    }
       void palindrome(int n1,int l)
        {
          int rev=0,n2=n1;
          while(n1>0)
          {
            int i=n1%10;
            rev=rev+i*(int)(Math.pow(10,l-1));
            l--;
            n1=n1/10;
          }
        if(rev==n2)
                System.out.println("Palindrome number");
    else
       System.out.println("Number not palindrome ");
        
    }
}
