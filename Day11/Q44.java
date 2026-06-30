import java.io.*;
class Q44
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=Integer.parseInt(ob.readLine());
        Q44 q=new Q44();
        q.fact(n);
    }
    void fact(int p)
    {
        int pro=1;
        for(int i=1;i<=p;i++)
           pro=pro*i; 
    System.out.println("Factorial of given number is :\n" + pro);
     }
}
