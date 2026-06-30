import java.io.*;
class Q41
{
    public static void main(String  as[]) throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n1,n2;
        System.out.println("Enter two numbers : ");
        n1=Integer.parseInt(ob.readLine());
        n2=Integer.parseInt(ob.readLine());
        Q41 q=new Q41();
        q.sum(n1,n2);
    }
    void sum(int p1,int p2)
    {
        int sum=p1+p2;
        System.out.println("Sum of above two numbers is :\n" + sum);
    }
}
