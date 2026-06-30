import java.io.*;
class Q42
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n1,n2,n3;
        System.out.println("Enter 3 numbers : ");
        n1=Integer.parseInt(ob.readLine());
        n2=Integer.parseInt(ob.readLine());
        n3=Integer.parseInt(ob.readLine());
        System.out.println("Largest no. among 3 numbers is :");
        Q42 q=new Q42();
        q.max(n1,n2,n3);
    }
    void max(int p1,int p2,int p3)
    {
        int max=p1;
        if(p1>p2)
        {
          if(p1>p3)
            max=p1;
          else 
            max=p3;
        }
        else
        {
            if(p2>p3)
               max=p2;
           else
               max=p3;
        }
       System.out.println(max);
     }
}
