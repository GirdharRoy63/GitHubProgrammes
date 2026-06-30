import java.io.*;
class RecursiveSumofDigits
{
    public static void main(String as[])throws Exception 
    {
        DataInputStream ob=new DataInputStream(System.in);
        int n;
        System.out.println("Enter a number : ");
         n=Integer.parseInt(ob.readLine());
         System.out.println("Sum of Digits is : ");
         RecursiveSumofDigits r=new RecursiveSumofDigits();
        System.out.println(r.sum(n));
          }
        int sum(int p)
          {
              if(p==0)
                 return 0;
              else
                   return (p%10) + sum(p/10); 
          }
}
